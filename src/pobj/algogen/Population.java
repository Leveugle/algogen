package pobj.algogen;

import java.util.*;

public class Population {

    private static final int POP_SIZE = 20;
    private int size = 0;
    private ArrayList<Individu> individus;
    private ArrayList<Individu> meilleurPop;

    public Population() {
        individus = new ArrayList<>();
    }

    public Population(int size) {
        individus = new ArrayList<>();
    }

    public int size() {
        return size;
    }

    public void add(Individu individu) {
        if (size < individus.size()+1) {
            individus.add(individu);
            size ++;
        } else {
            throw new ArrayIndexOutOfBoundsException("Plus de place !");
        }
    }

    public void evaluer(Environnement cible){
        individus.forEach(i ->{
            double eval = cible.eval(i);
            i.setFitness(eval);
        });

    }

    public void sort(){
        Collections.sort(individus);
    }

    public Population evoluer(Environnement cible){
        evaluer(cible);
        Population bonPopulation=reproduire();
        muter(5.0);
        return bonPopulation;
    }

    private void muter(double prob){
        for (int i=1;i<individus.size();i++){
            Individu mauvais= individus.get(i);
            Random proba= new Random();
            double nombre =proba.nextDouble();
            if(nombre<prob){
               mauvais.muter();
            }
        }

    }

    private Population reproduire(){
        int populationgarder=(int)(this.individus.size()*0.2); //20%
        int populationpourri = this.individus.size() - populationgarder;//80%

        Population meilleurPop= new Population(this.individus.size());

        while(meilleurPop.size()<populationgarder){
            Individu newPop= this.individus.get(meilleurPop.size()).clone();
            meilleurPop.add(newPop);
        }

        while(meilleurPop.size()<this.size()){
            Random r= new Random();
            int r1=r.nextInt(populationgarder);
            int r2=r.nextInt(populationgarder);

            Individu newPop2= meilleurPop.individus.get(r1).clone().croiser(meilleurPop.individus.get(r2));
            meilleurPop.add(newPop2);
        }
        return meilleurPop;
    }

    @Override
    public String toString() {
        return (individus.toString());
    }
}

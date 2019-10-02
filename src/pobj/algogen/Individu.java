package pobj.algogen;
import java.util.Random;
import java.util.Scanner;

public class Individu implements Comparable<Individu>{

    private double valeurPropre;
    private double fitness;


    public Individu() {
        this.fitness=0;
        Random r = new Random();
        this.valeurPropre=r.nextDouble();

    }

    public Individu(double valeur) {

        this.valeurPropre = valeur;
        this.fitness=0;
    }

    public double getValeurPropre() {
        return valeurPropre;
    }

    public String toString() {

        return "vp: " + this.valeurPropre+ " Fitness: "+this.fitness;

    }

    public void setFitness(double fitness) {
        this.fitness = fitness;
    }

    public double getFitness() {
        return fitness;
    }


    public int compareTo(Individu o) {

        if(this.fitness> o.fitness){
            return 1;
        }
        else if (this.fitness< o.fitness){
            return -1;
        }
        else
            return 0;
    }

    public void muter(){

        Random r=new Random();
        double ro=r.nextDouble();
        this.valeurPropre= ((ro*2)-1)*0.1+this.valeurPropre;
    }

    public Individu croiser(Individu autre){

        double MoyenneV= (this.valeurPropre+autre.valeurPropre)/2;
        Individu superieur =new Individu(MoyenneV);
        return superieur;
    }

    public Individu clone(){
        Individu cloner= new Individu(this.valeurPropre);
        return cloner;
    }



}

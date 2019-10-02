package pobj.algogen;

public class Main {

    public static void main(String[] args) {
        Individu individu= new Individu();// Création d'un nouvel individu avec une Vp aléatoire
        individu.setFitness(0.2);   //maj de la fitness, de basse =0
        Individu individu1= new Individu(0.5); //Individue avec vp choisie
        individu1.setFitness(0.8);
        System.out.println(individu.toString());
        System.out.println(individu1.toString());
        // Création d'une population avec ajout d'individu
        Population populationArray = new Population();
        populationArray.add(individu);
        populationArray.add(individu1);
        System.out.println(populationArray.toString());
        //Création d'une population random avec affichage
        System.out.println(PopulationFactory.createRandomPopulation(14));
        // Mutation de la vp d'un individu à + ou - 10%
        individu.muter();               //Question 2.5
        System.out.println(individu);   //Question 2.5
        // Création d'un individu avec une Vp croisé
        System.out.println(individu.croiser(individu1));

    }
}

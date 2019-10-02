package pobj.algogen;

import java.util.Collections;

public class PopulationMain {

    public static void main(String[] args) {
        System.out.println(args.length);
         int numb=Integer.parseInt(args[0]);
        Population randomPopulation = PopulationFactory.createRandomPopulation(numb);
        System.out.println(randomPopulation);
        randomPopulation.evaluer(new ValeurCible(0));
        randomPopulation.sort();
        System.out.println(randomPopulation);
        randomPopulation.evoluer(new ValeurCible(0.2));
        System.out.println(randomPopulation);

    }
}


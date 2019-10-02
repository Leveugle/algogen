package pobj.algogen;

public class PopulationFactory {

    public PopulationFactory() {

    }

    public static Population createRandomPopulation(int size) {

        Population population = new Population(size);
        for (int i = 0; i < size; i++) {

            population.add(new Individu());
        }

        return population;
    }
}

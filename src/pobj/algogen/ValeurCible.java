package pobj.algogen;

import java.util.Random;

import static java.lang.Math.sqrt;

public class ValeurCible implements Environnement {

    private double value;

    public ValeurCible(){
        this.value=0.9;
    }

    public ValeurCible(double value){

        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public double eval(Individu i) {

        return 1 / Math.pow(this.value - i.getValeurPropre(),2);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

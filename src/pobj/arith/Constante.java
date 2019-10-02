package pobj.arith;

public class Constante implements Expression {

    private final double value=0.2 ;

    public Constante(double c){

    }

    public double eval(EnvEval e){

        return this.value;
    }
    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

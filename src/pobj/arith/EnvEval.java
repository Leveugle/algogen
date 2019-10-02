package pobj.arith;

public class EnvEval {
    private double variable[];

    public EnvEval(int taille){
        double variable[]=new double [taille];

    }
    public void setVariable(int indexVariable,double val) {
        variable[indexVariable]=val;
    }

    public double getValue(int indexVariable){

        return variable[indexVariable];
    }

    public String toString() {

            for (int i=0; i<variable.length;i++){
                System.out.println(variable[i]);
            }
        return toString();
    }
}

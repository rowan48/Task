import static java.lang.Math.pow;

public class Problemo4 {
    public  double  Composite(double n){
       return sq(inc(n));
    }
    public  double sq(double n){

        return  pow(n,2);
    }
    public double inc(double n){
        return ++n;
    }
}

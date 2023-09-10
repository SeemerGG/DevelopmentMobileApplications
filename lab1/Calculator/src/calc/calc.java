package calc;

public class Calc {
    public static void main(String[] args){
        System.out.println("Privet");
        Calculator calc = new Calculator();
        System.out.println("2+2= " + calc.sum(2,2));
        System.out.println("2-2= " + calc.minus(2,2));
        System.out.println("2*2= " + calc.mult(2,2));
        System.out.println("2/2= " + calc.del(2,2));
        System.out.println("not 2= " + calc.inv(2));
    }
}
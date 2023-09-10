package calc;
import calc.operation.Adder;
import calc.operation.Minus;
import calc.operation.Multiple;
import calc.operation.Delenie;
import calc.operation.Invert;
public class Calculator
{
    public int sum(int... a)
    {
        Adder adder = new Adder();
        for(int i:a)
        {
            adder.add(i);
        }
        return adder.getSum();
    }

    public int minus(int a, int... b)
    {
        Minus minusOb = new Minus(a);
        for(int i:b)
        {
            minusOb.add(i);
        }
        return minusOb.getMinus();
    }

    public int mult(int a, int... b)
    {
        Multiple multOb = new Multiple(a);
        for(int i:b)
        {
            multOb.add(i);
        }
        return multOb.getMult();
    }

    public int del(int a, int... b)
    {
        Delenie delOb = new Delenie(a);
        for(int i:b)
        {
            delOb.add(i);
        }
        return delOb.getDel();
    }

    public int inv(int a)
    {
        Invert invertOb = new Invert(a);
        return invertOb.getInvert();
    }
}
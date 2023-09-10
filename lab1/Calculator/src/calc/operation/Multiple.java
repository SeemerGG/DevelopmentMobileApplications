package calc.operation;

public class Multiple
{
    int mult;

    public Multiple(int a)
    {
        mult = a;
    }

    public void add(int b)
    {
        mult*=b;
    }

    public int getMult()
    {
        return mult;
    }
}
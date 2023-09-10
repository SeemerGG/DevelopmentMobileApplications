package calc.operation;

public class Invert
{
    int digit;

    public Invert(int a)
    {
        digit = ~a;
    }

    public int getInvert()
    {
        return digit;
    }
}
package calc.operation;

public class Minus
{
    private int raz;

    public Minus(int a)
    {
        this.raz = a;
    }

    public void add(int b)
    {
        raz-=b;
    }
    public int getMinus()
    {
        return raz;
    }
}
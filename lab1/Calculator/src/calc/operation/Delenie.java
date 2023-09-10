package calc.operation;

public class Delenie
{
    int del;

    public Delenie(int a)
    {
        this.del = a;
    }

    public void add(int b)
    {
        del/=b;
    }
    public int getDel() {
        return del;
    }
}
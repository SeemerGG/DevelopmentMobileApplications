package src.animals;
public class Dog extends Animal
{
    private float Weight;
    public Dog(String n, String t, String s, float w)
    {
        super(n, t, s);
        Weight = w;
    }
`   public void setWeight(float weight)
    {
        this.Weight =  weight;
    }
    public float getWeight()
    {
        return this.Weight;
    }

    @Override
    public String Say()
    {
        return this.Sound;
    }
    public String toString()
    {
        return super.toString() + "Вес" + Weight;
    }

}
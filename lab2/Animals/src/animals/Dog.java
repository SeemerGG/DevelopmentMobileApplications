package animals;
public class Dog extends Animal
{
    private float Weight;
    public Dog(String n, String t, String s, float w)
    {
        super(n, t, s);
        Weight = w;
    }
    public void setWeight(float weight)
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
        return super.getSound();
    }
    @Override
    public String toString()
    {
        return super.toString() + "Вес" + Weight;
    }

    @Override
    public boolean equals(Object o)
    {
        boolean result = false;
        if(o instanceof Dog)
        {
            Dog dogObj = (Dog)o;
            if(dogObj.getWeight() == this.Weight && dogObj.getSound() == super.getSound() && dogObj.getName() == super.getName() && dogObj.getType() == super.getType())
            {
                result = true;
            }
        }

        return result;
    }

}
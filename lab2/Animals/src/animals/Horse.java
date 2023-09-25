package animals;
public class Horse extends Animal
{
    private float Weight, SpeedRun;
    public Horse(String n, String t, String s, float w, float speed)
    {
        super(n, t, s);
        Weight = w;
        SpeedRun = speed;
    }
    public void setWeight(float weight)
    {
       this.Weight =  weight;
    }
    public float getWeight()
    {
        return this.Weight;
    }

    public void setSpeedRun(float speed)
    {
        this.SpeedRun = speed;
    }

    public float getSpeedRun()
    {
        return this.SpeedRun;
    }

    @Override
    public String Say()
    {
        return super.getSound();
    }
    //@Override
    //public String toString()
    {
        //return super.toString() + "Вес" + Weight + "Скорость бега:" + SpeedRun;
    }



}
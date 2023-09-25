package animals;
public class Cat extends Animal
{
    private String EyeColor;
    public Cat(String n, String t, String s, String eyeColor)
    {
        super(n, t, s);
        EyeColor = eyeColor;
    }
    public void setEyeColor(String eyeColor)
    {
        this.EyeColor = eyeColor;
    }
    public String getEyeColor()
    {
        return this.EyeColor;
    }

    @Override
    public String Say()
    {
        return super.getSound();
    }
    @Override
    public String toString()
    {
        return super.toString() + "Цвет глаз:" + EyeColor;
    }

    @Override
    public boolean equals(Object o)
    {
        boolean result = false;
        if(o!=null && o instanceof Cat)
        {
            Cat catObj = (Cat)o;
            if(catObj.getEyeColor() == this.EyeColor && catObj.getSound() == super.getSound() && catObj.getName() == super.getName() && catObj.getType() == super.getType())
            {
                result = true;
            }
        }
        return result;
    }
}
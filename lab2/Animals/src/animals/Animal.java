package animals;

public abstract class Animal extends Object
{
    private String Name, Type, Sound;
    public Animal(String n, String t, String s)
    {
        Name = n;
        Type = t;
        Sound = s;
    }

    public void eat(){}

    public String getType()
    {
        return this.Type;
    }

    public String getSound()
    {
        return this.Sound;
    }

    public String getName()
    {
        return this.Name;
    }

    public void do_command(){}

    public void sleep(){}

    public void run(){}

    public abstract String Say();

    //@Override
    //public String toString()
    {
        //return "Порода:" + Type + "Кличка:" + Name + "Звук:" + Sound;
    }
}


import animals.*;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        Animal[] animal = new Animal[9];
        animal[0] = new Horse("Ненси", "Грузовая лошадь", "Иго-го", 150, 30);
        animal[1] = new Horse("Ганзалез", "Гоночная лошадь", "Иго-го", 120, 70);
        animal[2] = new Horse("Ганзалез", "Гоночная лошадь", "Иго-го", 120, 70);
        animal[3] = new Dog("Давг", "Такса", "Гав", 6);
        animal[4] = new Dog("Гизма", "Пикинес", "Гав", 10);
        animal[5] = new Dog("Макс", "Немецкая овчарка", "Гав", 20);
        animal[6] = new Cat("Мурзик", "Британский кот", "Мяу", "Желтый");
        animal[7] = new Cat("Мурзик", "Британский кот", "Мяу", "Желтый");
        animal[8] = new Cat("Пушистик", "Свехрпушистый кот", "Мяу", "Голубой");
        ArrayList<Animal> list = new ArrayList<Animal>();
        for(int i = 0; i < 8; i++)
        {
            if(!Difrent(animal[i], animal[i+1]))
                list.add(animal[i]);
        }

        for(Animal a:list)
        {
            System.out.println(a);
        }
    }

    public static boolean Difrent(Animal animal1, Animal animal2)
    {
        boolean flag = false;
        if(animal1==animal2)
        {
            System.out.println(animal1.getType() + " is identical " + animal2.getType());
        }
        else
        {
            System.out.println(animal1.getType() + " is not identical " + animal2.getType());
        }

        if(animal1.equals(animal2))
        {
            System.out.println(animal1.getType() + " is equals " + animal2.getType());
            flag = true;
        }
        else
        {
            System.out.println(animal1.getType() + " is not equals " + animal2.getType());
        }

        animal2 = animal1;

        if(animal1 == animal2)
        {
            System.out.println(animal1.getType() + " is identical " + animal2.getType());
        }
        else
        {
            System.out.println(animal1.getType() + " is not identical " + animal2.getType());
        }

        System.out.println("\n");
        return flag;
    }
}
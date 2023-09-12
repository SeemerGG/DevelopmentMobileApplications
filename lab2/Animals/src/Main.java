package src;
import src.animals.Animal;
public class Main
{
    public static void main(String[] args)
    {
        Animal[] animal = new Animal[9];
        animal[0] = new Horse("Ненси", "Грузовая лошадь", "Иго-го", 150, 30);
        animal[1] = new Horse("Лидия", "Пони", "Иго-го", 60, 40);
        animal[2] = new Horse("Ганзалез", "Гоночная лошадь", "Иго-го", 120, 70);
        animal[3] = new Dog("Давг", "Такса", "Гав", 6);
        animal[4] = new Dog("Гизма", "Пикинес", "Гав", 10);
        animal[5] = new Dog("Макс", "Немецкая овчарка", "Гав", 20);
        animal[6] = new Cat("Мурзик", "Британский кот", "Мяу", "Желтый");
        animal[7] = new Cat("Тигрик", "Бенгальский кот", "Мяу", "Оранжевый");
        animal[8] = new Cat("Пушистик", "Свехрпушистый кот", "Мяу", "Голубой");


    }

    public static void Sravnenie(Animal animal1, Animal animal2)
    {
        if(animal1==animal2)
        {
            System.out.println("animal1 is identical animal2");
        }
        else
        {
            System.out.println("animal1 is not identical animal2");
        }

        if(animal1.equals(animal2))
        {
            System.out.println("animal1 is equals animal2");
        }
        else
        {
            System.out.println("animal1 is not equals animal2");
        }

        animal2 = animal1;

        if(animal1 == animal2)
        {
            System.out.println("animal1 is identical animal2");
        }
        else
        {
            System.out.println("animal1 is not identical animal2");
        }

        System.out.println("\n");
    }
}
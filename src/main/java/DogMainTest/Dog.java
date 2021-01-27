package DogMainTest;

public class Dog {
    //1. Cоздать класс Dog, где описать характеристики и поведение собаки,
    // а потом вызвать этот класс из MainTest класса.

// описываю атребуты (переменные) класса
    public String name;
    public String color;
    public int age = 5;
    public double weight;
    public String words;

// методы eat, speak не возвращает никаких данных  –  void.
    public  void eat(){
        System.out.println("Bobik eat every day at 8AM and 17PM ");
    }

    public String speak(String words){
        String voice = words + " ayyyyy ";
        return voice;
    }
}

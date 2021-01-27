package DogMainTest;

public class MainTest {

    public static void main(String[] args) {
        // создаю экземпляр класса
        Dog somedog = new Dog();

        somedog.name = "Bobik";
        System.out.println(somedog.name);

        somedog.color = "yellow";
        System.out.println(somedog.color);

        System.out.println(somedog.age);

        somedog.weight = 17.3;
        System.out.println(somedog.weight);

        somedog.eat();

        String say = somedog.speak("Bobik say:");
        System.out.println(say);

    }
}

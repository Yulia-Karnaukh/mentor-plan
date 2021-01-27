package IfElsSwitch;

public class Name {
    //Даны имена 2х человек (тип String).
    // Если имена равны, то вывести сообщение о том, что люди являются тезками.
    public static void main(String[] args) {
        String a = "Женя";
        String b = "Же ня";

        if (a.equals(b)){
            System.out.println("Люди являются тезками");
        } else
            System.out.println("Разные имена");

    }
}

package IfElsSwitch;

public class LowestNumber {
    //Даны 4 числа типа int. Сравнить их и вывести наименьшее на консоль.
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 12;
        int d = 7;

        if ((a < b) && (a < c) && (a < d)) {
            System.out.println("A min number");
        } else if ((b < a) && (b < c) && (b < d)) {
            System.out.println("B min number");
        } else if ((c < a) && (c < b) && (c < d)) {
            System.out.println("C min number");
        } else if ((d < a) && (d < b) && (d < c)) {
            System.out.println("D min number");
        }
    }
}

// перечисляю через оператор и "&&", значения и сравниваю их между собой
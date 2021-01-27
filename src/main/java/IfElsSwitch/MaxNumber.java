package IfElsSwitch;


// Вывести на консоль количество максимальных чисел среди этих четырех.
// (P.S. Даны числа  5 9 3 9 .
// Максимальное число здесь 9, встречается 2 раза. Значит программа должна вывести 2.)
public class MaxNumber {

    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int c = 3;
        int d = 9;

       if ((a >= b && a >= c && a >= d) && (a==b || a==c || a==d)) {
            System.out.println("Таких чисел два");
        }

        if ((b >= a && b >= c && b >= d) && (b==a || b==c || b==d)) {
            System.out.println("Таких чисел два");
        }

        if ((c >= a && c >= b && c >= d) && (c==a || c==b || c==d)) {
            System.out.println("Таких чисел два");
        }

       if ((d==a || d==b || d==c) && (d >= a && d >= b && d >= c)) {
            System.out.println();
        }

    }
}

package ForWhile;

public class OddNumbers {
    //При помощи цикла for вывести на экран нечетные числа от 1 до 99.
    public static void main(String[] args) {
        int a = 0;
        int b = 99;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
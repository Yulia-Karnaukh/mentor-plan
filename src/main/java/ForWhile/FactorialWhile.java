package ForWhile;

public class FactorialWhile {
    //Перепишите программы с использованием цикла while.
    public static void main(String[] args) {

        int n = 8;
        int x = 1;
        int y = 1;

        while (y <= n) {
            x = x * y;
            y = y + 1;
            System.out.print(x + " ,");


        }

    }
}



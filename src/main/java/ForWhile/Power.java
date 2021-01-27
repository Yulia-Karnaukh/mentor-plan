package ForWhile;

public class Power {
    //Даны переменные x и n вычислить x^n.
    public static void main(String[] args) {
        int x = 12;
        int n = 5;
        int p = 1;
        for (int i = 0; i < n; i++) {
            p *= x;

        }
        System.out.println(p);

        }

    }

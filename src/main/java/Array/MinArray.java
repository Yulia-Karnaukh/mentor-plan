package Array;

public class MinArray {
    //Дан массив размерности N, найти наименьший элемент массива и вывести на консоль
    // (если наименьших элементов несколько — вывести их все).
    public static void main(String[] args) {
       int[] N = {35, 73, -45, 13, 0, 2};
        int min = N[0];
       for (int i = 0; i < N.length; i++) {
            if (min >= N[i])
                min = N[i];

        }
        for (int i = 0; i < N.length; i++) {
            if (min == N[i])
                System.out.println("min= " + min);
        }


    }
}


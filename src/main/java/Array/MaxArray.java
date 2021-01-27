package Array;

public class MaxArray {
    //В массиве из задания 2. найти наибольший элемент.
    public static void main(String[] args) {
        int[] N = {35, 73, -45, 13, 0, 2};
        int max = N[0];
        for (int i = 0; i < N.length; i++) {
            if (max <= N[i])
                max = N[i];

        }
        for (int i = 0; i < N.length; i++) {
            if (max == N[i])
                System.out.println("max= " + max);
        }
    }
}

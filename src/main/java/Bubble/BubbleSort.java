package Bubble;

public class BubbleSort {
    //Создайте массив из 20 случайных чисел (числа должны быть в диапазоне от 0 до 1000)
    // и отсортируйте массив по убыванию при помощи сортировки пузырьком.
    public static void main(String[] args) {

        int arr[] = new int[20];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 1000);
        }
        System.out.print("Массив по убыванию: " );

        for(int q = 1; q < arr.length; q++){
            for (int w = arr.length - 1; w >= q; w--) {
                if (arr[w - 1] > arr[w]) {
                    int tmp = arr[w - 1];
                    arr[w - 1] = arr[w];
                    arr[w] = tmp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}


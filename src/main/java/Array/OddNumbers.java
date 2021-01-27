package Array;

public class OddNumbers {
    //Создайте массив, содержащий 10 первых нечетных чисел.
    // Выведете элементы массива на консоль в одну строку, разделяя запятой.
    public static void main(String[] args) {
        int[] numbersArray = new int[10];
        for (int i = 0; i < 10; i++) {
            numbersArray[i] = i;
            System.out.print(2*i + 1 + " , ");

        }
    }
}

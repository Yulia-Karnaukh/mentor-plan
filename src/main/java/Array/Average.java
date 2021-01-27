package Array;

public class Average {
    //Найти среднее арифметическое всех элементов массива.
    public static void main(String[] args) {
        double[] array = {4, -5, 0, 6, 8};
        double result = 0;
        //в цикле перебираю все элементы массива и вычислю их сумму
        for (double d : array) {
            result = result + d;
        }
        //разделить сумму на длину массива
        System.out.println("Среднее арифметическое всех элементов массива = " + result / array.length);

    }
}

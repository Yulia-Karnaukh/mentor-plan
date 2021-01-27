package ForWhile;

public class Factorial {
    //Дано число n при помощи цикла for посчитать факториал n!
    //Факториа́л — функция, определённая на множестве неотрицательных целых чисел
    public static void main(String[] args) {

        int y=1;
        int n=8;
        for (int i=1; i<=n; i++){
            y=y*i;
        }
        System.out.print(y);
    }
}

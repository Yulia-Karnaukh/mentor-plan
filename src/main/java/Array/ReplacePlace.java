package Array;

public class ReplacePlace {
    //Поменять наибольший и наименьший элементы массива местами.
    // Пример: дан массив {4, -5, 0, 6, 8}. После замены будет выглядеть {4, 8, 0, 6, -5}.
    public static void main(String[] args) {

        int [] N = {4, -5, 0, 6, 8};
        int min = N[0];
        int max = N[0];
        int idMin = 0;
        int idMax = 0;

        for(int i = 0; i < N.length; i ++){
            if (min > N[i]){
                min = N[i];
                idMin = i;
            }
            if (max < N[i]){
                max = N[i];
                idMax = i;
            }
        }
        // замена местами мин и мах
        N[idMin] = max;
        N[idMax] = min;

        for(int j = 0 ; j < N.length; j ++){
            System.out.print(N[j] + ", ");
        }

    }

    }



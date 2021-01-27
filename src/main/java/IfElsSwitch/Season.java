package IfElsSwitch;

public class Season {
    //Дано число месяца (тип int).
    // Необходимо определить время года (зима, весна, лето, осень) и вывести на консоль.
    public static void main(String[] args) {
        int month = 6;
        String someMonth;
        switch (month){
            case 12:
            case 1:
            case 2:
                someMonth = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                someMonth = "Весна";
                        break;
            case 6:
            case 7:
            case 8:
                someMonth = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                someMonth ="Осень";
                break;
            default:
                someMonth = "Нет такого времени года";
        }
        System.out.println(someMonth);
    }
}

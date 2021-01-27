package IfElsSwitch;

//Даны 5 чисел (тип int). Вывести вначале наименьшее, а затем наибольшее из данных чисел.
public class MinMax {
    public static void main(String[] args) {
        int a = 100500;
        int b = - 2;
        int c = 56;
        int d = 113;
        int e = 0;
        if (a<b && a<c && a<d && a<e)
            System.out.println(a + " наименьшее");
        if (b<a && b<c && b<d && b<e)
            System.out.println(b + " наименьшее");
        if (c<b && c<a && c<d && c<e)
            System.out.println(c + " наименьшее");
        if (d<b && d<c && d<a && d<e)
            System.out.println(d + " наименьшее");
        if (e<b && e<c && e<a && e<d)
            System.out.println(e + " наименьшее");
	    if (a>b && a>c && a>d && a>e)
            System.out.println(a + " наибольшее");
	    if (b>a && b>c && b>d && b>e)
            System.out.println(b + " наибольшее");
	    if (c>b && c>a && c>d && c>e)
            System.out.println(c + " наибольшее");
	    if (d>b && d>c && d>a && d>e)
            System.out.println(d + " наибольшее");
        if (e>b && e>c && e>a && e>d)
            System.out.println(e + " наибольшее");

    }
}

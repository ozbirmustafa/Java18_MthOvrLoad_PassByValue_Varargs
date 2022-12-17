package day18arraylistspassbyvalue;

public class PostPreIncrementDecrement {

    public static void main(String[] args) {

        int a = 5;

        //post increment

        int b = a++;
        System.out.println(b); //5
        System.out.println(a); //6

        System.out.println("------");

        //pre increment

        int c = 10;
        int d =++c;
        System.out.println(d); //11
        System.out.println(c); //11
        System.out.println("------");

        //post decrement

        int e = 20;
        int f = e--;
        System.out.println(f); //20
        System.out.println(e); //19

        System.out.println("------");

        int h = 30;
        int i = --h;
        System.out.println(i); //29
        System.out.println(h); //29

        System.out.println("------");









    }





}

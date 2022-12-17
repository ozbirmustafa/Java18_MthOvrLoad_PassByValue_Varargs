package day18arraylistspassbyvalue;

public class PassByValue01 {

    /*
        1) Java variable ların orijinal değerlerini korumak ister.
        2) Variable methodlar içinde kullanıldığında JAva method un içine orijinal değeri koymaz,
           o değerin kopyasını üretir ve methoda o kopyaya yollar. Method kopya üstünde değişiklik yapar.
           Dolayısıyla variable ın orijinal değeri korunmuş olur.
           Bu sisteme "Pass By Value" denir.
           Note : Java "Pass By Value" kullanır.
     */

    public static void main(String[] args) {

        /*  Gomlek = 100TL
            Ogrenci = -10Tl ==> 90TL
            Gazi = -20Tl ==> 80Tl
        */

        //Static method olan main methodun içindeki her şey static olmalıdır.
        int x = 5;
        System.out.println(x);
        change(x);
        System.out.println(x);

        int ucret = 100;
        int kopya = indirim(ucret);
        // 100 olan orijinal değeri 90 yapmak istersek ==>  ucret = indirim(ucret);
        System.out.println(kopya); //90
        System.out.println(ucret); //100

    }

    public static void change (int a){
        System.out.println(a*3);

    }
    //Void dışındaki return type larda method bodysi içinde "return" keyword kullanılmalıdır.
    public static int indirim (int gomlekUcreti){
       return gomlekUcreti - 10;

    }


}

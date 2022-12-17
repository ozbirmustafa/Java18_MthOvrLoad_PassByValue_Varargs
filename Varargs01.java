package day18arraylistspassbyvalue;

public class Varargs01 {

    /*
        1) Farklı sayılardaki parametrelerle calışabilen bir method oluşturmak isterseniz "varargs" kullanmalısınız.
        2) "varargs" arka tarafta array kullanır. bu yüzden "varargs"larla çalışırken "array"lerle çalışıyormuş gibi davranabiliriz.
        3) "varargs" oluşturmak için "<data type>...  <varargs ismi>" veya "<data type>  ...<varargs ismi>"
        4) "varargs" en sonda olmak şartıyla "varargs" ın yanında başka bir parametre kullanılabilir.
        5) "varargs" en sonda olmak zorunda olduğu için birden fazla kullanılamaz.


    */



    public static void main(String[] args) {

        // iki sayının toplamını return eden method oıluşturunuz.

        int sonuc = topla(5, 6);
        System.out.println(sonuc);

        int uc = addThreeNums(4,5,6);
        System.out.println(uc);

        int r1 = add(2,3);
        System.out.println(r1);

        int r2 = add(2,3,4);
        System.out.println(r2);

        int r3 = add(1,2,3,4,5,6,7,8,9);
        System.out.println(r3);




    }

    public static int topla(int a, int b) {
        return a + b;
    }
    public static int addThreeNums(int a, int b, int c) {
        return a + b + c;
    }

    //istediğimiz kadar sayıyı toplayabileceğimiz bir method oluşturma

    public static int add(int... a){
        int sum = 0;
        for (int w: a ) {
            sum = sum + w ;
        }

        return sum;
    }



}
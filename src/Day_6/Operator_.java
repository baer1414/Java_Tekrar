package Day_6;

import java.util.Scanner;

public class Operator_ {
    public static void main(String[] args) {
        //ternary operator
//        int a=76,b=5;
//        int max=(a<=b)?b:a;
//        System.out.println(max);

//        int a=4;
//        System.out.println(a++);//4+1
//        System.out.println(a);//5
//
//        System.out.println(++a);//6
//        System.out.println(a++);//5+1
//        System.out.println(a);

        //örnek
//        int i=5,j;
//        j=i++;
//        System.out.println(j);

//        //örnek
//        int i=5;
//        i=i++ + --i + ++i - i--;
//        System.out.println(i);


//String b="fehmi";
//String c="fehmi";
//boolean d=(b.equals(c));
//        System.out.println(d);

//        Scanner scan=new Scanner(System.in);
//        System.out.println("lütfen iki sayı girin");
//        int a=scan.nextInt();
//        int b=scan.nextInt();
//boolean c=a>=b;
//
//        System.out.println(c);

        //örnek
//        int a=5, b=10, c=10;
//         boolean sonuc= a>b|| b>=c && !(a>c);
//                  //    false            true=true
//        System.out.println("sonuc = " + sonuc);

        //örnek
//        int a=5, b=10, c=10;
//        boolean sonuc=!(a>b || b>=c || !(a>c));
//                  //false
//        System.out.println("sonuc = " + sonuc);

int a=5;
boolean sonuc=a++==5 && --a==11%6;
         //     t           t
        System.out.println("sonuc = " + sonuc);


    }
}

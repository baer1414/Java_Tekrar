package day_47;

import java.util.Scanner;

public class ExceptionTutarial {
    public static void main(String[] args) {
//        int[] arr=new int[3];
//        System.out.println(arr[3]);
//        int a=5/0;
//        System.out.println(a);

        System.out.println("program başladı");
        boolean devam=true;
        while (devam){
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("lütfen bir sayı girin");
            int a=sc.nextInt();
            System.out.println("bölüm girin");
            int b=sc.nextInt();
            System.out.println(a/b);
            devam=false;

        }catch (Exception e){
            System.out.println("lütfen devam edin");
        }
            System.out.println("program bitti");
        }













    }
}

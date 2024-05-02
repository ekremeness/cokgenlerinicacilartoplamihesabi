package info.com;

import java.util.Scanner;

public class icAcılarToplamı {
    public static void main(String args[]){
        Scanner tarayici = new Scanner(System.in);

        System.out.println("lütfen kenar sayısı giriniz: ");

        int icacıtoplami = tarayici.nextInt();

        System.out.println("iç açılar toplamı :" +(icacıtoplami-2)*180);


    }
}

package JavaProjects.P04_okulYönetimi.P04_okulYönetimi.ogrcOgrtYonetimi;

import java.util.ArrayList;
import java.util.Scanner;

public class Islemler {


    static ArrayList<Kisi>ogrenciListesi=new ArrayList<>();
    static ArrayList<Kisi>ogretmenListesi=new ArrayList<>();
    static Scanner scan=new Scanner(System.in);
    static String kisiTuru;

    public static void girisPaneli(){
        System.out.println("");

        System.out.println("isleminizi seciniz :");
        String  secim =scan.next().toUpperCase();

        switch(secim) {
            case "1":
                kisiTuru="OGRENCİ";
                break;
                case "2":
                    kisiTuru="OGRETMEN";
                    break;
            case "q":
                break;
            default:
                System.out.println("hatali giris yaptiniz: (");
                girisPaneli();
                break;
        }









    }


}

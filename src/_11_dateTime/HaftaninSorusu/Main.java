package _11_dateTime.HaftaninSorusu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan =new Scanner(System.in);



         Kayıt yeniKayıt=new Kayıt();

        List<Kullanıcı>kisi=new ArrayList<>();

        boolean cikilsinMi=false;
        while(!cikilsinMi){
            System.out.println("lütfen \n1 : kayıt al \n2: sanslı kişi bul \n3:kişileri listele \n cıkıs");
            System.out.println("işleminizi seciniz");
            int islem=scan.nextInt();
           switch(islem){

               case 1:
                   kisi=yeniKayıt.kayitAl();
                   break;
               case 2:
                   yeniKayıt.sanslıKullanıcı(kisi);
                   break;
               case 3:
                   yeniKayıt.listele(kisi);
                   break;
               case 4 :
                   cikilsinMi=true;
                   break;
               default :
                   System.out.println("hatalı giriş yaptınız");
                   break;

           }


        }




    }
}

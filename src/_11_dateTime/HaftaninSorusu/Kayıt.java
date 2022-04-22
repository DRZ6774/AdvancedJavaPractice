package _11_dateTime.HaftaninSorusu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayıt {

    List<Kullanıcı> kisiler=new ArrayList<>();

    public List<Kullanıcı>kayitAl(){

        Scanner scan=new Scanner(System.in);
        System.out.println("adınızı giriniz");
        String isim=scan.nextLine();

        Kullanıcı k1=new Kullanıcı(isim, LocalDateTime.now());
        kisiler.add(k1);

        return kisiler;
    }

    public  void sanslıKullanıcı(List<Kullanıcı>kll){

        for (Kullanıcı k:kll ) {
            if (k.kayitZamani.getSecond()<10){
                System.out.println("Sanslı kişisiniz"+ k.name+"agam 5 kilo bal kazandın  ;)");
            }else System.out.println("maalesef"+k.name+"ballar balını buldunuz kovanınız yagmalandı");
        }

    }

    public void listele(List<Kullanıcı>kullanıcılar){
        for (Kullanıcı k:kullanıcılar){
            System.out.println("adı :"+k.name+"kayıt zamanı : "+k.kayitZamani);
        }
    }
}

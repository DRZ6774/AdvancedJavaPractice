package _11_dateTime.HaftaninSorusu;

import java.time.LocalDateTime;

public class Kullanıcı {
    String name;
    LocalDateTime kayitZamani;
    public Kullanıcı(){

    }

    public Kullanıcı(String name,LocalDateTime kayitZamani){
      this.name = name;
      this.kayitZamani=kayitZamani;
    }

}

package day13_methodOlusturma;

public class C01_MethodOlusturma {
    public static void main(String[] args) {
        String str= "Java Candir";
        // Str'i buyuk harflere cevirin

        str=str.toUpperCase(); // atama yaptı
     //   str=str.toBuyukHarf(); Altinda calisan method onemli kullanilan kelime onemli degil.
        System.out.println(str.toLowerCase()); // yazdirdi (ama atama yapılmadıysa gecici)

        //Iki tip method vardir;
        //1- Bir islem yapan veya yazdıran method ise method call'un return type'i  = void olur
        //2- Bir sonuc donduren bir method isr method call'un return type'i = return olur (Sonucu Ya Yazdirabiliriz ya da bir variable a kaydedebiliriz)
    }
}

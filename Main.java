import java.util.Scanner;

public class Main {
    public static void main (String[] args ){
        //Değişkenleri oluştur
        int mat, fizik, kimya, turkce,tarih, muzik;
        String durum;
        //Scanner sınıfını tanımladık
        Scanner inp = new Scanner(System.in);
        
        //Kullanıcıdan değer al
        System.out.print("Matematik Notunuz :");
        mat = inp.nextInt();
    
        System.out.print("Fizik Notunuz :");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz :");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz :");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz :");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam/6.0;
        System.out.println("Ortalamanız : " +sonuc);
        
        System.out.println(sonuc >= 60);

        durum = (sonuc>=60)? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.println(durum);


    }
}

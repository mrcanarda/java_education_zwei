

public class App {
   
//    public static void toplama(int a, int b, int c) {
//     System.out.println("Toplamlari"  + (a+b+c));
//    }

//    public static void ortalama (int a, int b, int c, int d) {
//     System.out.println("Ortalamasi" + ((a+b+c) / d));
//    }

   public static int toplama(int a, int b, int c) {
    return ((a + b) * c);
   }
    public static void main(String[] args) {

        System.out.println("sonucunuz" + toplama(4, 6, 10));

        // toplama(4, 5, 6);
        // ortalama(4, 5, 6, 3);
        // Scanner s = new Scanner(System.in); // Scanner nesnesi oluştur
        // System.out.print("Kilonuzu girin: ");
        // String isim = s.nextLine(); // Kullanıcıdan bir metin al
        // System.out.println("Merhaba, " + isim + "!");
        // s.close(); // Scanner nesnesini kapat

        // Scanner s = new Scanner(System.in);
        
        // int giris_hakki = 3;

        // String sys_kullanici_adi = "Can Arda";
        // String sys_parola = "12345";

        // System.out.println("**************************");
        // System.out.println("Kullanici Girisine Hosgeldiniz");
        // System.out.println("**************************");
        
        // while (true) {
        //     System.out.println("Kullanici adinizi Giriniz: ");
        //     String kullanici = s.nextLine();
        //     System.out.println("Parola Giriniz: ");
        //     String parola = s.nextLine();

        //     if (kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
        //         System.out.println("Hosgeldinz " + sys_kullanici_adi);
        //         break;

        //     } 
        //     else if (kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)) {
        //         System.out.println("Parolaniz Yanlis" + giris_hakki );
        //         giris_hakki -= 1;
        //     }
        //     else if (!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
        //         System.out.println("Kullanici Adiniz Yanlis" + giris_hakki);
        //         giris_hakki -= 1;
        //     }

        //     else {
               
        //         System.out.println("giris_hakkiniz:" + giris_hakki);
        //         giris_hakki -=1;
        //     }

        //     if(giris_hakki  == 0 ) {
        //         System.out.print("Giris Hakkiniz Kalmadi Cikin disari!");
        //         break;
        //     }
        // }
        


        // @SuppressWarnings("resource")
        // Scanner s = new Scanner(System.in); // Scanner nesnesi oluştur


        // System.out.println("Bankamizia Hosgeldiniz Faiz Orani 6%" );

        // int anapara, vade;

        // System.out.println("Bankamiza kac para yatirmak istediginizi belirtiniz");
        // anapara = s.nextInt();
        // System.out.println("Kac senelik vadeli hesap kullanmak istiyorsunuz");
        // vade = s.nextInt();

        // double toplampara = anapara;
        // double faizorani = 0.06;

        // for(int i = 1; i<=vade; i++ ) {
            
        //     toplampara = (anapara * faizorani)+toplampara;

        //     System.out.println(i + "yilin sonunda hesabinizda" + toplampara);
        }
    }

// Tam sayı: nextInt()
// Ondalıklı sayı: nextDouble()
// Tek kelime/metin: next()
// Satır/metin: nextLine()


//
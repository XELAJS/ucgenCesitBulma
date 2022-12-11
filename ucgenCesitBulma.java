import java.util.*;
public class ucgenCesitBulma {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        System.out.print("Birinci kenarı giriniz:");
        double kenar1 = girdi.nextDouble();
        if (kenar1 < 0 || kenar1==0) {
            System.out.println("Kenar uzunluğu negatif ya da 0 olamaz.");
        } else {
            System.out.print("İkinci kenarı giriniz:");
            double kenar2 = girdi.nextDouble();
            if (kenar2 < 0 || kenar2==0) {
                System.out.println("Kenar uzunluğu negatif ya da 0 olamaz");
            } else {
                System.out.print("Üçüncü kenarı giriniz:");
                double kenar3 = girdi.nextDouble();
                if (kenar3 < 0 || kenar3==0) {
                    System.out.println("Kenar uzunluğu negatif ya da 0 olamaz.");
                } else {

                    double fark1 = kenar3 - kenar2;
                    fark1 = Math.abs(fark1);
                    double fark2 = kenar3 - kenar1;
                    fark2 = Math.abs(fark2);
                    double fark3 = kenar2 - kenar1;
                    fark3 = Math.abs(fark3);
                    double toplam1 = kenar3 + kenar2;
                    double toplam2 = kenar3 + kenar1;
                    double toplam3 = kenar2 + kenar1;


                    if (fark1 < kenar1 && kenar1 < toplam1 && fark2 < kenar2 && kenar2 < toplam2 && fark3 < kenar3 && kenar3 < toplam3) {
                        if (kenar1==kenar2 && kenar2==kenar3){
                            System.out.print("Eşkenar ");
                        } else if (kenar1==kenar2 && kenar3!=kenar2) {
                            System.out.print("İkizkenar ");
                        } else if (kenar1==kenar3 && kenar2!=kenar3) {
                            System.out.print("İkizkenar ");

                        }else if (kenar2==kenar3 && kenar3!=kenar1){
                            System.out.println("İkizkenar ");
                        }else System.out.print("Çeşitkenar ");
                        if ((kenar1*kenar1)+(kenar2*kenar2)==kenar3*kenar3 || (kenar1*kenar1)+(kenar3*kenar3)==kenar2*kenar2 || (kenar3*kenar3)+(kenar2*kenar2)==(kenar1*kenar1) ){
                            System.out.print("dik");
                        }
                        System.out.println(" üçgen çizilebilir");
                    } else System.out.println("Üçgen çizilemez");
                }
            }
        }
    }
}
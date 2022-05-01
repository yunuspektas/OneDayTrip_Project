package OneDayTrip.Restaurant;


import OneDayTrip.Cinema.CinemaRunner;

import java.util.*;

import static OneDayTrip.Restaurant.RestaurantRunner.lMenu;

public class IslemYap {
    static double fatura = 0.0;
    static double bahsis = 0.0;
    static Scanner scan = new Scanner(System.in);
    public static List<Yemek> yemekList = new ArrayList<>();// müşterinin yediği yemeklerin Listi
    public static List<Icecek> icecekList = new ArrayList<>();// müşterinin yediği CECEKLERİN Listi
    public static Integer id;

    //!!!!!!!!!!!!!!!!!!!!!
    public static void SecımYap(IMenu ymk, IMenu ick, IMenu cine) {
        System.out.println("");
        System.out.println("=======================================================");
        System.out.println("****   Lütfen Yapmak Istediğiniz Işlemi Seçiniz   *****");
        System.out.println("=======================================================");
        System.out.println("\n1- Restaurant\n2- Sinema\n");

        String ıslem = scan.next();
        switch (ıslem) {
            case "1":
                lMenu(ymk);
                lMenu(ick);
                break;
            case "2":
                lMenu(cine);
                break;
            default:
                System.out.println("");
        }
    }


    public static void HesapIste() {
        System.out.println("******  HESABINIZ  *********");
        System.out.println("");
        fatura += yemekList.get(0).getPrice() + icecekList.get(0).getPrice();
        System.out.println("1- " + yemekList.get(0).getName() + " " + yemekList.get(0).getPrice());
        System.out.println("2- " + icecekList.get(0).getName() + " " + icecekList.get(0).getPrice());

        if (bahsis > 0.0) {
            System.out.println("3- Bahsis " + bahsis);
        }
        System.out.println("");
        System.out.println("*****************************");
        System.out.println("");
        System.out.println("Toplam Faturanız : " + fatura + "\n\n");

        System.out.println("Bir sonraki aktiviteniz ne olsun \n1- Sinema \n2- Çıkış");
        switch (scan.nextInt()) {

            case 1: {
                System.out.println("ArtOfCoding Cinema ya gidiyoruz .. ");
                CinemaRunner cine = new CinemaRunner();
                cine.listMenu();
                break;
            }
            case 2: {
                System.out.println("Umarız gününüz eğlenceli geçmiştir, iyi günler .. ");
                System.exit(0);
            }
            default: {
                System.out.println("!!! Hatalı giriş yaptınız ");
            }
        }
    }

    public static void GarsonaBahsısBırak() {
        System.out.println("Garsona Bahsis bırakmak ister misiniz ? \n1- Evet \n2- Hayır  ");
        switch (scan.nextInt()) {
            case 1: {
                bahsis();
                HesapIste(); // clean
                break;
            }
            case 2: {
                HesapIste(); //clean
                break;
            }
            default: {
                System.out.println("!! Giriş hatalı");
            }
        }
    }

    public static void bahsis() {
        System.out.println("Bırakmak istediğiniz bahşiş miktarını giriniz : ");
        bahsis = scan.nextDouble();
        fatura += bahsis;
    }
}

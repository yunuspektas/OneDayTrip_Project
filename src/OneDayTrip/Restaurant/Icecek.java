package OneDayTrip.Restaurant;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static OneDayTrip.Restaurant.IslemYap.GarsonaBahsısBırak;
import static OneDayTrip.Restaurant.IslemYap.icecekList;

public class Icecek implements IMenu {


    private String name;
    private double price;
    static int id = 8;
    static Scanner scan = new Scanner(System.in);
    static Map<Integer, Icecek> icecekMapim = new TreeMap<>(); // ıcecek objelerimiz burada

    public Icecek() {

        Icecek ick1 = new Icecek("Caffè Americano", 80.0);
        Icecek ick2 = new Icecek("Turk kahvesi", 70.0);
        Icecek ick3 = new Icecek("Royal Milk Tea", 60.0);
        Icecek ick4 = new Icecek("Limonada Peruana", 50.0);
        Icecek ick5 = new Icecek("Kefir", 40.0);
        Icecek ick6 = new Icecek("Paloma", 80.0);
        Icecek ick7 = new Icecek("çay", 100.0);
        icecekMapim.put(1, ick1);
        icecekMapim.put(2, ick2);
        icecekMapim.put(3, ick3);
        icecekMapim.put(4, ick4);
        icecekMapim.put(5, ick5);
        icecekMapim.put(6, ick6);
        icecekMapim.put(7, ick7);
    }

    public Icecek(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void listMenu() {
        System.out.println("***** İçecek istermisiniz ****** \n1-Evet\n2-Hayır ");
        if (scan.nextInt() == 1) {
            System.out.println("****** lütfen içecek seçiniz *****\n");
            System.out.println("Menümüzde bulunan çeşitler");
            System.out.println("--------------------------");
            System.out.println("\n1-Caffè Americano – İtalya\n2-Turk kahvesi – Türkiye\n" +
                    "3-Royal Milk Tea – Japonya\n4-Limonada Peruana – Peru\n5-Kefir– Türkiye\n" +
                    "6-Paloma – Meksika\n7-çay-Van;-)");
            System.out.println("************** Tercihiniz harika olacak *************");

            int secim = scan.nextInt();
            switch (secim) {
                case 1:
                    System.out.println("Italya'nın en lezzettli İçeceğidir");
                    icecekList.add(icecekMapim.get(1)); // içecekListinm içine ick1  objemi ekledim
                    break;
                case 2:
                    System.out.println("turk kahvesi muhteşemdir efendim;-)");
                    icecekList.add(icecekMapim.get(2));
                    break;
                case 3:
                    System.out.println("Hiç denemedim güzel olabilir?");
                    icecekList.add(icecekMapim.get(3));
                    break;
                case 4:
                    System.out.println("Limonada Peruana harikadır p");
                    icecekList.add(icecekMapim.get(4));
                    break;
                case 5:
                    System.out.println("Kefir içen bir daha içer");
                    icecekList.add(icecekMapim.get(5));
                    break;
                case 6:
                    System.out.println("Paloma !!! dikkat uçurabilir;-)");
                    icecekList.add(icecekMapim.get(6));
                    break;
                case 7:
                    System.out.println("Van kaçak çay  candır gerisi lafıguzar");
                    icecekList.add(icecekMapim.get(7));
                    System.out.println(icecekMapim.get(7));
                    break;
                default:
                    System.out.println("bunları ıstemıyorsanız eğer ikileyin ");

            }
            GarsonaBahsısBırak();
        } else System.out.println("peki siz bilirsiniz");


    }
}

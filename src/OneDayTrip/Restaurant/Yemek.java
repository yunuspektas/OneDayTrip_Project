package OneDayTrip.Restaurant;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static OneDayTrip.Restaurant.IslemYap.yemekList;

public class Yemek implements IMenu {

    private String name;
    private Double price;
    static Map<Integer, Yemek> yemekMapım = new HashMap<>(); // yemek objelerimiz burada
    static int id = 8;
    static Scanner scan = new Scanner(System.in);

    public Yemek() {
        Yemek ymk1 = new Yemek("Margherita Pizza", 50.0);
        Yemek ymk2 = new Yemek("Adana Kebap", 30.0);
        Yemek ymk3 = new Yemek("Ramen", 40.0);
        Yemek ymk4 = new Yemek("Lomo saltado", 60.0);
        Yemek ymk5 = new Yemek("Döner", 25.0);
        Yemek ymk6 = new Yemek("Tacos al Pastor", 15.5);
        Yemek ymk7 = new Yemek("Keledoş", 30.0);
        yemekMapım.put(1, ymk1);
        yemekMapım.put(2, ymk2);
        yemekMapım.put(3, ymk3);
        yemekMapım.put(4, ymk4);
        yemekMapım.put(5, ymk5);
        yemekMapım.put(6, ymk6);
        yemekMapım.put(7, ymk7);


    }

    public Yemek(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public void listMenu() {
        System.out.println("************** Tercihiniz harika olacak ****************");
        System.out.println("lütfen yemeğinizi seçiniz");
        System.out.println(" ");
        System.out.println("Menümüzde bulunan çeşitler ");
        System.out.println("--------------------------");
        System.out.println("\n1-Margherita Pizza – İtalya\n2-Adana Kebap – Türkiye\n" +
                "3-Ramen – Japonya\n4-Lomo saltado – Peru\n5-Döner – Türkiye\n" +
                "6-Tacos al Pastor – Meksika\n7-Keledoş-Van;-)");

        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                System.out.println("Italya'nın en lezzettli yemeğidir");
                yemekList.add(yemekMapım.get(1));       // yemekListin içine ymk1 (pizza) objemi ekledim
                break;
            case 2:
                System.out.println("Kebap candir efendim;-)");
                yemekList.add(yemekMapım.get(2));
                break;
            case 3:
                System.out.println("Hiç denemedim güzel olabilir?");
                yemekList.add(yemekMapım.get(3));
                break;
            case 4:
                System.out.println("Lomo saltado peru'kimse yiyemez.Elit işidir");
                yemekList.add(yemekMapım.get(4));
                break;
            case 5:
                System.out.println("doneri bulan banada haber etsin");
                yemekList.add(yemekMapım.get(5));
                break;
            case 6:
                System.out.println("Tacos al Pastor !!! dikkat ;yabancı madde çıkabılır");
                yemekList.add(yemekMapım.get(6));
                break;
            case 7:
                System.out.println("Van'nın yemekleri candır gerisi  heyecandır ");
                yemekList.add(yemekMapım.get(7));
                break;
            default:
                System.out.println("bunları ıstemıyorsanız  diğer tarafa bilet alın ");

        }
        System.out.println("");

    }
}

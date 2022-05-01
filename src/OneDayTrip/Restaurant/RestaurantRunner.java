package OneDayTrip.Restaurant;

//import static OneDayTrip.Restaurant.IslemYap.Restaurant;

public class RestaurantRunner {

    public RestaurantRunner() {
        Yemek ymk = new Yemek();
        Icecek ıck = new Icecek();
        lMenu(ymk);

    }

    public static void main(String[] args) {


    }

    public static void lMenu(IMenu menu) {
        menu.listMenu();
    }



}

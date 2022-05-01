import OneDayTrip.Cinema.CinemaRunner;
import OneDayTrip.Restaurant.Icecek;
import OneDayTrip.Restaurant.IslemYap;
import OneDayTrip.Restaurant.Yemek;

public class OneDayTripRunner {
    public static void main(String[] args) {
        Yemek ymk = new Yemek();
        Icecek ick = new Icecek();
        CinemaRunner cine = new CinemaRunner();
        IslemYap.SecımYap(ymk, ick, cine);
    }
}

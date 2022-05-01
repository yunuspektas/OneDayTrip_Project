package OneDayTrip.Cinema;

import OneDayTrip.Restaurant.IMenu;

public class CinemaRunner implements IMenu {

    public CinemaRunner() {
    }

    @Override
    public  void listMenu() {
        Room.initializeRooms();
        Movie mv = new Movie();

        TicketReservation.banner();
        TicketReservation.ticket();

    }


}

package ro.ase.acs.Adapter;

public class LowCostToFlightBookingAdapter extends FlightBooking {
    private LowCostFlightBooking lowCostFlightBooking;

    public LowCostToFlightBookingAdapter(LowCostFlightBooking lowCostFlightBooking){
        this.lowCostFlightBooking=lowCostFlightBooking;
    }

    @Override
    public boolean addBooking(int row, char seat) {
        lowCostFlightBooking.reserveFlight();
        return true;
    }

    @Override
    public void displaySeats() {
        lowCostFlightBooking.seatMap();
    }
}
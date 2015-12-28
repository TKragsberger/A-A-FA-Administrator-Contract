package contract.dto.departure;

import contract.dto.reservation.ReservationSummary;
import contract.dto.route.RouteDetail;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Thomas Kragsberger
 */
public class DepartureDetail extends DepartureIdentifier{

    private Date date;
    private long routeId;
    private Collection<ReservationSummary> reservations;
    private int currentPassengers;
    private int currentVehicles;
    private int currentLargeVehicles;
    
    public DepartureDetail(long id, Date date, long routeId, int currentPassengers, int currentVehicles, int currentLargeVehicles) {
        super(id);
        this.date = date;
        this.routeId = routeId;
        this.reservations = new ArrayList<>();
        this.currentPassengers = currentPassengers;
        this.currentVehicles = currentVehicles;
        this.currentLargeVehicles = currentLargeVehicles;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getRouteId() {
        return routeId;
    }

    public void setRouteId(long routeId) {
        this.routeId = routeId;
    }

    public Collection<ReservationSummary> getReservations() {
        return reservations;
    }

    public void setReservations(Collection<ReservationSummary> reservations) {
        this.reservations = reservations;
    }

    public int getCurrentPassengers() {
        return currentPassengers;
    }

    public void setCurrentPassengers(int currentPassengers) {
        this.currentPassengers = currentPassengers;
    }

    public int getCurrentVehicles() {
        return currentVehicles;
    }

    public void setCurrentVehicles(int currentVehicles) {
        this.currentVehicles = currentVehicles;
    }
    
    public int getCurrentLargeVehicles(){
        return currentLargeVehicles;
    }
    
    public void setCurrentLargeVehicles(int currentLargeVehicles){
        this.currentLargeVehicles = currentLargeVehicles;
    }
    
    public void addReservation(ReservationSummary reservation){
        this.reservations.add(reservation);
    }
}

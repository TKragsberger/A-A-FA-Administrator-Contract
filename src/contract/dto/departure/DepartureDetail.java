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
    
    public DepartureDetail(long id, Date date, long routeId) {
        super(id);
        this.date = date;
        this.routeId = routeId;
        this.reservations = new ArrayList<>();
        this.currentPassengers = 0;
        this.currentVehicles = 0;
        this.currentLargeVehicles = 0;
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
    
    public void addPassengers(int numberOfPassengers){
        for(int i = 0; i < numberOfPassengers; i++){
            this.currentPassengers++;
        }
    }
    
    public void addVehicles(int numberOfVehicles){
        for(int i = 0; i < numberOfVehicles; i++){
            this.currentVehicles++;
        }
    }
    
    public void addLargeVehicles(int numberOfLargeVehicles){
        for(int i = 0; i < numberOfLargeVehicles; i++){
            this.currentLargeVehicles++;
        }
    }
}

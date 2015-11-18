/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contract.dto;

import java.util.Date;


public class ReservationSummary extends ReservationIdentifier{
    
    private Date date;
    private String ticketType;
    private String firstName;
    private String lastName;
    private String email;
    private int routeId;

    public ReservationSummary(long id, Date date, String ticketType, String firstName, String lastName, String email, int routeId) {
        super(id);
        this.date = date;
        this.ticketType = ticketType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.routeId = routeId;
    }

    public Date getDate() {
        return date;
    }

    public String getTicketType() {
        return ticketType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getRoute() {
        return routeId;
    }
    
}

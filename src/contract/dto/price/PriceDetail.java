/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contract.dto.price;

/**
 * The price detail will be used for creating a table of alle the prices. 
 * the passenger type will tell if the passenger is in a car, bus og is walking onboard,
 * how many passenger there are in a car
 */
public class PriceDetail extends PriceIdentifier{
    private String passengerType;
    private int numberOfPassengers;
    private double price;

    public PriceDetail(long id, String passengerType, int numberOfPassengers, double price) {
        super(id);
        this.passengerType = passengerType;
        this.numberOfPassengers = numberOfPassengers;
        this.price = price;
    }

    public String getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(String passengerType) {
        this.passengerType = passengerType;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

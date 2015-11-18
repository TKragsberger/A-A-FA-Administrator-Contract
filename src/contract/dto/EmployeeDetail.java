/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contract.dto;

/**
 * The employee detail tells about an employees position in the company and the 
 * salery he or she gets.
 */
public class EmployeeDetail extends EmployeeIdentifier{
    private String firstName;
    private String lastName;
    private String email;
    private double salery;
    private String position;

    public EmployeeDetail(String firstName, String lastName, String email, double salery, long id, String position) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.salery = salery;
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalery() {
        return salery;
    }

    public void setSalery(double salery) {
        this.salery = salery;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contract.dto;


public class EmployeeSummary extends EmployeeIdentifier{
    
    private String firstName;
    private String lastName;
    private String email;
    private String position;

    public EmployeeSummary(long id, String firstName, String lastName, String email, String position) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.position = position;
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

    public String getPosition() {
        return position;
    }
    
    
}

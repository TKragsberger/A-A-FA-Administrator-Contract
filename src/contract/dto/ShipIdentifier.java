/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contract.dto;

import java.io.Serializable;

/**
 *
 * @author Thomas
 */
public class ShipIdentifier implements Serializable{
    private final long id;

    public ShipIdentifier(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}

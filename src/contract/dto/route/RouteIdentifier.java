/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contract.dto.route;

import java.io.Serializable;

/**
 *
 * @author Thomas
 */
public class RouteIdentifier implements Serializable{
    private final long id;

    public RouteIdentifier(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}

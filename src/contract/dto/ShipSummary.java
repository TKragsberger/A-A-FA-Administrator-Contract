package contract.dto;

import java.io.Serializable;

/**
 *
 * @author Thomas Kragsberger
 */
public abstract class ShipSummary implements Serializable{
    private long shipId;
    private String name;

    public ShipSummary(long shipId, String name){
        this.shipId = shipId;
        this.name = name;
    }

    public long getShipId(){
        return shipId;
    }

    public void setShipId(long shipId){
        this.shipId = shipId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public abstract String getShipDescription();
}

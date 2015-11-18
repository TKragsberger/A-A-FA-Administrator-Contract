package contract.dto.ship;

import java.io.Serializable;

/**
 *
 * @author Thomas Kragsberger
 */
public abstract class ShipSummary extends ShipIdentifier{
    private String name;

    public ShipSummary(long shipId, String name){
        super(shipId);
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public abstract String getShipDescription();
}

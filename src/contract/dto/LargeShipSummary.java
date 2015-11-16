package contract.dto;

import java.util.Date;

/**
 *
 * @author Thomas Kragsberger
 */
public class LargeShipSummary extends ShipSummary{

    public LargeShipSummary(long shipId, String name){
        super(shipId, name);
    }

    @Override
    public String getShipDescription(){
        return "Walking passengers, Small cars, Large vehicles, Changeable deck";
    }
}

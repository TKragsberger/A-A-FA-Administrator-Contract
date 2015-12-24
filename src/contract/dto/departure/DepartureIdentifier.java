package contract.dto.departure;

import java.util.Date;

/**
 *
 * @author Thomas Kragsberger
 */
public class DepartureIdentifier {
    private final long id;
    
    public DepartureIdentifier(long id){
        this.id = id;
    }
    
    public long getId(){
        return id;
    }
}

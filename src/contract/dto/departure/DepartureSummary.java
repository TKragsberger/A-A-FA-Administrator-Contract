package contract.dto.departure;

import contract.dto.route.RouteDetail;
import java.util.Date;

/**
 *
 * @author Thomas Kragsberger
 */
public class DepartureSummary extends DepartureIdentifier{

    private Date date;
    private long routeId;
    
    public DepartureSummary(long id, Date date, long routeId) {
        super(id);
        this.date = date;
        this.routeId = routeId;
    }

    public Date getDate() {
        return date;
    }

    public long getRouteId() {
        return routeId;
    }
    
}

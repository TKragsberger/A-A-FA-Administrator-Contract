package contract.dto.department;

import java.io.Serializable;

/**
 *
 * @author Thomas Kragsberger
 */
public class DepartmentIndentifier implements Serializable{
    private final long id;

    public DepartmentIndentifier(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}

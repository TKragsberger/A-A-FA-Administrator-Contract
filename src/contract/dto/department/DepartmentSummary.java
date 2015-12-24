package contract.dto.department;

/**
 *
 * @author Thomas Kragsberger
 */
public class DepartmentSummary extends DepartmentIndentifier{
    private String description;
    
    public DepartmentSummary(long id, String description) {
        super(id);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}

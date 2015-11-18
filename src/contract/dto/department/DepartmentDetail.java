package contract.dto.department;

import contract.dto.employee.EmployeeDetail;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Thomas Kragsberger
 */
public class DepartmentDetail extends DepartmentIndentifier{
    private String name;
    private String description;
    private Collection<EmployeeDetail> employees;
    
    public DepartmentDetail(long id, String name, String description) {
        super(id);
        this.name= name;
        this.description = description;
        employees = new ArrayList<>();
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public void addEmployee(EmployeeDetail employeeDetail){
        employees.add(employeeDetail);
    }
}

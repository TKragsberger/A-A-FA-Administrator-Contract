/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contract;
//test
import contract.dto.EmployeeDetail;
import contract.dto.EmployeeSummary;
import contract.dto.PriceDetail;
import contract.dto.ReservationDetail;
import contract.dto.ReservationSummary;
import contract.dto.ScheduleDetail;
import contract.dto.ScheduleSummary;
import contract.dto.ShipDetail;
import contract.dto.ShipSummary;
import contract.dto.WeatherDetail;
import java.util.Collection;
import java.util.Date;



public interface DataRepository {
    public Collection<EmployeeSummary> getEmployees();
    public EmployeeDetail getEmployee(int id);
    public Collection<ScheduleSummary> getScheduleSummary(Date date);
    public ScheduleDetail getScheduleDetail(Date date, int routeId);
    public Collection<PriceDetail> getPrices();
    public boolean removeEmployee(EmployeeDetail employee);
    public boolean updatePrice(PriceDetail updatedPrice);
    public boolean createEmployee(EmployeeDetail newEmployee);
    public Collection<ReservationSummary> getReservations(Date date);
    public ReservationDetail getReservation(int id);
    public WeatherDetail getWeatherDetail(Date date);
    public boolean updateEmployee(EmployeeDetail updatedEmployee);
    public ShipDetail getShipDetail(int id);
    public Collection<ShipSummary> getShips();
}

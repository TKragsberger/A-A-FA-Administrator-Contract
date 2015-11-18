/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contract;

import contract.dto.employee.EmployeeDetail;
import contract.dto.employee.EmployeeSummary;
import contract.dto.price.PriceDetail;
import contract.dto.reservation.ReservationDetail;
import contract.dto.reservation.ReservationSummary;
import contract.dto.schedule.ScheduleDetail;
import contract.dto.schedule.ScheduleSummary;
import contract.dto.ship.ShipDetail;
import contract.dto.ship.ShipSummary;
import contract.dto.weather.WeatherDetail;
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

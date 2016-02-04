/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author trogers8
 */
public class HRManager {
    private Employee employee;
    
    public void hireEmployee(String firstName, String lastName, String ssn){
        Employee e = new Employee();
        e.setFirstName(firstName);
        e.setLastName(lastName);
        e.setSsn(ssn);
        employee = e;
               
    }
    
    public void orientEmployee(){
        employee.doOrientation("101");
    }
    
    public String getEmployeeStatus() {
        return employee.getStatus();
    }
}

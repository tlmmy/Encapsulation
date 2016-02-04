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
public class Company {
    private HRManager hr;

    public Company(){
        hr = new HRManager();
    }
    
       public void hireEmployee(String firstName, String lastName, String ssn){
        hr.hireEmployee(firstName, lastName, ssn);
               
    }
    
    public HRManager getHr() {
        return hr;
    }

    public void setHr(HRManager hr) {
        this.hr = hr;
    }
    
    
}

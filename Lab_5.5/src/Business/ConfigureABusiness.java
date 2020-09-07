/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Organization.AdminOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.UserAccount.UserAccount;

/**
 *
 * @author ran
 */
public class ConfigureABusiness {
    
    public static Business configure(){
        // Three roles: LabAssistant, Doctor, Admin
        
        Business business = Business.getInstance();
        
        //add admin
        AdminOrganization adminOrganization = new AdminOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(adminOrganization);
        
        
        Employee employee1 = new Employee();
        employee1.setName("BochaoWang");
        
        UserAccount account1= new UserAccount();
        account1.setUsername("admin");
        account1.setPassword("admin");
        account1.setRole("admin");
        
        account1.setEmployee(employee1);

        adminOrganization.getEmployeeDirectory().getEmployeeList().add(employee1);
        
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account1);
        
        //add lab assitant
        LabOrganization labOrganization = new LabOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(labOrganization);
        
        Employee employee2 = new Employee();
        employee2.setName("Ben");
        
        UserAccount account2= new UserAccount();
        account2.setUsername("lab");
        account2.setPassword("lab");
        account2.setRole("lab assitant");
        
        account2.setEmployee(employee2);

        labOrganization.getEmployeeDirectory().getEmployeeList().add(employee2);
        
        labOrganization.getUserAccountDirectory().getUserAccountList().add(account2);
        
        //doctor
        DoctorOrganization doctorOrganization = new DoctorOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(doctorOrganization);
        
        
        Employee employee3 = new Employee();
        employee3.setName("Jackie");
        
        UserAccount account3= new UserAccount();
        account3.setUsername("doctor");
        account3.setPassword("doctor");
        account3.setRole("Doctor");
        
        account3.setEmployee(employee3);

        doctorOrganization.getEmployeeDirectory().getEmployeeList().add(employee3);
        
        doctorOrganization.getUserAccountDirectory().getUserAccountList().add(account3);

        
        return business;
    }
    
}

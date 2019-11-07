package com.test.salaryservice;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyTest {
    private Company company = new Company();
    private Employee manager = new Manager();
    private Employee scrumMaster = new ScrumMaster();
    private Employee developer = new Developer();


    @Before
    public void init() {
        company.setName("SuperCompany");
        manager.setName("Manager");
        manager.setSurname("ManagerSurname");
        manager.setRatePerHour(10);
        manager.setWorkdays(5);
        scrumMaster.setName("ScrumMaster");
        scrumMaster.setSurname("ScrumMasterSurname");
        scrumMaster.setRatePerHour(15);
        scrumMaster.setWorkdays(4);
        developer.setName("Developer");
        developer.setSurname("DeveloperSurname");
        developer.setRatePerHour(20);
        developer.setWorkdays(7);
        developer.setBonuses(50.00);
    }

    @Test
    public void shouldAddEmploees() {
        assertTrue(company.getEmployees().isEmpty());
        company.addEmploee(manager);
        assertFalse(company.getEmployees().isEmpty());
        company.addEmploee(scrumMaster);
        assertEquals(2, company.getEmployees().size());
        company.addEmploee(developer);
        assertEquals(3, company.getEmployees().size());
    }

    @Test
    public void shouldNotPay() {
        company.setBudget(1000.00);
        company.addEmploee(manager);
        company.addEmploee(scrumMaster);
        company.addEmploee(developer);
        SalaryServise salaryService = company.getSalaryService();
        salaryService.pay(company);
    }

    @Test
    public void shouldPay() {
        company.setBudget(10000.00);
        company.addEmploee(manager);
        company.addEmploee(scrumMaster);
        company.addEmploee(developer);
        SalaryServise salaryService = company.getSalaryService();
        salaryService.pay(company);
    }
}
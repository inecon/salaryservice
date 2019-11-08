package com.test.salaryservice;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyTest {
    private Company company = new Company();
    private Employee manager;
    private Employee scrumMaster;
    private Employee developer;

    @Before
    public void init() {
        company.setName("SuperCompany");
        manager = new Employee("Manager", "ManagerSurname", 10.00, 5, Role.MANAGER);
        scrumMaster = new Employee("ScrumMaster", "ScrumMasterSurname", 15.00, 4, Role.SCRUM_MASTER);
        developer = new Employee("Developer", "DeveloperSurname", 20.00, 7, 50.00, Role.DEVELOPER);
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

    @Test(expected = NotEnoughBudgetException.class)
    public void shouldNotPay() {
        company.setBudget(1000.00);
        company.addEmploee(manager);
        company.addEmploee(scrumMaster);
        company.addEmploee(developer);
        SalaryService salaryService = company.getSalaryService();
        salaryService.pay(company);
    }

    @Test
    public void shouldPay() {
        company.setBudget(10000.00);
        company.addEmploee(manager);
        company.addEmploee(scrumMaster);
        company.addEmploee(developer);
        SalaryService salaryService = company.getSalaryService();
        salaryService.pay(company);
    }
}
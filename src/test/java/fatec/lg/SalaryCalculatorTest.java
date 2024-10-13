package fatec.lg;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SalaryCalculatorTest {

    @Test
    void testDesenvolvedorSalaryAbove3000() {
        Employee employee = new Employee("João", "joao@example.com", 3500.0, Role.DESENVOLVEDOR);
        SalaryCalculator calculator = new SalaryCalculator();
        double netSalary = calculator.calculateNetSalary(employee);
        assertEquals(2800.0, netSalary, 0.01);
    }

    @Test
    void testDesenvolvedorSalaryBelow3000() {
        Employee employee = new Employee("Maria", "maria@example.com", 2500.0, Role.DESENVOLVEDOR);
        SalaryCalculator calculator = new SalaryCalculator();
        double netSalary = calculator.calculateNetSalary(employee);
        assertEquals(2250.0, netSalary, 0.01);
    }

    @Test
    void testDBASalaryAbove2000() {
        Employee employee = new Employee("Pedro", "pedro@example.com", 2500.0, Role.DBA);
        SalaryCalculator calculator = new SalaryCalculator();
        double netSalary = calculator.calculateNetSalary(employee);
        assertEquals(1875.0, netSalary, 0.01);
    }

    @Test
    void testDBASalaryBelow2000() {
        Employee employee = new Employee("Ana", "ana@example.com", 1800.0, Role.DBA);
        SalaryCalculator calculator = new SalaryCalculator();
        double netSalary = calculator.calculateNetSalary(employee);
        assertEquals(1530.0, netSalary, 0.01);
    }

    @Test
    void testTestadorSalaryAbove2000() {
        Employee employee = new Employee("Lucas", "lucas@example.com", 2200.0, Role.TESTADOR);
        SalaryCalculator calculator = new SalaryCalculator();
        double netSalary = calculator.calculateNetSalary(employee);
        assertEquals(1650.0, netSalary, 0.01);
    }

    @Test
    void testGerenteSalaryAbove5000() {
        Employee employee = new Employee("Carla", "carla@example.com", 6000.0, Role.GERENTE);
        SalaryCalculator calculator = new SalaryCalculator();
        double netSalary = calculator.calculateNetSalary(employee);
        assertEquals(4200.0, netSalary, 0.01);
    }

    @Test
    void testGerenteSalaryBelow5000() {
        Employee employee = new Employee("Rafael", "rafael@example.com", 4500.0, Role.GERENTE);
        SalaryCalculator calculator = new SalaryCalculator();
        double netSalary = calculator.calculateNetSalary(employee);
        assertEquals(3600.0, netSalary, 0.01);
    }
}

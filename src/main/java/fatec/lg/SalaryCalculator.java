package fatec.lg;

public class SalaryCalculator {
    public double calculateNetSalary(Employee employee) {
        double baseSalary = employee.getBaseSalary();
        Role role = employee.getRole();

        switch (role) {
            case DESENVOLVEDOR:
                if (baseSalary >= 3000) {
                    return baseSalary * 0.80;
                } else {
                    return baseSalary * 0.90;
                }
            case DBA:
            case TESTADOR:
                if (baseSalary >= 2000) {
                    return baseSalary * 0.75;
                } else {
                    return baseSalary * 0.85;
                }
            case GERENTE:
                if (baseSalary >= 5000) {
                    return baseSalary * 0.70;
                } else {
                    return baseSalary * 0.80;
                }
            default:
                throw new IllegalArgumentException("Cargo inválido");
        }
    }
}

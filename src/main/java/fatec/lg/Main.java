package fatec.lg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        String name = scanner.nextLine();

        System.out.println("Digite o email do funcionário:");
        String email = scanner.nextLine();

        System.out.println("Digite o salário-base do funcionário:");
        double baseSalary = scanner.nextDouble();

        System.out.println("Selecione o cargo do funcionário:");
        System.out.println("1 - Desenvolvedor");
        System.out.println("2 - DBA");
        System.out.println("3 - Testador");
        System.out.println("4 - Gerente");
        int roleOption = scanner.nextInt();

        Role role;
        switch (roleOption) {
            case 1:
                role = Role.DESENVOLVEDOR;
                break;
            case 2:
                role = Role.DBA;
                break;
            case 3:
                role = Role.TESTADOR;
                break;
            case 4:
                role = Role.GERENTE;
                break;
            default:
                scanner.close();
                throw new IllegalArgumentException("Opção de cargo inválida.");
        }

        Employee employee = new Employee(name, email, baseSalary, role);

        SalaryCalculator calculator = new SalaryCalculator();
        double netSalary = calculator.calculateNetSalary(employee);

        System.out.printf("O salário líquido de %s é: R$ %.2f%n", name, netSalary);

        scanner.close();
    }}
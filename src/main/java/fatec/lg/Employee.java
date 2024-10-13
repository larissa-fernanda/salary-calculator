package fatec.lg;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Employee {
    private String name;
    private String email;
    private double baseSalary;
    private Role role;

}

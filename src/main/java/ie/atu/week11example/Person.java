package ie.atu.week11example;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Person {
    @NotBlank
    private String name;

    @Min(18)
    private int age;

    @Email
    private String email;

    @NotBlank
    private String title;

    @NotBlank
    private String employeeId;

    @NotBlank
    private String position;

    @NotBlank
    private String department;

}

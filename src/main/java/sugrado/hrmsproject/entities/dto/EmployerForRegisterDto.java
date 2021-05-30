package sugrado.hrmsproject.entities.dto;

import lombok.Data;

@Data
public class EmployerForRegisterDto {
    private String companyName;
    private String webAddress;
    private String emailAddress;
    private String phoneNumber;
    private String password;
    private String passwordConfirm;
}

package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
//    @NonNull        //accept anything but null ""
//    @NotEmpty       //not going to accept spaces " "
//    @NotBlank       //" " "" null

    @NotBlank
    @Size(max = 12, min = 2)
    private String firstName;

    private String lastName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate brithDay;

    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zip;
}

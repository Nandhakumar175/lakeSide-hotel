package com.example.lakesideHotel_Backend.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {

//    @NotBlank
    private String email;
//    @NotBlank
    private String password;
}

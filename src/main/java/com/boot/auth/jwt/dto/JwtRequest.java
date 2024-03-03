package com.boot.auth.jwt.dto;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JwtRequest {

    private String email;
    private String password;

}

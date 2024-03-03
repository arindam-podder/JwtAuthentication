package com.boot.auth.jwt.dto;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JwtResponse {

    private String jwtToken;
    private String userName;

}

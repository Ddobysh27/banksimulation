package by.smartym.banksimulation.model;

import lombok.Data;

@Data
public class AuthTokenResponse {

    private String accessToken;
    private String expiresIn;
    private String refreshToken;
    private String scope;
    private String tokenType;

}

package pl.gromada.security.jwt;


import io.jsonwebtoken.security.Keys;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;

@Component
public class JwtSecretKey {

    @Bean
    public SecretKey secretKey() {
        return Keys.hmacShaKeyFor("securitysecuritysecuritysecuritysecuritysecuritysecuritysecuritysecurity".getBytes());
    }
}

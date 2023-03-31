package com.hanwhee.friendservice.security;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class SecurityService {
    @Value("${jwt.secret}")
    private String SECRET_KEY;

    public TokenInfo parseToken(String token) {
        Claims claims = Jwts.parserBuilder()
                .setSigningKey(
                        DatatypeConverter.parseBase64Binary(SECRET_KEY)
                )
                .build()
                .parseClaimsJws(token)
                .getBody();
        TokenInfo info = new TokenInfo().parseToken(claims);

        return info;

    }
    public String getToken() {
        ServletRequestAttributes requestAttributes =
                (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        return request.getHeader("authorization");
    }
}

package com.hanwhee.friendservice.security;

import io.jsonwebtoken.Claims;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TokenInfo {
    private Long id;
    private String name;
    public TokenInfo parseToken(Claims claims) {
        Long id = Long.parseLong(String.valueOf(claims.get("id")));
        String nick_name = (String) claims.get("name");

        return new TokenInfo(id,name);
    }
}


package com.mbtigroup.demo.api.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private String username; // email
    private String encryptedPassword;
    private String mbti;
}

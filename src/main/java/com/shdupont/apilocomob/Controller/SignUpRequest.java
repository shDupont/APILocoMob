package com.shdupont.apilocomob.Controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpRequest {
    private String email;
    private String name;
    private String username;
    private String password;
}

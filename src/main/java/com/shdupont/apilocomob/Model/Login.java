package com.shdupont.apilocomob.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Login {
    @Id
    private String id;
    private String username;
    private String password;

}

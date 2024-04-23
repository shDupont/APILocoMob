package com.shdupont.apilocomob.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class User {
    @Id
    private String id;
    private String email;
    private String name;
    private String plate;
    private Date birthDate;


}

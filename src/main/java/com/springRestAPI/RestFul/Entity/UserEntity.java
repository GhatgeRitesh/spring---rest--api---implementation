package com.springRestAPI.RestFul.Entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class UserEntity {
    // code to handle the user creds
    @Getter @Setter
    private Long id;
    @Getter @Setter
    private String Name;
    @Getter @Setter
    private String Data;
}

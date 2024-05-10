package com.springRestAPI.RestFul.controllers;

import com.springRestAPI.RestFul.Model.UserEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/home")
public class EntityController {


    private Map<Long,UserEntity> userEntityMap=new HashMap<>();
    @GetMapping
    public List<UserEntity> getAll()
    {
        return new ArrayList<>(userEntityMap.values());
    }
    @PostMapping("/addEntry")
    public void createUser(@RequestBody UserEntity user){
        userEntityMap.put(user.getId(),user);
    }
}

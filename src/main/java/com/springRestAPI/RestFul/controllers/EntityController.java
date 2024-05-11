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

    // to display the entry
    @GetMapping
    public List<UserEntity> getAll()
    {
        return new ArrayList<>(userEntityMap.values());
    }
    // to insert the entity
    @PostMapping
    public void createUser(@RequestBody UserEntity user){
        userEntityMap.put(user.getId(),user);
    }

    //using path variable by the urls
    @GetMapping("/id/{myid}")
    public UserEntity getUserById(@PathVariable Long myid)
    {
      return userEntityMap.get(myid);
    }

    // Delete mapping just for standard and reduce ambiguity
    @DeleteMapping("/id/{myid}")
    public void deleteUserById(@PathVariable Long myid)
    {
        userEntityMap.remove(myid);
    }

    // put mapping for the use of update the entity
    @PutMapping("/id/{id}")
    public void updateEntity(@PathVariable Long id , @RequestBody UserEntity user)
    {
        userEntityMap.put(id,user);
    }
}

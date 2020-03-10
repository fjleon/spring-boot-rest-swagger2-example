package com.example.swagger2.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.swagger2.model.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(value = "Employee management system")
@RestController
@RequestMapping(value = "/api/v1/user")
public class UserController {

    @ApiOperation(value = "Gets an existing employee", response = User.class)
    @GetMapping(value = "")
    public ResponseEntity<User> getUser(
	    @ApiParam(value = "Employee ID", required = true, example = "12345") @RequestParam Integer id) {
	
	return ResponseEntity.ok(User.builder().id(id).build());
    }
    
    @ApiOperation(value = "Creates a new employee", response = User.class)
    @PostMapping(value = "")
    public ResponseEntity<User> createUser(
	    @ApiParam(value = "Employee ID", required = true, example = "123") @RequestParam Integer id) {
	
	return ResponseEntity.ok(User.builder().id(id).build());
    }

}

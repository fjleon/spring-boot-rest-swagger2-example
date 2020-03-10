package com.example.swagger2.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel(description = "All details about the Employee")
public class User {

    @ApiModelProperty(value = "The database generated employee ID")
    private Integer id;
    
    @ApiModelProperty(notes = "The employee name")
    private String name;
    
    @ApiModelProperty(notes = "The employee email")
    private String email;
    
    @ApiModelProperty(notes = "The employee phone")
    private Integer phone;

}

package com.example.demomb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class userEntity {
    @Generated
    private Integer id;
    private String user;
    private String password;
    private String address;
    private String email;
}

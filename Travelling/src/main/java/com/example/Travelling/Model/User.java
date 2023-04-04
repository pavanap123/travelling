package com.example.Travelling.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    @Table(name="People")
    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private String name;
        private String email;
        private String gender;
        private  Integer phno;
        private  String user_address;


        @OneToOne(cascade = CascadeType.ALL)
     //@JoinColumn(name = "Hotel_name",referencedColumnName = "hotelname")
        Bus bus;
    }

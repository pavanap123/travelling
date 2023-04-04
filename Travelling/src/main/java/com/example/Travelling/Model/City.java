package com.example.Travelling.Model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    @Table(name = "City")

    public class City {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer id;
        @Column(name = "CityName")
        private String CityName;
        @Column(name = "Zipcode")
        private String Zipcode;

    @OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "tourism_place",referencedColumnName = "tourismplace")
    List<TourismPlace> tourismPlaces= new ArrayList<>();

  //  @OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "Bus_name",referencedColumnName = "busname")
    //List<Bus> bus= new ArrayList<>();
}


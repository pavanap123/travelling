package com.example.Travelling.Model;

import lombok.*;

import javax.persistence.*;
@Entity
    @Data
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
@Table(name = "Tourismplace")

    public class TourismPlace {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer id;
        @Column(name = "Name")
        private String name;
    //    @Column(name = "City")
      //  private String city;
    }


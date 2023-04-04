package com.example.Travelling.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class ZipCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @OneToMany
    @JoinColumn(referencedColumnName = "id")
    List<TourismPlace> tourismPlacesList = new ArrayList<>();
}

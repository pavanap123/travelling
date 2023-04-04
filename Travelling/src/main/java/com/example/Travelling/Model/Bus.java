package com.example.Travelling.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "buses")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "BusName")
    private String busName;
   // @Enumerated(EnumType.STRING)
//    @Column(name = "BusType")
//    private Bus busType;
    @Column(name="DepartureTime")
    private Date departureTime;
    @Column(name = "NoOfSeats")
    private int nofSeats;
    @Column(name="Price")
    private Double price;
    @Column(name="TypeOfBoard")
        private String typeofBoard;

   //@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    //@JoinTable(name = "user_Buses", joinColumns = @JoinColumn(name = "buses_id", referencedColumnName = "id"),
      //      inverseJoinColumns = @JoinColumn(name = "person_id", referencedColumnName = "id"))
    //private List<Bus> bus=new ArrayList<Bus>();
}



package com.vrlapp.model;

import java.util.Set;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Passenger {

	private String name;
	private Integer passengerId;
	private int age;
	private String email;
	private String destination;
	private long phoneNumber;

    @ManyToMany
    Set<Bus> bus;
    
    @ManyToOne
    Driver driver;


}

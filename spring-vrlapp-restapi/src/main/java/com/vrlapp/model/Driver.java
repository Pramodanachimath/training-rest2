package com.vrlapp.model;

import java.util.Set;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Driver {

	private String driverName;
	private Integer driverId;
	private long phoneNo;
	private int age;
	private String city;
	private double salary;

    @OneToOne
    Bus bus;
    
    @OneToMany
    Set<Passenger> passengers;
    
    



}

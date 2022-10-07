package com.vrlapp.model;

import java.util.Set;

import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

public class Bus {

	private String busname;
	private Integer busId;
	private String source;
	private String destination;
	private String time;

	@OneToMany
	Set<Passenger> passengers;
	
	@ManyToMany
	Set<Driver> drivers;
	
	
	
}

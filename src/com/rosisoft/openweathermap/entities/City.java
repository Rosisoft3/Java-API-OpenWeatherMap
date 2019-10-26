/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rosisoft.openweathermap.entities;

/**
 *
 * @author Rosisse
 */
public class City {
    
    	private String id ; 		//City ID
	private String name;		//City name
	private String country;		//Country code (GB, JP etc.)
	private Coord coord;
        private String timezone;       //Shift in seconds from UTC

    public String getTimezone() {
        return timezone;
    }
    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Coord getCoord() {
        return coord;
    }
    
}

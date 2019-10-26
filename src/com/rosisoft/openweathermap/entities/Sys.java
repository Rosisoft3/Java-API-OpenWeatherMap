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
public class Sys {
        private String type ;           //Internal parameter
	private String id;              //Internal parameter
	private String message ;        //Internal parameter
	private String country ;        //Country code (GB, JP etc.)
	private String sunrise;         //Sunrise time, unix, UTC
	private String sunset;          //Sunset time, unix, UTC

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public String getCountry() {
        return country;
    }

    public String getSunrise() {
        return sunrise;
    }

    public String getSunset() {
        return sunset;
    }

        
}

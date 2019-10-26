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
public class Weather {
    
	private String id; 				//Weather condition id
	private String main;			//Group of weather parameters (Rain, Snow, Extreme etc.)
	private String description;     //Weather condition within the group
	private String icon;			//Weather icon id

    public String getId() {
        return id;
    }

    public String getMain() {
        return main;
    }

    public String getDescription() {
        return description;
    }

    public String getIcon() {
        return icon;
    }     
}

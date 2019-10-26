/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rosisoft.openweathermap.entities;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author Rosisse
 */
public class Coord {
        @SerializedName("lon")
	private String lon ;   //City geo location, latitude
	@SerializedName("lat")
	private String lat ;	//City geo location, latitude

    public String getLon() {
        return lon;
    }

    public String getLat() {
        return lat;
    }      
}

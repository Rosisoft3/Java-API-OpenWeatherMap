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
public class WeatherForecastDaily {

	/*------------------- Parameters --------------------*/
	private City city;
        private String cod;		// Internal parameter
	private String message;	//Internal parameter
	private String cnt;		// Number of lines returned by this API call
	@SerializedName("list")
	private ListDaily[] list;

    public City getCity() {
        return city;
    }

    public String getCod() {
        return cod;
    }

    public String getMessage() {
        return message;
    }

    public String getCnt() {
        return cnt;
    }

    public ListDaily[] getList() {
        return list;
    }

   
}

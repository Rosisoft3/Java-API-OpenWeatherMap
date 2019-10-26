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
public class WeatherForecast  {
  	/*------------------- Parameters --------------------*/
	private String code;		//code Internal parameter
	private String message;	// Internal parameter
        private City city;		
	@SerializedName("list")
	private List[] list;
	private String cnt;		//Number of lines returned by this API call

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public City getCity() {
        return city;
    }

    public List[] getList() {
        return list;
    }

    public String getCnt() {
        return cnt;
    }  
}

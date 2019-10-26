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
public class List {
    /*------------------- Parameters --------------------*/
	private String dt ;             //Time of data forecasted, unix, UTC
	private String dt_txt;		//Data/time of calculation, UTC
	private Clouds clouds;
	private Wind wind;
	private Rain rain;
	private Snow snow;
	private Main main;
	@SerializedName("weather")
	private Weather[] weather;	// (more info Weather condition codes)
	@SerializedName("temp")
	private Temp temp;              //Part of the day (n - night, d - day)
        private String sys;

    public String getDt() {
        return dt;
    }

    public String getDt_txt() {
        return dt_txt;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public Wind getWind() {
        return wind;
    }

    public Rain getRain() {
        return rain;
    }

    public Snow getSnow() {
        return snow;
    }

    public Main getMain() {
        return main;
    }

    public Weather[] getWeather() {
        return weather;
    }

    public Temp getTemp() {
        return temp;
    }

    public String getSys() {
        return sys;
    }

        
}

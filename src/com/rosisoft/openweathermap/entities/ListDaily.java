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
public class ListDaily {
    	private String deg;		//Wind direction, degrees (meteorological)
	private String dt;
        private String pressure;	//Atmospheric pressure on the sea level, hPa
	private String clouds;		//Cloudiness, %
	private String speed;		//Wind speed. Unit Default: meter/sec, Metric: meter/sec, Imperial: miles/hour.
	private String humidity;	// Humidity, %
        private String rain;	// Precipitation volume, mm
        private String snow;	// Snow volume, mm
        
	@SerializedName("weather")
	private Weather [] weather;
	@SerializedName("temp")
	private Temp temp;

    public String getDeg() {
        return deg;
    }

    public String getPressure() {
        return pressure;
    }

    public String getClouds() {
        return clouds;
    }

    public String getSpeed() {
        return speed;
    }

    public String getHumidity() {
        return humidity;
    }

    public Weather[] getWeather() {
        return weather;
    }

    public Temp getTemp() {
        return temp;
    }

    public String getDt() {
        return dt;
    }

    public String getRain() {
        return rain;
    }

    public String getSnow() {
        return snow;
    }

    
        
}

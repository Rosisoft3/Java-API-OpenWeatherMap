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
public class Temp {
    
    	
	private String day;		//Day temperature. Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
	private String min ;	//Min daily temperature. Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
	private String max ;	//Max daily temperature. Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
	private String night;	//Night temperature. Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
	private String eve ;	//Evening temperature. Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
	private String morn ;	//Morning temperature. Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.

    public String getDay() {
        return day;
    }

    public String getMin() {
        return min;
    }

    public String getMax() {
        return max;
    }

    public String getNight() {
        return night;
    }

    public String getEve() {
        return eve;
    }

    public String getMorn() {
        return morn;
    }

        
}

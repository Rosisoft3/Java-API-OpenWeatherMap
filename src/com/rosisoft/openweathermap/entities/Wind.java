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
public class Wind {
    private String speed;	//Wind speed. Unit Default: meter/sec, Metric: meter/sec, Imperial: miles/hour.
    private String deg ;	//Wind direction, degrees (meteorological)	

    public String getSpeed() {
        return speed;
    }

    public String getDeg() {
        return deg;
    }
    
    
}

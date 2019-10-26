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
public class Snow {
        @SerializedName("3h")
	private String _3h; // Snow volume for last 3 hours
        
         @SerializedName("1h")
	private String _1h; //Rain volume for the last 1 hour, mm

    public String get3h() {
        return _3h;
    }

    public String get1h() {
        return _1h;
    }

         
}

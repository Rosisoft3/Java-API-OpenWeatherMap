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
public class Clouds  {
       @SerializedName("all")
	private String all; 		//Cloudiness, %

    public String getAll() {
        return all;
    }
      
}

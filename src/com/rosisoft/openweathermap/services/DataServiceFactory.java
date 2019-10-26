/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rosisoft.openweathermap.services;

import com.rosisoft.openweathermap.implement.OpenWeatherMap;
import com.rosisoft.openweathermap.interfaces.IWeatherDataService;



/**
 *
 * @author Rosisse
 *
 */
public class DataServiceFactory {

       public enum service
	{
            OPEN_WEATHER_MAP;
	}

	public static IWeatherDataService getWeatherService(service i_Service,String appID)
	{
		switch (i_Service)
		{
		case OPEN_WEATHER_MAP:
			return OpenWeatherMap.getInstance(appID);
                default:  return null;       
		}		
	}
	

}

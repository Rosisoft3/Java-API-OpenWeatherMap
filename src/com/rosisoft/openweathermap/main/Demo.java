/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rosisoft.openweathermap.main;




import com.rosisoft.openweathermap.classes.Unit;

import com.rosisoft.openweathermap.entities.WeatherForecastDaily;


import com.rosisoft.openweathermap.exceptions.WeatherDataServiceException;
import com.rosisoft.openweathermap.services.DataServiceFactory;
import com.rosisoft.openweathermap.services.DataServiceFactory.service;
import com.rosisoft.openweathermap.interfaces.IWeatherDataService;

/**
 *
 * @author Rosisse
 */
public class Demo {
    public static void main(String[] args) {
            
        try
		{
                    
                        //TEST
                        String apiKey ="***";
			IWeatherDataService dataService = DataServiceFactory.getWeatherService(service.OPEN_WEATHER_MAP,apiKey);
                       	dataService.setUnit(Unit.Metric);
                        WeatherForecastDaily	data =   dataService.GET_16_DAY_WEATHER_FORECAST_DATA_BY_CITY_NAME("Constantine");
                       
                        
			} catch (WeatherDataServiceException e)
		{
			e.printStackTrace();
		}
        
    }
}

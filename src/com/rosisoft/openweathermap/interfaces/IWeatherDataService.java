/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rosisoft.openweathermap.interfaces;


import com.rosisoft.openweathermap.classes.Unit;
import com.rosisoft.openweathermap.exceptions.WeatherDataServiceException;
import com.rosisoft.openweathermap.entities.CurrentWeather;
import com.rosisoft.openweathermap.entities.HourlyForecast;
import com.rosisoft.openweathermap.entities.WeatherForecastDaily;
import com.rosisoft.openweathermap.entities.WeatherForecast;




/**
 *
 * @author Rosisse
 */
public interface IWeatherDataService {
     
    public Unit getUnit() ;
    public void setUnit(Unit unit) ;

    
public CurrentWeather GET_CURRENT_WEATHER_DATA_BY_CITY_NAME(String city_name,String country_code) throws WeatherDataServiceException;
public CurrentWeather GET_CURRENT_WEATHER_DATA_BY_CITY_NAME(String city_name) throws WeatherDataServiceException;
public CurrentWeather GET_CURRENT_WEATHER_DATA_BY_CITY_ID(long city_ID ) throws WeatherDataServiceException;
public CurrentWeather GET_CURRENT_WEATHER_DATA_BY_GEO_COORD(double lat,double lon) throws WeatherDataServiceException;
public CurrentWeather GET_CURRENT_WEATHER_DATA_BY_ZIP_CODE(long zip_code,String country_code) throws WeatherDataServiceException;

public WeatherForecastDaily GET_16_DAY_WEATHER_FORECAST_DATA_BY_CITY_NAME(String city_name,String country_code) throws WeatherDataServiceException;
public WeatherForecastDaily GET_16_DAY_WEATHER_FORECAST_DATA_BY_CITY_NAME(String city_name) throws WeatherDataServiceException;
public WeatherForecastDaily GET_16_DAY_WEATHER_FORECAST_DATA_CITY_ID(long city_ID) throws WeatherDataServiceException;
public WeatherForecastDaily GET_16_DAY_WEATHER_FORECAST_DATA_GEO_COORD(double lat,double lon) throws WeatherDataServiceException;
public WeatherForecastDaily GET_16_DAY_WEATHER_FORECAST_DATA_ZIP_CODE(long zip_code,String country_code) throws WeatherDataServiceException;

public WeatherForecast GET_5_DAY_WEATHER_FORECAST_DATA_BY_CITY_NAME(String city_name,String country_code) throws WeatherDataServiceException;
public WeatherForecast GET_5_DAY_WEATHER_FORECAST_DATA_BY_CITY_NAME(String city_name) throws WeatherDataServiceException;
public WeatherForecast GET_5_DAY_WEATHER_FORECAST_DATA_CITY_ID(long city_ID) throws WeatherDataServiceException;
public WeatherForecast GET_5_DAY_WEATHER_FORECAST_DATA_GEO_COORD(double lat,double lon ) throws WeatherDataServiceException;
public WeatherForecast GET_5_DAY_WEATHER_FORECAST_DATA_ZIP_CODE(long zip_code,String country_code) throws WeatherDataServiceException;

public HourlyForecast GET_HOURLY_FORECAST_DATA_BY_CITY_NAME(String city_name,String country_code) throws WeatherDataServiceException;
public HourlyForecast GET_HOURLY_FORECAST_DATA_BY_CITY_NAME(String city_name) throws WeatherDataServiceException;
}

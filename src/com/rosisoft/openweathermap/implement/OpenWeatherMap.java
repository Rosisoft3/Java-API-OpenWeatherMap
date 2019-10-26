/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rosisoft.openweathermap.implement;

import com.rosisoft.openweathermap.entities.CurrentWeather;
import com.rosisoft.openweathermap.entities.WeatherForecast;
import com.rosisoft.openweathermap.entities.WeatherForecastDaily;
import com.google.gson.Gson;
import com.rosisoft.openweathermap.classes.Response;
import com.rosisoft.openweathermap.classes.TaginWeather;

import static com.rosisoft.openweathermap.classes.URLReader.readUrl;
import com.rosisoft.openweathermap.classes.Unit;
import com.rosisoft.openweathermap.entities.HourlyForecast;
import com.rosisoft.openweathermap.exceptions.WeatherDataServiceException;
import com.rosisoft.openweathermap.interfaces.IWeatherDataService;



/**
 *
 * @author Rosisse
 */
public class OpenWeatherMap implements IWeatherDataService{
    
        private String APP_ID;
        private Unit unit;
        private Response mode;
      
        
        private static volatile OpenWeatherMap weatherMap;
  

	public static OpenWeatherMap getInstance(String APP_ID)
	{
		if (weatherMap == null)
		{
			weatherMap = new OpenWeatherMap(){};
                        weatherMap.setAPP_ID(APP_ID);
                        weatherMap.setUnit(Unit.Metric);
                        weatherMap.setMode(Response.JSON);
		}
		return weatherMap;
                
	}

    private String getAPP_ID() {
        return APP_ID;
    }

    private void setAPP_ID(String APP_ID) {
        this.APP_ID = APP_ID;
    }
 
    @Override
    public Unit getUnit() {
        return unit;
    }
 
    @Override
    public void setUnit(Unit unit) {
        this.unit = unit;
    }

     
    private Response getMode() {
        return mode;
    }

  
    private void setMode(Response mode) {
        this.mode = mode;
    }

    
    @Override
    public CurrentWeather GET_CURRENT_WEATHER_DATA_BY_CITY_NAME(String city_name, String country_code) throws WeatherDataServiceException {
	try{        
            String CALLING_WEATHER = "?q="+city_name+","+country_code; 
            String res = readUrl(getURLString(TaginWeather.CURRENT_WEATHER_DATA, CALLING_WEATHER));
            return (CurrentWeather)   new Gson().fromJson(res,CurrentWeather.class);
	    } catch (Exception e){
		System.err.println("Weather parsing error. please try again or contact app developer.");
		return null;
		}          
    }

    @Override
    public CurrentWeather GET_CURRENT_WEATHER_DATA_BY_CITY_NAME(String city_name) throws WeatherDataServiceException {
        try{       
            String CALLING_WEATHER = "?q="+city_name;  
            String res = readUrl(getURLString(TaginWeather.CURRENT_WEATHER_DATA, CALLING_WEATHER));
            return (CurrentWeather)   new Gson().fromJson(res,CurrentWeather.class);
	    } catch (Exception e){
		System.err.println("Weather parsing error. please try again or contact app developer.");
		return null;
                }     
    }

    @Override
    public CurrentWeather GET_CURRENT_WEATHER_DATA_BY_CITY_ID(long city_ID) throws WeatherDataServiceException {
        try{       
            String CALLING_WEATHER = "?id="+city_ID;
            String res = readUrl(getURLString(TaginWeather.CURRENT_WEATHER_DATA, CALLING_WEATHER));
            return (CurrentWeather)   new Gson().fromJson(res,CurrentWeather.class);
	    }catch (Exception e){
		System.err.println("Weather parsing error. please try again or contact app developer.");
		return null;
                }
    }

    @Override
    public CurrentWeather GET_CURRENT_WEATHER_DATA_BY_GEO_COORD(double lat, double lon) throws WeatherDataServiceException {
        try{       
            String CALLING_WEATHER = "?lat="+lat+",lon="+lon;
            String res = readUrl(getURLString(TaginWeather.CURRENT_WEATHER_DATA, CALLING_WEATHER));
            return (CurrentWeather)   new Gson().fromJson(res,CurrentWeather.class);
	   }catch (Exception e){
		System.err.println("Weather parsing error. please try again or contact app developer.");
		return null;
                }
    }

    @Override
    public CurrentWeather GET_CURRENT_WEATHER_DATA_BY_ZIP_CODE(long zip_code, String country_code) throws WeatherDataServiceException {
        try{       
            String CALLING_WEATHER ="?zip="+zip_code+","+country_code ; 
            String res = readUrl(getURLString(TaginWeather.CURRENT_WEATHER_DATA, CALLING_WEATHER));
            return (CurrentWeather)   new Gson().fromJson(res,CurrentWeather.class);
            }catch (Exception e){
		System.err.println("Weather parsing error. please try again or contact app developer.");
		return null;
                }
    }

    @Override
    public WeatherForecastDaily GET_16_DAY_WEATHER_FORECAST_DATA_BY_CITY_NAME(String city_name, String country_code) throws WeatherDataServiceException {
      try{        
            String CALLING_WEATHER = "?q="+city_name+","+country_code; 
            String res = readUrl(getURLString(TaginWeather._16_DAY_WEATHER_FORECAST_DATA, CALLING_WEATHER));
            return (WeatherForecastDaily)   new Gson().fromJson(res,WeatherForecastDaily.class);
	    } catch (Exception e){
		System.err.println("Weather parsing error. please try again or contact app developer.");
		return null;
		}    
    }

    @Override
    public WeatherForecastDaily GET_16_DAY_WEATHER_FORECAST_DATA_BY_CITY_NAME(String city_name) throws WeatherDataServiceException {
        try{       
            String CALLING_WEATHER = "?q="+city_name;  
            String res = readUrl(getURLString(TaginWeather._16_DAY_WEATHER_FORECAST_DATA, CALLING_WEATHER));
            return (WeatherForecastDaily)   new Gson().fromJson(res,WeatherForecastDaily.class);
	    } catch (Exception e){
		System.err.println("Weather parsing error. please try again or contact app developer.");
		return null;
                }     
    }

    @Override
    public WeatherForecastDaily GET_16_DAY_WEATHER_FORECAST_DATA_CITY_ID(long city_ID) throws WeatherDataServiceException {
        try{       
            String CALLING_WEATHER = "?id="+city_ID;
            String res = readUrl(getURLString(TaginWeather._16_DAY_WEATHER_FORECAST_DATA, CALLING_WEATHER));
            return (WeatherForecastDaily)   new Gson().fromJson(res,WeatherForecastDaily.class);
	    }catch (Exception e){
		System.err.println("Weather parsing error. please try again or contact app developer.");
		return null;
                }       
    }

    @Override
    public WeatherForecastDaily GET_16_DAY_WEATHER_FORECAST_DATA_GEO_COORD(double lat, double lon) throws WeatherDataServiceException {
        try{       
            String CALLING_WEATHER = "?lat="+lat+",lon="+lon;
            String res = readUrl(getURLString(TaginWeather._16_DAY_WEATHER_FORECAST_DATA, CALLING_WEATHER));
            return (WeatherForecastDaily)   new Gson().fromJson(res,WeatherForecastDaily.class);
	   }catch (Exception e){
		System.err.println("Weather parsing error. please try again or contact app developer.");
		return null;
                }    
    }

    @Override
    public WeatherForecastDaily GET_16_DAY_WEATHER_FORECAST_DATA_ZIP_CODE(long zip_code, String country_code) throws WeatherDataServiceException {
        try{       
            String CALLING_WEATHER ="?zip="+zip_code+","+country_code ; 
            String res = readUrl(getURLString(TaginWeather._16_DAY_WEATHER_FORECAST_DATA, CALLING_WEATHER));
            return (WeatherForecastDaily)   new Gson().fromJson(res,WeatherForecastDaily.class);
            }catch (Exception e){
		System.err.println("Weather parsing error. please try again or contact app developer.");
		return null;
                }
    }

    @Override
    public WeatherForecast GET_5_DAY_WEATHER_FORECAST_DATA_BY_CITY_NAME(String city_name, String country_code) throws WeatherDataServiceException {
      try{        
            String CALLING_WEATHER = "?q="+city_name+","+country_code; 
            String res = readUrl(getURLString(TaginWeather._5_DAY_WEATHER_FORECAST_DATA, CALLING_WEATHER));
            return (WeatherForecast)   new Gson().fromJson(res,WeatherForecast.class);
	    } catch (Exception e){
		System.err.println("Weather parsing error. please try again or contact app developer.");
		return null;
		}
    }

    @Override
    public WeatherForecast GET_5_DAY_WEATHER_FORECAST_DATA_BY_CITY_NAME(String city_name) throws WeatherDataServiceException {
        try{       
            String CALLING_WEATHER = "?q="+city_name;  
            String res = readUrl(getURLString(TaginWeather._5_DAY_WEATHER_FORECAST_DATA, CALLING_WEATHER));
            return (WeatherForecast)   new Gson().fromJson(res,WeatherForecast.class);
	    } catch (Exception e){
		System.err.println("Weather parsing error. please try again or contact app developer.");
		return null;
                }     
    }

    @Override
    public WeatherForecast GET_5_DAY_WEATHER_FORECAST_DATA_CITY_ID(long city_ID) throws WeatherDataServiceException {
        try{       
            String CALLING_WEATHER = "?id="+city_ID;
            String res = readUrl(getURLString(TaginWeather._5_DAY_WEATHER_FORECAST_DATA, CALLING_WEATHER));
            return (WeatherForecast)   new Gson().fromJson(res,WeatherForecast.class);
	    }catch (Exception e){
		System.err.println("Weather parsing error. please try again or contact app developer.");
		return null;
                } 
    }

    @Override
    public WeatherForecast GET_5_DAY_WEATHER_FORECAST_DATA_GEO_COORD(double lat, double lon) throws WeatherDataServiceException {
        try{       
            String CALLING_WEATHER = "?lat="+lat+",lon="+lon;
            String res = readUrl(getURLString(TaginWeather._5_DAY_WEATHER_FORECAST_DATA, CALLING_WEATHER));
            return (WeatherForecast)   new Gson().fromJson(res,WeatherForecast.class);
	   }catch (Exception e){
		System.err.println("Weather parsing error. please try again or contact app developer.");
		return null;
                }
    }

    @Override
    public WeatherForecast GET_5_DAY_WEATHER_FORECAST_DATA_ZIP_CODE(long zip_code, String country_code) throws WeatherDataServiceException {
        try{       
            String CALLING_WEATHER ="?zip="+zip_code+","+country_code ; 
            String res = readUrl(getURLString(TaginWeather._5_DAY_WEATHER_FORECAST_DATA, CALLING_WEATHER));
            return (WeatherForecast)   new Gson().fromJson(res,WeatherForecast.class);
            }catch (Exception e){
		System.err.println("Weather parsing error. please try again or contact app developer.");
		return null;
                }
    }
    
    
    private String getURLString(TaginWeather TAGING,String CALLING_WEATHER ){
   
                String OPEN_WEATHER_MAP_URL = "http://api.openweathermap.org/data/2.5/";        
                String UNIT_PARAM = "&units="+this.unit;
                String MODE_PARAM = "&mode="+this.mode ;
                String CNT_PARAM  = "&cnt="+10;
                String APP_ID_PARAM = "&APPID="+this.APP_ID;
               return OPEN_WEATHER_MAP_URL+TAGING+CALLING_WEATHER+UNIT_PARAM+MODE_PARAM+CNT_PARAM+APP_ID_PARAM;

    }

    @Override
    public HourlyForecast GET_HOURLY_FORECAST_DATA_BY_CITY_NAME(String city_name, String country_code) throws WeatherDataServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HourlyForecast GET_HOURLY_FORECAST_DATA_BY_CITY_NAME(String city_name) throws WeatherDataServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

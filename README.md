# README #

# OpenWeatherMap
Weather API - OpenWeatherMap, 

## Description
This library is for getting information about the weather (current weather data, 5- and 16-day forecasts...), using the <a href="https://openweathermap.org/api">OpenWeatherMap.org</a>restful web service.

## Features
Current & Forecast weather data collection:
*<a href="https://openweathermap.org/current">Current weather data</a>
*<a href="https://openweathermap.org/forecast16">16 day / daily forecast</a>
*<a href="https://openweathermap.org/forecast5">5 day / 3 hour forecast</a>

### Requirements
- Java 1.8 
- Weather API - OpenWeatherMap  <a href="https://raw.githubusercontent.com/Rosisoft3/OpenWeatherMap/master/dist/OpenWeatherMap.jar">OpenWeatherMap.jar</a>
- The Gson library <a href="https://raw.githubusercontent.com/Rosisoft3/OpenWeatherMap/master/lib/gson-2.2.2.jar">gson-2.2.2.jar</a>
- [OpenWeather API-Key](http://openweathermap.org/price) 

## Installation
Before you start, ensure you have your own [OpenWeather API-Key](http://openweathermap.org/price) to be able to retrieve the weather data.

* Summary of set up
 An example for using this library:
 
```
#!java

public static void main(String[] args)
 	{ 		
 		try
 		{
      // Place your OpenWeather API-Key
       String API-Key ="***";
       IWeatherDataService dataService = DataServiceFactory.getWeatherService(service.OPEN_WEATHER_MAP,API-Key);
       WeatherForecastDaily	data =   dataService.GET_16_DAY_WEATHER_FORECAST_DATA_BY_CITY_NAME("Constantine","dz");
       CurrentWeather data2 = dataService.GET_CURRENT_WEATHER_DATA_BY_CITY_NAME("Toronto","on");
       WeatherForecast data3 = dataService.GET_5_DAY_WEATHER_FORECAST_DATA_BY_CITY_NAME("London","uk");           
 		}
 		catch (WeatherDataServiceException e)
 		{
 			e.printStackTrace();
 		}
 	}
```
## License
*GNU Lesser General Public License v3.0

## Contact me
* Email: 
* **[Rosisoft](mailto:#)**

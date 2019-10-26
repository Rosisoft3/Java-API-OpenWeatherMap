/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rosisoft.openweathermap.exceptions;

/**
 *
 * @author Rosisse
 */
public class WeatherDataServiceException extends Exception {
    private static final long serialVersionUID = 1L;

	public WeatherDataServiceException()
	{
		super();
	}

	public WeatherDataServiceException(String arg0, Throwable arg1)
	{
		super(arg0, arg1);
	}
        
        

	public WeatherDataServiceException(String arg0)
	{
		super(arg0);
	}
}

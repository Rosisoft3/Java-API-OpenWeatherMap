/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rosisoft.openweathermap.classes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *
 * @author Rosisse
 */
public class URLReader {
   public static String readUrl(String urlString) throws Exception {
    BufferedReader reader = null;
    try {
        URL url = new URL(urlString);
        reader = new BufferedReader(new InputStreamReader(url.openStream()));
        StringBuffer buffer = new StringBuffer();
        int read;
        char[] chars = new char[1024];
        while ((read = reader.read(chars)) != -1)
            buffer.append(chars, 0, read); 

        return buffer.toString();
    } finally {
        if (reader != null)
            reader.close();
    }
}
    
}

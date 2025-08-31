package com.rslakra.appsuite.jdk.json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;

/**
 * Coins related algorithms.
 *
 * @author Rohtash Lakra
 * @created 08/31/2025 10:39:53 AM
 */
class JsonReader {
    
    public static void main(String[] args) {
        System.setProperty("http.agent", "Chrome");
        try {
            URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");
            try {
                URLConnection connection = url.openConnection();
                InputStream inputStream = connection.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String thisLine;
                while ((thisLine = bufferedReader.readLine()) != null) {
                    String[] strings = thisLine.split(":");
                    String parsedString = strings[1].replaceAll("\"}", "").replace("\"", "");
                    String[] keyValues = parsedString.split(",");
                    System.out.println(Arrays.stream(keyValues).filter(s -> s.contains("age") && Integer.parseInt(s.split("=")[1]) >= 50).count());
                }
            } catch (IOException ioEx) {
                System.out.println(ioEx);
            }
        } catch (MalformedURLException malEx) {
            System.out.println(malEx);
        }
    }
}


package com.kongu.weather;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;





public class WeatherTracker {
	





		public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

			

			System.out.print("Provide city Name : ");

			Scanner sc = new Scanner(System.in);

			String s = sc.next();

			System.out.println("City Inputted is : "+s);

			

			

		     

		    RestTemplate restTemplate = new RestTemplate();

		    final String uri = "http://api.openweathermap.org/data/2.5/weather?q="+s+"&appid=b4cb3bdcbc1865dc1e47644f9587ec4a&units=metric";




		    	

		    	@SuppressWarnings("unchecked")

				Map<String,ArrayList<Map<String,String>>> result =  restTemplate.getForObject(uri, Map.class);

		    	@SuppressWarnings({ "unchecked", "rawtypes" })

				Map<String,LinkedHashMap> res2 = restTemplate.getForObject(uri, Map.class);

		    	

		    //	System.out.println(result);

		    	

		    	System.out.println("***********************   SARAVANAN'S WEATHER PROGRAM     ***********************") ;

		     	

		    	System.out.println("Weather to expect in "+s +" is "+result.get("weather").get(0).get("description"));

		    	System.out.println("Temperature at present in "+s +" is "+res2.get("main").get("temp"));

		    	

		    	sc.close();

		    

		}




	}


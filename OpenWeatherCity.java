package OpenWeatherAPICity;
import java.util.Scanner;
import java.net.URL;
//import java.net.URLConnection;
//import java.net.HttpURLConnection;
//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.apache.http.client.ClientProtocolException;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.impl.client.DefaultHttpClient;
//import org.openqa.selenium.remote.http.HttpResponse;
//import javax.net.ssl.HttpsURLConnection;


public class OpenWeatherCity {
	
	public static void main(String[] args) throws ClientProtocolException, IOException  {
				//API keys: "&APPID=7cd0bec67bad40e003ae102a701fb3a5"
				Scanner user_input = new Scanner(System.in);
				String city_name;
				//StringBuffer result=new StringBuffer();
				System.out.print("Enter a city:");
				city_name = user_input.next();
				
				String temp_min = "temp_min";
				String temp_max =  "temp_max";
				//String url = "http://api.openweathermap.org/data/2.5/weather?q=" + city_name + "&APPID=7cd0bec67bad40e003ae102a701fb3a5
				//URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=" + city_name + "&APPID=7cd0bec67bad40e003ae102a701fb3a5&mode=json&units=metric");
				String cityweather = "http://api.openweathermap.org/data/2.5/weather?q=\" + city_name + \"&APPID=7cd0bec67bad40e003ae102a701fb3a5&mode=json&units=metric";
				@SuppressWarnings("unused")
				//URLConnection conn = url.openConnection();
				//((HttpURLConnection) conn).setRequestMethod("GET");
				//((HttpURLConnection) conn).setRequestMethod( "POST" );
				WebDriver driver = new FirefoxDriver();
				driver.get(cityweather);
				int front = cityweather.indexOf(temp_min);
				int back = cityweather.lastIndexOf(temp_max) +3;
				System.out.println(cityweather.substring(front, back));
			}


	}
			
			   
			




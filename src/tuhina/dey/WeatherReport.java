package tuhina.dey;

import java.io.*;

public class WeatherReport {
	public static void main(String[] args) throws IOException {
		
		double celsius, fahrenheit,f;
		InputStreamReader r = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(r);
		
		System.out.print("Enter temperature in Fahrenheit:");
		
		fahrenheit = Double.parseDouble(br.readLine());
			
		celsius = (fahrenheit - 32) * 5/9;
		
		System.out.println("Temperature in Celsius:%.2f" + celsius);
		
	}
}

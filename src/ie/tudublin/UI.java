package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}
	
	public void setup() 
	{
	}
	
	public void draw()
	{			
	}

	public Color findColor(int value) {
	 for(int i = 0 ; i < colour.length; i ++)
	 {
		 System.out.println(colour[i] + "\t" + colour[i]);
	 }

	
	 for(float f:colour)
	 {
		 System.out.println(f);
	 }
 }
 
}

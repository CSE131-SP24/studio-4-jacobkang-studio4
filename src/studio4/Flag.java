package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	
	//Set flag color, make rectangle flag-shaped
	Color periwinkle = new Color(204, 204, 255);
	StdDraw.setPenColor(periwinkle);
	StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.2);
	
	//Draw lines on flag
	Color white = new Color(255, 255, 255);
	StdDraw.setPenColor(white);
	StdDraw.setPenRadius(0.01);
	StdDraw.line(0.1, 0.2, 0.7, 0.8);
	
	StdDraw.setPenColor(white);
	StdDraw.setPenRadius(0.01);
	StdDraw.line(0.2, 0.2, 0.8, 0.8);
	
	//Make circles for flag
	Color babyPink = new Color(255, 182, 193);
	StdDraw.setPenRadius(0.05);
	StdDraw.setPenColor(babyPink);
	StdDraw.point(0.15, 0.35);
	
	StdDraw.setPenRadius(0.05);
	StdDraw.setPenColor(babyPink);
	StdDraw.point(0.2, 0.4);
	
	StdDraw.setPenRadius(0.05);
	StdDraw.setPenColor(babyPink);
	StdDraw.point(0.25, 0.45);
	
	StdDraw.setPenRadius(0.05);
	StdDraw.setPenColor(babyPink);
	StdDraw.point(0.3, 0.4);
	
	StdDraw.setPenRadius(0.05);
	StdDraw.setPenColor(babyPink);
	StdDraw.point(0.35, 0.35);
	
	
	
	}
}
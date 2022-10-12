package studio4;

import java.awt.Color;
import java.awt.Font;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		
		
	
		
		double[] xs = {0, 0, 1.0};
		double[] ys = {.25, .75, .75};
		StdDraw.setPenColor(201, 181, 194);
		StdDraw.filledPolygon(xs, ys);
		
		double[] x2 = {0, 1, 1};
		double[] y2 = {.25, .25, .75};
		StdDraw.setPenColor(217, 144, 89);
		StdDraw.filledPolygon(x2, y2);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(.025);
		StdDraw.rectangle(.5, .5, .5, .25);
		
		Font font3 = new Font("Arial", Font.PLAIN,300);
		StdDraw.setFont(font3);
		StdDraw.setPenColor(Color.GRAY);
		StdDraw.text(.5,.57,"U", 180);
		
		StdDraw.setPenColor(Color.RED);
		Font font1 = new Font("Arial", Font.BOLD,165);
		StdDraw.setFont(font1);
		StdDraw.text(.5,.46,"U");
		StdDraw.setPenColor(Color.GREEN);
		Font font = new Font("Arial", Font.BOLD,60);
		StdDraw.setFont(font);
		StdDraw.text(.5,.5,"WASH");
		
		StdDraw.setPenColor(Color.BLACK);
		Font font2 = new Font("Arial", Font.BOLD,40);
		StdDraw.setFont(font2);
		StdDraw.text(.5,.31,"CSE 131!!");
		
		
		
	}
}
package random;

//Representation of a triangle in colored coordinate space 	

import java.awt.*;	
	
public class ColoredTriangle {	
	// instance variables	
	private Point p1;    // first endpoint	
	private Point p2;    // second endpoint	
	private Point p3;    // third endpoint	
	private Color color; // triangle color	
	
	// ColoredTriangle(): default constructor	
	public ColoredTriangle() {	
		Point a = new Point(1, 1);	
		Point b = new Point(2, 2);	
		Point c = new Point(3, 3);	
		setPoint(1, a);	
		setPoint(2, b);	
		setPoint(3, c);	
		setColor(Color.BLACK);	
	}	
	
	// ColoredTriangle(): specific constructor	
	public ColoredTriangle(Point a, Point b, Point c, Color d) {	
		setPoint(1, a);	
		setPoint(2, b);	
		setPoint(3, c);	
		setColor(d);	
	}	
	
	// getPoint(): endpoint accessor	
	public Point getPoint(int i) {	
		switch (i) {	
			case 1: return p1;	
			case 2: return p2;	
			case 3: return p3;	
			default: 	
				System.out.println("Unexpected endpoint access: " + i);	
				System.exit(i);	
				return null;	
		}	
	}	
	
	// setPoint(): endpoint mutator	
	public void setPoint(int i, Point v) {	
		switch (i) {	
			case 1: p1 = new Point(v.x, v.y); return;	
			case 2: p2 = new Point(v.x, v.y); return;	
			case 3: p3 = new Point(v.x, v.y); return;	
			default: 	
				System.out.println("Unexpected endpoint access: " + i);	
				System.exit(i);	
		}	
	}	
	
	// getColor(): color accessor	
	public Color getColor() {	
		return color;	
	}	
	
	// setColor(): color mutator	
	public void setColor(Color c) {	
		color = c;	
	}	
	
	// paint(): render facilitator	
	public void paint(Graphics g) {	
		Point v1 = getPoint(1);	
		Point v2 = getPoint(2);	
		Point v3 = getPoint(3);	
		Color c = getColor();	
	
		g.setColor(c);	
	
		Polygon t = new Polygon();	
		t.addPoint(v1.x, v1.y);	
		t.addPoint(v2.x, v2.y);	
		t.addPoint(v3.x, v3.y);	
	
		g.fillPolygon(t);	
	}	
}	
	
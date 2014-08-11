package random;

import java.awt.Color;

import java.awt.Point;

import java.util.*;

import java.awt.*;

import javax.swing.*;

public class Sierpinski {

    // midpoint(): midpoint facilitator

    public static Point midpoint(Point p1, Point p2) {

        return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);

    }

    // Sierpinski(): draws the Sierpinski Fractal

    public static void Sierpinski(Graphics g, Point p1, Point p2, Point p3, Color c, int depth) {

        g.setColor(Color.BLACK);

        if (depth == 1) {

            ColoredTriangle ct = new ColoredTriangle(p1, p2, p3, c);

            ct.paint(g);

        }

        else {

            Color d = Color.black;

            Point p4 = midpoint(p1, p2);

            Point p5 = midpoint(p2, p3);

            Point p6 = midpoint(p3, p1);

            Sierpinski(g, p1, p4, p6, d, depth-1);

            Sierpinski(g, p4, p2, p5, d, depth-1);

            Sierpinski(g, p6, p5, p3, d, depth-1);

        }

         

    }

    // main(): application entry point

    public static void main(String[] args) {

        // set up scanner

        Scanner scan = new Scanner(System.in);
   
        // determine desired cycles and color

        System.out.println("Qual a quantidade de vezes vc gostaria de fazer");

        int a = scan.nextInt();

        System.out.println();

        // produce Sierpinski Fractal

        Point p1 = new Point(100, 40);

        Point p2 = new Point(190, 187);

        Point p3 = new Point(10, 187);

        Color c = Color.black;

        JFrame window = new JFrame("Sierpinski Fractal");

       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setSize(200, 200);

        window.setVisible(true);

        Graphics g = window.getGraphics();

        System.out.print("clique novamente.");

        Scanner stdin = new Scanner(System.in);

        stdin.nextLine();

        Sierpinski(g, p1, p2, p3, c, a);

    }

}

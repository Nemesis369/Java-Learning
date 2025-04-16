package Paint.src;

import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.*;

abstract class GeoObject implements Serializable {
    public abstract void draw(Graphics g);
}

class PointObj extends GeoObject {
    int x;
    int y;

    public PointObj(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics g) {
        g.drawOval(x, y, 1, 1);
    }
}

class StraightLine extends GeoObject {

    int x1;
    int y1;
    int x2;
    int y2;

    public StraightLine(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void draw(Graphics g) {
        g.drawLine(x1, y1, x2, y2);
    }
}

class Triangle extends GeoObject {
    int[] xPoints, yPoints;
    final int nPoints = 3;

    public Triangle(int[] x, int[] y) {
        this.xPoints = x;
        this.yPoints = y;
    }

    @Override
    public void draw(Graphics g) {
        g.drawPolygon(xPoints, yPoints, nPoints);
    }
}

class Rectangle extends GeoObject {
    int x;
    int y;
    int width;
    int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(x, y, width, height);
    }
}

class CanvasPanel extends JPanel {
    ArrayList<GeoObject> objects = new ArrayList<>();

    public CanvasPanel() {
        setBackground(Color.WHITE);
    }

    public void addDrawing(GeoObject object) {
        objects.add(object);
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (var obj : objects) {
            obj.draw(g);
        }
    }
}

public class PaintApp extends JFrame {
    CanvasPanel canvas = new CanvasPanel();
    java.awt.Point startPoint;
    java.awt.Point endPoint;
    String mode = "Point";

    // adding buttons using for loop
    public PaintApp() {
        setTitle("PaintApp");
        setSize(500, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel toolBar = new JPanel();
        String[] buttons = { "Point", "Straight Line", "Rectangle", "Triangle" };
        for (String name : buttons) {
            JButton temp = new JButton(name);
            temp.addActionListener(e -> handleAction(e.getActionCommand()));
            toolBar.add(temp);
        }

        add(toolBar, BorderLayout.NORTH);
        add(canvas, BorderLayout.CENTER);

        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                startPoint = e.getPoint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                endPoint = e.getPoint();
                switch (mode) {
                    case "Point":
                        canvas.addDrawing(new PointObj(endPoint.x, endPoint.y));
                        break;
                    case "Rectangle":
                        int w = Math.abs(startPoint.x - endPoint.x);
                        int h = Math.abs(startPoint.y - endPoint.y);
                        int x = Math.min(startPoint.x, endPoint.x);
                        int y = Math.min(startPoint.y, endPoint.y);
                        canvas.addDrawing(new Rectangle(x, y, w, h));
                        break;
                    case "Straight Line":
                        canvas.addDrawing(new StraightLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y));
                        break;

                    case "Triangle":
                        int[] xAxis = { startPoint.x, endPoint.x, (startPoint.x + endPoint.x) / 2 };
                        int[] yAxis = { startPoint.y, endPoint.y, startPoint.y - Math.abs(startPoint.x - endPoint.x) };
                        canvas.addDrawing(new Triangle(xAxis, yAxis));
                        break;
                    default:
                }
            }
        });
        setVisible(true);
    }

    public void handleAction(String act) {

        switch (act) {
            case "Point":
                mode = "Point";
                break;
            case "Triangle":
                mode = "Triangle";
                break;
            case "Rectangle":
                mode = "Rectangle";
                break;
            case "Straight Line":
                mode = "Straight Line";
                break;
            default:
                mode = "Point";
        }
    }

    public static void main(String[] args) {
        new PaintApp();
    }
}

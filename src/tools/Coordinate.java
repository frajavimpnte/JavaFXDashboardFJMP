package tools;

public class Coordinate {    
    private double XMIN      = -5.0    ;
    private double XMAX      =  5.0    ;
    private double YMIN      = -5.0    ;
    private double YMAX      =  5.0    ;
    private int   WIDTH     =   300     ;
    private int   HEIGHT    =   300     ;
    
    public Coordinate() {}
    public Coordinate(double xMin, double xMax, double yMin, double yMax, 
            int w, int h) {
        XMIN = xMin;
        XMAX = xMax;
        YMIN = yMin;
        YMAX = yMax;
        WIDTH = w;
        HEIGHT = h;
    }
    
    public int toScreenX(double x) {
        return (int) ( (XMIN - x) * WIDTH /(XMIN - XMAX));
    }
    
    public int toScreenY(double y) {
        return (int) ( (YMAX - y)* HEIGHT/(YMAX - YMIN) );
    }

    public double getXMIN() {
        return XMIN;
    }

    public void setXMIN(double XMIN) {
        this.XMIN = XMIN;
    }

    public double getXMAX() {
        return XMAX;
    }

    public void setXMAX(double XMAX) {
        this.XMAX = XMAX;
    }

    public double getYMIN() {
        return YMIN;
    }

    public void setYMIN(double YMIN) {
        this.YMIN = YMIN;
    }

    public double getYMAX() {
        return YMAX;
    }

    public void setYMAX(double YMAX) {
        this.YMAX = YMAX;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public void setWIDTH(int WIDTH) {
        this.WIDTH = WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public void setHEIGHT(int HEIGHT) {
        this.HEIGHT = HEIGHT;
    }
    
    
}

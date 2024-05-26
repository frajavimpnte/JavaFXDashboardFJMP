/*
* ITESS-TICS 
* Enero-Junio 2024
* Cálculo Integral
* TI202 FJMP
* 23 febrero 2024
* Series Riemman
* famontecillo@itess.edu.mx
*/

package unidad1.riemann;

public class SumasRiemann {
    protected double []x;
    protected double w[];
    protected double dx[];
    protected double fw[];
    protected double suma;
    
    public SumasRiemann() {
    }
    public SumasRiemann(double[] x, double[] w) {
        this.x = x;
        this.w = w;
        
        dx = new double[w.length];
        fw = new double[w.length];
    }

    public double[] getX() {
        return x;
    }

    public void setX(double[] x) {
        this.x = x;
    }

    public double[] getW() {
        return w;
    }

    public void setW(double[] w) {
        this.w = w;
    }

    public double[] getDx() {
        return dx;
    }

    public void setDx(double[] dx) {
        this.dx = dx;
    }

    public double[] getFw() {
        return fw;
    }

    public void setFw(double[] fw) {
        this.fw = fw;
    }

    public double getSuma() {
        return suma;
    }
    
    
    public void calcularDx() {
        // calcular dx
        dx = new double[x.length-1];
        for (int i = 0; i < x.length-1; i++)
            dx[i] = x[i+1] - x[i];
    
    }
        
    public void calcularFw() {
        // calcular Fw
        fw = new double[x.length];
        for (int i = 0; i < w.length; i++)
            fw[i] = funcion(w[i]);                
    }
        
    public void calcularSuma() {        
        // calcular  suma
        suma = 0;
        for (int i = 0; i < w.length-1; i++) {
            suma += fw[i]*dx[i];
        }
    }
    
    public double funcion(double x) {
        return 2*x+1;
    }
    
    public void print() {
        System.out.println("i  |    wi   |   dxi  |   fwi  ");
        
        for (int i= 0; i < w.length-1; i++) 
            System.out.println(i +"  |    " + w[i] + "   |   " 
                    + dx[i] + "  |   " + fw[i]);
        
        System.out.println("Suma: " + suma);
        
    }
}
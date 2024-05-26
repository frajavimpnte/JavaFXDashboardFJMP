/*
* ITESS-TICS 
* Enero-Junio 2024
* Cálculo Integral
* TI202 FJMP
* 23 febrero 2024
* Series Riemman Ejemplo: f(x) = x, a = 1, b = 5, n = 10
* famontecillo@itess.edu.mx
*/

package unidad1.riemann;

public class SumasRiemannEjemplo1 extends SumasRiemann {
    private double a = 1;
    private double b = 5;
    private int n = 10;
    
    
    public SumasRiemannEjemplo1() {
        super();        
        inicializar();                
    }
        
    public SumasRiemannEjemplo1(double a, double b,  int n) {
        super();        
        inicializar();                
    }
    public SumasRiemannEjemplo1(double [] x, double[] w) {
        super(x, w);                
    }
    
    private void inicializar() {
        // En este caso, x = w, estan igualmentes separadas
        x = new double[n+1]; // n + 1 para considerar los limites 
        w = new double[n+1];
        
        double DX = (b-a)/n;
        
        for (int i = 0;  i < n+1; i++){
            x[i] = a + i*DX;
            w[i] = x[i];
        }
        
        setX(x);
        setW(w);
    }
    
    public void calcular() {
        calcularDx();
        calcularFw();
        calcularSuma();
    }
    
    
    /*
    @Override   
    public double funcion(double x) {
        return Math.sin(x);
    }
     
    
    @Override
    public void print() {
        System.out.println("suma: " + suma);
    }
   */

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
        inicializar();
    }
}
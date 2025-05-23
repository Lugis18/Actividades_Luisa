package Model;
public class Circulo{
    private double lado;
    private double PI=3.1415;
    
    public double getCirculoArea(){
        return PI * (lado/2) * (lado/2);
    }

    public double getPeriCirculo() { 
        return 2*PI*lado;
    }

    public void setLado(double lado) { 
        this.lado = lado;
    }
}

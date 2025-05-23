package Model;

public class TrianguloIsoseles {
    private double lado;
    private double altura;

    public double getATrianguloIsoseles(){
        return (lado*altura)/2;
    }

    public double getPeriTrianguloIsoseles() { 
        return lado*3;
    }
    public void setLado(double lado) { 
        this.lado = lado;
    }
    public void setAltura(double altura) { 
        this.altura = altura;
    }

}

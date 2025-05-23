import Model.Square;
import Model.TrianguloIsoseles;
import Model.Circulo;
public class App {
    public static void main(String[] args) throws Exception {
        //area cuadrado
        Square sq = new Square();
        sq.setLado(10);
        System.out.println("Cuadrado");
        double squarePerimeter = sq.getPerimeter(); 
        System.out.println(squarePerimeter);
        double squareArea=sq.getArea();
        System.out.println(squareArea);
        
        //area triangulo isoseles
        TrianguloIsoseles tri=new TrianguloIsoseles();
        tri.setLado(10);
        tri.setAltura(10);
        System.out.println("Triangulo");
        double trianguloArea=tri.getATrianguloIsoseles();
        double trianguloPeri=tri.getPeriTrianguloIsoseles();
        System.out.println(trianguloArea);
        System.out.println(trianguloPeri);

        //area circulo
        Circulo cir= new Circulo();
        cir.setLado(10);
        System.out.println("Circulo");
        double circuloArea=cir.getCirculoArea();
        double circuloPerimeto=cir.getPeriCirculo();
        System.out.println(circuloArea);
        System.out.println(circuloPerimeto);
    }
}

import Model.Circle;
import Model.FigureAbs;
import Model.Square;
import Model.Triangle;
import Model.TriangleE;
import Model.TriangleR;

public class App {  
    public static void main(String[] args) throws Exception {

        FigureAbs sq = new Square(10);
        FigureAbs cir = new Circle(10);
        FigureAbs triangle = new Triangle(20, 25, 20);
        FigureAbs triE = new TriangleE(10, 20);
        FigureAbs triR = new TriangleR(10,20,30);

        FigureAbs[] figures = { sq, cir, triangle, triE, triR };

        for (FigureAbs figureAbs : figures) {
            System.out.println("La clase es: " + figureAbs.getClass().getSimpleName());
            System.out.println("El area es: " + figureAbs.getArea());
            System.out.println("El perimetro es: " + figureAbs.getPerimeter());
            System.out.println("----------------------------------------------------");
        }

    }
}

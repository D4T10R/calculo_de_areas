import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import enums.Color;

public class Program {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<Shape> tipos = new ArrayList<>();

        System.out.println("Enter the number of shapes: ");
        int quant = sc.nextInt();

        for (int i = 0; i < quant; i++) {

            System.out.print("Shape #" + (i+1) + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char tipo = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = enums.Color.valueOf(sc.next());
            if (tipo == 'r') {
                System.out.print("width: ");
                Double width = sc.nextDouble();
                System.out.print("Height: ");
                Double height = sc.nextDouble();
                tipos.add(new Rectangle(color, width, height));
            }
            else if (tipo == 'c') {
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                tipos.add(new Circle(color, radius));
            }
            else {
                System.out.println("Valor invalido");
                i--;
            }

        }

        System.out.println("SHAPE AREAS: ");
        for (Shape shape : tipos) {
            Double area = shape.area();
            System.out.printf("\n %.2f", area);
        }

        // D4T10R
    }

}

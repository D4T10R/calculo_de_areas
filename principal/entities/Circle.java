import enums.Color;

public class Circle extends Shape {
    
    // ATRIBUTOS
    private Double radius;
    private final Double pi = 3.14159; 
    // ATRIBUTOS

    // CONSTRUTORES
    public Circle() {
    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
    // ENCAPSULAMENTO
    
    // METODOS
    @Override
    public Double area() {
        Double tamanho = pi * (radius * radius); 
        return tamanho;
    }
    // METODOS

    

}

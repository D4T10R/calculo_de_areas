import enums.Color;

public abstract class Shape {

    // ATRIBUTOS
    private Color color;
    // ATRIBUTOS

    // CONSTRUTORES
    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    public void setColor(Color color) {
        this.color = color;
    } 

    public Color getColor() {
        return color;
    }
    // ENCAPSULAMENTO

    // METODOS
    public abstract Double area();
    // METODOS
}
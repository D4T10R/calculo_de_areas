import java.security.PublicKey;

import enums.Color;

public class Rectangle extends Shape{
    

    // ATRIBUTOS
    public Double width;
    public Double height;
    // ATRUBUTOS

    // CONSTRUTORES
    public Rectangle() {
    }

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
    // ENCAPSULAMENTO

    // METODOS
    @Override
    public Double area() {
        Double tamanho = width * height;
        return tamanho;
    }

    


}

package facturacionsoda;

public class Carne {

    private String nombre_corte;
    private double precio;
    private String tipo_animal;

    public Carne(String nombre_corte, double precio, String tipo_animal) {
        this.nombre_corte = nombre_corte;
        this.precio = precio;
        this.tipo_animal = tipo_animal;
    }

 

    public String getTipo_animal() {
        return tipo_animal;
    }

    public void setTipo_animal(String tipo_animal) {
        this.tipo_animal = tipo_animal;
    }

    public String getNombre_corte() {
        return nombre_corte;
    }

    public void setNombre_corte(String nombre_corte) {
        this.nombre_corte = nombre_corte;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    Object getMensaje() {
       
        
        return "Prueba realizada";
    }

}

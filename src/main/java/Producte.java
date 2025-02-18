public class Producte {
    private String nombre;
    private String origen;
    private double precio;
    public Producte(String nombre, String origen, double precio){
        this.nombre = nombre;
        this.origen = origen;
        this.precio = precio;
    }

    public double getPrecio() {
        return this.precio;
    }
    public void setPrecio(double newPrecio) {
        this.precio = newPrecio;
    }

    public String getNombre() {
        return this.nombre;
    }
}

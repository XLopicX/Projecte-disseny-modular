public class Main {
    public static void main(String[] args) {
        Botiga greenClick = new Botiga("Green & Click");

        Producte mariaJuana = new Producte("Maria Juana", "Mexico", 1.70);
        Producte hierbaBosque = new Producte("Hierba de los bosque", "Andorra", 4.20);

        greenClick.addProducto(mariaJuana, 3);
        greenClick.addProducto(hierbaBosque, 4);

        greenClick.buscarProducto("ma");
    }
}
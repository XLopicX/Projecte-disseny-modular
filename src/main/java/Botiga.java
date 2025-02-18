import java.util.ArrayList;

public class Botiga {
    private String nombreTienda;
    private ArrayList<Producte> Productes = new ArrayList<>();
    private ArrayList<Integer> Stock = new ArrayList<>();

    public Botiga(String nombreTienda){
        this.nombreTienda = nombreTienda;
    }

    public void addProducto(Producte producte, Integer stock){
        Productes.add(producte);
        Stock.add(stock);
    }

    public int buscarProducto(String input) {
        input = input.toLowerCase();

        int trobats = 0;

        for (Producte prod : Productes) {
            if (prod.getNombre().toLowerCase().contains(input)) {
                trobats++;
                System.out.println(String.format("[%d] %s", trobats, prod.getNombre()));
            }
        }

        return trobats;
    }


}

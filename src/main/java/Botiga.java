import java.util.ArrayList;

public class Botiga {
    private String nombreTienda;
    private String billetera;
    private ArrayList<Producte> Productes = new ArrayList<>();
    private ArrayList<Integer> Stock = new ArrayList<>();

    public Botiga(String nombreTienda, String billetera){
        this.nombreTienda = nombreTienda;
        this.billetera = billetera;
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

    public int getStock(Producte prod) {
        if (Productes.contains(prod)) {
            return Stock.get(Productes.indexOf(prod));
        }
        else {
            return 0; // La botiga no te el producte
        }
    }

    public String getBilletera() {
        return this.billetera;
    }
}

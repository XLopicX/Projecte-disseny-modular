import java.util.ArrayList;

public class Botiga {
    private String nombreTienda;
    private ArrayList<Producte> Productes = new ArrayList<>();
    public Botiga(String nombreTienda){
        this.nombreTienda = nombreTienda;
    }

    public void addProducto(Producte producte){
        Productes.add(producte);
    }

}

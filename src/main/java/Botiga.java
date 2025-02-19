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

    public ArrayList<Producte> buscarProducto(String input, int filtro) {
        ArrayList<Producte> producteBuscat = new ArrayList<>();
        ArrayList<Producte> producteOrdenat = new ArrayList<>();
        input = input.toLowerCase();
        int trobats = 0;
        for (Producte prod : Productes) {
            if (prod.getNombre().toLowerCase().contains(input)) {
                trobats++;
                producteBuscat.add(prod);
                producteOrdenat.add(prod);
                //System.out.println(String.format("[%d] %s", trobats, prod.getNombre()));
            }
        }
        switch (filtro){
            case 1:{
                //filtrar de menor a mayor
                Producte hold;
                for (int i = 0; i < producteBuscat.size() ; i++) {
                    for ( int k = 0 ; k < (producteBuscat.size()-1); k++) {
                        hold = producteOrdenat.get(k);
                            if(hold.getPrecio() < producteBuscat.get(k+1).getPrecio()){
                                producteOrdenat.set(k, hold);
                                producteOrdenat.set(k+1, producteBuscat.get(k+1));
                            }
                            else {
                                producteOrdenat.set(k, producteBuscat.get(k+1));
                                producteOrdenat.set(k+1, hold);
                            }
                    }
                    producteBuscat = producteOrdenat;
                }
                break;
            }
            case 2: {
                Producte hold;
                for (int i = 0; i < producteBuscat.size() ; i++) {
                    for ( int k = 0 ; k < (producteBuscat.size()-1); k++) {
                        hold = producteOrdenat.get(k);
                        if(hold.getPrecio() > producteBuscat.get(k+1).getPrecio()){
                            producteOrdenat.set(k, hold);
                            producteOrdenat.set(k+1, producteBuscat.get(k+1));
                        }
                        else {
                            producteOrdenat.set(k, producteBuscat.get(k+1));
                            producteOrdenat.set(k+1, hold);
                        }
                    }
                    producteBuscat = producteOrdenat;
                }
                break;
            }
        }
        return producteOrdenat;
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

    public ArrayList buscarProductoOrigen(String input) {
        ArrayList<Producte> producteBuscat = new ArrayList<>();
        for (Producte prod : Productes) {
            if (prod.getOrigen().equals(input)) {
                producteBuscat.add(prod);
            }
        }
        return producteBuscat;
    }
    public ArrayList getOrigenes() {
        ArrayList<String> origenes = new ArrayList<>();
        for (Producte prod : Productes) {
            if (!origenes.contains(prod.getOrigen())) {
                origenes.add(prod.getOrigen());
            }
        }
        return origenes;
    }
}

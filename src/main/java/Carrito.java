import java.util.Hashtable;

public class Carrito {
    private Botiga botiga;
    private Usuari user;
    private Hashtable<String, Integer> lista = new Hashtable<>();
    private double precioTotal;

    public Carrito(Botiga botiga, Usuari user) {
        this.botiga = botiga;
        this.user = user;
    }

    public void agregarAlCarrito(Producte prod, int cantidad) {
        if (lista.get(prod.getNombre()) == null) {
            if (botiga.getStock(prod) >= cantidad) {
                lista.put(prod.getNombre(), cantidad);
                precioTotal += prod.getPrecio() * cantidad;
            }
            else {
                System.out.println("No hay suficiente stock");
            }
        }
        else {
            if (botiga.getStock(prod) >= lista.get(prod.getNombre()) + cantidad) {
                lista.put(prod.getNombre(), lista.get(prod.getNombre()) + cantidad);
                precioTotal += prod.getPrecio() * cantidad;
            }
            else {
                System.out.println("No hay suficiente stock");
            }
        }
    }

    public void eliminarDelCarrito(Producte prod, int cantidad) {
        if (lista.get(prod.getNombre()) != null) {
            if (lista.get(prod.getNombre()) > cantidad) {
                precioTotal -= prod.getPrecio() * cantidad;
                lista.put(prod.getNombre(), lista.get(prod.getNombre()) - cantidad);
            } else if (lista.get(prod.getNombre()) == cantidad) {
                precioTotal -= prod.getPrecio() * cantidad;
                lista.remove(prod.getNombre());
            } else  {
                System.out.println("No puedes eliminar mas cantidad de un producto de lo que tienes al carrito");
            }
        }
        else {
            System.out.println("El producto no existe en el carrito");
        }
    }

    public void generarFactura() {
        for (String producte : lista.keySet()) {
            int cantidad = lista.get(producte);
            System.out.println(String.format("%s: %d", producte, cantidad));
        }
        System.out.println(String.format("Precio final: %.2f€", precioTotal));
    }

    public void pagar() {
        if (user.pagar(precioTotal)) {
            System.out.println(String.format("Transferido %.2f€ de tu billetera %s a %s", precioTotal, user.getBilletera(), botiga.getBilletera()));
            System.out.println("¡Pago recibido correctamente, recibiras las hiervas en los proximos dias!");
        }
        else {
            System.out.println("No tienes suficiente dinero para hacer el pago");
        }
    }
}
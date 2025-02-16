public class Usuari {
    private String nombre;
    private String billetera;
    private double balance;

    public Usuari(String nombre, String billetera, double balance) {
        this.nombre = nombre;
        this.billetera = billetera;
        this.balance = balance;
    }

    // Métodes getter:

    public String getNombre() {
        return this.nombre;
    }

    public String getBilletera() {
        return this.billetera;
    }

    public double getBalance() {
        return this.balance;
    }

    // Métodes setters:

    public boolean pagar(double precio) {
        if (precio <= this.balance) {
            this.balance -= precio;
            return true;
        }
        else {
            return false; // Esta pobre el chaval
        }
    }

}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Botiga greenClick = new Botiga("Green & Click", "4GVFRHg5ouXBwVkxkESpgV6XQnpX18o4crJ2Xqq5x5RZrj2SerL8zKaCZr2QwRNhoNKZmtzoCmPrcPjRS6mfrc6ZUtxU1KK");

        Producte mariaJuana = new Producte("Maria Juana", "Mexico", 1.70);
        Producte hierbaBosque = new Producte("Hierba de los bosque", "Andorra", 4.20);

        greenClick.addProducto(mariaJuana, 3);
        greenClick.addProducto(hierbaBosque, 4);

        //MENÚ
        String banner = "\n" +
                "  .-_'''-.   .-------.        .-''-.      .-''-.  ,---.   .--.           .-```-.                 _______    .---.    .-./`)     _______   .--.   .--.   \n" +
                " '_( )_   \\  |  _ _   \\     .'_ _   \\   .'_ _   \\ |    \\  |  |          /   _   \\               /   __  \\   | ,_|    \\ .-.')   /   __  \\  |  | _/  /    \n" +
                "|(_ o _)|  ' | ( ' )  |    / ( ` )   ' / ( ` )   '|  ,  \\ |  |         |  .` '\\__|             | ,_/  \\__),-./  )    / `-' \\  | ,_/  \\__) | (`' ) /     \n" +
                ". (_,_)/___| |(_ o _) /   . (_ o _)  |. (_ o _)  ||  |\\_ \\|  |          \\  `--.              ,-./  )      \\  '_ '`)   `-'`\"`,-./  )       |(_ ()_)      \n" +
                "|  |  .-----.| (_,_).' __ |  (_,_)___||  (_,_)___||  _( )_\\  |         /' ..--`.----.        \\  '_ '`)     > (_)  )   .---. \\  '_ '`)     | (_,_)   __  \n" +
                "'  \\  '-   .'|  |\\ \\  |  |'  \\   .---.'  \\   .---.| (_ o _)  |        :  `     ' ___|         > (_)  )  __(  .  .-'   |   |  > (_)  )  __ |  |\\ \\  |  | \n" +
                " \\  `-'`   | |  | \\ `'   / \\  `-'    / \\  `-'    /|  (_,_)\\  |        |   `..-'_( )_         (  .  .-'_/  )`-'`-'|___ |   | (  .  .-'_/  )|  | \\ `'   / \n" +
                "  \\        / |  |  \\    /   \\       /   \\       / |  |    |  |         \\      (_ o _)         `-'`-'     /  |        \\|   |  `-'`-'     / |  |  \\    /  \n" +
                "   `'-...-'  ''-'   `'-'     `'-..-'     `'-..-'  '--'    '--'          `-.__..(_,_)            `._____.'   `--------`'---'    `._____.'  `--'   `'-'   \n" +
                "                                                                                                                                                        \n";
        Scanner scanN = new Scanner(System.in); // scanner numeros
        Scanner scanS = new Scanner(System.in); // scanner strings
        boolean stopcon = false;// condicio de parar el programa
        System.out.println("A escriba su usuario");
        String nombreU;
        nombreU = scanS.nextLine();
        System.out.println("Escriba la direccion de su billetera");
        String billeteraU;
        billeteraU = scanS.nextLine();
        System.out.println("Escriba el balance que quiere ingresar");
        double balanceU;
        balanceU = scanN.nextDouble();
        while(stopcon != true){
            System.out.println(banner);
            System.out.println("Bienvenido a la pagina principal de Green&Click. \nA continuación escoja una de las siguentes opciones del menú");
            Usuari usuari = new Usuari(nombreU, billeteraU, balanceU);
            System.out.println("[1] Ver Catalogo completo");
            System.out.println("[2] Ver Buscar un producto");
            System.out.println("[3] Ver Buscar un producto por origen");
            System.out.println("[0] Salir del programa");
            switch (scanN.nextInt()) {
                case 1:{
                    System.out.println("[1] Filtrar menor -> mayor");
                    System.out.println("[2] Filtrar mayor -> menor");
                    ArrayList<Producte> llistaProductes = greenClick.buscarProducto("",0);
                    for (int i = 0; i < llistaProductes.size(); i++ ){
                        System.out.println("["+(i+3)+"]"+ llistaProductes.get(i).getNombre());
                    }
                    System.out.println("[0] Exit");
                    switch (scanN.nextInt()){
                        case 1:{
                            for (int i = 0; i < llistaProductes.size(); i++ ){
                                System.out.println("["+i+"]"+ greenClick.buscarProducto("",1).get(i).getNombre());
                            }
                            break;
                        }
                        case 2:{
                            break;
                        }
                        case 0:{
                            break;
                        }
                    }

                    System.out.println("Primera");
                    break;
                }
                case 2:{
                    System.out.println("Segunda");
                    break;
                }
                case 0:{
                    stopcon = true;
                    break;
                }
            }
        }
//        System.out.println("Stock: " + greenClick.getStock(hierbaBosque));
//
//        greenClick.buscarProducto("ma", 1);
//
//        Usuari usuari = new Usuari("Ferran", "45Yurz2vAgVDfk7uyXEEenXUcrfhUFFSPQKn5eqYEb4d3w4t3vp2JuWRuTmMdnSBeG5nfnuz6jFEsR5QGi8UXU5VE4aqvXE", 1);
//
//        Carrito carrito = new Carrito(greenClick, usuari);
//
//        carrito.agregarAlCarrito(mariaJuana, 2);
//        carrito.agregarAlCarrito(mariaJuana, 1);
//
//        carrito.generarFactura();
//
//        carrito.pagar();

    }
}
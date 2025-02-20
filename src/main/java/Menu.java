import java.util.*;

public class Menu {
    static Botiga greenClick = new Botiga("Green & Click", "4GVFRHg5ouXBwVkxkESpgV6XQnpX18o4crJ2Xqq5x5RZrj2SerL8zKaCZr2QwRNhoNKZmtzoCmPrcPjRS6mfrc6ZUtxU1KK");
    static Producte mariaJuana = new Producte("Maria Juana", "Mexico", 1.70);
    static Producte hierbaBosque = new Producte("Hierba de los bosque", "Andorra", 4.20);
    static Producte setaFeliz = new Producte("La seta feliz", "Marrueco", 2.47);
    static Producte oroVerde = new Producte("El oro verde", "Palestina", 1.33);
    static ArrayList<Producte> llistaProductes;
    static Usuari usuari;
    static Carrito carrito;
    static String busquedaProd = "";
    public static void main(String[] args) {
        System.out.println("A escriba su usuario");
        String nombreU;
        nombreU = scanner.nextLine();
        System.out.println("Escriba la direccion de su billetera");
        String billeteraU;
        billeteraU = scanner.nextLine();
        System.out.println("Escriba el balance que quiere ingresar");
        double balanceU;
        balanceU = scannerI.nextDouble();
        usuari = new Usuari(nombreU, billeteraU, balanceU);
        carrito = new Carrito(greenClick, usuari);
        greenClick.addProducto(mariaJuana, 100);
        greenClick.addProducto(hierbaBosque, 100);
        greenClick.addProducto(setaFeliz, 100);
        greenClick.addProducto(oroVerde, 100);
        Principal();
    }
    static Scanner scanner = new Scanner(System.in);
    static Scanner scannerI = new Scanner(System.in);
    static Scanner scannerS = new Scanner(System.in);
    static Scanner scannerSS = new Scanner(System.in);
    // defineix les opcions disponibles a cada menu https://stackoverflow.com/questions/1005073/initialization-of-an-arraylist-in-one-line
    static List<Integer> RPrincipal = Arrays.asList(1,2,3,4,0);
    static ArrayList<Integer> RClassic = new ArrayList<>(Arrays.asList(1,2,0));
    static ArrayList<Integer> RClassicBusqueda = new ArrayList<>(Arrays.asList(1,2,0));
    static ArrayList<Integer> RClassicOrigen = new ArrayList<>(Arrays.asList(0));
    static ArrayList<Integer> RCarrito = new ArrayList<>(Arrays.asList(1,0));
    static List<Integer> RAClassic = Collections.singletonList(1);
    static List<Integer> RCredits = Collections.singletonList(1);

    public static int validificador(String menu) {
        boolean valid = false;
        int opcio = 0;

        if (menu.equals("Principal")) {
            while (!valid) {
                try {
                    opcio = scanner.nextInt();
                    if (RPrincipal.contains(opcio)) {
                        valid = true;
                    } else {
                        System.out.println("Resposta Invalida");
                    }
                }
                catch (Exception e) {
                    System.out.println("Resposta Invalida");
                    scanner.nextLine();
                }
            }
        }
        else if (menu.equals("Classic")) {
            while (!valid) {
                try {
                    opcio = scanner.nextInt();
                    if (RClassic.contains(opcio)) {
                        valid = true;
                    }
                    else {
                        System.out.println("Resposta Invalida");
                    }
                }
                catch (Exception e) {
                    System.out.println("Resposta Invalida");
                    scanner.reset();
                }
            }
        }
        else if (menu.equals("ClassicBusqueda")) {
            while (!valid) {
                try {
                    opcio = scanner.nextInt();
                    if (RClassicBusqueda.contains(opcio)) {
                        valid = true;
                    }
                    else {
                        System.out.println("Resposta Invalida");
                    }
                }
                catch (Exception e) {
                    System.out.println("Resposta Invalida");
                    scanner.reset();
                }
            }
        }
        else if (menu.equals("ClassicOrigen")) {
            while (!valid) {
                try {
                    opcio = scanner.nextInt();
                    if (RClassicOrigen.contains(opcio)) {
                        valid = true;
                    }
                    else {
                        System.out.println("Resposta Invalida");
                    }
                }
                catch (Exception e) {
                    System.out.println("Resposta Invalida");
                    scanner.reset();
                }
            }
        }
        else if (menu.equals("Carrito")) {
            while (!valid) {
                try {
                    opcio = scanner.nextInt();
                    if (RCarrito.contains(opcio)) {
                        valid = true;
                    }
                    else {
                        System.out.println("Resposta Invalida");
                    }
                }
                catch (Exception e) {
                    System.out.println("Resposta Invalida");
                    scanner.reset();
                }
            }
        }
        else if (menu.equals("AClassic")) {
            while (!valid) {
                try {
                    opcio = scanner.nextInt();
                    if (RAClassic.contains(opcio)) {
                        valid = true;
                    } else {
                        System.out.println("Resposta Invalida");
                    }
                }
                catch (Exception e) {
                    System.out.println("Resposta Invalida");
                    scanner.reset();
                }
            }
        }
        else if (menu.equals("Credits")) {
            while (!valid) {
                try {
                    opcio = scanner.nextInt();
                    if (RCredits.contains(opcio)) {
                        valid = true;
                    } else {
                        System.out.println("Resposta Invalida");
                    }
                }
                catch (Exception e) {
                    System.out.println("Resposta Invalida");
                    scanner.reset();
                }
            }
        }
        return opcio;
    }

    public static void Principal() {
        String titol = """
                       
                 _____                                _____ _ _      _   \s
                |  __ \\                       ___    /  __ \\ (_)    | |  \s
                | |  \\/_ __ ___  ___ _ __    ( _ )   | /  \\/ |_  ___| | __
                | | __| '__/ _ \\/ _ \\ '_ \\   / _ \\/\\ | |   | | |/ __| |/ /
                | |_\\ \\ | |  __/  __/ | | | | (_>  < | \\__/\\ | | (__|   <\s
                 \\____/_|  \\___|\\___|_| |_|  \\___/\\/  \\____/_|_|\\___|_|\\_\\    V1.0
                    """;
        System.out.println(titol);
        String menu = """
                    [1] Ver Catalogo completo
                    [2] Buscar un producto
                    [3] Buscar un producto por origen
                    [4] Carrito
                    [0] Salir del programa
                    """;
        System.out.println(menu);
        int opcio = validificador("Principal");
        menuInter("Principal", opcio);
    }

    public static void Classic(int filtre) {
        String menu2Variable="";
        llistaProductes = greenClick.buscarProducto("",filtre);
        for (int i = 0; i < llistaProductes.size(); i++ ){
            menu2Variable += "["+(i+3)+"] "+ llistaProductes.get(i).getNombre()+" | Origen: "+ llistaProductes.get(i).getOrigen()+" | Precio: "+ llistaProductes.get(i).getPrecio()  +"\n";
        }
        String menu2 = """
                        \nSelecciona un filtro:
                        [1] Filtrar menor -> mayor
                        [2] Filtrar mayor -> menor 
                        """;

        String menu21 = """
                        -----------------
                        [0] Endarrere
                        """;
        System.out.println(menu2+menu2Variable+menu21);
        modificarLista(llistaProductes, "Classic");
        int opcio = validificador("Classic");
        menuInter("Classic", opcio);
    }
    public static void ClassicBusqueda(int filtre, String busqueda) {
        String menu2Variable="";
        llistaProductes = greenClick.buscarProducto(busqueda,filtre);
        for (int i = 0; i < llistaProductes.size(); i++ ){
            menu2Variable += "["+(i+3)+"] "+ llistaProductes.get(i).getNombre()+" | Origen: "+ llistaProductes.get(i).getOrigen()+" | Precio: "+ llistaProductes.get(i).getPrecio()  +"\n";
        }
        String menu2 = """
                        \nSelecciona un filtro:
                        [1] Filtrar menor -> mayor
                        [2] Filtrar mayor -> menor 
                        """;

        String menu21 = """
                        -----------------
                        [0] Endarrere
                        """;
        System.out.println(menu2+menu2Variable+menu21);
        modificarLista(llistaProductes, "ClassicBusqueda");
        int opcio = validificador("ClassicBusqueda");
        menuInter("ClassicBusqueda", opcio);
    }

    public static void ClassicOrigen(String busqueda) {
        String menu2Variable="";
        llistaProductes = greenClick.buscarProductoOrigen(busqueda);
        for (int i = 0; i < llistaProductes.size(); i++ ){
            menu2Variable += "["+(i+1)+"] "+ llistaProductes.get(i).getNombre() + " | Precio: " + llistaProductes.get(i).getPrecio()  +"\n";
        }
        String menu2 = "\nUste esta buscando por el pais de Origen: " + busquedaProd + "\n";

        String menu21 = """
                        -----------------
                        [0] Endarrere
                        """;
        System.out.println(menu2+menu2Variable+menu21);
        modificarLista(llistaProductes, "ClassicOrigen");
        int opcio = validificador("ClassicOrigen");
        menuInter("ClassicOrigen", opcio);
    }
    public static void Carrito() {
        String menu2Variable="";
        llistaProductes = carrito.getProductesCarrito();
        for (int i = 0; i < llistaProductes.size(); i++ ){
            menu2Variable += "["+(i+2)+"] "+ llistaProductes.get(i).getNombre() + " | Precio: " + llistaProductes.get(i).getPrecio()+ " | Cantidad: " + carrito.getCantitatProducte(llistaProductes.get(i))  +"\n";
        }
        String menu2 = """
                        \nCarrito:
                        [1] Pagar 
                        """;

        String menu21 = String.format(
                        """
                        -----------------
                        Subtotal de la cesta: %.2f€
                        -----------------
                        [0] Endarrere
                        """, carrito.precioFinal());
        System.out.println(menu2+menu2Variable+menu21);
        modificarLista(llistaProductes, "Carrito");
        int opcio = validificador("Carrito");
        menuInter("Carrito", opcio);
    }

    public static void AClassic() {
        String menu3 = """
            \nFacil = Numero aleatori entre 0 i 25 amb 10 intents
            Intermitg = Numero aleatori entre 0 i 50 amb 15 intents
            Dificil = Numero aleatori entre 0 i 100 amb 20 intents
                                  
            [1] Endarrere
             """;
        System.out.println(menu3);
        int opcio = validificador("AClassic");
        menuInter("AClassic", opcio);
    }

    public static void Credits() {
        String menu3 = """
            \nCreat per Ferran Gimenez Figuerola
            A data de: 09/10/2024
            
            Fonts d'informacio:
            https://stackoverflow.com/questions/1005073/initialization-of-an-arraylist-in-one-line
            
            [1] Endarrere
             """;
        System.out.println(menu3);
        int opcio = validificador("Credits");
        menuInter("Credits", opcio);
    }

    public static void menuInter(String menu, int numero) {

        if (menu.equals("Principal")) {
            if (numero == 1) {
                Classic(0);
            }
            else if (numero == 2) {
                System.out.println("Introduce el nombre del producto que desea buscar");
                busquedaProd = scannerS.nextLine();
                ClassicBusqueda(0, busquedaProd);

            }
            else if (numero == 3) {
                System.out.println("Introduce el Origen del producto que desea buscar");
                busquedaProd = scannerS.nextLine();
                ClassicOrigen(busquedaProd);
            }
            else if (numero == 4) {
                Carrito();
            }
        }
        else if (menu.equals("Classic")) {
            if (numero > 2) {
                System.out.println("Añade la cantidad de producto deseada");
                int cantidad;
                cantidad = scannerI.nextInt();
                carrito.agregarAlCarrito(llistaProductes.get(numero-3), cantidad );
                System.out.println("Usted ha añadido " +llistaProductes.get(numero-3).getNombre() + " con " + cantidad + " unidades a la cesta");
                Classic(0 );
            }
            else if (numero == 0) {
                Principal();
            }
            else if (numero == 1) {
                Classic(1);
            }
            else if (numero == 2) {
                Classic(2);
            }
        }
        else if (menu.equals("ClassicBusqueda")) {
            if (numero > 2) {
                System.out.println("Añade la cantidad de producto deseada");
                int cantidad;
                cantidad = scannerI.nextInt();
                carrito.agregarAlCarrito(llistaProductes.get(numero-3), cantidad );
                System.out.println("Usted ha añadido " +llistaProductes.get(numero-3).getNombre() + " con " + cantidad + " unidades a la cesta");
                ClassicBusqueda(0,busquedaProd);
            }
            else if (numero == 0) {
                Principal();
            }
            else if (numero == 1) {
                ClassicBusqueda(1,busquedaProd);
            }
            else if (numero == 2) {
                ClassicBusqueda(2,busquedaProd);
            }
        }
        else if (menu.equals("ClassicOrigen")) {
            if (numero > 0) {
                System.out.println("Añade la cantidad de producto deseada");
                int cantidad;
                cantidad = scannerI.nextInt();
                carrito.agregarAlCarrito(llistaProductes.get(numero-1), cantidad );
                System.out.println("Usted ha añadido " +llistaProductes.get(numero-1).getNombre() + " con " + cantidad + " unidades a la cesta");
                ClassicOrigen(busquedaProd);
            }
            else if (numero == 0) {
                Principal();
            }
        }
        else if (menu.equals("Carrito")) {
            if (numero > 1) {
                System.out.println("Indique la cantidad del productos selecionado que quiera quiatar:");
                int cantidad;
                cantidad = scannerI.nextInt();
                carrito.eliminarDelCarrito(llistaProductes.get(numero-2), cantidad );
                Carrito();
            }
            else if (numero == 1) {
                carrito.pagar();
            }
            else if (numero == 0) {
                Principal();
            }
        }
        else if (menu.equals("AClassic")) {
            if (numero == 1) {
                Classic(0);
            }
        }
        else if (menu.equals("Credits")) {
            if (numero == 1) {
                Principal();
            }
        }
    }

    public static void modificarLista(ArrayList<Producte> opcions, String menu){
        Integer valor = 0;
        if (menu.equals("Classic")) {
            for (int i = 0; i < opcions.size(); i++) {
                while (RClassic.contains(valor)) {
                    valor++;
                }
                RClassic.add(valor);
                //System.out.println("["+(i+3)+"]"+ opcions.get(i).getNombre());
            }
        }
        else if (menu.equals("ClassicBusqueda")) {
            for (int i = 0; i < opcions.size(); i++) {
                while (RClassicBusqueda.contains(valor)) {
                    valor++;
                }
                RClassicBusqueda.add(valor);
                //System.out.println("["+(i+3)+"]"+ opcions.get(i).getNombre());
            }
        }
        else if (menu.equals("ClassicOrigen")) {
            for (int i = 0; i < opcions.size(); i++) {
                while (RClassicOrigen.contains(valor)) {
                    valor++;
                }
                RClassicOrigen.add(valor);
                //System.out.println("["+(i+3)+"]"+ opcions.get(i).getNombre());
            }
        }

        else if (menu.equals("Carrito")) {
            for (int i = 0; i < opcions.size(); i++) {
                while (RCarrito.contains(valor)) {
                    valor++;
                }
                RCarrito.add(valor);
                //System.out.println("["+(i+3)+"]"+ opcions.get(i).getNombre());
            }
        }
    }
}

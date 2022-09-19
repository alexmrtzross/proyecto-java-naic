import java.util.*;
import Cliente.*;
import Factura.*;
import Producto.*;

public class Naic {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Factura[] facturas = new Factura[30];
        Producto producto = new Producto();
        Cliente[] cliente = new Cliente[30];
        int noFactura = crearFact();

        // PRODUCTOS CREADOS
        producto = new Producto("tenis", 100, 2);
        producto = new Producto("playera", 70, 3);
        producto = new Producto("pans", 80, 4);
        producto = new Producto("pantaloneta", 50, 5);
        producto = new Producto("gorra", 65, 3);
        producto = new Producto("tenis", 100, 2);
        producto = new Producto("playera", 70, 1);
        producto = new Producto("pans", 80, 3);
        producto = new Producto("pantaloneta", 50, 1);
        producto = new Producto("gorra", 65, 1);

        /* Crear facturas con datos random */
        facturas[7] = new Factura(noFactura, "Juan", "123456-7", "Zona 1", producto.getMontoTotal(), "Enero", 2021,
                "Efectivo", producto);
        facturas[8] = new Factura(noFactura, "Pedro", "123456-8", "Zona 2", producto.getMontoTotal(), "Febrero", 2021,
                "Efectivo", producto);
        facturas[9] = new Factura(noFactura, "Maria", "123456-9", "Zona 3", producto.getMontoTotal(), "Marzo", 2021,
                "Efectivo", producto);
        facturas[10] = new Factura(noFactura, "Jose", "123456-10", "Zona 4", producto.getMontoTotal(), "Abril", 2021,
                "Efectivo", producto);
        facturas[11] = new Factura(noFactura, "Luis", "123456-11", "Zona 5", producto.getMontoTotal(), "Mayo", 2021,
                "Efectivo", producto);
        facturas[12] = new Factura(noFactura, "Ana", "123456-12", "Zona 6", producto.getMontoTotal(), "Junio", 2021,
                "Efectivo", producto);
        facturas[13] = new Factura(noFactura, "Luisa", "123456-13", "Zona 7", producto.getMontoTotal(), "Julio", 2021,
                "Efectivo", producto);
        facturas[14] = new Factura(noFactura, "Carlos", "123456-14", "Zona 8", producto.getMontoTotal(), "Agosto", 2021,
                "Efectivo", producto);
        facturas[15] = new Factura(noFactura, "Luis", "123456-15", "Zona 9", producto.getMontoTotal(), "Septiembre", 2021,
                "Efectivo", producto);
        facturas[16] = new Factura(noFactura, "Luisa", "123456-16", "Zona 10", producto.getMontoTotal(), "Octubre", 2021,
                "Efectivo", producto);

        int opcion = 0;

        do {

            System.out.println("\nFacturas Tiendas Naic\n");
            System.out.println("1. Ingresar Factura");
            System.out.println("2. Imprimir Factura");
            System.out.println("3. Imprimir ingreso por ventas");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    noFactura = crearFact();
                    System.out.print("El numero de factura es: " + noFactura + "\n");
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = sc.next();
                    System.out.print("Ingrese el nit del cliente: ");
                    String nit = sc.next();
                    System.out.print("Ingrese la direccion del cliente: ");
                    String direccion = sc.next();
                    System.out.print("Ingrese el mes de la factura: ");
                    String mes = sc.next();
                    System.out.print("Ingrese el anio de la factura: ");
                    int anio = sc.nextInt();
                    /* Obtener el metodo de pago */
                    String pago;
                    System.out.print("Ingrese el metodo de pago: ");
                    System.out.print("\n1. Efectivo\n2. Tarjeta\n");
                    String metodoPago = sc.next().toLowerCase();
                    if (metodoPago.equals("1") || metodoPago.equals("efectivo")) {
                        pago = "Efectivo";
                    } else if (metodoPago.equals("2") || metodoPago.equals("tarjeta")) {
                        pago = "Tarjeta";
                    } else {
                        pago = "Efectivo";
                    }

                    // Ver productos
                    System.out.print("Cuantos productos compro?: ");
                    int cantidad = sc.nextInt();
                    for (int i = 0; i < cantidad; i++) {
                        System.out.print("\n");
                        System.out.println("1. Tenis");
                        System.out.println("2. Playera");
                        System.out.println("3. Pans");
                        System.out.println("4. Pantaloneta");
                        System.out.println("5. Gorra");
                        System.out.print("Ingrese el numero del producto " + (i + 1) + ": ");
                        int numProducto = sc.nextInt();
                        if (numProducto == 1) {
                            producto = new Producto("tenis".toLowerCase(), 100, cantidad);
                        } else if (numProducto == 2) {
                            producto = new Producto("playera".toLowerCase(), 70, cantidad);
                        } else if (numProducto == 3) {
                            producto = new Producto("pans".toLowerCase(), 80, cantidad);
                        } else if (numProducto == 4) {
                            producto = new Producto("pantaloneta".toLowerCase(), 50, cantidad);
                        } else if (numProducto == 5) {
                            producto = new Producto("gorra".toLowerCase(), 65, cantidad);
                        } else {
                            System.out.println("Opcion no valida");
                        }
                    }
                    System.out.print("\n");

                    /* Generamos la factura con los datos */
                    Factura factura = new Factura(noFactura, nombre, nit, direccion, producto.getMontoTotal(), mes, anio,
                            pago, producto);
                    for (int i = 0; i < facturas.length; i++) {
                        if (facturas[i] == null) {
                            facturas[i] = factura;
                            break;
                        }
                    }
                    Cliente cliente1 = new Cliente(nombre, nit, direccion);
                    for (int i = 0; i < cliente.length; i++) {
                        if (cliente[i] == null) {
                            cliente[i] = cliente1;
                            break;
                        }
                    }
                    System.out.println("Factura ingresada con exito");
                    System.out.println("\n");
                    /* Imprimir la factura */
                    System.out.println("Factura No. " + factura.getNoFactura());
                    System.out.println("Cliente: " + factura.getNombre());
                    System.out.println("Nit: " + factura.getNit());
                    System.out.println("Direccion: " + factura.getDireccion());
                    System.out.println("Monto total: " + factura.getMontoTotal());
                    System.out.println("Fecha: " + factura.getMes() + " " + factura.getAnio());
                    System.out.println("Metodo de pago: " + factura.getPago());
                    break;
                case 2:
                    System.out.print("\n");
                    System.out.println("1. Por Numero de factura");
                    System.out.println("2. Por Nombre del cliente");
                    System.out.println("3. Por Nit");
                    System.out.println("4. Por Direccion");
                    System.out.println("5. Por Monto total");
                    System.out.println("6. Por Mes");
                    System.out.println("7. Por Anio");
                    System.out.println("8. Por Metodo de pago");
                    System.out.print("Ingrese su opcion: ");
                    int opcion2 = sc.nextInt();
                    switch (opcion2) {
                        /* Imprimir todo el arreglo dependiendo la opcion2 */
                        case 1:
                            System.out.print("Ingrese el numero de factura: ");
                            int noFactura2 = sc.nextInt();
                            System.out.print("\n");
                            for (int i = 0; i < facturas.length; i++) {
                                if (facturas[i] != null) {
                                    if (facturas[i].getNoFactura() == noFactura2) {
                                        System.out.print("\n");
                                        System.out.println("Factura No. " + facturas[i].getNoFactura());
                                        System.out.println("Cliente: " + facturas[i].getNombre());
                                        System.out.println("Nit: " + facturas[i].getNit());
                                        System.out.println("Direccion: " + facturas[i].getDireccion());
                                        System.out.println("Monto total: " + facturas[i].getMontoTotal());
                                        System.out.println(
                                                "Fecha: " + facturas[i].getMes() + " " + facturas[i].getAnio());
                                        System.out.println("Metodo de pago: " + facturas[i].getPago());
                                        System.out.print("\n");
                                    }
                                }
                            }
                            break;
                        case 2:
                            System.out.print("Ingrese el nombre del cliente: ");
                            String nombre2 = sc.next().toLowerCase();
                            System.out.print("\n");
                            for (int i = 0; i < facturas.length; i++) {
                                if (facturas[i] != null) {
                                    if (facturas[i].getNombre().equals(nombre2)) {
                                        System.out.print("\n");
                                        System.out.println("Factura No. " + facturas[i].getNoFactura());
                                        System.out.println("Cliente: " + facturas[i].getNombre());
                                        System.out.println("Nit: " + facturas[i].getNit());
                                        System.out.println("Direccion: " + facturas[i].getDireccion());
                                        System.out.println("Monto total: " + facturas[i].getMontoTotal());
                                        System.out.println(
                                                "Fecha: " + facturas[i].getMes() + " " + facturas[i].getAnio());
                                        System.out.println("Metodo de pago: " + facturas[i].getPago());
                                        System.out.print("\n");
                                    }
                                }
                            }
                            break;
                        case 3:
                            System.out.print("Ingrese el nit del cliente: ");
                            String nit2 = sc.next().toLowerCase();
                            System.out.print("\n");
                            for (int i = 0; i < facturas.length; i++) {
                                if (facturas[i] != null) {
                                    if (facturas[i].getNit().equals(nit2)) {
                                        System.out.print("\n");
                                        System.out.println("Factura No. " + facturas[i].getNoFactura());
                                        System.out.println("Cliente: " + facturas[i].getNombre());
                                        System.out.println("Nit: " + facturas[i].getNit());
                                        System.out.println("Direccion: " + facturas[i].getDireccion());
                                        System.out.println("Monto total: " + facturas[i].getMontoTotal());
                                        System.out.println(
                                                "Fecha: " + facturas[i].getMes() + " " + facturas[i].getAnio());
                                        System.out.println("Metodo de pago: " + facturas[i].getPago());
                                        System.out.print("\n");
                                    }
                                }
                            }
                            break;
                        case 4:
                            System.out.print("Ingrese la direccion del cliente: ");
                            String direccion2 = sc.next().toLowerCase();
                            System.out.print("\n");
                            for (int i = 0; i < facturas.length; i++) {
                                if (facturas[i] != null) {
                                    if (facturas[i].getDireccion().equals(direccion2)) {
                                        System.out.print("\n");
                                        System.out.println("Factura No. " + facturas[i].getNoFactura());
                                        System.out.println("Cliente: " + facturas[i].getNombre());
                                        System.out.println("Nit: " + facturas[i].getNit());
                                        System.out.println("Direccion: " + facturas[i].getDireccion());
                                        System.out.println("Monto total: " + facturas[i].getMontoTotal());
                                        System.out.println(
                                                "Fecha: " + facturas[i].getMes() + " " + facturas[i].getAnio());
                                        System.out.println("Metodo de pago: " + facturas[i].getPago());
                                        System.out.print("\n");
                                    }
                                }
                            }
                            break;
                        case 5:
                            System.out.print("Ingrese el monto total de la factura: ");
                            double montoTotal2 = sc.nextDouble();
                            System.out.print("\n");
                            for (int i = 0; i < facturas.length; i++) {
                                if (facturas[i] != null) {
                                    if (facturas[i].getMontoTotal() == montoTotal2) {
                                        System.out.print("\n");
                                        System.out.println("Factura No. " + facturas[i].getNoFactura());
                                        System.out.println("Cliente: " + facturas[i].getNombre());
                                        System.out.println("Nit: " + facturas[i].getNit());
                                        System.out.println("Direccion: " + facturas[i].getDireccion());
                                        System.out.println("Monto total: " + facturas[i].getMontoTotal());
                                        System.out.println(
                                                "Fecha: " + facturas[i].getMes() + " " + facturas[i].getAnio());
                                        System.out.println("Metodo de pago: " + facturas[i].getPago());
                                        System.out.print("\n");
                                    }
                                }
                            }
                            break;
                        case 6:
                            System.out.print("Ingrese el mes de la factura: ");
                            String mes2 = sc.next().toLowerCase();
                            System.out.print("\n");
                            for (int i = 0; i < facturas.length; i++) {
                                if (facturas[i] != null) {
                                    if (facturas[i].getMes().equals(mes2)) {
                                        System.out.print("\n");
                                        System.out.println("Factura No. " + facturas[i].getNoFactura());
                                        System.out.println("Cliente: " + facturas[i].getNombre());
                                        System.out.println("Nit: " + facturas[i].getNit());
                                        System.out.println("Direccion: " + facturas[i].getDireccion());
                                        System.out.println("Monto total: " + facturas[i].getMontoTotal());
                                        System.out.println(
                                                "Fecha: " + facturas[i].getMes() + " " + facturas[i].getAnio());
                                        System.out.println("Metodo de pago: " + facturas[i].getPago());
                                        System.out.print("\n");
                                    }
                                }
                            }
                            break;
                        case 7:
                            System.out.print("Ingrese el anio de la factura: ");
                            int anio2 = sc.nextInt();
                            System.out.print("\n");
                            for (int i = 0; i < facturas.length; i++) {
                                if (facturas[i] != null) {
                                    if (facturas[i].getAnio() == anio2) {
                                        System.out.print("\n");
                                        System.out.println("Factura No. " + facturas[i].getNoFactura());
                                        System.out.println("Cliente: " + facturas[i].getNombre());
                                        System.out.println("Nit: " + facturas[i].getNit());
                                        System.out.println("Direccion: " + facturas[i].getDireccion());
                                        System.out.println("Monto total: " + facturas[i].getMontoTotal());
                                        System.out.println(
                                                "Fecha: " + facturas[i].getMes() + " " + facturas[i].getAnio());
                                        System.out.println("Metodo de pago: " + facturas[i].getPago());
                                        System.out.print("\n");
                                    }
                                }
                            }
                            break;
                        case 8:
                            System.out.println("1. Efectivo");
                            System.out.println("2. Tarjeta de debito");
                            System.out.print("Ingrese el metodo de pago de la factura: ");
                            int pago2 = sc.nextInt();
                            System.out.print("\n");
                            if (pago2 == 1) {
                                for (int i = 0; i < facturas.length; i++) {
                                    if (facturas[i] != null) {
                                        if (facturas[i].getPago().equals("efectivo")) {
                                            System.out.print("\n");
                                            System.out.println("Factura No. " + facturas[i].getNoFactura());
                                            System.out.println("Cliente: " + facturas[i].getNombre());
                                            System.out.println("Nit: " + facturas[i].getNit());
                                            System.out.println("Direccion: " + facturas[i].getDireccion());
                                            System.out.println("Monto total: " + facturas[i].getMontoTotal());
                                            System.out.println(
                                                    "Fecha: " + facturas[i].getMes() + " " + facturas[i].getAnio());
                                            System.out.println("Metodo de pago: " + facturas[i].getPago());
                                            System.out.print("\n");
                                        }
                                    }
                                }
                            } else if (pago2 == 2) {
                                for (int i = 0; i < facturas.length; i++) {
                                    if (facturas[i] != null) {
                                        if (facturas[i].getPago().equals("tarjeta")) {
                                            System.out.print("\n");
                                            System.out.println("Factura No. " + facturas[i].getNoFactura());
                                            System.out.println("Cliente: " + facturas[i].getNombre());
                                            System.out.println("Nit: " + facturas[i].getNit());
                                            System.out.println("Direccion: " + facturas[i].getDireccion());
                                            System.out.println("Monto total: " + facturas[i].getMontoTotal());
                                            System.out.println(
                                                    "Fecha: " + facturas[i].getMes() + " " + facturas[i].getAnio());
                                            System.out.println("Metodo de pago: " + facturas[i].getPago());
                                            System.out.print("\n");
                                        }
                                    }
                                }
                            } else {
                                System.out.println("Opcion invalida");
                            }
                            break;
                        default:
                            System.out.println("Opcion invalida");
                    }
                    break;

                case 3:
                    System.out.println("\n1. Ingresar por anio");
                    System.out.println("2. Ingresar por mes");
                    System.out.println("3. Ingresar por producto");
                    System.out.print("Ingrese su opcion: ");
                    int opc3 = sc.nextInt();
                    switch (opc3) {
                        /* Imprimir los ingresos por anio por mes y por producto */
                        case 1:
                            System.out.print("Ingrese el anio: ");
                            int anio3 = sc.nextInt();
                            System.out.print("\n");
                            /* Ver todos los montos hechos en un anio sumarlos y mostrarlos en pantalla */
                            double suma = 0;
                            for (int i = 0; i < facturas.length; i++) {
                                if (facturas[i] != null) {
                                    if (facturas[i].getAnio() == anio3) {
                                        suma = suma + facturas[i].getMontoTotal();
                                    }
                                }
                            }
                            System.out.println("Los ingresos del anio " + anio3 + " son: " + suma);
                            break;
                        case 2:
                            System.out.print("Ingrese el mes: ");
                            String mes3 = sc.next().toLowerCase();
                            System.out.print("\n");
                            /* Ver todos los montos hechos en un mes sumarlos y mostrarlos en pantalla */
                            double totalMes = 0;
                            for (int i = 0; i < facturas.length; i++) {
                                if (facturas[i] != null) {
                                    if (facturas[i].getMes().equals(mes3)) {
                                        totalMes += facturas[i].getMontoTotal();
                                    }
                                }
                            }
                            System.out.println("Los ingresos totales del mes " + mes3 + " son: " + totalMes);
                            break;
                        case 3:
                            System.out.println("1. Tenis");
                            System.out.println("2. Playera");
                            System.out.println("3. Pans");
                            System.out.println("4. Pantaloneta");
                            System.out.println("5. Gorra");
                            System.out.print("Ingrese el numero del producto: ");
                            int productoIngreso = sc.nextInt();
                            System.out.print("\n");
                            if (productoIngreso == 1) {
                                int totalTenis = 0;
                                int aux = 0;
                                for (int i = 0; i < facturas.length; i++) {
                                    if (facturas[i] != null) {

                                        aux += facturas[i].getMontoTotal();

                                    }
                                }
                                totalTenis = aux * producto.getCantidad() / 100;
                                System.out.println("Los ingresos por tenis son: " + totalTenis);
                            }
                            else if (productoIngreso == 2) {
                                int totalPlayera = 0;
                                int aux = 0;
                                for (int i = 0; i < facturas.length; i++) {
                                    if (facturas[i] != null) {

                                        aux += facturas[i].getMontoTotal();

                                    }
                                }
                                totalPlayera = aux * producto.getCantidad() / 70;
                                System.out.println("Los ingresos por playera son: " + totalPlayera);
                            }
                            else if (productoIngreso == 3) {
                                int totalPans = 0;
                                int aux = 0;
                                for (int i = 0; i < facturas.length; i++) {
                                    if (facturas[i] != null) {

                                        aux += facturas[i].getMontoTotal();

                                    }
                                }
                                totalPans = aux * producto.getCantidad() / 80;
                                System.out.println("Los ingresos por pans son: " + totalPans);
                            }
                            else if (productoIngreso == 4) {
                                int totalPantaloneta = 0;
                                int aux = 0;
                                for (int i = 0; i < facturas.length; i++) {
                                    if (facturas[i] != null) {

                                        aux += facturas[i].getMontoTotal();

                                    }
                                }
                                totalPantaloneta = aux * producto.getCantidad() / 50;
                                System.out.println("Los ingresos por pantaloneta son: " + totalPantaloneta);
                            }
                            else if (productoIngreso == 5) {
                                int totalGorra = 0;
                                int aux = 0;
                                for (int i = 0; i < facturas.length; i++) {
                                    if (facturas[i] != null) {

                                        aux += facturas[i].getMontoTotal();

                                    }
                                }
                                totalGorra = aux * producto.getCantidad() / 65;
                                System.out.println("Los ingresos por gorra son: " + totalGorra);
                            }
                            else{
                                System.out.println("Opcion invalida");
                            }
                            break;
                        default:
                            System.out.println("Opcion invalida");
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 4);
    }

    public static int crearFact() {
        int[] numeros = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int resultfact = 0;
        /* Elegir 4 numeros del 0 al 9 y retornarlos en resultfact */
        for (int i = 0; i < 4; i++) {
            int random = (int) (Math.random() * 10);
            resultfact = resultfact * 10 + numeros[random];
        }
        return resultfact;
    }

}

package com.mycompany.sistemarestaruante;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Restaruante {

    public static ArrayList<Plato> ListPlato = new ArrayList<Plato>();
    public static ArrayList<Venta> Listventa = new ArrayList<Venta>();
    public static ArrayList<Cliente> Listcliente = new ArrayList<Cliente>();
    public static int PrecioDeCompra, CostoDelPlato, cantidadVendida, Preciopagado;
    public static String descripcion, tipoDeAlmuerozo, NumeroDeDocumento;
    public static Scanner leer = new Scanner(System.in);
    public static int op = 0;
    public static String nombrePlato, TipoDeDocumento, fecha;
    public static int PrecioDeVenta;
    public static String NombreCompleto, NombreDeEmpresa, tipoDeDocumento;
    public static boolean menu = true;

    public static void main(String[] args) {
        menu();
       
        
    }

    public ArrayList getPlato() {
        return ListPlato;
    }

    public void setPlato(ArrayList plato) {
        this.ListPlato = plato;
    }

    public ArrayList getVenta() {
        return Listventa;
    }

    public void setVenta(ArrayList venta) {
        this.Listventa = venta;
    }

    public ArrayList getCliente() {
        return Listcliente;
    }

    public void setCliente(ArrayList cliente) {
        this.Listcliente = cliente;
    }

    public static void menu() {

        do {

            System.out.println("Escoge una de las opciones \n"
                    + "1: registrar plato\n"
                    + "2: registrar una venta\n"
                    + "3: registrar cliente\n"
                    + "4: generar reporte\n "
                    + "5: Salir del sistema"
            );

            op = leer.nextInt();
            switch (op) {

                case 1: {
                    System.out.println("Ingrese un nombre del plato");
                    nombrePlato = leer.next();
                    System.out.println("Ingrese el costo del plato");
                    CostoDelPlato = leer.nextInt();
                    System.out.println("Ingrese el precio de venta?");
                    PrecioDeVenta = leer.nextInt();
                    System.out.println("Ingrese el tipo");
                    tipoDeAlmuerozo = leer.next();
                    System.out.println("Ingrese una dscripcion breve");
                    descripcion = leer.next();
                    ListPlato.add(new Plato(nombrePlato, CostoDelPlato, PrecioDeVenta, tipoDeAlmuerozo, descripcion));
                    break;
                }
                case 2: {
                    System.out.println("Ingrese el nombre del plato");
                    nombrePlato = leer.next();
                    System.out.println("Ingrese la cantidad vendida");
                    cantidadVendida = leer.nextInt();
                    System.out.println("Ingrese el precio pagado");
                    Preciopagado = leer.nextInt();
                    System.out.println("Ingrese el numero de documeto");
                    NumeroDeDocumento = leer.next();
                    System.out.println("Ingrese el tipo de documento");
                    TipoDeDocumento = leer.next();
                    System.out.println("Ingrese la fecha de hoy");
                    fecha = leer.next();
                    // venta.add(new Venta());
                    Listventa.add(new Venta(nombrePlato, cantidadVendida, Preciopagado, NumeroDeDocumento, TipoDeDocumento, fecha));
                    break;
                }
                case 3: {
                    System.out.println("Ingrese el numero de documento");
                    NumeroDeDocumento = leer.next();
                    System.out.println("Ingrese el tipo de documento");
                    TipoDeDocumento = leer.next();
                    System.out.println("Ingrese el nombre completo");
                    NombreCompleto = leer.next();
                    System.out.println("Ingrese el nombre de la empresa");
                    NombreDeEmpresa = leer.next();
                    //cliente.add(new Cliente());
                    Listcliente.add(new Cliente(NumeroDeDocumento, TipoDeDocumento, NombreCompleto, NombreDeEmpresa));

                    break;
                }
                case 4: {
                    Reporte();

                    break;
                }
                case 5: {
                    menu = false;
                    break;
                }
                default: {
                    System.out.println("Tiene que se una de las 4 opciones");
                    break;
                }
            }
        } while (menu == true);
    }

    public static void Reporte() {
        int resultado = 0;
        for (Plato elemento : ListPlato) {
            System.out.println("El nombre del plato es: " + elemento.getNombreDelPlato()
                    + "\nEl precio de venta es: " + elemento.getPrecioDeVenta()
                    + "El tipo es: " + elemento.getTipo());
        }

        for (Cliente EleCliente : Listcliente) {

            System.out.println("EL nombre completo : " + EleCliente.getNombreCompleto());
        }
        for (Venta ElemVenta : Listventa) {
            resultado += ElemVenta.getPrecioPagado();

        }
        System.out.println("El suma de ventas totales es: " + resultado);
    }

}

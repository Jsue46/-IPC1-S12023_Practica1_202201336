
package com.mycompany.super_25;

import java.util.Scanner;
class Factura {
    private Producto[] productosVendidos = new Producto[20];
    private int cantidadProductosVendidos = 0;
    private double total = 0.0;
 
    public void agregarProducto(Producto producto) {
        productosVendidos[cantidadProductosVendidos++] = producto;
        total += producto.getPrecio();
    }
 
    public double getTotal() {
        return total;
    }
}
class Producto {
    private String nombre;
    private double precio;
 
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public double getPrecio() {
        return precio;
    }
}

public class Super_25 {

    public static void main(String[] args) {
       int opcion;
       Scanner sc = new Scanner(System.in);
       Scanner scan = new Scanner(System.in);
       String  us = "cajero_202201336";
       String  pass ="ipc1_202201336";
       String user;
       String password;
    
        Producto [] listaProductos = new Producto [20];
       
        
               
       System.out.println("ingrese su usuario");
       user = sc.nextLine();
        
        System.out.println("ingrese contraseña");
        password = sc.nextLine();
        
        int intentos = 0;
         if(us.equals(user) && pass.equals(password)){
               System.out.println("Bienvenido");
        }
        while(pass.equals(password)== false){
            System.out.println("Usuario o contraseña incorrectos");
            System.out.println("ingrese su usuario");
       user = sc.nextLine();
        
        System.out.println("ingrese contraseña");
        password = sc.nextLine();
         System.out.println("Bienvenido");
        intentos++;        
        }
        
        do {
            System.out.println("====Menú====");
            System.out.println("1.Agregar nuevos productos ");
            System.out.println("2.Agregar cupones de descuento");
            System.out.println("3.Realizar ventas");
            System.out.println("4.Realizar reporte");
            
            System.out.println("Ingrese un número de opción");
        opcion = scan.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println("Agregar nuevos productos");
                
                    
                if(true){
        while(true) {
        
        System.out.println("Agregar Nuevo producto");
        Scanner product = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del producto");
        String nombre = product.nextLine();
        
        System.out.println("Ingrese el precio del producto");
        double precio = product.nextDouble();
        
        if (precio > 0) {
                    
            Producto objeto = new Producto(nombre, precio);

            for (int i = 0; i < 20; i++) {
                if (listaProductos[i] == null) { 
                    listaProductos[i] = objeto;
                    break;
                } else { 
                    if (listaProductos[i].getNombre().equals(nombre)) {
                        System.out.println("El producto ya existe ingrese otro nombre");
                        break;
                    }
                }
            }
            

            for (int i = 0; i < 20; i++) { 
                if (listaProductos[i] != null) {
                    System.out.println("[" + i + "]" + listaProductos[i].getNombre() + " " + listaProductos[i].getPrecio());
                }
                
            }
           
        }
        
        else {
                System.out.println("El precio ingresado debe ser mayor que 0");
       
        }
        
                System.out.println("Ingrese 0 para salir o cualquier otro número para continuar agregando productos");
                int salir = product.nextInt();
                    if (salir == 0) {
                    break;
                    }
                }
        
                }
                break;
            case 2:
                Scanner scanner = new Scanner(System.in);
                System.out.println("====Agregar cupones de descuento====");
                
                String digitos;
                double numero;
                 do {
                  System.out.print("Ingrese un codigo de 4 dígitos ");
                 digitos = scanner.nextLine();
                if (digitos.length() != 4) {
                  System.out.println("Error: El codigo no tiene 4 dígitos");
                }
                } while (digitos.length() != 4);
                    System.out.println("El codigo tiene 4 dígitos");
                do {
                 System.out.print("Ingrese el porcentaje de descuento entre 0.1 y 1: ");
                 numero = scanner.nextDouble();
                if (numero < 0.1 || numero > 1) {
                      System.out.println("Error: porcentaje inválido");
                     }
                     } while (numero < 0.1 || numero > 1);
                         System.out.println("El número está entre 0.1 y 1");
                break;
            case 3:
                System.out.println("====Realizar ventas====");
               System.out.println("Productos disponibles");
               for (int i = 0; i < 20; i++) { 
                if (listaProductos[i] != null) {
                    System.out.println("[" + i + "]" + listaProductos[i].getNombre() + " " + listaProductos[i].getPrecio());
                }
               }
              
                System.out.println("elegir Prodyctos");
               /* listaProductos[0] = new Producto("Laptop", 1000.0);
                listaProductos[1] = new Producto("Teclado", 20.0);
                listaProductos[2] = new Producto("Mouse", 15.0);
        */
                
                break;
            case 4:
                System.out.println("Realizar reporte");
                break;
            case 5:
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("No existe la opción ingresada.");
                break;
        }
            
            
            
        } while (true);
       
       
        /*private static Producto buscarProductoPorNombre(Producto[] listaProductos, String nombre) {
                for (int i = 0; i < listaProductos.length; i++) {
        if (listaProductos[i].getNombre().equals(nombre)) {
            return listaProductos[i];
                 }
                 }
                return null;
                }
 
                private static void agregarProductoAFactura(Producto[] listaProductos, Factura factura) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese el nombre");*/
       
        
     }
    
}
        
    

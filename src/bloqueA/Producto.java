/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloqueA;

public class Producto {
    public String nombre;
    public int precio;
    public int stock;

    // Constructor vacío
    public Producto() {}

    public Producto(String nombre, int precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrarProducto() {
        System.out.println(nombre + " $" + precio + " Stock: " + stock);
    }

    public void vender(int cantidad) {
        stock -= cantidad;
    }

    public void reabastecer(int cantidad) {
        stock += cantidad;
    }
}

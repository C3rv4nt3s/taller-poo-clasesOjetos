/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloqueA;

public class Vehiculo {

    public String marca;
    public String modelo;
    public int velocidadActual;

    public void mostrarEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad: " + velocidadActual);
    }

    public void acelerar() {
        velocidadActual += 10;
    }

    public void frenar() {
        velocidadActual -= 10;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
    }
}

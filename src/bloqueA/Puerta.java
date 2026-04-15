/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloqueA;

public class Puerta {
    public boolean abierta;

    public void abrir() {
        abierta = true;
    }

    public void cerrar() {
        abierta = false;
    }

    public void mostrarEstado() {
        System.out.println("Abierta: " + abierta);
    }
}

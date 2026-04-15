/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloqueA;

public class Celular {
    public int bateria;
    public boolean prendido;

    public void encender() {
        prendido = true;
    }

    public void apagar() {
        prendido = false;
    }

    public void cargarBateria() {
        bateria = 100;
    }

    public void mostrarEstado() {
        System.out.println("Prendido: " + prendido + " | Batería: " + bateria);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloqueA;

public class Lampara {
    public boolean encendida;

    public void encender() {
        encendida = true;
    }

    public void apagar() {
        encendida = false;
    }

    public void mostrarEstado() {
        System.out.println("Encendida: " + encendida);
    }
}
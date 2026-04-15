/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloqueA;

public class Semaforo {
    public String color;

    public void cambiar() {
        if (color.equals("rojo")) {
            color = "verde";
        } else if (color.equals("verde")) {
            color = "amarillo";
        } else {
            color = "rojo";
        }
    }
}

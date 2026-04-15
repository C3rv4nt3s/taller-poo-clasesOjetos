/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloqueA;

public class Estudiante {
    public String nombre;
    public String codigo;
    public int semestre;

    public Estudiante() {}

    public Estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public Estudiante(String nombre, String codigo, int semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
    }

    public void mostrarInfo() {
        System.out.println(nombre + " - " + codigo + " - " + semestre);
    }

    public void cambiarSemestre(int s) {
        semestre = s;
    }
}

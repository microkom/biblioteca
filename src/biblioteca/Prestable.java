/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 *Para prevenir posibles cambios en el programa se tiene que implementar
una interfaz Prestable con los métodos prestar(), devolver() y prestado. La
clase Libro implementa esta interfaz.
 */
public interface Prestable {
    public void prestar();
    public void devolver();
    public boolean prestado();
    
}

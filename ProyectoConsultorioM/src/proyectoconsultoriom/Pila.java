/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconsultoriom;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author ulacit
 */
public class Pila {
    Stack<Doctor> pila = new Stack<>();

    public Pila() {
    }

    public void insertarDato(Doctor doc) {
        pila.add(doc);
        JOptionPane.showMessageDialog(null, "El elemento: " + doc.getNombre() + " fue agregado");
    }

    public void eliminarUltimo() {
        if (!this.pila.empty()) {
            String msg = "Se elimino: " + this.pila.peek() + "\nLista anterior: " + this.pila + " \n";
            this.pila.pop();
            msg = msg + "Lista actual: " + this.pila;
            JOptionPane.showMessageDialog(null, msg);

        } else {
            JOptionPane.showMessageDialog(null, "Lista vacia");
        }
    }

    public void vaciar() {
        if (!this.pila.empty()) {
            while (!this.pila.empty()) {
                this.pila.pop();
            }
            JOptionPane.showMessageDialog(null, "Se eliminaron todos los elementos");
        } else {
            JOptionPane.showMessageDialog(null, "La pila esta vacia");
        }
    }

    public Doctor loginDoctor(String user, String pass) {
        Stack<Doctor> temp = new Stack<>();
        temp=pila;
        try {
            while(temp!=null){
            Doctor doc=temp.pop();
            if(doc.getUsuario().equals(user) && doc.getPass().equals(pass)){
                return doc;
            }
        }
        } catch (Exception e) 
        {
            return null;
        }
        
        return null;
    }

    public void estado() {
        String msg = "Datos de la pila: " + this.pila + "\nCantidad elementos: " + this.pila.size() + ""
                + "\nPila vacia: " + this.pila.empty();
        JOptionPane.showMessageDialog(null, msg);
    }
    
}

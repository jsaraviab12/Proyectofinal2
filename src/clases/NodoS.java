/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Jesus
 */
public class NodoS {
    public Personas valor;
    private NodoS siguiente;
public NodoS (Personas valor){
    this.valor = valor;
    this.siguiente = null;
}
 public void enlazarSiguiente(NodoS n)
    {
        siguiente = n;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Personas valor) {
        this.valor = valor;
    }

    public NodoS getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoS siguiente) {
        this.siguiente = siguiente;
    }

    public Object valor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}

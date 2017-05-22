/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Jesus
 */
public class NodoD {
   private Object Valor;
   private NodoD siguiente;
   private NodoD anterior;

    public NodoD(Object valor) {
      this.Valor=valor;
      this.siguiente=null;
      this.anterior=null;
    }

    public Object getValor() {
        return Valor;
    }

    public void setValor(Object Valor) {
        this.Valor = Valor;
    }

   
    public NodoD getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoD siguiente) {
        this.siguiente = siguiente;
    }

    public NodoD getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoD anterior) {
        this.anterior = anterior;
    }
      public void enlazarSiguiente(NodoD n) {
        this.siguiente = n;
    }

    public void enlazarAnterior(NodoD n) {
        this.anterior = n;
    }
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import Clases.NodoS;
import Clases.Personas;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Jesus
 */
public class ListaS {
    NodoS cabeza;
    int size;
     
    public boolean estaVacia() {
        if (cabeza == null) {
            return true;
        } else {
            return false;
        }
    }
   public int getSize(){
       return this.size;
   } 
  public void agregarInicio(Personas valor) {
    /*  if (cabeza == null) {
            NodoS nuevo = new NodoS(valor);
            cabeza = nuevo;
        } else {
            NodoS nuevo = new NodoS(valor);
            nuevo.enlazarSiguiente(cabeza);
            cabeza = nuevo;
        }
        size++;
*/          if(!estaVacia()){
            NodoS nuevo=new NodoS(valor);
            nuevo.setSiguiente(cabeza);
            cabeza=nuevo;
            
        }else{
    
}
  }
   public void eliminarInicio (){
       if(!estaVacia()){ 
       cabeza=cabeza.getSiguiente();
   }
   }
   public void agregarFinal(Personas datos){
      if(!estaVacia()){
            NodoS nuevo=new NodoS(datos);
            NodoS aux= cabeza;
            while(aux.getSiguiente()!= null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setSiguiente(null);
        }
      
   }
   public void eliminarFinal (){
        NodoS aux = cabeza;
        while (aux.getSiguiente().getSiguiente() != null) {
            aux = aux.getSiguiente();
        }
        aux.setSiguiente(null);

    }
   public void agregarEntreNodos(Personas datos,int pos){
        if(!estaVacia()){
            NodoS nuevo=new NodoS(datos);
            NodoS aux=cabeza;
            NodoS aux2=aux;
            int pos_recorrido=0;
            if(pos==0){
                agregarInicio(datos);
            }
            if(pos==getSize()){
            agregarFinal(datos);
        }
        if(pos>0 && pos<getSize()){
            while(pos_recorrido != pos ){
                aux2=aux;
                aux=aux.getSiguiente();    
                pos_recorrido++;
            }
           nuevo.setSiguiente(aux);
           aux2.setSiguiente(nuevo);
        }
        }
   }
   public void eliminarEntreNodos(int pos){
        if(!estaVacia()){
            NodoS aux=cabeza;
            NodoS aux2=aux;
            int pos_recorrido=0;
            if(pos==0){
                eliminarInicio();
            }else if(pos==getSize()){
                eliminarFinal();
            }else if(pos>0 && pos<getSize()){
                while(pos_recorrido!=pos){
                    aux2=aux;
                    aux=aux.getSiguiente();
                    pos_recorrido++;
                }
                aux2.setSiguiente(aux.getSiguiente());
            }
        }
    }
   public void mostrar(){
       NodoS aux=cabeza;
       while(aux!=null){
            System.out.println(aux.getValor());
            aux=aux.getSiguiente();
   }
       
   }
   public void eliminarLista(){
         if(!estaVacia()){
         cabeza.setSiguiente(null);
         cabeza=null;
        }
   }
   public String Mostrar(){
        String texto="";
        NodoS aux= cabeza;
        while(aux!=null){
            texto += aux.getValor()+"\n";
            System.out.println(texto+"\n");
            aux=aux.getSiguiente();
        }
        return texto;
   }
   public void pantalla(){
        NodoS aux=cabeza;
        while(aux!=null){
            System.out.println(aux.getValor());
            aux=aux.getSiguiente();
        }
    } 
  public NodoS get(int posicion){
        NodoS aux = cabeza;
        int contador=0;
        while(contador != posicion){
            aux = aux.getSiguiente();
            contador++;
        }
        return aux;
    }
    public int size(){
        NodoS aux=cabeza;
        int cont=0;
        if(!estaVacia()){
            cont++;
            while(aux.getSiguiente()!=null){
                cont++;
                aux=aux.getSiguiente();
        }
        
        
        }
        return cont;
    }
    public void mostrarPerosnas(JTextArea area) {

        NodoS aux = cabeza;
        Personas p;

        while (aux != null) {
            p = (Personas) aux.getValor();
           area.setText(" "+p.getId()+ "" + p.getNombre() + " " + p.getApellido()+ " " + p.getSexo());
            aux = aux.getSiguiente();
        }

    }
        
        
    
}
   


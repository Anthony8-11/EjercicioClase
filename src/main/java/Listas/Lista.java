package Listas;

import java.util.Scanner;

public class Lista {
    //Variable primer nodo
    public Nodo primero;

    public Lista (){
        primero = null;
    }

    //almacenar nombres de personas
//public Lista insertarCabezaLista(String nombre){
//        Nodo nuevo;
//        nuevo = new Nodo(nombre);
//        nuevo.enlace = primero;
//        primero = nuevo;
//        return this;
//    }


    private String leerEntero(){
        System.out.println("Ingrese un valor, -1 para terminar: ");
        //ret
        return (new Scanner(System.in).nextLine());
    }

    public Lista crearLista(){
        String x="";
        primero =null;
        do{
            x = leerEntero();
            if(x!=" "){
                primero = new Nodo(x,primero);
            }
        }while (x!=" ");
        return this;
    }

    public Lista insertarCabezaLista(String entrada){
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;
        return this;
    }

    public void visualizar(){
        Nodo n;
        int k = 0;
        n = primero;
        while(n!=null){
            System.out.println(n.dato + " ");
            n = n.enlace;
            k++;
            //cada 15 elementos hace un salto de linea para imprimir
            System.out.print((k%15!=0 ? " " : "\n"));
        }
    }

}

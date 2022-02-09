/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroprojeto;

import java.util.ArrayList;//chamar o arraylist 


/**
 *
 * @author romei
 */
public class progetoteste2 {
    
       public static void main(String[] args) { 
 
     //esse <String> serve pra dizer que o tipo dessa ArrayList é String
     
ArrayList<String> frutas = new ArrayList<String>(); //cria o ArrayList frutas

frutas.add("Melancia"); //adiciona uma nova fruta ao ArrayList
frutas.add("Melancia");// adiciona a fruta
frutas.add("banana");//adiciona segunda fruta 
frutas.remove(0); //remove a primeira fruta melancia adicionada de acordo com a posição indicada no caso 0


System.out.println(frutas.toString());//mostra a fruta adicionada
System.out.println(frutas.get(1));// recupera o item da posição 1 no caso a banana
System.out.print(frutas.indexOf("banana"));//comando pra indicar a posição do item
 


       }

  }
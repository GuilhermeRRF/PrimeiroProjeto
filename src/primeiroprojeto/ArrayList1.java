/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroprojeto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author romei
 */
public class ArrayList1 {
          public static void main(String[] args) {
        //  Alguns métodos com scanners e lista:

Scanner entrada = new Scanner(System.in);
//Criando lista
ArrayList<String> lista = new ArrayList<>();

String fruta;
//Pegando algo do teclado e guardando na variável fruta
System.out.println("Digite o nome da fruta que voce quer adicionar");
fruta = entrada.nextLine();
//Adicionando o valor da variável fruta na lista
lista.add(fruta);
//Adicionando o que digitaram no teclado diretamente na lista
System.out.println("Digite a segunda fruta");
lista.add(entrada.nextLine());

//Imprimindo a lista na tela
System.out.println(lista);

//Removendo algo que digitaram da lista
System.out.println("Digite a fruta que deseja remover"); 
lista.remove(entrada.nextLine());

System.out.println(lista);
//Você pode fazer um menu com while para ir perguntando só usuário se ele quer adicionar ou remover algo.    b
        
              

    }
}
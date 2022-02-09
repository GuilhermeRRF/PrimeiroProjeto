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
public class projetestecomarraylisty {
      public static void main(String[] args) {
//Na verdade você pode remover o elemento diretamente, sem precisar do índice:

ArrayList<String> frutas = new ArrayList<>();

Scanner entrada = new Scanner (System.in);
//Um detalhe é que se tiver elementos repetidos, vai remover somente o primeiro:

System.out.println("Digite a fruta que deseja adicionar"); 
entrada=frutas.add(e);

frutas.remove("Melancia"); // só remove a primeira Melancia
System.out.println(frutas); // [Abacaxi, Pera, Melancia]
       
        
        }  

  }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroprojeto;

import java.util.Scanner;

/**
 *
 * @author romei
 */
public class Primeiroprojeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int opc;
        int codigo,escolha;//vai denir as ações
        
        String nov_frut;
        int frut_quant,frut_dias;
        
        int maça,laranja,manga,banana,morango;//vai armazenar a qunatidade que cada fruta tem
        int abobora,chuchu,beterraba,batata,cenoura;//vai armazenar a qunatidade que cada legume tem
        int alface,coentro,couve,alho_poro,rucula;//vai armazenar a qunatidade que cada verdura tem
        int acafrao,pimenta_do_reino,sal,bicarbonato_de_sodio,colorau;//vai armazenar a quantidade que cada tempero tem
        int baixo,alto, em_falta;
                       
        Scanner entrada = new Scanner (System.in);
        Scanner sc = new Scanner(System.in);
        
        escolha=0;
        
        
        //declarações das variaveis fruta
        maça=45;
        laranja=30;
        manga=13;
        banana=25;
        morango=8;
        
        //declarações das variaveis Legumes
        abobora=10;
        chuchu=37;
        beterraba=14;
        batata=40;
        cenoura=18;
        
        //declarações das variaveis verdura
        alface=25;
        coentro=15;
        couve=33;
        alho_poro=8;
        rucula=20;
        
        //declarações das variaveis tempero
        acafrao=30;
        pimenta_do_reino=15;
        sal=40;
        bicarbonato_de_sodio=5;
        colorau=19;
        
        
        do{
	        System.out.println("***** Bem vindo *****");    
	        System.out.println("Opçõo 1 - Funcionario");
	        System.out.println("Opçõo 2 - Cliente");
	        System.out.println("Opção 0 - Sair");
        	System.out.println("****************************");    
	        System.out.print("Digite sua Opção: "); 
            opc = entrada.nextInt();
	
	        if ((opc>=1) && (opc<=2)){
	   
	        }
	        else{
	            if(opc==0){
	                System.out.println("Obrigado até a proxima");
	            }
	            else {
	                System.out.println("Opção Invalida Digite 1 ou 2");
	            }
	        }
	
	        if(opc==1){
		        
		        
		        System.out.print("Digite seu codigo de acesso: ");//pede o codigo para confirmar se são um funcionario
                codigo = entrada.nextInt();
        
            if(codigo == 123){//verifica se o codigo de acesso esta correto
              
                    do{
            	        System.out.println("***** Bem vindo *****");    
            	        System.out.println("Opção 1 - Estoque Geral");
            	        System.out.println("Opcão 2 - Estoque Frutas");
            	        System.out.println("Opção 3 - Estoque Legumes");
            	        System.out.println("Opção 4 - Estoque Verduras");
            	        System.out.println("Opção 5 - Estoque Tempero");
            	        System.out.println("Opção 6 - Produtos com o Estoque Baixo");
            	        System.out.println("Opção 0 - Para encerrar o sistema");
                    	System.out.println("****************************");    
            	        System.out.print("Digite sua Opção: "); 
                        opc = entrada.nextInt();
            	
            	        if ((opc>=1) && (opc<=6)){
                            
            	        }
            	        else{
            	            if(opc==0){
            	                System.out.println("Obrigado");
            	            }
            	            else {
            	                System.out.println("Opção Invalida Digite um numero entre 1 a 6");
            	            }
            	        }
            	
            	        if(opc==1){  
            		        System.out.println(" ");
            		        System.out.println("***********************************************************************");
            		        System.out.println("* Temos " +maça+" Maça e elas vão durar 7 dias");
            		        System.out.println("* Temos " +laranja+" Laranja e elas vão durar 60 dias");
            		        System.out.println("* Temos " +manga+" * Mangas e elas vão durar 7 dias");
            		        System.out.println("* Temos " +banana+" * Bananas e elas vão durar 5 dias");
            		        System.out.println("* Temos " +morango+" Morangos e eles vão durar 7 dias");
            		        System.out.println("* Temos " +abobora+" Aboboras e elas vão durar 90 dias");
            		        System.out.println("* Temos " +chuchu+" Chuchus e eles vão durar 30 dias");
            		        System.out.println("* Temos " +beterraba+" Beterrabas e elas vÃ£o durar 14 dias");
            		        System.out.println("* Temos " +batata+" Batata e elas vão durar 60 dias");
            		        System.out.println("* Temos " +cenoura+" Cenouras e elas vão durar 15 dias");
            		        System.out.println("* Temos " +alface+" Alaces e eles vão durar 12 dias");
            		        System.out.println("* Temos " +coentro+" Coentro e elrs vão durar 11 dias");
            		        System.out.println("* Temos " +alho_poro+" Alho-Poró³ e elas vão durar 5 dias");
            		        System.out.println("* Temos " +rucula+" Ruculas e elas vão durar 7 dias");
            		        System.out.println("* Temos " +acafrao+" Alsafrão e eles vão durar --");
            		        System.out.println("* Temos " +pimenta_do_reino+" Pimenta do Reino e elas vÃ£o durar --");
            		        System.out.println("* Temos " +sal+" Sal e vai durar --");
            		        System.out.println("* Temos " +bicarbonato_de_sodio+" Bicarbonato de Sodio e vai durar --");
            		        System.out.println("* Temos " +colorau+" Colorau e vai durar --");
            	                System.out.println("************************************************************************");
            	                System.out.println("  ");
            		       
            	        }
            	
            	        if(opc==2){
            	            
            		        System.out.println(" ");
            		        System.out.println("**********************************************************");
            		        System.out.println("* Temos " +banana+" * Bananas e elas vão durar 5 dias");
            		        System.out.println("* Temos " +laranja+" Laranja e elas vão durar 60 dias");
            		        System.out.println("* Temos " +maça+" Maças e elas vão durar 7 dias");
            		        System.out.println("* Temos " +manga+" * Mangas e elas vão durar 7 dias");
            		        System.out.println("* Temos " +morango+" Morangos e eles vão durar 7 dias");
            		        System.out.println("**********************************************************");
            		        System.out.println("  ");
            		        
            		        System.out.println("Quer adicionar um novo Produtos? Digite 1 caso queira");
            		        escolha = entrada.nextInt();
            		        
            		        if(escolha ==1){
            		              
            		              System.out.println("Digite o nome da fruta que voce vai adicionar:");
            		              nov_frut = sc.nextLine();
            		              System.out.print("Informe a quantidade que vai ter no estoque: ");
            		              frut_quant = entrada.nextInt();
            		              System.out.print("Informe quantos dias a fruta vai durar: ");
            		              frut_dias=entrada.nextInt();
            		              
            		              
            		              System.out.println(" ");
            		              System.out.println("**********************************************************");
                                      System.out.println("* Temos " +frut_quant+" " +nov_frut+ " e eles vão durar " +frut_dias+ " dias");
            		              System.out.println("* Temos " +banana+" * Bananas e elas vão durar 5 dias");
            		              System.out.println("* Temos " +laranja+" Laranja e elas vão durar 60 dias");
            		              System.out.println("* Temos " +maça+" Maças e elas vão durar 7 dias");
            		              System.out.println("* Temos " +manga+" * Mangas e elas vão durar 7 dias");
            		              System.out.println("* Temos " +morango+" Morangos e eles vão durar 7 dias");
            		             
            		              System.out.println("**********************************************************");
            		              System.out.println("  ");
            		                
            		        }
            		            
            		            
            		        
                        }
            
            	        if (opc==3){
            	            
            	                System.out.println(" ");
            		        System.out.println("***************************************************************");
                	        System.out.println("* Temos " +abobora+" Aboboras e elas vão durar 90 dias");
                	        System.out.println("* Temos " +batata+" Batata e elas vão durar 60 dias");
                	        System.out.println("* Temos " +beterraba+" Beterrabas e elas vão durar 14 dias");
                		System.out.println("* Temos " +cenoura+" Cenouras e elas vão durar 15 dias");
            		        System.out.println("* Temos " +chuchu+" Chuchus e eles vão durar 30 dias");
            		        System.out.println("***************************************************************");
            		        System.out.println(" ");
            
            	        }
            	        
            	        if (opc==4){
            	            
            	            System.out.println(" ");
            		        System.out.println("**************************************************************");
                		System.out.println("* Temos " +alface+" Alaces e eles vão durar 12 dias");
                		System.out.println("* Temos " +alho_poro+" Alho-Poró e elas vão durar 5 dias");
            		        System.out.println("* Temos " +coentro+" Coentro e elas vão durar 11 dias");
            		        System.out.println("* Temos " +rucula+" Ruculas e elas vão durar 7 dias");
            		        System.out.println("**************************************************************");
            		        System.out.println(" ");
            
            	        }
            	        
            	        if (opc==5){
            	           
            	            System.out.println(" ");
            		    System.out.println("************************************************************************"); 
            	            System.out.println("* Temos " +acafrao+" Alsafrão e vai durar --");
            	            System.out.println("* Temos " +bicarbonato_de_sodio+" Bicarbonato de Sodio e vai durar --");
            	            System.out.println("* Temos " +colorau+" Colorau e vai durar --");
            		    System.out.println("* Temos " +pimenta_do_reino+" Pimenta do Reino e elas vão durar --");
            		    System.out.println("* Temos " +sal+" Sal e vai durar --");
            	            System.out.println("************************************************************************");
                            System.out.println(" ");
            
            	        }
            	        
            	        if (opc==6){
            	            
            	               System.out.println(" ");
            		       System.out.println("************************************************************************");
            		       System.out.println("* Temos " +abobora+" Aboboras e elas vão durar 90 dias");
            		       System.out.println("* Temos " +alho_poro+" Alho-PorÃ³ e elas vão durar 5 dias");
            		       System.out.println("* Temos " +beterraba+" Beterrabas e elas vão durar 14 dias");
            		       System.out.println("* Temos " +bicarbonato_de_sodio+" Bicarbonato de Sodio e vai durar --");
            		       System.out.println("* Temos " +cenoura+" Cenouras e elas vão durar 15 dias");
            		       System.out.println("* Temos " +coentro+" Coentro e elrs vão durar 11 dias");
            		       System.out.println("* Temos " +colorau+" Colorau e vai durar --");
                	       System.out.println("* Temos " +manga+" * Mangas e elas vão durar 7 dias");
                	       System.out.println("* Temos " +morango+" Morangos e eles vão durar 7 dias");
                	       System.out.println("* Temos " +pimenta_do_reino+" Pimenta do Reino e elas vão durar --");
            	               System.out.println("************************************************************************");
            	               System.out.println("  ");
                               baixo=entrada.nextInt();   
                               
                               
            
            	        }
            
            	    }while (opc!=0);
                    
                    
            }
            
            else{//avisa que o codigo de acesso esta errado
                System.out.println("Codigo de acesso incorreto");
            }
		        
	        }
	
	        if(opc==2){
		        System.out.println("Bem vindo Cliente ");
            }
        }while (opc!=0);
        
        
        
        
        
  
	}
    
  }


        
        
    
    

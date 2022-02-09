/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroprojeto;
/**
 *
 * @author romei
 */     import java.util.Scanner;
        public class projetofinalizado {
      


	public static void main(String[] args) {
        
        int opc,escolha,opc_entrega,codigo,pag;//vai denir as açôes
        int falta;
        double preco,kg,valor,vezes,preco_taxa;//vai armazenar o resultado das operações realizada
            
        String rua,tipo_resid,cidade,nome,data_cartao;//Usuário vai estar digitando as informações pedidas 
        int num_casa,cod_cartao;//Usuário vai estar digitando as informações pedidas 
        long cpf,num_cartao;
        
        String nov_frut,nov_legum,nov_verd,nov_temp;//vai armazenar um novo Produto
        int frut_quant,frut_dias,legum_quant,legum_dias,verd_quant,verd_dias,temp_quant;//vai armazenar a quantidade de um novo Produto
        
        int quant_compra;//vai armazenar a quantidade pedida pelo Usuário do Produto selecionado
        
        int quant_abobora,quant_alho,quant_beterraba,quant_bicarbonato,quant_cenoura,quant_coentro,quant_colorau,quant_manga,quant_morango,quant_pimenta;
        
        int total_abobora,total_alho,total_beterraba,total_bicarbonato,total_cenoura,total_coentro,total_colorau,total_manga,total_morango,total_pimenta;
        
        double total_abobora_Kg,total_beterraba_Kg,total_cenoura_kg,total_manga_kg,total_morango_kg;
        
        int maca,laranja,manga,banana,morango;//vai armazenar a quantidade que cada fruta tem
        int abobora,chuchu,beterraba,batata,cenoura;//vai armazenar a quantidade que cada legume tem
        int alface,coentro,couve,alho_poro,rucula;//vai armazenar a quantidade que cada verdura tem
        int acafrao,pimenta_do_reino,bicarbonato_de_sodio,colorau;//vai armazenar a quantidade que cada tempero tem
        
        double maca_g,laranja_g,manga_g,banana_g,morango_g;//vai armazenar a quantidade em Kg que cada fruta tem
        double abobora_g,chuchu_g,beterraba_g,batata_g,cenoura_g;//vai armazenar a quantidade que cada legume tem
        
        double maca_Kg,laranja_Kg,manga_Kg,banana_Kg,morango_Kg;//vai armazenar a quantidade em Kg que cada fruta tem
        double abobora_Kg,chuchu_Kg,beterraba_Kg,batata_Kg,cenoura_Kg;//vai armazenar a quantidade que cada legume tem
        
        
        Scanner entrada = new Scanner (System.in);
        Scanner sc = new Scanner(System.in);
        
        //declaração  das demais coisas
        opc=0;
        codigo=0;
        escolha=0;
        preco= 0;
        preco_taxa=0;
        
        //declaração das variaveis fruta
        maca=45;
        laranja=30;
        manga=13;
        banana=25;
        morango=8;
        
        //declaração das variaveis Legumes
        abobora=10;
        chuchu=37;
        beterraba=14;
        batata=40;
        cenoura=18;
        
        //declaração das variaveis verdura
        alface=25;
        coentro=15;
        couve=33;
        alho_poro=8;
        rucula=20;
        
        //declaração das variaveis tempero
        acafrao=30;
        pimenta_do_reino=15;
        bicarbonato_de_sodio=5;
        colorau=19;
        
        
        //declaração das variaveis frutas em grama
        maca_g=130;
        laranja_g=140;
        manga_g=110;
        banana_g=86;
        morango_g=24;
        
        //declaração das variaveis Legumes em grama
        abobora_g=500;
        chuchu_g=320;
        beterraba_g=140;
        batata_g=180;
        cenoura_g=130;
        
        //calculando quantidade que tem em Kg das frutas
        maca_Kg=(manga_g*maca)/1000;
        laranja_Kg=(laranja_g*laranja)/1000;
        manga_Kg=(manga_g*manga)/1000;
        banana_Kg=(banana_g*banana)/1000;
        morango_Kg=(morango_g*morango)/1000;
        
         //calculando quantidade que tem em Kg dos legumes
         abobora_Kg=(abobora_g*abobora)/1000;
         chuchu_Kg=(chuchu_g*chuchu)/1000;
         beterraba_Kg=(beterraba_g*beterraba)/1000;
         batata_Kg=(batata_g*batata)/1000;
         cenoura_Kg=(chuchu_g*batata)/1000;
         
        do{//lop
	        System.out.println("***** Bem vindo *****");    
	        System.out.println("Opção 1 - Funcionario");
	        System.out.println("Opção 2 - Cliente");
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
	                    System.out.println("Opção Inválida! Digite 1 ou 2");
	            }
	        }
	
	        if(opc==1){
		        
		        
		        System.out.print("Digite seu codigo de acesso: ");//pede o codigo para confirmar se é um funcionario
                codigo = entrada.nextInt();
        
            if(codigo == 123){//verifica se o codigo de acesso esta correto
              
                    do{
            	        System.out.println("***** Bem vindo *****");    
            	        System.out.println("Opção 1 - Estoque Geral");
            	        System.out.println("Opção 2 - Estoque Frutas");
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
            	                    System.out.println("Opção Inválida! Digite um número entre 1 a 6");
            	            }
            	        }
            	
            	        if(opc==1){  
            		        System.out.println(" ");
            		        System.out.println("***********************************************************************");
            		        System.out.println("* Temos " +maca+" Maças total em Kg " +maca_Kg+ " ,e elas vão durar 7 dias");
            		        System.out.println("* Temos " +laranja+" Laranja total em Kg " +laranja_Kg+ " ,e elas vão durar 60 dias");
            		        System.out.println("* Temos " +manga+" * Mangas total em Kg " +manga_Kg+ " ,e elas vão durar 7 dias");
            		        System.out.println("* Temos " +banana+" * Bananas total em Kg "+banana_Kg+ " ,e elas vão durar 5 dias");
            		        System.out.println("* Temos " +morango+" Morangos total em Kg "+morango_Kg+ " ,e eles vão durar 7 dias");
            		        System.out.println("* Temos " +abobora+" Aboboras total em Kg "+abobora_Kg+ " ,e elas vão durar 90 dias");
            		        System.out.println("* Temos " +chuchu+" Chuchus total em Kg "+chuchu_Kg+ " ,e eles vão durar 30 dias");
            		        System.out.println("* Temos " +beterraba+" Beterrabas total em Kg "+beterraba_Kg+ " ,e elas vão durar 14 dias");
            		        System.out.println("* Temos " +batata+" Batata total em Kg "+batata_Kg+ " ,e elas vão durar 60 dias");
            		        System.out.println("* Temos " +cenoura+" Cenouras total em Kg "+cenoura_Kg+ " ,e elas vão durar 15 dias");
            		        System.out.println("* Temos " +alface+" Alaces e eles vão durar 12 dias");
            		        System.out.println("* Temos " +coentro+" Coentro e elrs vão durar 11 dias");
            		        System.out.println("* Temos " +alho_poro+" Alho-Poró e elas vão durar 5 dias");
            		        System.out.println("* Temos " +rucula+" Ruculas e elas vão durar 7 dias");
            		        System.out.println("* Temos " +acafrao+" Açafrão e eles vão durar --");
            		        System.out.println("* Temos " +pimenta_do_reino+" Pimenta do Reino e elas vão durar --");
            		        System.out.println("* Temos " +bicarbonato_de_sodio+" Bicarbonato de Sodio e vai durar --");
            		        System.out.println("* Temos " +colorau+" Colorau e vai durar --");
            	            System.out.println("************************************************************************");
            	            System.out.println("  ");
            		       
            	        }
            	
            	        if(opc==2){
            	            
            	            System.out.println("  ");
            		        System.out.println(" Setor de Frutas ");
            		        System.out.println("**********************************************************");
            		        System.out.println("* Temos " +maca+" Maças total em Kg " +maca_Kg+ " ,e elas vão durar 7 dias");
            		        System.out.println("* Temos " +laranja+" Laranja total em Kg " +laranja_Kg+ " ,e elas vão durar 60 dias");
            		        System.out.println("* Temos " +manga+" * Mangas total em Kg " +manga_Kg+ " ,e elas vão durar 7 dias");
            		        System.out.println("* Temos " +banana+" * Bananas total em Kg "+banana_Kg+ " ,e elas vão durar 5 dias");
            		        System.out.println("* Temos " +morango+" Morangos total em Kg "+morango_Kg+ " ,e eles vão durar 7 dias");
            		        System.out.println("**********************************************************");
            		        System.out.println("  ");
            		        
            		        System.out.println("Quer adicionar um novo Produtos ou pe?Digite 1 caso queira:");
            		        escolha = entrada.nextInt();
            		        
            		        if(escolha ==1){
            		              
            		              System.out.print("Digite o nome da fruta que você vai adicionar:");
            		              nov_frut= entrada.next();
            		              System.out.print("Informe a quantidade que vai ter no estoque: ");
            		              frut_quant = entrada.nextInt();
            		              System.out.print("Informe quantos dias a fruta vai durar: ");
            		              frut_dias=entrada.nextInt();
            		              
            		              
            		              System.out.println(" ");
            		              System.out.println(" Setor de Frutas ");
            		              System.out.println("**********************************************************");
            		              System.out.println("* Temos " +maca+" Maças total em Kg " +maca_Kg+ " ,e elas vão durar 7 dias");
            		              System.out.println("* Temos " +laranja+" Laranja total em Kg " +laranja_Kg+ " ,e elas vão durar 60 dias");
            		              System.out.println("* Temos " +manga+" * Mangas total em Kg " +manga_Kg+ " ,e elas vão durar 7 dias");
            		              System.out.println("* Temos " +banana+" * Bananas total em Kg "+banana_Kg+ " ,e elas vão durar 5 dias");
            		              System.out.println("* Temos " +morango+" Morangos total em Kg "+morango_Kg+ " ,e eles vão durar 7 dias");
            		              System.out.println("* Temos " +frut_quant+" " +nov_frut+ " e eles vão durar " +frut_dias+ " dias");
            		              System.out.println("**********************************************************");
            		              System.out.println("  ");
            		                
            		        }
            		            
            		            
            		        
                        }
            
            	        if (opc==3){
            	            
            	            System.out.println(" ");
            	            System.out.println(" Setor de Legumes ");
            		        System.out.println("***************************************************************");
                		    System.out.println("* Temos " +abobora+" Aboboras total em Kg "+abobora_Kg+ " ,e elas vão durar 90 dias");
            		        System.out.println("* Temos " +chuchu+" Chuchus total em Kg "+chuchu_Kg+ " ,e eles vão durar 30 dias");
            		        System.out.println("* Temos " +beterraba+" Beterrabas total em Kg "+beterraba_Kg+ " ,e elas vão durar 14 dias");
            		        System.out.println("* Temos " +batata+" Batata total em Kg "+batata_Kg+ " ,e elas vão durar 60 dias");
            		        System.out.println("* Temos " +cenoura+" Cenouras total em Kg "+cenoura_Kg+ " ,e elas vão durar 15 dias");
            		        System.out.println("***************************************************************");
            		        System.out.println(" ");
            		        
            		        System.out.println("Quer adicionar um novo Produtos?Digite 1 caso queira:");
            		        escolha = entrada.nextInt();
            		        
            		        if(escolha ==1){
            		              
            		              System.out.print("Digite o nome do legume que você vai adicionar:");
            		              nov_legum= entrada.next();
            		              System.out.print("Informe a quantidade que vai ter no estoque: ");
            		              legum_quant = entrada.nextInt();
            		              System.out.print("Informe quantos dias o legume vai durar: ");
            		              legum_dias=entrada.nextInt();
            		              
            		              
            		              System.out.println(" ");
            		              System.out.println(" Setor de legumes ");
            		              System.out.println("**********************************************************");
            		              System.out.println("* Temos " +abobora+" Aboboras total em Kg "+abobora_Kg+ " ,e elas vão durar 90 dias");
            		              System.out.println("* Temos " +chuchu+" Chuchus total em Kg "+chuchu_Kg+ " ,e eles vão durar 30 dias");
            		              System.out.println("* Temos " +beterraba+" Beterrabas total em Kg "+beterraba_Kg+ " ,e elas vão durar 14 dias");
            		              System.out.println("* Temos " +batata+" Batata total em Kg "+batata_Kg+ " ,e elas vão durar 60 dias");
            		              System.out.println("* Temos " +cenoura+" Cenouras total em Kg "+cenoura_Kg+ " ,e elas vão durar 15 dias");
            		              System.out.println("* Temos " +legum_quant+" " +nov_legum+ " e eles vão durar " +legum_dias+ " dias");
            		              System.out.println("**********************************************************");
            		              System.out.println("  ");
            		                
            		        }
            		        
            
            	        }
            	        
            	        if (opc==4){
            	            
            	            System.out.println(" ");
            	            System.out.println(" Setor de Verduras ");
            		        System.out.println("**************************************************************");
                		    System.out.println("* Temos " +alface+" Alaces e eles vão durar 12 dias");
                		    System.out.println("* Temos " +alho_poro+" Alho-Poró e elas vão durar 5 dias");
            		        System.out.println("* Temos " +coentro+" Coentro e elrs vão durar 11 dias");
            		        System.out.println("* Temos " +rucula+" Ruculas e elas vão durar 7 dias");
            		        System.out.println("**************************************************************");
            		        System.out.println(" ");
            		        
            		        System.out.println("Quer adicionar um novo Produtos?Digite 1 caso queira:");
            		        escolha = entrada.nextInt();
            		        
            		        if(escolha ==1){
            		              
            		              System.out.print("Digite o nome da verdura que você vai adicionar:");
            		              nov_verd= entrada.next();
            		              System.out.print("Informe a quantidade que vai ter no estoque: ");
            		              verd_quant = entrada.nextInt();
            		              System.out.print("Informe quantos dias a verdura vai durar: ");
            		              verd_dias=entrada.nextInt();
            		              
            		              
            		              System.out.println(" ");
            		              System.out.println(" Setor de Verduras ");
            		              System.out.println("**********************************************************");
            		              System.out.println("* Temos " +alface+" Alaces e eles vão durar 12 dias");
                		          System.out.println("* Temos " +alho_poro+" Alho-Poró e elas vão durar 5 dias");
            		              System.out.println("* Temos " +coentro+" Coentro e elrs vão durar 11 dias");
            		              System.out.println("* Temos " +rucula+" Ruculas e elas vão durar 7 dias");
            		              System.out.println("* Temos " +verd_quant+" " +nov_verd+ " e eles vão durar " +verd_dias+ " dias");
            		              System.out.println("**********************************************************");
            		              System.out.println("  ");
            		                
            		        }
            
            	        }
            	        
            	        if (opc==5){
            	           
            	            System.out.println(" ");
            	            System.out.println(" Setor de Temperos ");
            		        System.out.println("************************************************************************"); 
            	            System.out.println("* Temos " +acafrao+" Açafrão e vai durar --");
            	            System.out.println("* Temos " +bicarbonato_de_sodio+" Bicarbonato de Sodio e vai durar --");
            	            System.out.println("* Temos " +colorau+" Colorau e vai durar --");
            		        System.out.println("* Temos " +pimenta_do_reino+" Pimenta do Reino e elas vão durar --");
            	            System.out.println("************************************************************************");
                		    System.out.println(" ");
                		    
                		    System.out.println("Quer adicionar um novo Produtos?Digite 1 caso queira:");
            		        escolha = entrada.nextInt();
            		        
            		        if(escolha ==1){
            		              
            		              System.out.print("Digite o nome do tempero que você vai adicionar:");
            		              nov_temp= entrada.next();
            		              System.out.print("Informe a quantidade que vai ter no estoque: ");
            		              temp_quant = entrada.nextInt();
            		              
            		              
            		              
            		              System.out.println(" ");
            		              System.out.println(" Setor de Temperos ");
            		              System.out.println("**********************************************************");
            		              System.out.println("* Temos " +acafrao+" Açafrão e vai durar --");
            	                  System.out.println("* Temos " +bicarbonato_de_sodio+" Bicarbonato de Sodio e vai durar --");
            	                  System.out.println("* Temos " +colorau+" Colorau e vai durar --");
            		              System.out.println("* Temos " +pimenta_do_reino+" Pimenta do Reino e elas vão durar --");
            		              System.out.println("* Temos " +temp_quant+" " +nov_temp+ " e eles vão durar --");
            		              System.out.println("**********************************************************");
            		              System.out.println("  ");
            		                
            		        }
            
            	        }
            	        
            	        if (opc==6){
            	            
            	           System.out.println(" ");
            		       System.out.println("************************************************************************");
            		       System.out.println("Produtos com o Estoque Baixo ");
            		       System.out.println("* Temos " +abobora+" Abóboras e elas vão durar 90 dias");
            		       System.out.println("* Temos " +alho_poro+" Alho-Poró e elas vão durar 5 dias");
            		       System.out.println("* Temos " +beterraba+" Beterrabas e elas vão durar 14 dias");
            		       System.out.println("* Temos " +bicarbonato_de_sodio+" Bicarbonato de Sódio e vai durar --");
            		       System.out.println("* Temos " +cenoura+" Cenouras e elas vão durar 15 dias");
            		       System.out.println("* Temos " +coentro+" Coentro e elrs vão durar 11 dias");
            		       System.out.println("* Temos " +colorau+" Colorau e vai durar --");
                		   System.out.println("* Temos " +manga+" * Mangas e elas vão durar 7 dias");
                		   System.out.println("* Temos " +morango+" Morangos e eles vão durar 7 dias");
                		   System.out.println("* Temos " +pimenta_do_reino+" Pimenta do Reino e elas vão durar --");
            	           System.out.println("************************************************************************");
            	           System.out.println("  ");
            	           
            	           
            	           //***************************************************************************************
            	           
            	           do{
            	        	   System.out.println("Deseja esta adicionando um novo carregamento?Caso queira seleciona o item:  ");
                	           System.out.println(" ");
                	           System.out.println("Opção 1- Abóbora");
                	           System.out.println("Opção 2- Alho Póro");
                	           System.out.println("Opção 3- Beterraba");
                	           System.out.println("Opção 4- Bicarbonato de Sódio");
                	           System.out.println("Opção 5- Cenoura");
                	           System.out.println("Opção 6- Coentro");
                	           System.out.println("Opção 7- Colorau");
                	           System.out.println("Opção 8- Manga");
                	           System.out.println("Opção 9- Morango");
                	           System.out.println("Opção 10- Pimenta do Reino");
                	           System.out.println("Opção 0 - Para sair"); 
            	   	           System.out.print("Digite sua Opção: "); 
            	               opc = entrada.nextInt();
            	   	
            	   	        if ((opc>=1) && (opc<=10)){
            	   	            
            	   	        }
            	   	        else{
            	   	            if(opc==0){
            	   	                System.out.println("Finalizando o Sistema");
            	   	            }
            	   	            else {
            	   	                    System.out.println("Opção Inválida! Digite um número entre 1 a 10");
            	   	            }
            	   	        }
            	   	
            	   	        if(opc==1){
            	   	        		
            	   	        		System.out.println("Digite a quantidade que vai ser adcionada de abóbora:");
            	   	        		quant_abobora=entrada.nextInt();
            	   	        		total_abobora=abobora+quant_abobora;
            	   	        		total_abobora_Kg=(abobora_g*total_abobora)/1000;
            	   	        		
            	   	        		if(total_abobora>=30){
            	   	        			System.out.println("Foram adcionadas " +quant_abobora +" aboboras e este produto não esta mais com o estoque baixo");
            	   	        			System.out.println("* Temos " +total_abobora+" Aboboras total em Kg "+total_abobora_Kg+ " ,e elas vão durar 90 dias");
            	   	        		}
            	   	        		else {
            	   	        			falta=30-total_abobora;
            	   	        			System.out.println("Foram adcionadas " +quant_abobora +" aboboras porem este produto ainda esta com o estoque baixo, falta " +falta+ " para este protudo ficar com o estoque mínimo");
            	   	        			System.out.println("* Temos " +total_abobora+" Aboboras total em Kg "+total_abobora_Kg+ " ,e elas vão durar 90 dias");
            	   	        		}
            	   		        
            	   	        }
            	   	
            	   	        if(opc==2){
            	   		        		
            	   	        	System.out.println("Digite a quantidade que vai ser adcionada de alho póro:");
        	   	        		quant_alho=entrada.nextInt();
        	   	        		total_alho=abobora+quant_alho;
        	   	        		
        	   	        		
        	   	        		if(total_alho>=30){
        	   	        			System.out.println("Foram adcionadas " +quant_alho +" alho póro este produto não esta mais com o estoque baixo");
        	   	        			System.out.println("* Temos " +total_alho+" Alho Póro, e elas vão durar 90 dias");
        	   	        		}
        	   	        		else {
        	   	        			falta=30-total_alho;
        	   	        			System.out.println("Foram adcionadas " +quant_alho +" alho póro porem este produto ainda esta com o estoque baixo, falta " +falta+ " para este protudo ficar com o estoque mínimo");
        	   	        			System.out.println("* Temos " +total_alho+" Alho Póro, e elas vão durar 90 dias");
        	   	        		}
            	               }

            	   	        if (opc==3){
            	   	        		
            	   	        	System.out.println("Digite a quantidade que vai ser adcionada de beterraba:");
        	   	        		quant_beterraba=entrada.nextInt();
        	   	        		total_beterraba=beterraba+quant_beterraba;
        	   	        		total_beterraba_Kg=(beterraba_g*total_beterraba)/1000;
        	   	        		
        	   	        		if(total_beterraba>=30){
        	   	        			System.out.println("Foram adcionadas " +quant_beterraba +" beterraba e este produto não esta mais com o estoque baixo");
        	   	        			System.out.println("* Temos " +total_beterraba+" Beterrabas total em Kg "+total_beterraba_Kg+ " ,e elas vão durar 90 dias");
        	   	        		}
        	   	        		else {
        	   	        			falta=30-total_beterraba;
        	   	        			System.out.println("Foram adcionadas " +quant_beterraba +" aboboras porem este produto ainda esta com o estoque baixo, falta " +falta+ " para este protudo ficar com o estoque mínimo");
        	   	        			System.out.println("* Temos " +total_beterraba+" beterraba total em Kg "+total_beterraba_Kg+ " ,e elas vão durar 90 dias");
        	   	        		}
            	   	        	            	   
            	   	        }
            	   	        
		            	   	     if(opc==4){
		 	   		        		
		         	   	        	System.out.println("Digite a quantidade que vai ser adcionada de bicarbonato de sódio:");
		     	   	        		quant_bicarbonato=entrada.nextInt();
		     	   	        		total_bicarbonato=bicarbonato_de_sodio+quant_bicarbonato;
		     	   	        		
		     	   	        		
		     	   	        		if(total_bicarbonato>=30){
		     	   	        			System.out.println("Foram adcionadas " +quant_bicarbonato +" bicarbonato de sódio este produto não esta mais com o estoque baixo");
		     	   	        			System.out.println("* Temos " +total_bicarbonato+" bicarbonato de sódio, e elas vão durar 90 dias");
		     	   	        		}
		     	   	        		else {
		     	   	        			falta=30-total_bicarbonato;
		     	   	        			System.out.println("Foram adcionadas " +quant_bicarbonato +" bicarbonato de sódio porem este produto ainda esta com o estoque baixo, falta " +falta+ " para este protudo ficar com o estoque mínimo");
		     	   	        			System.out.println("* Temos " +total_bicarbonato+" bicarbonato de sódio, e elas vão durar 90 dias");
		     	   	        		}
		         	               }
		            	   	     
		            	   	  if (opc==5){
          	   	        		
	            	   	        	System.out.println("Digite a quantidade que vai ser adcionada de cenouras:");
	        	   	        		quant_cenoura=entrada.nextInt();
	        	   	        		total_cenoura=cenoura+quant_cenoura;
	        	   	        		total_cenoura_kg=(beterraba_g*total_cenoura)/1000;
	        	   	        		
	        	   	        		if(total_cenoura>=30){
	        	   	        			System.out.println("Foram adcionadas " +quant_cenoura +" cenouras e este produto não esta mais com o estoque baixo");
	        	   	        			System.out.println("* Temos " +total_cenoura+" cenouras total em Kg "+total_cenoura_kg+ " ,e elas vão durar 90 dias");
	        	   	        		}
	        	   	        		else {
	        	   	        			falta=30-total_cenoura;
	        	   	        			System.out.println("Foram adcionadas " +quant_cenoura +" cenouras porem este produto ainda esta com o estoque baixo, falta " +falta+ " para este protudo ficar com o estoque mínimo");
	        	   	        			System.out.println("* Temos " +total_cenoura+" cenouras total em Kg "+total_cenoura_kg+ " ,e elas vão durar 90 dias");
	        	   	        		}
	            	   	        	            	   
	            	   	        }
		            	   	  
		            	   	if(opc==6){
	 	   		        		
	         	   	        	System.out.println("Digite a quantidade que vai ser adcionada de coentro:");
	     	   	        		quant_coentro=entrada.nextInt();
	     	   	        		total_coentro=coentro+quant_coentro;
	     	   	        		
	     	   	        		
	     	   	        		if(total_coentro>=30){
	     	   	        			System.out.println("Foram adcionadas " +quant_coentro +" coentro este produto não esta mais com o estoque baixo");
	     	   	        			System.out.println("* Temos " +total_coentro+" coentro, e elas vão durar 90 dias");
	     	   	        		}
	     	   	        		else {
	     	   	        			falta=30-total_coentro;
	     	   	        			System.out.println("Foram adcionadas " +quant_coentro +" coentro porem este produto ainda esta com o estoque baixo, falta " +falta+ " para este protudo ficar com o estoque mínimo");
	     	   	        			System.out.println("* Temos " +total_coentro+" coentro, e elas vão durar 90 dias");
	     	   	        		}
	         	               }
		            	   	
		            	   	if(opc==7){
	 	   		        		
	         	   	        	System.out.println("Digite a quantidade que vai ser adcionada de colorau:");
	     	   	        		quant_colorau=entrada.nextInt();
	     	   	        		total_colorau=colorau+quant_colorau;
	     	   	        		
	     	   	        		
	     	   	        		if(total_colorau>=30){
	     	   	        			System.out.println("Foram adcionadas " +quant_colorau +" colorau este produto não esta mais com o estoque baixo");
	     	   	        			System.out.println("* Temos " +total_colorau+" colorau, e elas vão durar 90 dias");
	     	   	        		}
	     	   	        		else {
	     	   	        			falta=30-total_colorau;
	     	   	        			System.out.println("Foram adcionadas " +quant_colorau +" colorau porem este produto ainda esta com o estoque baixo, falta " +falta+ " para este protudo ficar com o estoque mínimo");
	     	   	        			System.out.println("* Temos " +total_colorau+" colorau, e elas vão durar 90 dias");
	     	   	        		}
	         	               }
		            	   	
		            	   	if (opc==8){
          	   	        		
            	   	        	System.out.println("Digite a quantidade que vai ser adcionada de mangas:");
        	   	        		quant_manga=entrada.nextInt();
        	   	        		total_manga=manga+quant_manga;
        	   	        		total_manga_kg=(manga_g*total_manga)/1000;
        	   	        		
        	   	        		if(total_manga>=30){
        	   	        			System.out.println("Foram adcionadas " +quant_manga +" mangas e este produto não esta mais com o estoque baixo");
        	   	        			System.out.println("* Temos " +total_manga+" mangas total em Kg "+total_manga_kg+ " ,e elas vão durar 90 dias");
        	   	        		}
        	   	        		else {
        	   	        			falta=30-total_manga;
        	   	        			System.out.println("Foram adcionadas " +quant_manga +" mangas porem este produto ainda esta com o estoque baixo, falta " +falta+ " para este protudo ficar com o estoque mínimo");
        	   	        			System.out.println("* Temos " +total_manga+" mangas total em Kg "+total_manga_kg+ " ,e elas vão durar 90 dias");
        	   	        		}
            	   	        	            	   
            	   	        }
		            	   	
		            	   	if (opc==9){
          	   	        		
            	   	        	System.out.println("Digite a quantidade que vai ser adcionada de morangos:");
        	   	        		quant_morango=entrada.nextInt();
        	   	        		total_morango=morango+quant_morango;
        	   	        		total_morango_kg=(morango_g*total_morango)/1000;
        	   	        		
        	   	        		if(total_morango>=50){
        	   	        			System.out.println("Foram adcionadas " +quant_morango +" morangos e este produto não esta mais com o estoque baixo");
        	   	        			System.out.println("* Temos " +total_morango+" morango total em Kg "+total_morango_kg+ " ,e elas vão durar 90 dias");
        	   	        		}
        	   	        		else {
        	   	        			falta=50-total_morango;
        	   	        			System.out.println("Foram adcionadas " +quant_morango +" morangos porem este produto ainda esta com o estoque baixo, falta " +falta+ " para este protudo ficar com o estoque mínimo");
        	   	        			System.out.println("* Temos " +total_morango+" morangos total em Kg "+total_morango_kg+ " ,e elas vão durar 90 dias");
        	   	        		}
            	   	        	            	   
            	   	        }
		            	   	
		            	   	if(opc==6){
	 	   		        		
	         	   	        	System.out.println("Digite a quantidade que vai ser adcionada de pimenta do reino:");
	     	   	        		quant_pimenta=entrada.nextInt();
	     	   	        		total_pimenta=pimenta_do_reino+quant_pimenta;
	     	   	        		
	     	   	        		
	     	   	        		if(total_pimenta>=30){
	     	   	        			System.out.println("Foram adcionadas " +quant_pimenta +" pimenta do reino este produto não esta mais com o estoque baixo");
	     	   	        			System.out.println("* Temos " +total_pimenta+" pimenta do reino, e elas vão durar 90 dias");
	     	   	        		}
	     	   	        		else {
	     	   	        			falta=30-total_pimenta;
	     	   	        			System.out.println("Foram adcionadas " +quant_pimenta +" pimenta do reino porem este produto ainda esta com o estoque baixo, falta " +falta+ " para este protudo ficar com o estoque mínimo");
	     	   	        			System.out.println("* Temos " +total_pimenta+" pimenta do reino, e elas vão durar 90 dias");
	     	   	        		}
	         	               }
		            	   
            	   	}while (opc!=0);

            	           //*******************************************************************************             
            	        }
            
            	    }while (opc!=0);
                    
                    
            }
            
            else{//avisa que o codigo de acesso esta errado
                System.out.println("Codigo de acesso incorreto");
            }
		        
	        }
	
	        if(opc==2){
	            System.out.println("");
		        System.out.println("Bem vindo Cliente ");
		        System.out.println("");
		        
		        do{
	        System.out.println("***** Escolha Qual Produto Deseja Comprar *****");   
	        System.out.println("Tabela dos Preços");
	        System.out.println("");
	        System.out.println("Frutas Kg");
	        System.out.println("Opção 1 -Maça R$3,50");
	        System.out.println("Opção 2 -Laranja R$2,30 ");
	        System.out.println("Opção 3 -Manga R$3,20 ");
	        System.out.println("Opção 4 -Banana R$3,80 ");
	        System.out.println("Opção 5 -Morangos R$19,00 ");
	        System.out.println("");
	        System.out.println("Legumes kg");
	        System.out.println("Opção 6 -Abobora R$2,50 ");
	        System.out.println("Opção 7 -Chuchu R$1,30 ");
	        System.out.println("Opção 8 -Beterraba R$3,70 ");
	        System.out.println("Opção 9 -Batata R$6.50 ");
	        System.out.println("Opção 10 -Cenoura R$6,00 ");
	        System.out.println("");
	        System.out.println("Verduras Unidade");
	        System.out.println("Opção 11 -Alface  R$2,50");
	        System.out.println("Opção 12 -Rucula R$4,00 ");
	        System.out.println("Opção 13 -Coentro R$2,50 ");
	        System.out.println("Opção 14 -Alho-Poró R$4,30");
	        System.out.println("");
	        System.out.println("Temperos Unidade (Pacotes com 20g)");
	        System.out.println("Opção 15 - Açafrão R$1,45");
	        System.out.println("Opção 16 - Bicarbonato de Sodio R$2,00");
	        System.out.println("Opção 17 - Colorau R$1,75");
	        System.out.println("Opção 18 - Pimenta do Reino R$2,50");

	        System.out.println("Opção 0 - Para encerrar o sistema");
        	System.out.println("****************************");    
	        System.out.print("Digite sua Opção: "); 
            opc = entrada.nextInt();
	
	        if ((opc>=1) && (opc<=18)){
	            
	        }
	        else{
	            if(opc==0){
	                System.out.println("Obrigado,volte sempre!");
	            }
	            else {
	                    System.out.println("Opção Inválida! Digite um número entre 1 a 18");
	            }
	        }
	
	        if(opc==1){//Início- produto Maça
		            
		            System.out.println("Informe a quantidade de Maças que você vai Comprar:");
		            quant_compra = entrada.nextInt();
		            
		            kg=(maca_g*quant_compra)/1000;//calcula quanto deu em Km /Maça
		            
		            if(kg<=maca_Kg){//Início- processo de calculo do valor do produto e retirada ou entrega do produto /Maça
		                
		                System.out.println("");
		                preco=kg*3.50;
		                
		                System.out.println("Deu "+kg+ " Kg, valor a ser pago sera:" +preco);
		                
		                System.out.println("Deseja retirar no Hortifruti ou que seja entregue em sua residência(caso escolha que entrega será combrado uma taxa de R$3,00)? \n (1-para retirar)(2-entregar)");
		                opc_entrega=entrada.nextInt();
		                
		                if(opc_entrega==1){//Início- informa que o produto vai ser retirado  /Maça
		                    
		                        System.out.println("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.println("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//*Início- opção de pagamento 1   /Maça
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+(preco-valor));
                        		    System.out.println("");
                        		  
                        		}//Fim- opção de pagamento 1  /Maça
                        		
                        		if (pag == 2){//Início- opção de pagamento 2  /Maça
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    
                        		    valor=preco/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		   
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		   
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+preco);
                        		    
                        		}//Fim- opção de pagamento 2  /Maça
                        		
                        		if (pag == 3){//Início- opção de pagamento 3   /Maça
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+(preco+valor));
                        		    
                        		    vezes=(preco+valor)/4;
                        		    
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3 /Maça
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe /Maça
                        		     System.out.println("Código inválido");
                		        }
		                    
		                }//Fim- informa que o produto vai ser retirado /Maça
		                
		                if(opc_entrega==2){//Início- define que o produto deve ser entregue /Maça
		                        System.out.println("Informe o endereço para ser realizada a entrega!(Será cobrado uma taxa de R$3,00)");
        		                
        		                System.out.println("Digite o nome da rua:");
        		                rua=entrada.next();
        		                
        		                System.out.println("Informe o tipo de residência:");
        		                tipo_resid=entrada.next();
        		                
        		                System.out.println("Digite o número da sua residência:");
        		                num_casa=entrada.nextInt();
        		                
        		                System.out.println("Digite o nome da sua cidade:");
        		                cidade=entrada.next();
        		                
        		                preco_taxa=preco + 3;
        		                
        		                System.out.println("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1 /MAÇA
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa-valor));
                        		    System.out.println("");
                        		    
                        		} //Fim- opção de pagamento 1 /MAÇÃ
                        		
                        		if (pag == 2){//Início- opção de pagamento 2 /MAÇÃ
                        		
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    
                        		    valor=preco_taxa/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		   
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+preco_taxa);
                        		    
                        		    
                        		    
                        		} //Fim- opção de pagamento 2  /MAÇÃ
                        		
                        		if (pag == 3){//Início- opção de pagamento 3 /MAÇÃ
                        		
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		   
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		   
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa+valor));
                        		    
                        		    vezes=(preco_taxa+valor)/4;
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim opção de pagamento 3 /MAÇÃ
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe /MAÇÃ
                        		     System.out.println("Código inválido");
                		}
		                }//Início define que o produto deve ser entregue /MAÇÃ
		                
		                
		            }//Início processo de calculo do valor do produto e retirada ou entrega do produto /MAÇÃ
		            
		            else{//Início avisa que não tem toda essa quantidade  /MAÇÃ
		             
		                System.out.println("Desculpa mas não temos toda essa quantidade,volta outra hora");
		                
		            }//Fim avisa que não tem toda essa quantidade /MAÇÃ
		            
	        }//Fim produto Maçã 
	
	        if(opc==2){//Início produto Laranja
	            
	                System.out.println("Informe a quantidade de Laranjas que você vai Comprar:");
		            quant_compra = entrada.nextInt();
		            kg=(laranja_g*quant_compra)/1000;
		            
		            if(kg<=laranja_Kg){//Início- processo de calculo do valor do produto e retirada ou entrega do produto /Laranja
		                
		                System.out.println("");
		                preco=kg*2.30;
		                System.out.println("Deu "+kg+ " Kg, valor a ser pago sera:" +preco);
		                System.out.println("Deseja retirar no Hortifruti ou que seja entregue em sua residência? (1-para retirar)(2-entregar");
		                opc_entrega=entrada.nextInt();
		                
		                if(opc_entrega==1){//Início- define que o produto vai ser retirado
		                    
		                    System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		   
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+(preco-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1 
                        		
                        		if(pag == 2){//Início- opção de pagamento 2
                        		    
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    valor=preco/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+preco);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+(preco+valor));
                        		    vezes=(preco+valor)/4;
                        		    
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		}
		                    
		                }//Fim- define que o produto vai ser retirado
		                
		                if(opc_entrega==2){//Início- define que o produto deve ser entregue
		                    
		                        System.out.println("Informe o endereço para ser realizada a entrega!(Será cobrado uma taxa de R$3,00)");
        		                
        		                System.out.println("Digite o nome da rua:");
        		                rua=entrada.next();
        		                
        		                System.out.println("Informe o tipo de residência:");
        		                tipo_resid=entrada.next();
        		                
        		                System.out.println("Digite o número da sua residência:");
        		                num_casa=entrada.nextInt();
        		                
        		                System.out.println("Digite o nome da sua cidade:");
        		                cidade=entrada.next();
        		                
        		                preco_taxa=preco + 3;
        		                
        		                System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1
                        		
                        		if (pag == 2){//Início- opção de pagamento 2
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    
                        		    valor=preco_taxa/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+preco_taxa);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa+valor));
                        		   
                        		    vezes=(preco_taxa+valor)/4;
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		        }
		                }//Fim- define que o produto deve ser entregue
		                
		            }//Fim- processo de calculo do valor do produto e retirada ou entrega do produto
		            
		            else{//Início- avisa que não tem toda essa quantidade
		             
		                System.out.println("Desculpa mas não temos toda essa quantidade,volta outra hora");
		                
		            }//Fim- avisa que não tem toda essa quantidade
		        
            }//Fim- produto Laranja

	        if (opc==3){//Início produto Manga
	            
	                System.out.println("Informe a quantidade de Mangas que você vai Comprar:");
		            quant_compra = entrada.nextInt();
		            
		            kg=(manga_g*quant_compra)/1000;
		            
		            if(kg<=manga_Kg){//Início- processo de calculo do valor do produto e retirada ou entrega do produto
		                
		                System.out.println("");
		                preco=kg*3.20;
		                System.out.println("Deu "+kg+ " Kg, valor a ser pago sera:" +preco);
		                System.out.println("Deseja retirar no Hortifruti ou que seja entregue em sua residência? (1-para retirar)(2-entregar");
		                opc_entrega=entrada.nextInt();
		                
		                if(opc_entrega==1){//Início- define que o produto vai ser retirado
		                    
		                    System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		   
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+(preco-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1 
                        		
                        		if(pag == 2){//Início- opção de pagamento 2
                        		    
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    valor=preco/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+preco);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco+valor));
                        		    vezes=(preco+valor)/4;
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		}
		                    
		                }//Fim- define que o produto vai ser retirado
		                
		                if(opc_entrega==2){//Início- define que o produto deve ser entregue
		                    
		                        System.out.println("Informe o endereço para ser realizada a entrega!(Será cobrado uma taxa de R$3,00)");
        		                
        		                System.out.println("Digite o nome da rua:");
        		                rua=entrada.next();
        		                
        		                System.out.println("Informe o tipo de residência:");
        		                tipo_resid=entrada.next();
        		                
        		                System.out.println("Digite o número da sua residência:");
        		                num_casa=entrada.nextInt();
        		                
        		                System.out.println("Digite o nome da sua cidade:");
        		                cidade=entrada.next();
        		                
        		                preco_taxa=preco + 3;
        		                
        		                System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1
                        		
                        		if (pag == 2){//Início- opção de pagamento 2
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    
                        		    valor=preco_taxa/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+preco_taxa);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa+valor));
                        		   
                        		    vezes=(preco_taxa+valor)/4;
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		        }
		                }//Fim- define que o produto deve ser entregue
		                
		                
		            }//Fim- processo de calculo do valor do produto e retirada ou entrega do produto
		            
		            else{
		             
		                System.out.println("Desculpa mas não temos toda essa quantidade,volta outra hora");
		                
		            }//Fim avisa que não tem toda essa quantidade

	        }//Fim produto Manga
	        
	        if (opc==4){//Início produto Banana
    		  
    		        System.out.println("Informe a quantidade de Bananas que você vai Comprar:");
		            quant_compra = entrada.nextInt();
		            kg=(banana_g*quant_compra)/1000;
		            
		            if(kg<=banana_Kg){//Início- processo de calculo do valor do produto e retirada ou entrega do produto
		                
		                System.out.println("");
		                preco=kg*3.80;
		                System.out.println("Deu "+kg+ " Kg, valor a ser pago sera:" +preco);
		                System.out.println("Deseja retirar no Hortifruti ou que seja entregue em sua residência? (1-para retirar)(2-entregar");
		                opc_entrega=entrada.nextInt();
		                
		                if(opc_entrega==1){//Início- define que o produto vai ser retirado
		                    
		                    System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		   
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+(preco-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1 
                        		
                        		if(pag == 2){//Início- opção de pagamento 2
                        		    
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    valor=preco/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+preco);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco+valor));
                        		    vezes=(preco+valor)/4;
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		}
		                    
		                }//Fim- define que o produto vai ser retirado
		                
		                if(opc_entrega==2){//Início- define que o produto deve ser entregue
		                    
		                        System.out.println("Informe o endereço para ser realizada a entrega!(Será cobrado uma taxa de R$3,00)");
        		                
        		                System.out.println("Digite o nome da rua:");
        		                rua=entrada.next();
        		                
        		                System.out.println("Informe o tipo de residência:");
        		                tipo_resid=entrada.next();
        		                
        		                System.out.println("Digite o número da sua residência:");
        		                num_casa=entrada.nextInt();
        		                
        		                System.out.println("Digite o nome da sua cidade:");
        		                cidade=entrada.next();
        		                
        		                preco_taxa=preco + 3;
        		                
        		                System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1
                        		
                        		if (pag == 2){//Início- opção de pagamento 2
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    
                        		    valor=preco_taxa/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+preco_taxa);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa+valor));
                        		   
                        		    vezes=(preco_taxa+valor)/4;
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		        }
		                }//Fim- define que o produto deve ser entregue
		                
		                
		                
		            }//Fim- processo de calculo do valor do produto e retirada ou entrega do produto
		            
		            else{//Fim- avisa que não tem toda essa quantidade
		             
		                System.out.println("Desculpa mas não temos toda essa quantidade,volta outra hora");
		                
		            }//Fim- avisa que não tem toda essa quantidade

	        }//Fim produto Banana
	        
	        if (opc==5){//Início- produto Morango
	            
	                System.out.println("Informe a quantidade de Morangos que você vai Comprar:");
		            quant_compra = entrada.nextInt();
		            kg=(morango_g*quant_compra)/1000;
		            
		            if(kg<=morango_Kg){//Início- processo de calculo do valor do produto e retirada ou entrega do produto
		                
		                System.out.println("");
		                preco=kg*19;
		                System.out.println("Deu "+kg+ " Kg, valor a ser pago sera:" +preco);
		                System.out.println("Deseja retirar no Hortifruti ou que seja entregue em sua residência? (1-para retirar)(2-entregar");
		                opc_entrega=entrada.nextInt();
		                
		                if(opc_entrega==1){//Início- define que o produto vai ser retirado
		                    
		                    System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		   
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+(preco-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1 
                        		
                        		if(pag == 2){//Início- opção de pagamento 2
                        		    
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    valor=preco/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+preco);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco+valor));
                        		    vezes=(preco+valor)/4;
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		}
		                    
		                }//Fim- define que o produto vai ser retirado
		                
		                if(opc_entrega==2){//Início- define que o produto deve ser entregue
		                    
		                        System.out.println("Informe o endereço para ser realizada a entrega!(Será cobrado uma taxa de R$3,00)");
        		                
        		                System.out.println("Digite o nome da rua:");
        		                rua=entrada.next();
        		                
        		                System.out.println("Informe o tipo de residência:");
        		                tipo_resid=entrada.next();
        		                
        		                System.out.println("Digite o número da sua residência:");
        		                num_casa=entrada.nextInt();
        		                
        		                System.out.println("Digite o nome da sua cidade:");
        		                cidade=entrada.next();
        		                
        		                preco_taxa=preco + 3;
        		                
        		                System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1
                        		
                        		if (pag == 2){//Início- opção de pagamento 2
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    
                        		    valor=preco_taxa/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+preco_taxa);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa+valor));
                        		   
                        		    vezes=(preco_taxa+valor)/4;
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		        }
		                }//Fim- define que o produto deve ser entregue
		                
		            }//Fim- processo de calculo do valor do produto e retirada ou entrega do produto
		            
		            else{//Fim- avisa que não tem toda essa quantidade
		             
		                System.out.println("Desculpa mas não temos toda essa quantidade,volta outra hora");
		                
		            }//Fim- avisa que não tem toda essa quantidade

	        }//Fim produto Morango
	        
	        if (opc==6){//Início produto Abobora
	            
	                System.out.println("Informe a quantidade de Aboboras que você vai Comprar:");
		            quant_compra = entrada.nextInt();
		            kg=(abobora_g*quant_compra)/1000;
		            
		            if(kg<=abobora_Kg){//Início- processo de calculo do valor do produto e retirada ou entrega do produto
		                
		                System.out.println("");
		                preco=kg*2.50;
		                System.out.println("Deu "+kg+ " Kg, valor a ser pago sera:" +preco);
		                System.out.println("Deseja retirar no Hortifruti ou que seja entregue em sua residência? (1-para retirar)(2-entregar");
		                opc_entrega=entrada.nextInt();
		                
		                if(opc_entrega==1){//Início- define que o produto vai ser retirado
		                    
		                    System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		   
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+(preco-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1 
                        		
                        		if(pag == 2){//Início- opção de pagamento 2
                        		    
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    valor=preco/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+preco);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+(preco+valor));
                        		    vezes=(preco+valor)/4;
                        		    
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		}
		                    
		                }//Fim- define que o produto vai ser retirado
		                
		                if(opc_entrega==2){//Início- define que o produto deve ser entregue
		                    
		                        System.out.println("Informe o endereço para ser realizada a entrega!(Será cobrado uma taxa de R$3,00)");
        		                
        		                System.out.println("Digite o nome da rua:");
        		                rua=entrada.next();
        		                
        		                System.out.println("Informe o tipo de residência:");
        		                tipo_resid=entrada.next();
        		                
        		                System.out.println("Digite o número da sua residência:");
        		                num_casa=entrada.nextInt();
        		                
        		                System.out.println("Digite o nome da sua cidade:");
        		                cidade=entrada.next();
        		                
        		                preco_taxa=preco + 3;
        		                
        		                System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1
                        		
                        		if (pag == 2){//Início- opção de pagamento 2
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    
                        		    valor=preco_taxa/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+preco_taxa);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa+valor));
                        		   
                        		    vezes=(preco_taxa+valor)/4;
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		        }
		                }//Fim- define que o produto deve ser entregue
		                
		                
		            }//Fim- processo de calculo do valor do produto e retirada ou entrega do produto
		            
		            else{//Fim- avisa que não tem toda essa quantidade
		             
		                System.out.println("Desculpa mas não temos toda essa quantidade,volta outra hora");
		                
		            }//Fim- avisa que não tem toda essa quantidade

	        }//Fim produto Abobora
	        
	        if (opc==7){//Início produto Chuchu
    		  
    		        System.out.println("Informe a quantidade de Chuchus que você vai Comprar:");
		            quant_compra = entrada.nextInt();
		            kg=(chuchu_g*quant_compra)/1000;
		            
		            if(kg<=chuchu_Kg){//Início- processo de calculo do valor do produto e retirada ou entrega do produto
		                
		                System.out.println("");
		                preco=kg*1.30;
		                System.out.println("Deu "+kg+ " Kg, valor a ser pago sera:" +preco);
		                System.out.println("Deseja retirar no Hortifruti ou que seja entregue em sua residência? (1-para retirar)(2-entregar");
		                opc_entrega=entrada.nextInt();
		                
		                if(opc_entrega==1){//Início- define que o produto vai ser retirado
		                    
		                    System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		   
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+(preco-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1 
                        		
                        		if(pag == 2){//Início- opção de pagamento 2
                        		    
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    valor=preco/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+preco);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+(preco+valor));
                        		    vezes=(preco+valor)/4;
                        		    
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		}
		                    
		                }//Fim- define que o produto vai ser retirado
		                
		                if(opc_entrega==2){//Início- define que o produto deve ser entregue
		                    
		                        System.out.println("Informe o endereço para ser realizada a entrega!(Será cobrado uma taxa de R$3,00)");
        		                
        		                System.out.println("Digite o nome da rua:");
        		                rua=entrada.next();
        		                
        		                System.out.println("Informe o tipo de residência:");
        		                tipo_resid=entrada.next();
        		                
        		                System.out.println("Digite o número da sua residência:");
        		                num_casa=entrada.nextInt();
        		                
        		                System.out.println("Digite o nome da sua cidade:");
        		                cidade=entrada.next();
        		                
        		                preco_taxa=preco + 3;
        		                
        		                System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1
                        		
                        		if (pag == 2){//Início- opção de pagamento 2
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    
                        		    valor=preco_taxa/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+preco_taxa);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa+valor));
                        		   
                        		    vezes=(preco_taxa+valor)/4;
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		        }
		                }//Fim- define que o produto deve ser entregue
		                
		                
		            }//Fim- processo de calculo do valor do produto e retirada ou entrega do produto
		            
		            else{//Fim- avisa que não tem toda essa quantidade
		             
		                System.out.println("Desculpa mas não temos toda essa quantidade,volta outra hora");
		                
		            }//Fim- avisa que não tem toda essa quantidade

	        }//Fim produto Chuchu
	        
	        if (opc==8){//Início produto Beterraba
	            
	                System.out.println("Informe a quantidade de Beterrabas que você vai Comprar:");
		            quant_compra = entrada.nextInt();
		            kg=(beterraba_g*quant_compra)/1000;
		            
		            if(kg<=beterraba_Kg){//Início- processo de calculo do valor do produto e retirada ou entrega do produto
		                
		                System.out.println("");
		                preco=kg*3.70;
		                System.out.println("Deu "+kg+ " Kg, valor a ser pago sera:" +preco);
		                System.out.println("Deseja retirar no Hortifruti ou que seja entregue em sua residência? (1-para retirar)(2-entregar");
		                opc_entrega=entrada.nextInt();
		                
		                if(opc_entrega==1){//Início- define que o produto vai ser retirado
		                    
		                    System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		   
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+(preco-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1 
                        		
                        		if(pag == 2){//Início- opção de pagamento 2
                        		    
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    valor=preco/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+preco);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+(preco+valor));
                        		    vezes=(preco+valor)/4;
                        		    
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		}
		                    
		                }//Fim- define que o produto vai ser retirado
		                
		                if(opc_entrega==2){//Início- define que o produto deve ser entregue
		                    
		                        System.out.println("Informe o endereço para ser realizada a entrega!(Será cobrado uma taxa de R$3,00)");
        		                
        		                System.out.println("Digite o nome da rua:");
        		                rua=entrada.next();
        		                
        		                System.out.println("Informe o tipo de residência:");
        		                tipo_resid=entrada.next();
        		                
        		                System.out.println("Digite o número da sua residência:");
        		                num_casa=entrada.nextInt();
        		                
        		                System.out.println("Digite o nome da sua cidade:");
        		                cidade=entrada.next();
        		                
        		                preco_taxa=preco + 3;
        		                
        		                System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1
                        		
                        		if (pag == 2){//Início- opção de pagamento 2
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    
                        		    valor=preco_taxa/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+preco_taxa);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa+valor));
                        		   
                        		    vezes=(preco_taxa+valor)/4;
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		        }
		                }//Fim- define que o produto deve ser entregue
		                
		                
		            }//Fim- processo de calculo do valor do produto e retirada ou entrega do produto
		            
		            else{//Fim- avisa que não tem toda essa quantidade
		             
		                System.out.println("Desculpa mas não temos toda essa quantidade,volta outra hora");
		                
		            }//Fim- avisa que não tem toda essa quantidade

	        }//Fim produto Beterraba
	        
	        if (opc==9){//Início produto Batata
	            
	                System.out.println("Informe a quantidade de Batatas que você vai Comprar:");
		            quant_compra = entrada.nextInt();
		            kg=(batata_g*quant_compra)/1000;
		            
		            if(kg<=batata_Kg){//Início- processo de calculo do valor do produto e retirada ou entrega do produto
		                
		                System.out.println("");
		                preco=kg*6.50;
		                System.out.println("Deu "+kg+ " Kg, valor a ser pago sera:" +preco);
		                System.out.println("Deseja retirar no Hortifruti ou que seja entregue em sua residência? (1-para retirar)(2-entregar");
		                opc_entrega=entrada.nextInt();
		                
		                if(opc_entrega==1){//Início- define que o produto vai ser retirado
		                    
		                    System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		   
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+(preco-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1 
                        		
                        		if(pag == 2){//Início- opção de pagamento 2
                        		    
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    valor=preco/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+preco);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+(preco+valor));
                        		    vezes=(preco+valor)/4;
                        		    
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		}
		                    
		                }//Fim- define que o produto vai ser retirado
		                
		                if(opc_entrega==2){//Início- define que o produto deve ser entregue
		                    
		                        System.out.println("Informe o endereço para ser realizada a entrega!(Será cobrado uma taxa de R$3,00)");
        		                
        		                System.out.println("Digite o nome da rua:");
        		                rua=entrada.next();
        		                
        		                System.out.println("Informe o tipo de residência:");
        		                tipo_resid=entrada.next();
        		                
        		                System.out.println("Digite o número da sua residência:");
        		                num_casa=entrada.nextInt();
        		                
        		                System.out.println("Digite o nome da sua cidade:");
        		                cidade=entrada.next();
        		                
        		                preco_taxa=preco + 3;
        		                
        		                System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1
                        		
                        		if (pag == 2){//Início- opção de pagamento 2
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    
                        		    valor=preco_taxa/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+preco_taxa);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa+valor));
                        		   
                        		    vezes=(preco_taxa+valor)/4;
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		        }
		                }//Fim- define que o produto deve ser entregue
		                
		                
		            }//Fim- processo de calculo do valor do produto e retirada ou entrega do produto
		            
		            else{//Fim- avisa que não tem toda essa quantidade
		             
		                System.out.println("Desculpa mas não temos toda essa quantidade,volta outra hora");
		                
		            }//Fim- avisa que não tem toda essa quantidade

	        }//Fim produto Batata
	        
	        if (opc==10){//Início produto Cenoura
	            
	                System.out.println("Informe a quantidade de Cenouras que você vai Comprar:");
		            quant_compra = entrada.nextInt();
		            kg=(cenoura_g*quant_compra)/1000;
		            
		            if(kg<=chuchu_Kg){//Início- processo de calculo do valor do produto e retirada ou entrega do produto
		                
		                System.out.println("");
		                preco=kg*6.00;
		                System.out.println("Deu "+kg+ " Kg, valor a ser pago sera:" +preco);
		                System.out.println("Deseja retirar no Hortifruti ou que seja entregue em sua residência? (1-para retirar)(2-entregar");
		                opc_entrega=entrada.nextInt();
		                
		                if(opc_entrega==1){//Início- define que o produto vai ser retirado
		                    
		                    System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		   
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+(preco-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1 
                        		
                        		if(pag == 2){//Início- opção de pagamento 2
                        		    
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    valor=preco/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+preco);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+(preco+valor));
                        		    vezes=(preco+valor)/4;
                        		    
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		}
		                    
		                }//Fim- define que o produto vai ser retirado
		                
		                if(opc_entrega==2){//Início- define que o produto deve ser entregue
		                    
		                        System.out.println("Informe o endereço para ser realizada a entrega!(Será cobrado uma taxa de R$3,00)");
        		                
        		                System.out.println("Digite o nome da rua:");
        		                rua=entrada.next();
        		                
        		                System.out.println("Informe o tipo de residência:");
        		                tipo_resid=entrada.next();
        		                
        		                System.out.println("Digite o número da sua residência:");
        		                num_casa=entrada.nextInt();
        		                
        		                System.out.println("Digite o nome da sua cidade:");
        		                cidade=entrada.next();
        		                
        		                preco_taxa=preco + 3;
        		                
        		                System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1
                        		
                        		if (pag == 2){//Início- opção de pagamento 2
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    
                        		    valor=preco_taxa/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+preco_taxa);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa+valor));
                        		   
                        		    vezes=(preco_taxa+valor)/4;
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		        }
		                }//Fim- define que o produto deve ser entregue
		                
		                
		            }//Fim- processo de calculo do valor do produto e retirada ou entrega do produto
		            
		            else{//Fim- avisa que não tem toda essa quantidade
		             
		                System.out.println("Desculpa mas não temos toda essa quantidade,volta outra hora");
		                
		            }//Fim- avisa que não tem toda essa quantidade

	        }//Fim produto Cenoura
	        
	        if (opc==11){//Início produto Alface
	            
	                System.out.println("Informe a quantidade de Alfaces que você vai Comprar:");
		            quant_compra = entrada.nextInt();
		            
		            if(quant_compra<=alface){//Início- processo de calculo do valor do produto e retirada ou entrega do produto
		                System.out.println("");
		                preco=quant_compra*2.50;
		                System.out.println("Você esta comprando "+quant_compra+ " Alfaces, o valor a ser pago sera:" +preco);
		                System.out.println("Deseja retirar no Hortifruti ou que seja entregue em sua residência? (1-para retirar)(2-entregar");
		                opc_entrega=entrada.nextInt();
		                
		                if(opc_entrega==1){//Início- define que o produto vai ser retirado
		                    
		                    System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		   
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+(preco-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1 
                        		
                        		if(pag == 2){//Início- opção de pagamento 2
                        		    
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    valor=preco/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+preco);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+(preco+valor));
                        		    vezes=(preco+valor)/4;
                        		    
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		}
		                    
		                }//Fim- define que o produto vai ser retirado
		                
		                if(opc_entrega==2){//Início- define que o produto deve ser entregue
		                    
		                        System.out.println("Informe o endereço para ser realizada a entrega!(Será cobrado uma taxa de R$3,00)");
        		                
        		                System.out.println("Digite o nome da rua:");
        		                rua=entrada.next();
        		                
        		                System.out.println("Informe o tipo de residência:");
        		                tipo_resid=entrada.next();
        		                
        		                System.out.println("Digite o número da sua residência:");
        		                num_casa=entrada.nextInt();
        		                
        		                System.out.println("Digite o nome da sua cidade:");
        		                cidade=entrada.next();
        		                
        		                preco_taxa=preco + 3;
        		                
        		                System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1
                        		
                        		if (pag == 2){//Início- opção de pagamento 2
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    
                        		    valor=preco_taxa/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+preco_taxa);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa+valor));
                        		   
                        		    vezes=(preco_taxa+valor)/4;
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		        }
		                }//Fim- define que o produto deve ser entregue
		                
		                
		            }//Fim- processo de calculo do valor do produto e retirada ou entrega do produto
		            
		            else{
		             
		                System.out.println("Desculpa mas não temos toda essa quantidade,volta outra hora");
		                
		            }

	        }//Fim- produto Alface
	        
	        
	        if (opc==12){//Início- produto Rucula
	            
	                System.out.println("Informe a quantidade de Ruculas que você vai Comprar:");
		            quant_compra = entrada.nextInt();
		            
		            
		            if(quant_compra<=rucula){//Início- processo de calculo do valor do produto e retirada ou entrega do produto
		                
		                System.out.println("");
		                preco=quant_compra*4.00;
		                System.out.println("Você esta comprando "+quant_compra+ " Ruculas, o valor a ser pago sera:" +preco);
		                System.out.println("Deseja retirar no Hortifruti ou que seja entregue em sua residência? (1-para retirar)(2-entregar");
		                opc_entrega=entrada.nextInt();
		                
		                if(opc_entrega==1){//Início- define que o produto vai ser retirado
		                    
		                    System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		   
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+(preco-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1 
                        		
                        		if(pag == 2){//Início- opção de pagamento 2
                        		    
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    valor=preco/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+preco);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+(preco+valor));
                        		    vezes=(preco+valor)/4;
                        		    
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		}
		                    
		                }//Fim- define que o produto vai ser retirado
		                
		                if(opc_entrega==2){//Início- define que o produto deve ser entregue
		                    
		                        System.out.println("Informe o endereço para ser realizada a entrega!(Será cobrado uma taxa de R$3,00)");
        		                
        		                System.out.println("Digite o nome da rua:");
        		                rua=entrada.next();
        		                
        		                System.out.println("Informe o tipo de residência:");
        		                tipo_resid=entrada.next();
        		                
        		                System.out.println("Digite o número da sua residência:");
        		                num_casa=entrada.nextInt();
        		                
        		                System.out.println("Digite o nome da sua cidade:");
        		                cidade=entrada.next();
        		                
        		                preco_taxa=preco + 3;
        		                
        		                System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1
                        		
                        		if (pag == 2){//Início- opção de pagamento 2
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    
                        		    valor=preco_taxa/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+preco_taxa);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa+valor));
                        		   
                        		    vezes=(preco_taxa+valor)/4;
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		        }
		                }//Fim- define que o produto deve ser entregue
		                
		                
		                
		            }//Fim- processo de calculo do valor do produto e retirada ou entrega do produto
		            
		            else{
		             
		                System.out.println("Desculpa mas não temos toda essa quantidade,volta outra hora");
		                
		            }

	        }//Fim-produto Rucula
	        if (opc==13){//Início- produto Coentro
	                
	                System.out.println("Informe a quantidade de Coentro que você vai Comprar:");
		            quant_compra = entrada.nextInt();
		            
		            
		            if(quant_compra<=coentro){//Início- processo de calculo do valor do produto e retirada ou entrega do produto
		                
		                System.out.println("");
		                preco=quant_compra*2.50;
		                System.out.println("Você esta comprando "+quant_compra+ " Coentro, o valor a ser pago sera:" +preco);
		                System.out.println("Deseja retirar no Hortifruti ou que seja entregue em sua residência? (1-para retirar)(2-entregar");
		                opc_entrega=entrada.nextInt();
		                
		                if(opc_entrega==1){//Início- define que o produto vai ser retirado
		                    
		                    System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		   
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+(preco-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1 
                        		
                        		if(pag == 2){//Início- opção de pagamento 2
                        		    
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    valor=preco/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+preco);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+(preco+valor));
                        		    vezes=(preco+valor)/4;
                        		    
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		}
		                    
		                }//Fim- define que o produto vai ser retirado
		                
		                if(opc_entrega==2){//Início- define que o produto deve ser entregue
		                    
		                        System.out.println("Informe o endereço para ser realizada a entrega!(Será cobrado uma taxa de R$3,00)");
        		                
        		                System.out.println("Digite o nome da rua:");
        		                rua=entrada.next();
        		                
        		                System.out.println("Informe o tipo de residência:");
        		                tipo_resid=entrada.next();
        		                
        		                System.out.println("Digite o número da sua residência:");
        		                num_casa=entrada.nextInt();
        		                
        		                System.out.println("Digite o nome da sua cidade:");
        		                cidade=entrada.next();
        		                
        		                preco_taxa=preco + 3;
        		                
        		                System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1
                        		
                        		if (pag == 2){//Início- opção de pagamento 2
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    
                        		    valor=preco_taxa/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+preco_taxa);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa+valor));
                        		   
                        		    vezes=(preco_taxa+valor)/4;
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		        }
		                }//Fim- define que o produto deve ser entregue
		                
		                
		                
		            }//Fim- processo de calculo do valor do produto e retirada ou entrega do produto
		            
		            else{
		             
		                System.out.println("Desculpa mas não temos toda essa quantidade,volta outra hora");
		                
		            }

	        }//Fim- produto Coentro
	        
	        if (opc==14){//Início- produto Alho-Poró
	                
	                System.out.println("Informe a quantidade de Alho-Poró que você vai Comprar:");
		            quant_compra = entrada.nextInt();
		            
		            if(quant_compra<=alho_poro){//Início- processo de calculo do valor do produto e retirada ou entrega do produto
		                
		                System.out.println("");
		                preco=quant_compra*4.30;
		                System.out.println("Você esta comprando "+quant_compra+ " Alho-Poró, o valor a ser pago sera:" +preco);
		                System.out.println("Deseja retirar no Hortifruti ou que seja entregue em sua residência? (1-para retirar)(2-entregar");
		                opc_entrega=entrada.nextInt();
		                
		                if(opc_entrega==1){//Início- define que o produto vai ser retirado
		                    
		                    System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		   
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+(preco-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1 
                        		
                        		if(pag == 2){//Início- opção de pagamento 2
                        		    
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    valor=preco/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+preco);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("Ola " +nome+ " você esta comprando " +quant_compra+" maçãs, o valor total a ser pago é:"+(preco+valor));
                        		    vezes=(preco+valor)/4;
                        		    
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		}
		                    
		                }//Fim- define que o produto vai ser retirado
		                
		                if(opc_entrega==2){//Início- define que o produto deve ser entregue
		                    
		                        System.out.println("Informe o endereço para ser realizada a entrega!(Será cobrado uma taxa de R$3,00)");
        		                
        		                System.out.println("Digite o nome da rua:");
        		                rua=entrada.next();
        		                
        		                System.out.println("Informe o tipo de residência:");
        		                tipo_resid=entrada.next();
        		                
        		                System.out.println("Digite o número da sua residência:");
        		                num_casa=entrada.nextInt();
        		                
        		                System.out.println("Digite o nome da sua cidade:");
        		                cidade=entrada.next();
        		                
        		                preco_taxa=preco + 3;
        		                
        		                System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1
                        		
                        		if (pag == 2){//Início- opção de pagamento 2
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    
                        		    valor=preco_taxa/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+preco_taxa);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa+valor));
                        		   
                        		    vezes=(preco_taxa+valor)/4;
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		        }
		                }//Fim- define que o produto deve ser entregue
		                
		                
		                
		            }//Fim- processo de calculo do valor do produto e retirada ou entrega do produto
		            
		            else{
		             
		                System.out.println("Desculpa mas não temos toda essa quantidade,volta outra hora");
		                
		            }

	        }//Fim- produto Alho-Poró
	        
	        if (opc==15){//Início- produto Açafrão
	                
	                System.out.println("Informe a quantidade de Açafrão que você vai Comprar:");
		            quant_compra = entrada.nextInt();
		            
		            if(quant_compra<=acafrao){//Início- processo de calculo do valor do produto e retirada ou entrega do produto
		                
		                System.out.println("");
		                preco=quant_compra*1.45;
		                System.out.println("Você esta comprando "+quant_compra+ " Açafrão, o valor a ser pago sera:" +preco);
		                System.out.println("Deseja retirar no Hortifruti ou que seja entregue em sua residência? (1-para retirar)(2-entregar");
		                opc_entrega=entrada.nextInt();
		                
		                if(opc_entrega==1){//Início- define que o produto vai ser retirado
		                    
		                    System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		   
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1 
                        		
                        		if(pag == 2){//Início- opção de pagamento 2
                        		    
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    valor=preco/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+preco);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco+valor));
                        		    vezes=(preco+valor)/4;
                        		    
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		}
		                    
		                }//Fim- define que o produto vai ser retirado
		                
		                if(opc_entrega==2){//Início- define que o produto deve ser entregue
		                    
		                        System.out.println("Informe o endereço para ser realizada a entrega!(Será cobrado uma taxa de R$3,00)");
        		                
        		                System.out.println("Digite o nome da rua:");
        		                rua=entrada.next();
        		                
        		                System.out.println("Informe o tipo de residência:");
        		                tipo_resid=entrada.next();
        		                
        		                System.out.println("Digite o número da sua residência:");
        		                num_casa=entrada.nextInt();
        		                
        		                System.out.println("Digite o nome da sua cidade:");
        		                cidade=entrada.next();
        		                
        		                preco_taxa=preco + 3;
        		                
        		                System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1
                        		
                        		if (pag == 2){//Início- opção de pagamento 2
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    
                        		    valor=preco_taxa/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+preco_taxa);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa+valor));
                        		   
                        		    vezes=(preco_taxa+valor)/4;
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		        }
		                }//Fim- define que o produto deve ser entregue
		                
		                
		                
		            }//Fim- processo de calculo do valor do produto e retirada ou entrega do produto
		            
		            else{
		             
		                System.out.println("Desculpa mas não temos toda essa quantidade,volta outra hora");
		                
		            }

	        }//Fim- produto Açafrão
	        
	        if (opc==16){//Início- produto Bicarbonato de Sódio
	            
	                System.out.println("Informe a quantidade de Bicarbonato de Sódio que você vai Comprar:");
		            quant_compra = entrada.nextInt();
		            
		            if(quant_compra<=bicarbonato_de_sodio){//Início- processo de calculo do valor do produto e retirada ou entrega do produto
		                
		                System.out.println("");
		                preco=quant_compra*2.00;
		                System.out.println("Você esta comprando "+quant_compra+ " Bicarbonato de Sódio, o valor a ser pago sera:" +preco);
		                System.out.println("Deseja retirar no Hortifruti ou que seja entregue em sua residência? (1-para retirar)(2-entregar");
		                opc_entrega=entrada.nextInt();
		                
		                if(opc_entrega==1){//Início- define que o produto vai ser retirado
		                    
		                    System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		   
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1 
                        		
                        		if(pag == 2){//Início- opção de pagamento 2
                        		    
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    valor=preco/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+preco);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco+valor));
                        		    vezes=(preco+valor)/4;
                        		    
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		}
		                    
		                }//Fim- define que o produto vai ser retirado
		                
		                if(opc_entrega==2){//Início- define que o produto deve ser entregue
		                    
		                        System.out.println("Informe o endereço para ser realizada a entrega!(Será cobrado uma taxa de R$3,00)");
        		                
        		                System.out.println("Digite o nome da rua:");
        		                rua=entrada.next();
        		                
        		                System.out.println("Informe o tipo de residência:");
        		                tipo_resid=entrada.next();
        		                
        		                System.out.println("Digite o número da sua residência:");
        		                num_casa=entrada.nextInt();
        		                
        		                System.out.println("Digite o nome da sua cidade:");
        		                cidade=entrada.next();
        		                
        		                preco_taxa=preco + 3;
        		                
        		                System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1
                        		
                        		if (pag == 2){//Início- opção de pagamento 2
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    
                        		    valor=preco_taxa/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+preco_taxa);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa+valor));
                        		   
                        		    vezes=(preco_taxa+valor)/4;
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		        }
		                }//Fim- define que o produto deve ser entregue
		                
		                
		                
		            }//Fim- processo de calculo do valor do produto e retirada ou entrega do produto
		            
		            else{
		             
		                System.out.println("Desculpa mas não temos toda essa quantidade,volta outra hora");
		                
		            }

	        }//Fim- produto Bicarbonato de Sódio
	        
	        if (opc==17){//Início- produto Colorau
	            
	                System.out.println("Informe a quantidade de Colorau que você vai Comprar:");
		            quant_compra = entrada.nextInt();
		            
		            
		            if(quant_compra<=colorau){//Início- processo de calculo do valor do produto e retirada ou entrega do produto
		                
		                System.out.println("");
		                preco=quant_compra*1.75;
		                System.out.println("Você esta comprando "+quant_compra+ " colorau, o valor a ser pago sera:" +preco);
		                System.out.println("Deseja retirar no Hortifruti ou que seja entregue em sua residência? (1-para retirar)(2-entregar");
		                opc_entrega=entrada.nextInt();
		                
		                if(opc_entrega==1){//Início- define que o produto vai ser retirado
		                    
		                    System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		   
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1 
                        		
                        		if(pag == 2){//Início- opção de pagamento 2
                        		    
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    valor=preco/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+preco);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco+valor));
                        		    vezes=(preco+valor)/4;
                        		    
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		}
		                    
		                }//Fim- define que o produto vai ser retirado
		                
		                if(opc_entrega==2){//Início- define que o produto deve ser entregue
		                    
		                        System.out.println("Informe o endereço para ser realizada a entrega!(Será cobrado uma taxa de R$3,00)");
        		                
        		                System.out.println("Digite o nome da rua:");
        		                rua=entrada.next();
        		                
        		                System.out.println("Informe o tipo de residência:");
        		                tipo_resid=entrada.next();
        		                
        		                System.out.println("Digite o número da sua residência:");
        		                num_casa=entrada.nextInt();
        		                
        		                System.out.println("Digite o nome da sua cidade:");
        		                cidade=entrada.next();
        		                
        		                preco_taxa=preco + 3;
        		                
        		                System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1
                        		
                        		if (pag == 2){//Início- opção de pagamento 2
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    
                        		    valor=preco_taxa/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+preco_taxa);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa+valor));
                        		   
                        		    vezes=(preco_taxa+valor)/4;
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		        }
		                }//Fim- define que o produto deve ser entregue
		                
		                
		                
		            }//Fim- processo de calculo do valor do produto e retirada ou entrega do produto
		            
		            else{
		             
		                System.out.println("Desculpa mas não temos toda essa quantidade,volta outra hora");
		                
		            }

	        }//Fim- produto Colorau

	        if (opc==18){//Início- produto Pimenta do Reino
	            
	                System.out.println("Informe a quantidade de Pimenta do Reino que você vai Comprar:");
		            quant_compra = entrada.nextInt();
		            
		            if(quant_compra<=pimenta_do_reino){//Início- processo de calculo do valor do produto e retirada ou entrega do produto
		                
		                System.out.println("");
		                preco=quant_compra*2.50;
		                System.out.println("Você esta comprando "+quant_compra+ " pimenta do reino, o valor a ser pago sera:" +preco);
		                System.out.println("Deseja retirar no Hortifruti ou que seja entregue em sua residência? (1-para retirar)(2-entregar");
		                opc_entrega=entrada.nextInt();
		                
		                if(opc_entrega==1){//Início- define que o produto vai ser retirado
		                    
		                    System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		   
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1 
                        		
                        		if(pag == 2){//Início- opção de pagamento 2
                        		    
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    valor=preco/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+preco);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco+valor));
                        		    vezes=(preco+valor)/4;
                        		    
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		}
		                    
		                }//Fim- define que o produto vai ser retirado
		                
		                if(opc_entrega==2){//Início- define que o produto deve ser entregue
		                    
		                        System.out.println("Informe o endereço para ser realizada a entrega!(Será cobrado uma taxa de R$3,00)");
        		                
        		                System.out.println("Digite o nome da rua:");
        		                rua=entrada.next();
        		                
        		                System.out.println("Informe o tipo de residência:");
        		                tipo_resid=entrada.next();
        		                
        		                System.out.println("Digite o número da sua residência:");
        		                num_casa=entrada.nextInt();
        		                
        		                System.out.println("Digite o nome da sua cidade:");
        		                cidade=entrada.next();
        		                
        		                preco_taxa=preco + 3;
        		                
        		                System.out.print("Escolha como vai ser a forma de pagamento, sendo: 1 - À  vista no cartão de crédito, recebe 15% de desconto,");
                        		System.out.print("2 - Em duas vezes no cartão, preço normal sem juros, 3 - Em quatro vezes no cartão, preço normal mais juros de 15%: ");
                        		pag=entrada.nextInt();
                        		
                        		if (pag == 1){//Início- opção de pagamento 1
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Codigo 1- À vista no cartão de crédito, recebe 15% de desconto.");
                        		    System.out.println("Seu desconto é:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa-valor));
                        		    System.out.println("");
                        		    
                        		}//Fim- opção de pagamento 1
                        		
                        		if (pag == 2){//Início- opção de pagamento 2
                        		    System.out.println("Codigo 2- Em duas vezes no cartão, preço normal sem juros.");
                        		    
                        		    valor=preco_taxa/2;
                        		    
                        		    System.out.println("Sem desconto,valor da parcela:"+valor);
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+preco_taxa);
                        		    
                        		}//Fim- opção de pagamento 2
                        		
                        		if (pag == 3){//Início- opção de pagamento 3
                        		    System.out.println("Codigo 3- Em quatro vezes no cartão, preço normal mais juros de 15%.");
                        		    
                        		    valor=(preco_taxa*15)/100;
                        		    
                        		    System.out.println("Você tem um juros de:"+valor );
                        		    System.out.println("Informe os dados para finalizar o pagamento!");
                        		    
                        		    System.out.println("Digite seu nome comleto:");
                        		    nome=entrada.next();
                        		    
                        		    System.out.println("Digite seu CPF apenas números:");
                        		    cpf=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o número do seu cartão:");
                        		    num_cartao=entrada.nextLong();
                        		    
                        		    System.out.println("Digite o código de segurança do cartão:");
                        		    cod_cartao=entrada.nextInt();
                        		    
                        		    System.out.println("Informe a data de validade do seu cartão:");
                        		    data_cartao=entrada.next();
                        		    
                        		    System.out.println("O valor total a ser pago é:"+(preco_taxa+valor));
                        		   
                        		    vezes=(preco_taxa+valor)/4;
                        		    System.out.println("O valor das parcelas:"+vezes);
                        		    
                        		}//Fim- opção de pagamento 3
                        		
                        		if((pag < 1) && (pag > 3)){//Avisa que a opção escolhida não existe
                        		     System.out.println("Código inválido");
                		        }
		                }//Fim- define que o produto deve ser entregue
		                
		                
		                
		            }//Fim- processo de calculo do valor do produto e retirada ou entrega do produto
		            
		            else{
		             
		                System.out.println("Desculpa mas não temos toda essa quantidade,volta outra hora");
		                
		            }

	        }//Fim- produto Pimenta do Reino
	        

	        }while (opc!=0);

		        
		        
            }
        }while (opc!=0);
  
	}
}  

 


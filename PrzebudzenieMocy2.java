package PrzebudzenieMocy1;


import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;



class menuPostaci{
	menuPostaci(){
	System.out.println("*********************************************");
	System.out.println("             Przebudzenie Mocy               ");
	System.out.println("         Witaj w kreatorze postaci:          ");
	System.out.println("*********************************************");
	System.out.println(" ");
	System.out.println("     Na początek wybierz rasę postaci:       ");              /* wybór postaci*/
	System.out.println(" ");
	System.out.println(" NR    Rasa      |      Zdolności rasowe     ");
	System.out.println(" ");
	System.out.println("  1  Człowiek    |           Brak            ");
	System.out.println(" ");
	System.out.println("  2    Elf       |    Widzenie w ciemności   ");
	System.out.println("                 |      Super zręczność      ");
	System.out.println(" ");
	System.out.println("  3  Krasnolud   |    Widzenie w ciemności   ");
	System.out.println("                 |     Super wytrzymałość    ");
	System.out.println(" ");
	System.out.println("  4  Łotrzyk     |          Latanie          ");
	System.out.println("                 |    Wrażliwy na obrażenia  ");
	}
}

class Profesja1{
	Profesja1(){
		System.out.println("*********************************************");
		System.out.println("             Przebudzenie Mocy               ");
		System.out.println("         Witaj w kreatorze postaci:          ");
		System.out.println("*********************************************");  /*menu pierwszej profesji*/
		System.out.println(" ");
		System.out.println("     Teraz wybierz Pierwszą z 2 profesji:    ");
		System.out.println(" ");
		System.out.println(" NR  Profesja    |        Umiejętności       "); 
	}
	
	
	
	
}



class Profesja2{
	Profesja2(){
		System.out.println("*********************************************");
		System.out.println("             Przebudzenie Mocy               ");
		System.out.println("         Witaj w kreatorze postaci:          ");
		System.out.println("*********************************************");    /*menu wybór 2 profesji*/
		System.out.println(" ");
		System.out.println("     Teraz wybierz Drógą z 2 profesji:    ");
		System.out.println(" ");
		System.out.println(" NR  Profesja    |        Umiejętności       "); 
	}
	
	
	
	
}

class wojownik1{
	wojownik1(){
		
		System.out.println(" ");
		System.out.println("  1  Wojownik    | Władanie mieczem, toporem ");           /*opcja 1 wojownik*/
		System.out.println("                 |   walka włócznią i wręcz  ");
	}
}

class mag1{
	mag1(){
		System.out.println(" ");
		System.out.println("  2    Mag       |         Czarowanie        ");
		System.out.println("                 |          Eliksiry         ");       /*opcja 2 mag*/
	}
}

class zabójca1{
	zabójca1(){
		System.out.println(" ");
		System.out.println("  3  Zabójca     |    Skradanie, trucizny    ");
		System.out.println("                 |         walka wręcz       ");    /*opcja 3 zabójca*/
	}
}

class zbrojmistrz1{
	zbrojmistrz1(){
		System.out.println(" ");
		System.out.println("  4 Zbrojmistrz  |      Naprawa Ekwipunku    ");    /*opcja 4 zbrojmistrz*/
	}
}

class łowca1{
	łowca1(){
		System.out.println(" ");
		System.out.println("  5   Łowca      |    Skradanie, strzelectwo ");     /*opcja 5 łowca*/
		System.out.println(" ");
	}
}




public class PrzebudzenieMocy2 {         /*clasa rozruchowa przebudzenie mocy oparta o wzorzec dekorator*/

	

	public static void main(String[] args) throws IOException {          /*funkcja main przesyłająca dalej wyjątki IOException */
		
		/*-----------------------------------------------*/
		String nazwaPliku = "Postać.txt";                        /*tworzenie noweku pliku TXT do zapisu postaci*/
		  FileWriter plikWy = null;                              /*czyszczenie pliku*/
		/*----------------------------------------------*/
		  
		  Scanner in = new Scanner(System.in);                   /*funkcja scanner do zczytywania danych z klawiatury*/
		int p1;
		int z;           /*Zmienne wymagane w progrmaie*/
		int p2;
		
		      /*pętla for sprawdzająca czy wybrana została postać od 1 do 4*/
		menuPostaci menu = new menuPostaci();
		int p = in.nextInt();      /*zczytywanie z klawiatury */
        z = p;
        try {
            plikWy = new FileWriter(nazwaPliku);
        
        	if (p==1){                                          /*funkcja if do wyboru posraci - 1 postać człowiek */
        		Rasa rasa1 = new Człowiek();                    /*wybór nowej funkcji człowiek do wzoraca (clasy rasa) - wzorzec dekorator*/
        		Profesja1 profesja = new Profesja1();           
        		wojownik1 wojownik = new wojownik1();
        		mag1 mag = new mag1();
        		zabójca1 zabójca = new zabójca1();
        		zbrojmistrz1 zbrojmistrz = new zbrojmistrz1();
        		łowca1 łowca = new łowca1();
        		p1 = in.nextInt();
        		z = p1;
        					
        					
        					if (z==1){                          /*funkcja if do umiejętności - 1 umiejętność */
        						rasa1 = new Wojownik(rasa1);   /*dynamiczne dodawanie dodatków w trakcie działania kodu  */
        						Profesja2 profesja2 = new Profesja2();        
        						mag1 mag1 = new mag1();
        		        		zabójca1 zabójca1 = new zabójca1();
        		        		zbrojmistrz1 zbrojmistrz1 = new zbrojmistrz1();
        		        		łowca1 łowca1 = new łowca1();
        		        		p2 = in.nextInt();
        						z = p2;
        											
        											if(z==2){
        											rasa1 = new Mag(rasa1);
        											System.out.println(rasa1.pobierzOpis());  /*wyświetlanie całości dodatkowo w programie*/
        											String tekst = rasa1.pobierzOpis();  /*pobieranie tekstu do zapisu w pliku*/
        			        		                plikWy.write(tekst);    /*zapis całości czyli postaci i 2 umiejętności do pliku*/
        			        		                // zapis po znaku
        											}
        											else if(z==3){
        												rasa1 = new Zabójca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==4){
        												rasa1 = new Zbrojmistrz(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==5){
        												rasa1 = new Łowca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											
        											
        											}
        					}
        					else if(z==2){
        						rasa1 = new Mag(rasa1);
        						Profesja2 profesja2 = new Profesja2();
        						wojownik1 wojownik1 = new wojownik1();
        		        		zabójca1 zabójca1 = new zabójca1();
        		        		zbrojmistrz1 zbrojmistrz1 = new zbrojmistrz1();
        		        		łowca1 łowca1 = new łowca1();
        		        		p2 = in.nextInt();
        						z = p2;				for(int i=0;i>=0;--i){
        											if(z==1){
        											rasa1 = new Wojownik(rasa1);
        											System.out.println(rasa1.pobierzOpis());
        											String tekst = rasa1.pobierzOpis();
        			        		                plikWy.write(tekst);
        			        		                // zapis po znaku
        											}
        											else if(z==3){
        												rasa1 = new Zabójca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==4){
        												rasa1 = new Zbrojmistrz(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==5){
        												rasa1 = new Łowca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}else if (z!=2 && z!=3 && z!=4 && z!=5){
        												System.out.println("Podaj jedną z widocznych wartości! \n");
        											i++;
        											}
        											
        											
        											}
        						
        						
        					}
        					else if(z==3){
        						rasa1 = new Zabójca(rasa1);
        						Profesja2 profesja2 = new Profesja2();
        						wojownik1 wojownik1 = new wojownik1();
        						mag1 mag1 = new mag1();
        		        		zbrojmistrz1 zbrojmistrz1 = new zbrojmistrz1();
        		        		łowca1 łowca1 = new łowca1();
        		        		p2 = in.nextInt();
        						z = p2;				for(int i=0;i>=0;--i){
        											if(z==2){
        											rasa1 = new Mag(rasa1);
        											System.out.println(rasa1.pobierzOpis());
        											String tekst = rasa1.pobierzOpis();
        			        		                plikWy.write(tekst);
        			        		                // zapis po znaku
        											}
        											else if(z==1){
        												rasa1 = new Wojownik(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==4){
        												rasa1 = new Zbrojmistrz(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==5){
        												rasa1 = new Łowca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}else if (z!=2 && z!=3 && z!=4 && z!=5){
        												System.out.println("Podaj jedną z widocznych wartości! \n");
        											i++;
        											}
        											
        											
        											}
        						
        					}
        					else if(z==4){
        						rasa1 = new Zbrojmistrz(rasa1);
        						Profesja2 profesja2 = new Profesja2();
        						wojownik1 wojownik1 = new wojownik1();
        						mag1 mag1 = new mag1();
        		        		zabójca1 zabójca1 = new zabójca1();
        		        		łowca1 łowca1 = new łowca1();
        		        		p2 = in.nextInt();
        						z = p2;				for(int i=0;i>=0;--i){
        											if(z==2){
        											rasa1 = new Mag(rasa1);
        											System.out.println(rasa1.pobierzOpis());
        											String tekst = rasa1.pobierzOpis();
        			        		                plikWy.write(tekst);
        			        		                // zapis po znaku
        											}
        											else if(z==3){
        												rasa1 = new Zabójca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==1){
        												rasa1 = new Wojownik(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==5){
        												rasa1 = new Łowca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}else if (z!=2 && z!=3 && z!=4 && z!=5){
        												System.out.println("Podaj jedną z widocznych wartości! \n");
        											i++;
        											}
        											
        											
        											}
        					}
        					else if(z==5){
        						rasa1 = new Łowca(rasa1);
        						Profesja2 profesja2 = new Profesja2();
        						wojownik1 wojownik1 = new wojownik1();
        						mag1 mag1 = new mag1();
        		        		zabójca1 zabójca1 = new zabójca1();
        		        		zbrojmistrz1 zbrojmistrz1 = new zbrojmistrz1();
        		        		p2 = in.nextInt();
        						z = p2;				
        											for(int i=0;i>=0;--i){
        											if(z==2){
        											rasa1 = new Mag(rasa1);
        											System.out.println(rasa1.pobierzOpis());
        											String tekst = rasa1.pobierzOpis();
        			        		                plikWy.write(tekst);
        			        		                // zapis po znaku
        											}
        											else if(z==3){
        												rasa1 = new Zabójca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==4){
        												rasa1 = new Zbrojmistrz(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==1){
        												rasa1 = new Wojownik(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											
        											
        											
        											}
        						
        						
        					
        					}
        					}
        					
        					
        		
        	}
        	else if (p==2){
        		Rasa rasa1 = new Elf();
        		
        		Profesja1 profesja = new Profesja1();
        		wojownik1 wojownik = new wojownik1();
        		mag1 mag = new mag1();
        		zabójca1 zabójca = new zabójca1();
        		zbrojmistrz1 zbrojmistrz = new zbrojmistrz1();
        		łowca1 łowca = new łowca1();
        		p1 = in.nextInt();
        		z = p1;
        		
        					for(int j=0;j>=0;j--){
        					if (z==1){
        						rasa1 = new Wojownik(rasa1);
        						Profesja2 profesja2 = new Profesja2();
        						mag1 mag1 = new mag1();
        		        		zabójca1 zabójca1 = new zabójca1();
        		        		zbrojmistrz1 zbrojmistrz1 = new zbrojmistrz1();
        		        		łowca1 łowca1 = new łowca1();
        		        		p2 = in.nextInt();
        						z = p2;
        											if(z==2){
        											rasa1 = new Mag(rasa1);
        											System.out.println(rasa1.pobierzOpis());
        											String tekst = rasa1.pobierzOpis();
        			        		                plikWy.write(tekst);
        			        		                // zapis po znaku
        											}
        											else if(z==3){
        												rasa1 = new Zabójca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==4){
        												rasa1 = new Zbrojmistrz(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==5){
        												rasa1 = new Łowca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        						
        					}
        					else if(z==2){
        						rasa1 = new Mag(rasa1);
        						Profesja2 profesja2 = new Profesja2();
        						wojownik1 wojownik1 = new wojownik1();
        		        		zabójca1 zabójca1 = new zabójca1();
        		        		zbrojmistrz1 zbrojmistrz1 = new zbrojmistrz1();
        		        		łowca1 łowca1 = new łowca1();
        		        		p2 = in.nextInt();
        						z = p2;
        											if(z==1){
        											rasa1 = new Wojownik(rasa1);
        											System.out.println(rasa1.pobierzOpis());
        											String tekst = rasa1.pobierzOpis();
        			        		                plikWy.write(tekst);
        			        		                // zapis po znaku
        											}
        											else if(z==3){
        												rasa1 = new Zabójca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==4){
        												rasa1 = new Zbrojmistrz(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==5){
        												rasa1 = new Łowca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        						
        						
        					}
        					else if(z==3){
        						rasa1 = new Zabójca(rasa1);
        						Profesja2 profesja2 = new Profesja2();
        						wojownik1 wojownik1 = new wojownik1();
        						mag1 mag1 = new mag1();
        		        		zbrojmistrz1 zbrojmistrz1 = new zbrojmistrz1();
        		        		łowca1 łowca1 = new łowca1();
        		        		p2 = in.nextInt();
        						z = p2;
        											if(z==2){
        											rasa1 = new Mag(rasa1);
        											System.out.println(rasa1.pobierzOpis());
        											String tekst = rasa1.pobierzOpis();
        			        		                plikWy.write(tekst);
        			        		                // zapis po znaku
        											}
        											else if(z==1){
        												rasa1 = new Wojownik(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==4){
        												rasa1 = new Zbrojmistrz(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==5){
        												rasa1 = new Łowca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        						
        					}
        					else if(z==4){
        						rasa1 = new Zbrojmistrz(rasa1);
        						Profesja2 profesja2 = new Profesja2();
        						wojownik1 wojownik1 = new wojownik1();
        						mag1 mag1 = new mag1();
        		        		zabójca1 zabójca1 = new zabójca1();
        		        		łowca1 łowca1 = new łowca1();
        		        		p2 = in.nextInt();
        						z = p2;
        											if(z==2){
        											rasa1 = new Mag(rasa1);
        											System.out.println(rasa1.pobierzOpis());
        											String tekst = rasa1.pobierzOpis();
        			        		                plikWy.write(tekst);
        			        		                // zapis po znaku
        											}
        											else if(z==3){
        												rasa1 = new Zabójca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==1){
        												rasa1 = new Wojownik(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==5){
        												rasa1 = new Łowca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        					}
        					else if(z==5){
        						rasa1 = new Łowca(rasa1);
        						Profesja2 profesja2 = new Profesja2();
        						wojownik1 wojownik1 = new wojownik1();
        						mag1 mag1 = new mag1();
        		        		zabójca1 zabójca1 = new zabójca1();
        		        		zbrojmistrz1 zbrojmistrz1 = new zbrojmistrz1();
        		        		p2 = in.nextInt();
        						z = p2;
        											if(z==2){
        											rasa1 = new Mag(rasa1);
        											System.out.println(rasa1.pobierzOpis());
        											String tekst = rasa1.pobierzOpis();
        			        		                plikWy.write(tekst);
        			        		                // zapis po znaku
        											}
        											else if(z==3){
        												rasa1 = new Zabójca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==4){
        												rasa1 = new Zbrojmistrz(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==1){
        												rasa1 = new Wojownik(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        						
        											else if (z!=1 && z!=2 && z!=3 && z!=4 && z!=5){
        				        						System.out.println("Wybierz wartość od 1 do 5");
        				        						
        				        					}
        				        					
        				        					}
        					}
        		
        		
        		
        		
        		
        	}
        	else if (p==3){
        		Rasa rasa1 = new Krasnolud();
        		Profesja1 profesja = new Profesja1();
        		wojownik1 wojownik = new wojownik1();
        		mag1 mag = new mag1();
        		zabójca1 zabójca = new zabójca1();
        		zbrojmistrz1 zbrojmistrz = new zbrojmistrz1();
        		łowca1 łowca = new łowca1();
        		p1 = in.nextInt();
        		z = p1;
        		
        					for(int j=0;j>=0;j--){
        					if (z==1){
        						rasa1 = new Wojownik(rasa1);
        						Profesja2 profesja2 = new Profesja2();
        						mag1 mag1 = new mag1();
        		        		zabójca1 zabójca1 = new zabójca1();
        		        		zbrojmistrz1 zbrojmistrz1 = new zbrojmistrz1();
        		        		łowca1 łowca1 = new łowca1();
        		        		p2 = in.nextInt();
        						z = p2;
        											if(z==2){
        											rasa1 = new Mag(rasa1);
        											System.out.println(rasa1.pobierzOpis());
        											String tekst = rasa1.pobierzOpis();
        			        		                plikWy.write(tekst);
        			        		                // zapis po znaku
        											}
        											else if(z==3){
        												rasa1 = new Zabójca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==4){
        												rasa1 = new Zbrojmistrz(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==5){
        												rasa1 = new Łowca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        						
        					}
        					else if(z==2){
        						rasa1 = new Mag(rasa1);
        						Profesja2 profesja2 = new Profesja2();
        						wojownik1 wojownik1 = new wojownik1();
        		        		zabójca1 zabójca1 = new zabójca1();
        		        		zbrojmistrz1 zbrojmistrz1 = new zbrojmistrz1();
        		        		łowca1 łowca1 = new łowca1();
        		        		p2 = in.nextInt();
        						z = p2;
        											if(z==1){
        											rasa1 = new Wojownik(rasa1);
        											System.out.println(rasa1.pobierzOpis());
        											String tekst = rasa1.pobierzOpis();
        			        		                plikWy.write(tekst);
        			        		                // zapis po znaku
        											}
        											else if(z==3){
        												rasa1 = new Zabójca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==4){
        												rasa1 = new Zbrojmistrz(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==5){
        												rasa1 = new Łowca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        						
        						
        					}
        					else if(z==3){
        						rasa1 = new Zabójca(rasa1);
        						Profesja2 profesja2 = new Profesja2();
        						wojownik1 wojownik1 = new wojownik1();
        						mag1 mag1 = new mag1();
        		        		zbrojmistrz1 zbrojmistrz1 = new zbrojmistrz1();
        		        		łowca1 łowca1 = new łowca1();
        		        		p2 = in.nextInt();
        						z = p2;
        											if(z==2){
        											rasa1 = new Mag(rasa1);
        											System.out.println(rasa1.pobierzOpis());
        											String tekst = rasa1.pobierzOpis();
        			        		                plikWy.write(tekst);
        			        		                // zapis po znaku
        											}
        											else if(z==1){
        												rasa1 = new Wojownik(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==4){
        												rasa1 = new Zbrojmistrz(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==5){
        												rasa1 = new Łowca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        						
        					}
        					else if(z==4){
        						rasa1 = new Zbrojmistrz(rasa1);
        						Profesja2 profesja2 = new Profesja2();
        						wojownik1 wojownik1 = new wojownik1();
        						mag1 mag1 = new mag1();
        		        		zabójca1 zabójca1 = new zabójca1();
        		        		łowca1 łowca1 = new łowca1();
        		        		p2 = in.nextInt();
        						z = p2;
        											if(z==2){
        											rasa1 = new Mag(rasa1);
        											System.out.println(rasa1.pobierzOpis());
        											String tekst = rasa1.pobierzOpis();
        			        		                plikWy.write(tekst);
        			        		                // zapis po znaku
        											}
        											else if(z==3){
        												rasa1 = new Zabójca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==1){
        												rasa1 = new Wojownik(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==5){
        												rasa1 = new Łowca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        					}
        					else if(z==5){
        						rasa1 = new Łowca(rasa1);
        						Profesja2 profesja2 = new Profesja2();
        						wojownik1 wojownik1 = new wojownik1();
        						mag1 mag1 = new mag1();
        		        		zabójca1 zabójca1 = new zabójca1();
        		        		zbrojmistrz1 zbrojmistrz1 = new zbrojmistrz1();
        		        		p2 = in.nextInt();
        						z = p2;
        											if(z==2){
        											rasa1 = new Mag(rasa1);
        											System.out.println(rasa1.pobierzOpis());
        											String tekst = rasa1.pobierzOpis();
        			        		                plikWy.write(tekst);
        			        		                // zapis po znaku
        											}
        											else if(z==3){
        												rasa1 = new Zabójca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==4){
        												rasa1 = new Zbrojmistrz(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==1){
        												rasa1 = new Wojownik(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        						
        						
        					}else if (z!=1 && z!=2 && z!=3 && z!=4 && z!=5){
        						System.out.println("Wybierz wartość od 1 do 5");
        						
        					}
        					
        					}
        		
        		
        		
        		
        	}
        	else if (p==4){
        		Rasa rasa1 = new Łotrzyk();
        		Profesja1 profesja = new Profesja1();
        		wojownik1 wojownik = new wojownik1();
        		mag1 mag = new mag1();
        		zabójca1 zabójca = new zabójca1();
        		zbrojmistrz1 zbrojmistrz = new zbrojmistrz1();
        		łowca1 łowca = new łowca1();
        		p1 = in.nextInt();
        		z = p1;
        					for(int j=0;j>=0;j--){
        					if (z==1){
        						rasa1 = new Wojownik(rasa1);
        						Profesja2 profesja2 = new Profesja2();
        						mag1 mag1 = new mag1();
        		        		zabójca1 zabójca1 = new zabójca1();
        		        		zbrojmistrz1 zbrojmistrz1 = new zbrojmistrz1();
        		        		łowca1 łowca1 = new łowca1();
        		        		p2 = in.nextInt();
        						z = p2;
        											if(z==2){
        											rasa1 = new Mag(rasa1);
        											System.out.println(rasa1.pobierzOpis());
        											String tekst = rasa1.pobierzOpis();
        			        		                plikWy.write(tekst);
        			        		                // zapis po znaku
        											}
        											else if(z==3){
        												rasa1 = new Zabójca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==4){
        												rasa1 = new Zbrojmistrz(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==5){
        												rasa1 = new Łowca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        						
        					}
        					else if(z==2){
        						rasa1 = new Mag(rasa1);
        						Profesja2 profesja2 = new Profesja2();
        						wojownik1 wojownik1 = new wojownik1();
        		        		zabójca1 zabójca1 = new zabójca1();
        		        		zbrojmistrz1 zbrojmistrz1 = new zbrojmistrz1();
        		        		łowca1 łowca1 = new łowca1();
        		        		p2 = in.nextInt();
        						z = p2;
        											if(z==1){
        											rasa1 = new Wojownik(rasa1);
        											System.out.println(rasa1.pobierzOpis());
        											String tekst = rasa1.pobierzOpis();
        			        		                plikWy.write(tekst);
        			        		                // zapis po znaku
        											}
        											else if(z==3){
        												rasa1 = new Zabójca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==4){
        												rasa1 = new Zbrojmistrz(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==5){
        												rasa1 = new Łowca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        						
        						
        					}
        					else if(z==3){
        						rasa1 = new Zabójca(rasa1);
        						Profesja2 profesja2 = new Profesja2();
        						wojownik1 wojownik1 = new wojownik1();
        						mag1 mag1 = new mag1();
        		        		zbrojmistrz1 zbrojmistrz1 = new zbrojmistrz1();
        		        		łowca1 łowca1 = new łowca1();
        		        		p2 = in.nextInt();
        						z = p2;
        											if(z==2){
        											rasa1 = new Mag(rasa1);
        											System.out.println(rasa1.pobierzOpis());
        											String tekst = rasa1.pobierzOpis();
        			        		                plikWy.write(tekst);
        			        		                // zapis po znaku
        											}
        											else if(z==1){
        												rasa1 = new Wojownik(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==4){
        												rasa1 = new Zbrojmistrz(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==5){
        												rasa1 = new Łowca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        						
        					}
        					else if(z==4){
        						rasa1 = new Zbrojmistrz(rasa1);
        						Profesja2 profesja2 = new Profesja2();
        						wojownik1 wojownik1 = new wojownik1();
        						mag1 mag1 = new mag1();
        		        		zabójca1 zabójca1 = new zabójca1();
        		        		łowca1 łowca1 = new łowca1();
        		        		p2 = in.nextInt();
        						z = p2;
        											if(z==2){
        											rasa1 = new Mag(rasa1);
        											System.out.println(rasa1.pobierzOpis());
        											String tekst = rasa1.pobierzOpis();
        			        		                plikWy.write(tekst);
        			        		                // zapis po znaku
        											}
        											else if(z==3){
        												rasa1 = new Zabójca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==1){
        												rasa1 = new Wojownik(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==5){
        												rasa1 = new Łowca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        					}
        					else if(z==5){
        						rasa1 = new Łowca(rasa1);
        						Profesja2 profesja2 = new Profesja2();
        						wojownik1 wojownik1 = new wojownik1();
        						mag1 mag1 = new mag1();
        		        		zabójca1 zabójca1 = new zabójca1();
        		        		zbrojmistrz1 zbrojmistrz1 = new zbrojmistrz1();
        		        		p2 = in.nextInt();
        						z = p2;
        											if(z==2){
        											rasa1 = new Mag(rasa1);
        											System.out.println(rasa1.pobierzOpis());
        											String tekst = rasa1.pobierzOpis();
        			        		                plikWy.write(tekst);
        			        		                // zapis po znaku
        											}
        											else if(z==3){
        												rasa1 = new Zabójca(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==4){
        												rasa1 = new Zbrojmistrz(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        											else if (z==1){
        												rasa1 = new Wojownik(rasa1);
            											System.out.println(rasa1.pobierzOpis());
            											String tekst = rasa1.pobierzOpis();
            			        		                plikWy.write(tekst);
            			        		                // zapis po znaku
        											}
        						
        						
        					}else if (z!=1 && z!=2 && z!=3 && z!=4 && z!=5){
        						System.out.println("Wybierz wartość od 1 do 5");
        						
        						j++;
        						
        					}
        					
        					}

        	}
        	else if (p!=1 && p!=2 && p!=3 && p!=4){
        		System.out.println("Wybierz liczbę od 1 do 4!");
        	
        		
        	}
        
        } finally {
            if (plikWy != null) {
                plikWy.close();
            }
        }
        	
        	
		

		
		

System.out.println("Postać została zapisana w pliku:  Postać.txt \n");
		
		
	}


	



}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Galgenraten
{
	public static void main(String args[])throws IOException
	{
		Galgenraten aufruf=new Galgenraten(); 
		int laenge;	
		String wort=new String(); 
		wort=aufruf.worteingabe(); 
		laenge=wort.length();
		aufruf.vergleich(laenge,wort); 
	}

	String eingabe() throws IOException
	{ 
		String zeichen=new String(); 

		InputStreamReader eingabe = new InputStreamReader(System.in);
		BufferedReader lese = new BufferedReader(eingabe);
		zeichen = lese.readLine(); 
        
		return zeichen;
	}
  
	String worteingabe() throws IOException
	{
		 System.out.println("Geben Sie bitte ein Wort ein, das geraten werden soll.\n");       
         String wort = this.eingabe(); 
         return wort;
	}
     
	void vergleich(int laenge,String wort)throws IOException
	{     
		int richtig=0, falsch=0, erraten=0,anzahl=0;
		String buchstaben = new String();      
		boolean vergleich_buchstaben = true;
		String wiederholung = new String();           
		Galgenraten aufruf = new Galgenraten();
		StringBuffer worteingabe = new StringBuffer();
		for(int i=0; i<laenge; i++)
        {
			worteingabe.append("?");
        }
        while(richtig!=laenge+1 && falsch!=10)
        {
        	vergleich_buchstaben=true;
        	System.out.println(worteingabe+"\nBitte geben sie einen Buchstaben ein!\n");
        	buchstaben=aufruf.eingabe();
           
        	while((buchstaben.length())==0)
        	{
        		System.out.println("\nBitte geben sie einen Buchstaben ein!\n");
        		buchstaben=aufruf.eingabe();
        	}

        	while((buchstaben.length())>=2)
        	{
        		System.out.println("\nBitte geben sie nur EINEN Buchstaben ein!\n");
        		buchstaben=aufruf.eingabe();
        	}           
           
        	anzahl=wiederholung.length();
        	for(int h=0; h<=anzahl;h++)
        	{
        		if(wiederholung.regionMatches( h, buchstaben, 0, 1 ))
        		{
        			vergleich_buchstaben=false;   
        			System.out.println("\nDiesen Buchstaben haben Sie bereits eingegeben\n");
        		}   
        	}
           
        	if(vergleich_buchstaben==true)
        	{
        		for(int i=0; i<= laenge; i++)
        		{
        			if( wort.regionMatches( i, buchstaben, 0, 1 ))
        			{
        				richtig++;
        				worteingabe.delete(i,i+1);
        				worteingabe.insert(i, buchstaben);
        				System.out.println("Richtig!");                          
        			}
        		}
        		wiederholung=wiederholung+buchstaben;
        	
        		if(richtig==0)
        		{
        			falsch++;
        			
        			if (falsch==0)
        			{
        				System.out.println(" ");
        			}
        		
        			if (falsch==1)
        			{
        				System.out.println("                            ");
        				System.out.println("                            ");
        				System.out.println("                           ");
        				System.out.println("                             ");
        				System.out.println("                            ");
        				System.out.println("                           ");
        				System.out.println("                         ");
        				System.out.println("          / \\               ");
        			}
                   
					if (falsch == 2) {
						System.out.println("                            ");
						System.out.println("                            ");
						System.out.println("                          ");
						System.out.println("                           ");
						System.out.println("           |                ");
						System.out.println("           |                ");
						System.out.println("           |              ");
						System.out.println("          / \\               ");
					}

					if (falsch == 3) {
						System.out.println("           |               ");
						System.out.println("           |                 ");
						System.out.println("           |               ");
						System.out.println("           |                ");
						System.out.println("           |                ");
						System.out.println("           |                ");
						System.out.println("           |              ");
						System.out.println("          / \\               ");
					}

					if (falsch == 4) {
						System.out.println("           |----            ");
						System.out.println("           |                ");
						System.out.println("           |               ");
						System.out.println("           |                ");
						System.out.println("           |                ");
						System.out.println("           |                ");
						System.out.println("           |              ");
						System.out.println("          / \\               ");
					}

					if (falsch == 5) {
						System.out.println("           |--------         ");
						System.out.println("           |                ");
						System.out.println("           |                ");
						System.out.println("           |               ");
						System.out.println("           |                ");
						System.out.println("           |                ");
						System.out.println("           |              ");
						System.out.println("          / \\               ");
					}

					if (falsch == 6) {
						System.out.println("           |--------         ");
						System.out.println("           |       |         ");
						System.out.println("           |                ");
						System.out.println("           |                ");
						System.out.println("           |                ");
						System.out.println("           |                ");
						System.out.println("           |              ");
						System.out.println("          / \\               ");
					}

					if (falsch == 7) {
						System.out.println("           |--------         ");
						System.out.println("           |       |         ");
						System.out.println("           |       O      ");
						System.out.println("           |                ");
						System.out.println("           |                ");
						System.out.println("           |                ");
						System.out.println("           |              ");
						System.out.println("          / \\               ");
					}

					if (falsch == 8) {
						System.out.println("           |--------         ");
						System.out.println("           |       |         ");
						System.out.println("           |       O      ");
						System.out.println("           |      \\|/     ");
						System.out.println("           |                ");
						System.out.println("           |                ");
						System.out.println("           |              ");
						System.out.println("          / \\               ");
					}

					if (falsch == 9) {
						System.out.println("           |--------         ");
						System.out.println("           |       |         ");
						System.out.println("           |       O      ");
						System.out.println("           |      \\|/     ");
						System.out.println("           |       |         ");
						System.out.println("           |                ");
						System.out.println("           |              ");
						System.out.println("          / \\               ");
					}

					if (falsch == 10) {
						System.out.println("           |--------         ");
						System.out.println("           |       |         ");
						System.out.println("           |       O      ");
						System.out.println("           |      \\|/     ");
						System.out.println("           |       |         ");
						System.out.println("           |      / \\        ");
						System.out.println("           |              ");
						System.out.println("          / \\               ");
					}

					System.out.println("Falsch! Sie haben nun " + falsch + "/10 Fehlern!");
        		}
        	
        		richtig=0;
        	}
        	
        	String worteingabe_string=worteingabe.toString();
           
        	if (falsch >= 10) 
			{
				System.out.println("Sie haben leider verloren");
				System.exit(0);
			}

			if (worteingabe_string.equals(wort)) 
			{
				System.out.println("Herzlichen Glückwunsch, Sie haben gewonnen!");
				System.exit(0);
			}
        }
	}
}
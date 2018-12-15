package Java_lexicon_victor.Calculator;

import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	
    	Scanner scan = new Scanner(System.in);
    	
        System.out.println( "Tryck 1 för att börja" );
           
    	
    	
    	int Börja = scan.nextInt();
    	
    	
    	if(Börja == 1)
    	{
    		
    		
    		System.out.println("mata in ditt första nummer");
    		int num1 = scan.nextInt();
    		
    		System.out.println("mata in ditt andra nummer");
    		int num2 = scan.nextInt();
    		
    		
    		System.out.println("Vilken ekvation ska du göra?");
    		System.out.println("skriv: + för att adera dina nummmer");
    		System.out.println("skriv: - för att substrahera dina nummer");
    		System.out.println("skriv: / för att Dividera dina nummer");
    		System.out.println("skriv: * för att multiplicera dina nummer");
    		String ekvation = scan.next();
    		
    		if(ekvation.equals("+")) {	int svar = num1 + num2; System.out.println(num1 + ekvation + num2 + "=" + svar );	}
    		
    		else if (ekvation.equals("*")) {	int svar = num1 * num2; System.out.println(num1 + ekvation + num2 + "=" + svar);	}
    		
    		else if (ekvation.equals("-")) {	int svar = num1 - num2; System.out.println(num1 + ekvation + num2 + "=" + svar);	}
    		
    		else if (ekvation.equals("/")) {	int svar = num1 / num2;	System.out.println(num1 + ekvation + num2 + "=" + svar);    }
    		
    		else
    			
    		{
    			System.out.println("det där kan jag inte göra");
    			return;
    		}
    		
    		System.out.println("om du vill göra en ny Ekvation vänligen starta om programet");
    		
    	}
    	
    	
    }
    
    
    
}

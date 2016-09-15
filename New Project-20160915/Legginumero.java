import java.io.*;

public class Legginumero
{
  public static void main(String[] args)
  {
		
  	InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader tastiera = new BufferedReader(input); 
    
    
    String numeroLetto;
    int eta = 0;
    
    try
    {
    	numeroLetto = tastiera.readLine();
    	//eta = Integer.valueOf(numeroLetto).intValue();
    }
    catch(Exception e)
    {
    	System.out.println("numero non corretto");	
      	return;
    }
    
	System.out.println(numeroLetto);
  
  
  
  }
}

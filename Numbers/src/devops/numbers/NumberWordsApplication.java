package devops.numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class NumberWordsApplication {
int n;
	private final BufferedReader reader ;
	
	public NumberWordsApplication() {
		reader = new BufferedReader( new InputStreamReader( System.in ) ) ;
	}
	
	public void execute() {
		while( true ) {
			try {
				System.out.print( "Enter number (0 to exit): " ) ;
				String value = reader.readLine() ;
				int number = Integer.parseInt( value ) ;
				int ones,ten,hundred,thousand,ones1,ten1;
	
				n=number;
				if(n<20)
					System.out.print(NumberWords.oneToninteen(n));
				else if(n<100)
				{
					ones=n%10;
					n=n/10;
					ten=n%10;
					System.out.print(NumberWords.tens(ten));
					System.out.print(NumberWords.oneToninteen(ones));
					
				}
				else if(n<1000)
				{
					ones=n%10;
					n=n/10;
					ten=n%10;
					n=n/10;
					hundred=n%10;
					
					if(hundred<10)
					{
						System.out.print(NumberWords.oneToninteen(hundred));
						System.out.print("hundred ");
					}
					if(ten!=0)
					{	if(ten==1)
						System.out.println(NumberWords.oneToninteen(ten*10+ones));
						else
							System.out.print(NumberWords.tens(ten));
					}	
					if(ones!=0&&ten!=1)
						System.out.print(NumberWords.oneToninteen(ones));	
				}
				else if (n<100000)
				{

					ones=n%10;
					n=n/10;
					ten=n%10;
					n=n/10;
					hundred=n%10;
					n=n/10;
					if(n<20)
					{
						System.out.print(NumberWords.oneToninteen(n));
						System.out.print("thousand ");
					
					}
					else if(n<100)
					{
						ones1=n%10;
						n=n/10;
						ten1=n%10;
						System.out.print(NumberWords.tens(ten1));
						System.out.print(NumberWords.oneToninteen(ones1));
						System.out.print("thousand ");
						
					}
					if(hundred!=0)
						System.out.print(NumberWords.hundreds(hundred));
					if(ten!=0)
					{	if(ten==1)
						System.out.print(NumberWords.oneToninteen(ten*10+ones));
						else
							System.out.print(NumberWords.tens(ten));
					}	
					if(ones!=0&&ten!=1)
						System.out.print(NumberWords.oneToninteen(ones));	
				}


			} catch ( NumberFormatException | IOException e ) {
				System.out.print( "Invalid number" ) ;
			}
		}
	}

	public static void main(String[] args) {
		new NumberWordsApplication().execute() ;
	}	

}

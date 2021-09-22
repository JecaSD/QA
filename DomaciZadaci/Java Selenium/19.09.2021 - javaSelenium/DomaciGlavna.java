package SeleniumOsnove;

import java.util.Scanner;

public class DomaciGlavna {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);	
		
		Happy p1=new Happy();
		
		Sad s1=new Sad();
		
		int izbor =0;
		
		System.out.println("Unesite jedno od ponudjenog: \n1.Happy\n2.Sad");

		izbor=s.nextInt();
		switch (izbor)  {
		
		case 1:
			p1.happy();
			break;
			
		case 2:
			s1.sad ();
			break;
			
		}		
}		
	}

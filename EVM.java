import java.util.Scanner;

class EVM 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int bjp=0, cng=0, ss=0, aap=0, mns=0, nota=0 ;
		System.out.println();
		System.out.println("              Welcome               ");
		System.out.println();

		System.out.println("Enter Population : ");
		int population = sc.nextInt();
		
		
		for(int i=1; i<=population; i++)
		{
			System.out.println();
			System.out.println("     *** List of Parties ***      ");
			System.out.println("1. BJP");
			System.out.println("2. Congress");
			System.out.println("3. Shiv Sena");
			System.out.println("4. AAP");
			System.out.println("5. MNS");
			System.out.println("6. Nota");
			System.out.println();
			
			int opt = sc.nextInt();

			if (opt>=1 && opt<=6)
			{
				if (opt==1)
				{
					bjp++;
					System.out.println(" voted BJP");
				}
				if (opt==2)
				{
					cng++;
					System.out.println("voted congress");
				}
				if (opt==3)
				{
					ss++;
					System.out.println("voted Shiv Sena");
				}
				if (opt==4)
				{
					aap++;
					System.out.println("voted aap");
				}
				if (opt==5)
				{
					mns++;
					System.out.println("voted MNS Jay Maharashtra");
				}
				if (opt==6)
				{
					nota++;
					System.out.println("good choice");
				}
			//System.out.println( "voted according to list of parties : "+opt);
			//System.out.println(opt);
			}
			if (!(opt>=1 && opt<=6))
			{
				i--;
				System.out.println("Invalid Option");
			}

			if (bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota)
			{
				System.out.println("BJP WON the election");
			}
			if (cng>=bjp && cng>=ss && cng>=aap && cng>=mns && cng>=nota)
			{
				System.out.println("CNG WON the election");
			}
			if (ss>=bjp && ss>=cng && ss>=aap && ss>=mns && ss>=nota)
			{
				System.out.println("SS WON the election");
			}
			if (aap>=bjp && aap>=cng && aap>=ss && aap>=mns && aap>=nota)
			{
				System.out.println("aap WON the election");
			}
			if (mns>=bjp && mns>=cng && mns>=ss && mns>=aap && bjp>=nota)
			{
				System.out.println("mns WON the election");
			}
			if (nota>=bjp && nota>=cng && nota>=ss && nota>=aap && nota>=mns)
			{
				System.out.println("nota WON the election");
			}
		

		}


	}
}

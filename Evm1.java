import java.util.Scanner;

class Evm1 
{
	public static void main(String[] args) 
	{
		int bjp=0, cng=0, ss=0, aap=0, mns=0, nota=0;
		Scanner sc = new Scanner (System.in);
		System.out.println();
		System.out.println("		 WELCOME		");
		System.out.println();
		System.out.println("Enter Population : ");
		int population = sc.nextInt();
		System.out.println();


		for (int i=1; i<=population; i++)
		{
			System.out.println("	*** List of Parties ***		");
			System.out.println("1. BJP");
			System.out.println("2. CNG");
			System.out.println("3. SS");
			System.out.println("4. AAP");
			System.out.println("5. MNS");
			System.out.println("6. NOTA");
			
			System.out.println("Enter the option : ");
			int opt = sc.nextInt();
			if (opt>=1 && opt<=6)
			{
				// increase the count of parties by 1.
				if (opt==1)
				{
					bjp++;
					System.out.println("BJP");
				}
				if (opt==2)
				{
					cng++;
					System.out.println("CNG");
				}
				if (opt==3)
				{
					ss++;
					System.out.println("SS");
				}
				if (opt==4)
				{
					aap++;
					System.out.println("AAP");
				}
				if (opt==5)
				{
					mns++;
					System.out.println("MNS");
				}
				if (opt==6)
				{
					nota++;
					System.out.println("NOTA");
				}
				
			}
			System.out.println();
			// if the enter number is greater than 6 
			if (!(opt>=1 && opt<=6))
			{
				i--;
				System.out.println("Invalid Option");
			} 

			if (bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota)
			{
				System.out.println("Bjp won the game");
			}
			else if (cng>=bjp && cng>=ss && cng>=aap && cng>=mns && cng>=nota)
			{
				System.out.println("Cng won ");
			}
			else if (ss>=bjp && ss>=cng && ss>=aap && ss>=mns && ss>=nota)
			{
				System.out.println("Shiv Sena Balasaheb Thakrey");
			}
			else if (aap>=bjp && aap>=cng && aap>=ss && aap>=mns && aap>=nota)
			{
				System.out.println("aap won");
			}
			else if (mns>=bjp && mns>=cng && mns>=ss && mns>=aap && mns>=nota)
			{
				System.out.println("MNS Won the Maharashtra ");
			}
			else if (nota>=bjp && nota>=cng && nota>=ss && nota>=aap && nota>=mns)
			{
				System.out.println("Nota good");
			}

		}



	}
}

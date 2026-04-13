import java.util.Scanner;
class Spotify
{
	public static void main (String [] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("*** SPOTIFY WELCOMES YOU ***");
		System.out.println("*** SELECT YOUR musicians ***");
		System.out.println("1.A.R.RAHMAN");
		System.out.println("2.ANIRUDH");
		System.out.println("3.HARISH JEYARAJ");
		System.out.println("4.ILLAIYARAJA");
		System.out.println("5.U1");
		int musicians=sc.nextInt();
		if (musicians==1)
		{
			System.out.println("CHOOSE ANY ONE SITUATION");
			System.out.println("1.MELODY");
			System.out.println("2.KUTHU");
			System.out.println("3.MOTIVATIONAL");
			System.out.println("4.SAD");
            int situation=sc.nextInt();			
		if (situation==1)
		{
			System.out.println("CHOOSE ANY ONE MELODY SONGS");
			System.out.print("1.Netru Illadha Matram");
			System.out.print("2.Enna Solla Pogirai");
			System.out.print("3.Ennavale Adi Ennavale");
			System.out.print("4.Unakaga valzha Ninakiran");
			int song=sc.nextInt();
			if (song==1)
			{
				System.out.println("Playing Netru Illadha Matram");
			}
			else if (song==2)
			{
			System.out.println("Playing Enna Solla Pogirai");	
			}
			else if (song==3)
			{
				System.out.println("Playing Ennavale Adi Ennavale");
			}
			else if (song==4)
			{
				System.out.println("Playing Unakaga valzha Ninakiran");
			}
		}
		else if (situation==2)
		{
			System.out.println("CHOOSE ANY ONE KUTHU SONGS");
			System.out.print("1.Alazha Poran Tamilan ");
			System.out.print("2.Mukkala Mukkabila");
			System.out.print("3.Urvashi Urvashi");
			System.out.print("4.Thaiya Thaiya");
			int song=sc.nextInt();
		
		if (song==1)
			{
				System.out.println("Playing Alazha Poran Tamilan");
			}
			else if (song==2)
			{
			System.out.println("Playing Mukkala Mukkabila");	
			}
			else if (song==3)
			{
				System.out.println("Playing Urvashi Urvashi");
			}
			else if (song==4)
			{
				System.out.println("Playing Thaiya Thaiya");
			}
		}
			else if (situation==3)
		{
			System.out.println("CHOOSE ANY ONE MOTIVATIONAL SONGS");
			System.out.print("1.Vande Mataram ");
			System.out.print("2.Oruvan Oruvan mudhalli");
			System.out.print("3.Shakthi kodu");
			System.out.print("4.Kappal Yeari Poyachu");
			int song=sc.nextInt();
		
		if (song==1)
			{
				System.out.println("Playing Vande Mataram");
			}
			else if (song==2)
			{
			System.out.println("Playing Oruvan Oruvan mudhalli");	
			}
			else if (song==3)
			{
				System.out.println("Playing Shakthi kodu");
			}
			else if (song==4)
			{
				System.out.println("Playing Kappal Yeari Poyachu");
			}
		}
			else if (situation==4)
		{
			System.out.println("CHOOSE ANY ONE SAD SONGS");
			System.out.print("1.Poongatrile ");
			System.out.print("2.Marudaani");
			System.out.print("3.Minnalea En vazhvin");
			System.out.print("4.Oru poiyavathu Sol");
			int song=sc.nextInt();
		
		if (song==1)
			{
				System.out.println("Playing Poongatrile");
			}
			else if (song==2)
			{
			System.out.println("Playing Marudaani");	
			}
			else if (song==3)
			{
				System.out.println("Playing Minnalea En vazhvin");
			}
			else if (song==4)
			{
				System.out.println("Playing Oru poiyavathu Sol");
			}
			
		}
		}
		if (musicians==2)
		{
		    System.out.println("CHOOSE ANY ONE FAVORITE SUITIVATION");
			System.out.println("1.MELODY");
			System.out.println("2.KUTHU");
			System.out.println("3.MOTIVATIONAL");
			System.out.println("4.SAD");
            int situation=sc.nextInt();
        if (situation==1)
		{
			System.out.println("CHOOSE ANY ONE MELODY SONGS");
			System.out.print("1.Neeyum Nanum Anbe");
			System.out.print("2.Velicha Poove");                                                     
			System.out.print("3.Po Indru Neeyaga");
			System.out.print("4.Nee partha vizhigal");
			int song=sc.nextInt();
			if (song==1)
			{
				System.out.println("Playing Neeyum Nanum Anbe");
			}
			else if (song==2)
			{
			System.out.println("Playing Velicha Poove");	
			}
			else if (song==3)
			{
				System.out.println("Playing Po Indru Neeyaga");
			}
			else if (song==4)
			{
				System.out.println("Playing Nee partha vizhigal");
			}
		}
		else if (situation==2)
		{
			System.out.println("CHOOSE ANY ONE KUTHU SONGS");
			System.out.print("1.Vaathi Raid ");
			System.out.print("2.Naa Ready");
			System.out.print("3.Badass");
			System.out.print("4.Vandha Edam");
			int song=sc.nextInt();
		
		if (song==1)
			{
				System.out.println("Playing Vaathi Raid");
			}
			else if (song==2)
			{
			System.out.println("Playing Naa Ready");	
			}
			else if (song==3)
			{
				System.out.println("Playing Badass");
			}
			else if (song==4)
			{
				System.out.println("Playing Vandha Edam");
			}
		}
			else if (situation==3)
		{
			System.out.println("CHOOSE ANY ONE MOTIVATIONAL SONGS");
			System.out.print("1.Velai Illa pattathari ");
			System.out.print("2.Boomi Enna Suthudhe");
			System.out.print("3.Ethir Neechal");
			System.out.print("4.Surviva");
			int song=sc.nextInt();
		
		if (song==1)
			{
				System.out.println("Playing Velai Illa pattathari");
			}
			else if (song==2)
			{
			System.out.println("Playing Boomi Enna Suthudhe");	
			}
			else if (song==3)
			{
				System.out.println("Playing Ethir Neechal");
			}
			else if (song==4)
			{
				System.out.println("Playing Surviva");
			}
		}
			else if (situation==4)
		{
			System.out.println("CHOOSE ANY ONE SAD SONGS");
			System.out.print("1.Porkanda Singam");
			System.out.print("2.Kanave Kanave");
			System.out.print("3.Kannaana Kanne");
			System.out.print("4.Jodi Nilave");
			int song=sc.nextInt();
		
		if (song==1)
			{
				System.out.println("Playing Porkanda Singam");
			}
			else if (song==2)
			{
			System.out.println("Playing Kanave Kanave");	
			}
			else if (song==3)
			{
				System.out.println("Playing Kannaana Kanne");
			}
			else if (song==4)
			{
				System.out.println("Playing Jodi Nilave");
			}
		}			
		}
            if (musicians==3)
		{
			System.out.println("CHOOSE ANY ONE FAVORITE SUITIVATION");
			System.out.println("1.MELODY");
			System.out.println("2.KUTHU");
			System.out.println("3.SAD");
            int situation=sc.nextInt();			
		    if (situation==1)
		{
			System.out.println("CHOOSE ANY ONE MELODY SONGS");
			System.out.print("1.Unnale");
			System.out.print("2.Annul Maele");
			System.out.print("3.Yedho Ondru");
			System.out.print("4.Vaseegara");
			int song=sc.nextInt();
			if (song==1)
			{
				System.out.println("Playing Unnale");
			}
			else if (song==2)
			{
			System.out.println("Playing Annul Maele");	
			}
			else if (song==3)
			{
				System.out.println("Playing Yedho Ondru");
			}
			else if (song==4)
			{
				System.out.println("Playing Vaseegara");
			}
		}
		else if (situation==2)
		{
			System.out.println("CHOOSE ANY ONE KUTHU SONGS");
			System.out.print("1.Tirunelveli Halwa Da ");
			System.out.print("2.Soda Bottle");
			System.out.print("3.Aradi katre");
			System.out.print("4.Aruva Meesai");
			int song=sc.nextInt();
		
		if (song==1)
			{
				System.out.println("Playing Tirunelveli Halwa Da");
			}
			else if (song==2)
			{
			System.out.println("Playing Soda Bottle");	
			}
			else if (song==3)
			{
				System.out.println("Playing Aradi katre");
			}
			else if (song==4)
			{
				System.out.println("Playing Aruva Meesai");
			}
		}
			else if (situation==3)
		{
			System.out.println("CHOOSE ANY ONE SAD SONGS");
			System.out.print("1.Venmathiye ");
			System.out.print("2.Oh maname");
			System.out.print("3.Yamma Yamma");
			System.out.print("4.Othayile");
			int song=sc.nextInt();
		
		if (song==1)
			{
				System.out.println("Playing Venmathiye");
			}
			else if (song==2)
			{
			System.out.println("Playing Oh maname");	
			}
			else if (song==3)
			{
				System.out.println("Playing Yamma Yamma");
			}
			else if (song==4)
			{
				System.out.println("Playing Othayile");
			}
		}
		}
            if (musicians==4)
		{
			System.out.println("CHOOSE ANY ONE FAVORITE SUITIVATION");
			System.out.println("1.MELODY");
			System.out.println("2.KUTHU");
			System.out.println("3.SAD");
            int situation=sc.nextInt();			
		    if (situation==1)
		{
			System.out.println("CHOOSE ANY ONE MELODY SONGS");
			System.out.print("1.Oru kili uruguthu");
			System.out.print("2.Kuzhaloodhum kannanukku");
			System.out.print("3.Ennai thottu");
			System.out.print("4.Raja Raja cholan");
			int song=sc.nextInt();
			if (song==1)
			{
				System.out.println("Playing Oru kili uruguthu");
			}
			else if (song==2)
			{
			System.out.println("Playing Kuzhaloodhum kannanukku");	
			}
			else if (song==3)
			{
				System.out.println("Playing Ennai thottu");
			}
			else if (song==4)
			{
				System.out.println("Playing Raja Raja cholan");
			}
			else
			
		}
		else
		else if (situation==2)
		{
			System.out.println("CHOOSE ANY ONE KUTHU SONGS");
			System.out.print("1.Ooruvittu ooruvanthu ");
			System.out.print("2.Nooru varusham");
			System.out.print("3.Aasai Nooruvagai");
			System.out.print("4.Aasai Athigam vachu");
			int song=sc.nextInt();
		
		if (song==1)
			{
				System.out.println("Playing Ooruvittu ooruvanthu");
			}
			else if (song==2)
			{
			System.out.println("Playing Nooru varusham");	
			}
			else if (song==3)
			{
				System.out.println("Playing Aasai Nooruvagai");
			}
			else if (song==4)
			{
				System.out.println("Playing Aasai Athigam vachu");
			}
		}
			else if (situation==3)
		{
			System.out.println("CHOOSE ANY ONE SAD SONGS");
			System.out.print("1.Kanne Kalaimane ");
			System.out.print("2.Thene thenpaandi Neeye");
			System.out.print("3.Paadi Parantha Killi");
			System.out.print("4.Nilave Vaa");
			int song=sc.nextInt();
		
		if (song==1)
			{
				System.out.println("Playing Kanne Kalaimane");
			}
			else if (song==2)
			{
			System.out.println("Playing Thene thenpaandi Neeye");	
			}
			else if (song==3)
			{
				System.out.println("Playing Paadi Parantha Killi");
			}
			else if (song==4)
			{
				System.out.println("Playing Nilave Vaa");
			}
		}
		}
            if (musicians==5)
		{
			System.out.println("CHOOSE ANY ONE FAVORITE SUITIVATION");
			System.out.println("1.MELODY");
			System.out.println("2.KUTHU");
			System.out.println("3.MOTIVATIONAL");
			System.out.println("4.SAD");
            int situation=sc.nextInt();			
		    if (situation==1)
		{
			System.out.println("CHOOSE ANY ONE MELODY SONGS");
			System.out.print("1.Aathadi Manasudhan");
			System.out.print("2.Venmeggam");
			System.out.print("3.Iayyayyo");
			System.out.print("4.Chinna sirisu");
			int song=sc.nextInt();
			if (song==1)
			{
				System.out.println("Playing Aathadi Manasudhan");
			}
			else if (song==2)
			{
			System.out.println("Playing Venmeggam");	
			}
			else if (song==3)
			{
				System.out.println("Playing Iayyayyo");
			}
			else if (song==4)
			{
				System.out.println("Playing Chinna sirisu");
			}
		}
		else if (situation==2)
		{
			System.out.println("CHOOSE ANY ONE KUTHU SONGS");
			System.out.print("1.Machi open the bottle ");
			System.out.print("2.Saroja saman nikalo");
			System.out.print("3.No money no honey");
			System.out.print("4.Villaiyadu mankatha");
			int song=sc.nextInt();
		
		if (song==1)
			{
				System.out.println("Playing Machi open the bottle");
			}
			else if (song==2)
			{
			System.out.println("Playing Saroja saman nikalo");	
			}
			else if (song==3)
			{
				System.out.println("Playing No money no honey");
			}
			else if (song==4)
			{
				System.out.println("Playing Villaiyadu mankatha");
			}
		}
			else if (situation==3)
		{
			System.out.println("CHOOSE ANY ONE MOTIVATIONAL SONGS");
			System.out.print("1.Edhirthu Nill ");
			System.out.print("2.Oru nalil");
			System.out.print("3.Nimirnthu NIL");
			System.out.print("4.Ungakkule Mirugam");
			int song=sc.nextInt();
		
		if (song==1)
			{
				System.out.println("Playing Edhirthu Nill");
			}
			else if (song==2)
			{
			System.out.println("Playing Oru nalil");	
			}
			else if (song==3)
			{
				System.out.println("Playing Nimirnthu NIL");
			}
			else if (song==4)
			{
				System.out.println("Playing Ungakkule Mirugam");
			}
		}
			else if (situation==4)
		{
			System.out.println("CHOOSE ANY ONE SAD SONGS");
			System.out.print("1.Kadhal valarthen ");
			System.out.print("2.Yedho ondru ennai");
			System.out.print("3.Pogadhe");
			System.out.print("4.Ninaithu ninaithu");
			int song=sc.nextInt();
		
		if (song==1)
			{
				System.out.println("Playing Kadhal valarthen");
			}
			else if (song==2)
			{
			System.out.println("Playing Yedho ondru ennai");	
			}
			else if (song==3)
			{
				System.out.println("Playing Pogadhe");
			}
			else if (song==4)
			{
				System.out.println("Playing Ninaithu ninaithu");
			}
			
		}
		}	
	}
}
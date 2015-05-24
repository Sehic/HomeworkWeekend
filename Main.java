

public class Main {

	public static void main(String[] args) {
		//Zadatak 1. 
		//Sadrži tri cijela broja.
		//Ispisuje da li je moguæe konstruisati troguao sa vrijednostima tih brojeva.
		
		int num1 = 1, num2 = 3, num3 = 3;
		if(num1!=0 && num2!=0 & num3!=0){
		if(num1==num2 || num1==num3 || num2==num3){
			System.out.println("Moguæe je konstruisati trougao.\n");
		}
		else{
			System.out.println("Nije moguæe konstruisati trougao.\n");
		}
		}
		else{
			System.out.println("Nije moguæe konstruisati trougao.\n");
		}
		
		
		//Zadatak 2.
		//Sadrži varijablu num.
		//Ispisuje da li se ta varijabla nalazi izmeðu 5 i 7.5, izmeðu 7.5 i 10 ili je van opsega.
		
		double num = 5.4;
		if(num>5 && num<7.5){
			System.out.println("Varijabla se nalazi izmeðu 5 i 7.5\n");
		}
		else if(num>7.5 && num<10){
			System.out.println("Varijabla se nalazi izmeðu 7.5 i 10\n");
		}
		else{
			System.out.println("Varijabla je van opsega\n");
		}
		
		//Zadatak 3.
		//Sadrži šest varijabli koje predstavljaju dva datuma.
		//Ispisuje koji datum doðe prije drugog.
		
		int dan1 = 1, mjesec1 = 3, godina1 = 2015, dan2 = 2, mjesec2 = 2, godina2 = 2015;
		if(godina1<godina2){
			System.out.printf("Datum: Dan: %d, Mjesec: %d, Godina: %d \n \n", dan1, mjesec1, godina1);
		}
		else if(godina1>godina2){
			System.out.printf("Datum: Dan: %d, Mjesec: %d, Godina: %d \n \n", dan2, mjesec2, godina2);
		}
		else if(mjesec1<mjesec2){
			System.out.printf("Datum: Dan: %d, Mjesec: %d, Godina: %d \n \n", dan1, mjesec1, godina1);
		}
		else if(mjesec1>mjesec2){
			System.out.printf("Datum: Dan: %d, Mjesec: %d, Godina: %d \n \n", dan2, mjesec2, godina2);
		}
		else if(dan1<dan2){
			System.out.printf("Datum: Dan: %d, Mjesec: %d, Godina: %d \n \n", dan1, mjesec1, godina1);
		}
		else {
			System.out.printf("Datum: Dan: %d, Mjesec: %d, Godina: %d \n \n", dan2, mjesec2, godina2);
		}
		
		//Zadatak 4.
		//Za dati datum odreðuje horoskopski znak.
		
		int dan = 30, mjesec = 3;
		if (mjesec == 3 && dan >=21){
			System.out.println("Ovan \n");
		}
		else if (dan < 21){
			System.out.println("Riba \n");
		}
		else if (mjesec == 4 && dan >=20){
			System.out.println("Ovan \n");
		}
		else if (dan <= 21){
			System.out.println("Bik \n");
		}
		else if (mjesec == 5 && dan >=20){
			System.out.println("Bik \n");
		}
		else if (dan <= 21){
			System.out.println("Blizanac \n");
		} 
		else if (mjesec == 6 && dan >=20){
			System.out.println("Blizanac \n");
		}
		else if (dan <= 21){
			System.out.println("Rak \n");
		}
		else if (mjesec == 7 && dan >=20){
			System.out.println("Rak \n");
		}
		else if (dan <= 21){
			System.out.println("Lav \n");
		}
		else if (mjesec == 8 && dan >=20){
			System.out.println("Lav \n");
		}
		else if (dan <= 21){
			System.out.println("Djevica \n");
		}
		else if (mjesec == 9 && dan >=20){
			System.out.println("Djevica \n");
		}
		else if (dan <= 21){
			System.out.println("Vaga \n");
		}
		else if (mjesec == 10 && dan >=20){
			System.out.println("Vaga \n");
		}
		else if (dan <= 21){
			System.out.println("Škorpion \n");
		}
		else if (mjesec == 11 && dan >=20){
			System.out.println("Škorpion \n");
		}
		else if (dan <= 21){
			System.out.println("Strelac \n");
		}
		else if (mjesec == 12 && dan >=20){
			System.out.println("Strelac \n");
		}
		else if (dan <= 21){
			System.out.println("Jarac \n");
		}
		else if (mjesec == 1 && dan >=20){
			System.out.println("Jarac \n");
		}
		else if (dan <= 21){
			System.out.println("Vodolija \n");
		}
		else if (mjesec == 2 && dan >=20){
			System.out.println("Vodolija \n");
		}
		else if (dan <= 21){
			System.out.println("Riba \n");
		}
		
		//Zadatak 5.
		//Sadrži 4 varijable.
		//Ispisuje ih od najmanje ka najveæoj.
		
		int var1 = 5, var2 = 85, var3 = 11, var4 = 4;
		int prvi = 0, drugi = 0, treci = 0, cetvrti = 0;
		if(var1 < var2 && var1 < var3 && var1 < var4){
			prvi=var1;
			if(var2 < var3 && var2 < var4){
				drugi=var2;
				if(var3<var4){
					treci=var3;
					cetvrti=var4;
				}
				else{
					treci=var4;
					cetvrti=var3;
				}
			}
			else if(var3 < var2 && var3 < var4){
				drugi=var3;
				if(var2<var4){
					treci=var2;
					cetvrti=var4;
				}
				else{
					treci=var4;
					cetvrti=var2;
				}
			}
			else{
				drugi=var4;
				if(var2<var3){
					treci=var2;
					cetvrti=var3;
				}
				else{
					treci=var3;
					cetvrti=var2;
				}
			}
		}
		else if(var2 < var1 && var2 < var3 && var2 < var4){
			prvi=var2;
			if(var1 < var3 && var1 < var4){
				drugi=var1;
				if(var3<var4){
					treci=var3;
					cetvrti=var4;
				}
				else{
					treci=var4;
					cetvrti=var3;
				}
			}
			else if(var3 < var1 && var3 < var4){
				drugi=var3;
				if(var1<var4){
					treci=var1;
					cetvrti=var4;
				}
				else{
					treci=var4;
					cetvrti=var1;
				}
			}
			else{
				drugi=var4;
				if(var1<var3){
					treci=var1;
					cetvrti=var3;
				}
				else{
					treci=var3;
					cetvrti=var1;
				}
			}
		}
		else if(var3 < var2 && var3 < var1 && var3 < var4){
			prvi=var3;
			if(var1 < var2 && var1< var4){
				drugi=var1;
				if(var2<var4){
					treci=var2;
					cetvrti=var4;
				}
				else{
					treci=var4;
					cetvrti=var2;
				}
			}
			else if(var2 < var1 && var2 < var4){
				drugi=var2;
				if(var1<var4){
					treci=var1;
					cetvrti=var4;
				}
				else{
					treci=var4;
					cetvrti=var1;
				}
			}
			else{
				drugi=var4;
				if(var1<var2){
					treci=var1;
					cetvrti=var2;
				}
				else{
					treci=var2;
					cetvrti=var1;
				}
			}
		}
		else {
			prvi=var4;
			if(var1 < var2 && var1 < var3){
				drugi=var1;
				if(var2<var3){
					treci=var2;
					cetvrti=var3;
				}
				else{
					treci=var3;
					cetvrti=var2;
				}
			}
			else if(var2 < var1 && var2 < var3){
				drugi=var2;
				if(var1<var3){
					treci=var1;
					cetvrti=var3;
				}
				else{
					treci=var3;
					cetvrti=var1;
				}
			}
			else{
				drugi=var3;
				if(var1<var2){
					treci=var1;
					cetvrti=var2;
				}
				else{
					treci=var2;
					cetvrti=var1;
				}
			}
		}
		System.out.println(prvi + " " + drugi + " " + treci + " " + cetvrti + "\n");
		
		//Zadatak 6.
		//Sadrži dvije varijable koje prikazuju sat u formatu 24:00h.
		//Ispisuje u formatu PM/AM.
		
		int sati = 23, minute = 17, Nsat = 0;
		if(sati >= 0 && sati <=11){
			System.out.println(sati + ":" + minute + " AM \n");
		}
		else if(sati==12){
			System.out.println(sati + ":" + minute + " PM \n");
		}
		else{
			Nsat = sati - 12;
			System.out.println(Nsat + ":" + minute + " PM \n");
		}
		
		//Zadatak 7.
		//Sadrži èetverocifrenu varijablu.
		//Ispisuje sumu tih èetiri cifre.
		
		/*int varijabla = 7777, suma = 0, brojac = 0;
		do{
			suma+=varijabla%10;
			varijabla/=10;
			brojac++;
		}while (brojac<4);
		System.out.printf("Suma cifri je: %d \n \n", suma);*/
		
		//ili na drugi nacin:
		
		int varijabla = 7777, suma = 0;
		suma+=varijabla%10;
		varijabla/=10;
		suma+=varijabla%10;
		varijabla/=10;
		suma+=varijabla%10;
		varijabla/=10;
		suma+=varijabla%10;
		varijabla/=10;
		System.out.printf("Suma cifri je: %d \n \n", suma);
		
		//Zadatak 8.
		//Za tri varijable x,y,z odreðuje udaljenost u 3D prostoru
		
		double x1 = 0, y1 = 0, z1 = 0, x2 = 33, y2 = 55, z2 = 77, D = 0;
		D = Math.sqrt( (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)+(z2-z1)*(z2-z1) ) ;
		System.out.printf("Udaljenost je: %.3f \n \n", D);
		
		//Zadatak 9
		//Sadrži trocifrenu varijablu
		//Provjerava da li je broj djeljiv sa zbirom svojih cifara
		
		int nBroj = 100, sumaCifara = 0;
		int pomBroj = nBroj;
		sumaCifara+=nBroj%10;
		nBroj/=10;
		sumaCifara+=nBroj%10;
		nBroj/=10;
		sumaCifara+=nBroj%10;
		nBroj/=10;
		if(pomBroj%sumaCifara == 0){
			System.out.println("Broj je djeljiv. \n");
		}
		else
			System.out.println("Broj nije djeljiv. \n");
		
		//Zadatak 10.
		//Sadrži pet varijabli i potencijalno rješenje jednaèine.
		//Odreðuje da li je dati broj jedan od rješenja date kubne jednaèine oblika 
		//ax^3 + bx^2 + cx + d = 0
		
		int a = 1, b = 2, c = 3, d = 4, x = 5;
		if(a*x*x*x+b*x*x+c*x+d==0){
			System.out.println("Dati broj je rješenje, \n");
		}
		else
			System.out.println("Dati broj nije rješenje. \n");
		
		//Zadatak 11.
		//Sadrži varijable koje odreðuju u koliko sati avion uzlijeæe i
		//koliko mu je minuta potrebno za let.
		//Program odreðuje vrijeme slijetanja aviona.
		
		int satOdlaska = 1, minuteOdlaska = 10, minuteTrajanja = 120, satDolaska = 0, minuteDolaska = 0;
		int pomocna = 0;
		pomocna = minuteTrajanja+minuteOdlaska;
		if(pomocna > 60){
			minuteDolaska=pomocna;
			pomocna/=60;
			pomocna*=60;
			minuteDolaska-=pomocna;
			pomocna/=60;
			satDolaska=satOdlaska+pomocna;
			System.out.printf("Vrijeme dolaska aviona je u %d : %d  h \n \n", satDolaska, minuteDolaska);
		}
		else{
			System.out.printf("Vrijeme dolaska aviona je u %d : %d  h \n \n", satDolaska, pomocna);
		}
		
		//Zadatak 12.
		//Sadrži varijablu koja oznaèava polupreènik lopte.
		//Program odreðuje da li je lopta "dobrog kvaliteta".
		//Formula za izracunavanje volumena lopte je V=4/3*r^3*pi	
		//Tesko naci po zadatom volumenu savrsenu loptu
		
		double poluPrecnik = 1.13;
		double V = 0;
		V = (4/3)*poluPrecnik*poluPrecnik*poluPrecnik* Math.PI;
		if (V <= 6.017007 && V >= 6.010993){
			System.out.println("Lopta je dobra");
		}
		else{
			System.out.println("Lopta nije dobra");
		}
		
		}
	}


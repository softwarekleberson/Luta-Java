package luta;

public class Principal {
	public static void main(String[] args) {
		
		Lutador l[] = new Lutador[6];
		
		l[0] = new Lutador("Prety Boy", "França", 31, 1.75, 0, 0, 0, 68.9);
		l[1] = new Lutador("Putscript", "Brasil", 32, 1.70, 0, 0, 0, 57.9);
		l[2] = new Lutador("Snapshadow", "EUA", 35, 1.77, 0, 0, 0, 80.9);
		l[3] = new Lutador("Dead Code", "Australia", 28, 1.93, 0, 0, 0, 81.6);
		l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70, 0, 0, 0, 119.3);
		l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81, 0, 0, 0, 105.7);
		
		
		
		Porrada ufcToquio = new Porrada();
		ufcToquio.marcarLuta(l[0], l[1]);
		ufcToquio.luta();
		
		Porrada ufcRio = new Porrada();
		ufcRio.marcarLuta(l[2], l[3]);
		ufcRio.luta();
		
		Porrada ufcBerlin = new Porrada();
		ufcBerlin.marcarLuta(l[0], l[1]);
		ufcBerlin.luta();
		
		Porrada ufcSao = new Porrada();
		ufcToquio.marcarLuta(l[0], l[1]);
		ufcToquio.luta();
		
		Porrada ufcMiame = new Porrada();
		ufcRio.marcarLuta(l[2], l[3]);
		ufcRio.luta();
		
		Porrada ufcLondres = new Porrada();
		ufcBerlin.marcarLuta(l[0], l[1]);
		ufcBerlin.luta();
		
		
		l[0].status();
		System.out.println(" * * * * * ");
		l[1].status();
		System.out.println(" * * *  * *");
		l[2].status();
		System.out.println(" * * * * *  *");
		l[3].status();
		
		
		
			}
}

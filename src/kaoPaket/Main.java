package kaoPaket;

import java.util.*;

public class Main {

	public static void main(String[] args)
	{
		Sabiranje sab = new Sabiranje(3, 8);
		
		//int zbir = sab.izvrsiOperaciju();
		
		//System.out.println("Zbir je: " + zbir);
		
		Oduzimanje od = new Oduzimanje(3, 8);
		
		//int razlika = od.izvrsiOperaciju();
		
		//System.out.println("Razlika je: " + razlika);
		
		Vector<Sabiranje> sabV = new Vector<Sabiranje>();
		Vector<Oduzimanje> oduV = new Vector<Oduzimanje>();
		
		Vector<Object> vektorObjekti = new Vector<Object>();
		Vector<MatematickeOperacije> vektorMatOp = new Vector<MatematickeOperacije>();
		
		vektorObjekti.add(sab);
		vektorObjekti.add(od);
		
		sabV.add(sab);
		oduV.add(od);
		
		vektorMatOp.add(sab);
		vektorMatOp.add(od);
		
		sab = new Sabiranje(5, 5);
		od = new Oduzimanje(5, 5);
		
		vektorObjekti.add(sab);
		vektorObjekti.add(od);
		
		sabV.add(sab);
		oduV.add(od);
		
		vektorMatOp.add(sab);
		vektorMatOp.add(od);
		
		/*for (Sabiranje s: sabV)
		{
			System.out.println("Zbir je: " + s.izvrsiOperaciju());
		}
		
		for (Oduzimanje o: oduV)
		{
			System.out.println("Razlika je: " + o.izvrsiOperaciju());
		}
		
		for (Object o: vektorObjekti)
		{
			if (o.getClass().toString().equals("class kaoPaket.Sabiranje"))
			{
				System.out.println("Zbir je: " + ((Sabiranje)o).izvrsiOperaciju());
			} else if (o.getClass().toString().equals("class kaoPaket.Oduzimanje"))
			{
				System.out.println("Razlika je: " + ((Oduzimanje)o).izvrsiOperaciju());
			}
		}*/
		
		Mnozenje mnoz = new Mnozenje(2, 5);
		vektorMatOp.add(mnoz);
		mnoz = new Mnozenje(10,2);
		vektorMatOp.add(mnoz);
		
		for (MatematickeOperacije matOp: vektorMatOp)
		{
			System.out.println("Rezultat operacije je: " + matOp.izvrsiOperaciju());
		}
	}

}

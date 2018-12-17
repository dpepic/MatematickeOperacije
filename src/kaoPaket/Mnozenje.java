package kaoPaket;

public class Mnozenje extends MatematickeOperacije
{
	public Mnozenje(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public int izvrsiOperaciju()
	{
		return x*y;
	}
}

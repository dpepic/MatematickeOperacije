package kaoPaket;

public class Oduzimanje extends MatematickeOperacije
{
	public Oduzimanje(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	@Override
	public int izvrsiOperaciju()
	{
		return x-y;
	}
}

package kaoPaket;

public class Sabiranje extends MatematickeOperacije
{
	
	public Sabiranje(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public int izvrsiOperaciju()
	{
		return x + y;
	}
}


public class DamMove extends Move
	{
	private int dam;
	public DamMove(String n, int d)
		{
		super(n);
		}
	public int getDam()
		{
		return dam;
		}
	public void setDam(int dam)
		{
		this.dam = dam;
		}
	}

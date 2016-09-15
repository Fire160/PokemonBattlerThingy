
public class Move
	{
	private String moveNam;
	private int type;
	public Move(String n,int m)
		{
		moveNam = n;
		type = m;
		}
	public void executeMove(String pokNam)
		{
		System.out.println(pokNam + " used " + moveNam);
		}
	public String getMoveNam()
		{
		return moveNam;
		}
	public void setMoveNam(String moveNam)
		{
		this.moveNam = moveNam;
		}
	public int getType()
		{
		return type;
		}
	public void setType(int type)
		{
		this.type = type;
		}
	}

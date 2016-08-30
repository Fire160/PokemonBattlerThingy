
public class Move
	{
	private String moveNam;
	public Move(String n)
		{
		moveNam = n;
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
	}

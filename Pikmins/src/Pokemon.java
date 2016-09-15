import java.util.ArrayList;

public class Pokemon
	{
	private int level,baseHP,baseAtk,baseDef,baseSpAtk,baseSpDef,type1,type2;
	private String name;
	private Move[] moves;
	public Pokemon(String name,int lvl,int HP,int Atk,int Def,int SpAtk,int SpDef,int tp1,int tp2)
		{
		Move moves[] = new Move[4];
		level = lvl;
		baseHP = HP;
		baseAtk = Atk;
		baseDef = Def;
		baseSpAtk = SpAtk;
		baseSpDef = SpDef;
		type1 = tp1;
		type2 = tp2;
		}
	public void createMoves(String move1, int mt1 ,String move2,int mt2 ,String move3,int mt3 ,String move4, int mt4)
		{
		moves[0] = new Move(move1,mt1);
		moves[1] = new Move(move2,mt2);
		moves[2] = new Move(move3,mt3);
		moves[3] = new Move(move4,mt4);
		}
	public int getLevel()
		{
		return level;
		}
	public void setLevel(int level)
		{
		this.level = level;
		}
	public String getName()
		{
		return name;
		}
	public void setName(String name)
		{
		this.name = name;
		}
	public int getBaseHP()
		{
		return baseHP;
		}
	public void setBaseHP(int baseHP)
		{
		this.baseHP = baseHP;
		}
	public int getBaseAtk()
		{
			return baseAtk;
		}
	public void setBaseAtk(int baseAtk)
		{
			this.baseAtk = baseAtk;
		}
	public int getBaseDef()
		{
			return baseDef;
		}
	public void setBaseDef(int baseDef)
		{
			this.baseDef = baseDef;
		}
	public int getBaseSpAtk()
		{
			return baseSpAtk;
		}
	public void setBaseSpAtk(int baseSpAtk)
		{
			this.baseSpAtk = baseSpAtk;
		}
	public int getBaseSpDef()
		{
			return baseSpDef;
		}
	public void setBaseSpDef(int baseSpDef)
		{
			this.baseSpDef = baseSpDef;
		}
	public int getType1()
		{
			return type1;
		}
	public void setType1(int type1)
		{
			this.type1 = type1;
		}
	public int getType2()
		{
			return type2;
		}
	public void setType2(int type2)
		{
			this.type2 = type2;
		}

	}
//type num ref
//0 water
//1 fire
//2 rock
//3 ground
//4 flying
//5 electric
//6 
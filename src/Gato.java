
public class Gato {
	public char tablero[][];
	public char turno;
	public int marcador[];
	//TODO Falta terminar la validacion de los casos de que alguien gane!
	public boolean ganoAlguien()
	{
		for(int i = 0;i<3;i++)
		{
			
		}
		return false;
	}
	
	public boolean setToken(int i,int j)
	{
		boolean ret = true;
			if(ret = isEmpty(i,j))
			{
				tablero[i][j] = turno;
			}
		return ret;
	}
	private char cambiaTurno(char turno)
	{
		if (turno == 'x')
			return 'o';
		else
			return 'x';
	}
	boolean isEmpty(int i,int j)
	{
		return tablero[i][j] == '-';
	}
	
	public Gato()
	{
		tablero = new char[3][3];
		for (int i = 0;i<3;i++)
		{
			for (int j = 0; j<3;j++)
			{
				tablero[i][j] = '-';
			}
		}
		turno = 0;
		marcador = new int[2];
		marcador[0] = 0;
		marcador[1] = 0;
	}
	public String toString()
	{
		String ret = "";
		for (int i = 0;i<3;i++)
		{
			for (int j = 0; j<3;j++)
			{
				ret +=""+tablero[i][j];
			}
			ret+="\n";
		}
		return ret;
	}
}

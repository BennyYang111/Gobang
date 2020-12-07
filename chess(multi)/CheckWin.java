public class CheckWin extends Main
{
	public void check(int[][] win, int X, int Y)
	{
		int chess = win[X][Y];
		int line = 0;
		int end = 0;
		
		//�����ˬd
		if (end == 0)
		{
			for (int i = -4; i <= 4; i++)
			{
				int checkX = X + i;
				if (checkX >= 0 && checkX <= 14)
				{
					if (win[checkX][Y] == chess)
					{
						line++;
						if (line >= 5)
						{
							Main.winner = 1;
							end = 1;
						}
					}
					else
					{
						line = 0;
					}
				}
			}
			line = 0;
		}
		
		//�����ˬd
		if (end == 0)
		{
			for (int i = -4; i <= 4; i++)
			{
				int checkY = Y + i;
				if (checkY >= 0 && checkY <= 14)
				{
					if (win[X][checkY] == chess)
					{
						line++;
						if (line >= 5)
						{
							Main.winner = 1;
							end = 1;
						}
					}
					else
					{
						line = 0;
					}
				}
			}
			line = 0;
		}
		
		//���U�ץk�W�ˬd
		if (end == 0)
		{
			for (int i = -4; i <= 4; i++)
			{
				int checkX = X - i;
				int checkY = Y + i;
				if ((checkY >= 0 && checkY <= 14) && (checkX >= 0 && checkX <= 14))
				{
					if (win[checkX][checkY] == chess)
					{
						line++;
						if (line >= 5)
						{
							Main.winner = 1;
							end = 1;
						}
					}
					else
					{
						line = 0;
					}
				}
			}
			line = 0;
		}
		
		//���W�ץk�U�ˬd
		if (end == 0)
		{
			for (int i = -4; i <= 4; i++)
			{
				int checkX = X + i;
				int checkY = Y + i;
				if ((checkY >= 0 && checkY <= 14) && (checkX >= 0 && checkX <= 14))
				{
					if (win[checkX][checkY] == chess)
					{
						line++;
						if (line >= 5)
						{
							Main.winner = 1;
							end = 1;
						}
					}
					else
					{
						line = 0;
					}
				}
			}
			line = 0;
		}
		
		if (end == 0)
		{
			Main.winner = 0;
		}
	}
}

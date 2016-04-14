package ajedrez;

import java.util.Scanner;

public class Ajedrez
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Número de filas: ");
		int filas = sc.nextInt();
		System.out.print("Número de columnas: ");
		int col = sc.nextInt();
		int[][] rectangulo = new int[filas][col];
		int valor;
		do
		{
			System.out.print("Valor inicial(0/1): ");
			valor = sc.nextInt();
			switch(valor)
			{
				case 0:
					for(int i = 0; i < col; i++)
					{
						for(int j = 0; j < filas; j++)
						{
							rectangulo[j][i] = valor;
							if(j % 2 == 0)
							{
								if(i % 2 == 0)
								{
									valor++;
								}
								else
								{
									valor--;
								}
							}
							else
							{
								if(i % 2 == 0)
								{
									valor--;
								}
								else
								{
									valor++;
								}
							}
						}
					}
				break;
				case 1:
					for(int i = 0; i < col; i++)
					{
						for(int j = 0; j < filas; j++)
						{
							rectangulo[j][i] = valor;
							if(j % 2 == 0)
							{
								if(i % 2 == 0)
								{
									valor--;
								}
								else
								{
									valor++;
								}
							}
							else
							{
								if(i % 2 == 0)
								{
									valor++;
								}
								else
								{
									valor--;
								}
							}
						}
					}
				break;
				default:
					System.out.println("Opción incorrecta.");
				break;
			}
		}
		while(valor < 0 || valor > 1);
		sc.close();
		for(int i = 0; i < filas; i++)
		{
			for(int j = 0; j < col; j++)
			{
				System.out.print(rectangulo[i][j] + "\t");
			}
			System.out.println();
		}
	}
}


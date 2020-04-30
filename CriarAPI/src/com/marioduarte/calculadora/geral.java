package com.marioduarte.calculadora;

public class geral 
{
	public static int soma(int x, int y)
	{
		return calculadoraAPI.soma(x, y);
	}
	public static int subtracao(int x, int y)
	{
		return calculadoraAPI.subtracao(x, y);
	}
	//Deixou de ser utilizada
	public static int inversaoDaSoma(int x,int y)
	{
		return calculadoraAPI.subtracao(x, y);
	}
	public static int multiplicacao(int x, int y)
	{
		return calculadoraAPI.multiplicacao(x, y);
	}
	public static double divisao(double x, double y)
	{
		return calculadoraAPI.divisao(x, y);
	}
}

package com.marioduarte.calculadora;
/**
 * <h1> Calculator </h1>
 * This class uttilizes the calculator API (caulculadoraAPI) to perform basic arithmetic
 * those being sum, subtraction, multiplication and division.
 * 
 * Example code:
 * 
 * {@code
 * double calculadoraAPI.multiplicacao = multiplicacao(3,3) // result: 9
 * }
 * 
 * 
 * @author Ricardo Duarte
 * @version 1.0
 * @since 30-04-2020
 *
 */
public class geral 
{
	/**
	 * 
	 * @param x int parameter that's used as the first value for the 4 operations
	 * @param y int parameter that's used as the second value for the 4 operations
	 * @return calculadoraAPI.function(x,y) (soma, subtracao, multiplicacao, divisao) the result of any of the operations
	 */
	
	public static int soma(int x, int y)
	{
		//Calling calculadoraAPI.soma with the parameters x and y and returning the value received
		return calculadoraAPI.soma(x, y);
	}
	public static int subtracao(int x, int y)
	{
		return calculadoraAPI.subtracao(x, y);
	}
	/**
	 * Unused as it returns the same value as subtracao#
	 * 
	 * @param x int used as first value for subtraction
	 * @param y int used as second value for subtraction
	 * @return calculadoraAPI.subtracao, result of subtracting x and y
	 * 
	 * @deprecated
	 * 
	 * @since 1.0
	 */
	
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
		//Unlike the 3 other functions, divisao returns a Double as divisions can return non ints
		//Example: (int) 3 / (int) 2 = (double) 1.5
		return calculadoraAPI.divisao(x, y);
	}
}

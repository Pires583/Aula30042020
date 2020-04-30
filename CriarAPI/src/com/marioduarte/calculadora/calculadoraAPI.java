package com.marioduarte.calculadora;

/**
 * <b><i>Calculadora</i></b></br></br>
 * 
 * A API <strong>calculadoraAPI</strong> oferece um conjunto de funções
 * que permitem obter o resultado das funções aritméticas base.</br></br>
 * 
 * Exemplo de utilização:
 * <pre>
 * {@code
 * 	int resultadoSubtracao = calculadoraAPI.soma(5,2) // resultado: 7
 * }
 * </pre>
 * 
 * @author Mário Duarte
 * @version 1.1
 * @since 30/04/2020
 * 
 * @see #soma(int, int)
 * @see #subtracao(int, int)
 * @see #multiplicacao(int, int)
 * @see #divisao(double, double)
 */
public class calculadoraAPI 
{
	public static int soma(int x, int y)
	{
		return tools.soma(x, y);
	}
	public static int subtracao(int x, int y)
	{
		return tools.subtracao(x, y);
	}
	public static int multiplicacao(int x, int y)
	{
		return tools.multiplicacao(x, y);
	}
	/**
	 * Função que devolve o valor da divisão de dois parâmetros
	 * 
	 * @param x (double) parâmetro da divisão
	 * @param y (double) parâmetro da divisão
	 * @return (double) resultado da divisão
	 * 
	 * </br></br>
	 * 
	 * {@link tools#divisao(double x, double y)}
	 */
	public static double divisao(double x, double y)
	{
		/**
		 * Devolve o valor da divisão de x por y
		 */
		return tools.divisao(x, y);
	}
}

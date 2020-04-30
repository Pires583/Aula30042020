package com.teixeira.calculadora;

/**
 * <b><i>Calculadora</i></b>
 * 
 * A API <strong>CalcoladoraAPI</strong> ofereçe um conjunto de funções
 * que permitem obter o resultado das funções aritméticas base.
 * 
 * Exemplo de utilização:
 * <pre>
 * {@code
 * int resultadoSubtracao = CalculadoraAPI.soma(5,2) // resultado = 7
 * int resultadoSubtracao = CalculadoraAPI.subtracao(5,2) // resultado = 3
 * int resultadoSubtracao = CalculadoraAPI.multiplicacao(5,2) // resultado = 10
 * double resultadoSubtracao = CalculadoraAPI.divisao(5,2) // resultado = 2.5
 * }
 * </pre>
 * @author biaoj
 * @version 1.1
 * @since 30/04/2020
 * 
 * @see #soma(int, int)
 * @see #subtracao(int, int)
 * @see #multiplicacao(int, int)
 * @see #divisao(double, double)
 *
 */

public class geral {
	/**
	 * Função que devolve o valor da soma de dois parametros
	 * @param x (int) parametro da soma
	 * @param y (int) parametro da soma
	 * @return (int) parametro da soma
	 * 
	 * {@link tools#soma(int x, int y)}
	 */
	public static int soma(int x, int y)
	{
		/**
		 * Devolve o valor da soma 
		 */
		return CalculadoraAPI.soma(x, y);
	}
	/**
	 * Função que devolve o valor da subtracao de dois parametros
	 * @param x (int) parametro da subtracao
	 * @param y (int) parametro da subtracao
	 * @return (int) parametro da subtracao
	 * 
	 * {@link tools#subtracao(int x, int y)}
	 */
	public static int subtracao(int x, int y)
	{
		/**
		 * Devolve o valor da subtração
		 */
		return CalculadoraAPI.subtracao(x, y);
	}
	/**
	 * Função que devolve o valor da multiplicação de dois parametros
	 * @param x (int) parametro da multiplicação
	 * @param y (int) parametro da multiplicação
	 * @return (int) parametro da multiplicação
	 * 
	 * {@link tools#multiplicacao(int x, int y)}
	 */
	public static int multiplicacao(int x, int y)
	{
		/**
		 * Devolve o valor da multiplicação
		 */
		return CalculadoraAPI.multiplicacao(x, y);
	}
	/**
	 * Função que devolve o valor da divisõa de dois parametros
	 * @param x (double) parametro da divisão
	 * @param y (double) parametro da divisão
	 * @return (double) parametro da divisão
	 * 
	 * {@link tools#divisao(double, double)}
	 */
	public static double divisao(double x, double y)
	{
		/**
		 * Devolve o valor da divisão
		 */
		return CalculadoraAPI.divisao(x, y);
	}
}

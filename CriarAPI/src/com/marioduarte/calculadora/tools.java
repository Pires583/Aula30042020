package com.marioduarte.calculadora;
/**
 * A class <strong>tools</strong> disponibiliza um conjunto de operações
 * aritméticas base.
 * 
 * É constítuida por 4 funções e como exemplo de utilização:
 * 
 * <pre>
 * 	{@code 
 * 	int resultadoSoma = soma(5,2) //resultado : 7
 *  }
 * </pre>
 * 
 * @author Mário Duarte
 * @version 1.0
 * @since 30/04/2020
 *
 */
public class tools 
{
	/**
	 * A variável global resultado recebe o valor das operações:
	 * @see #soma(int x, int y) 
	 * @see #subtracao(int x, int y)
	 * @see #multiplicao(int x, int y) 
	 */
	static int resultado;
	
	/**
	 * Função que devolve o resultado da soma de dois inteiros.
	 * @param x (int) parâmetro inteiro que vai ser um dos elementos da soma 
	 * @param y (int) parâmetro inteiro que vai ser um dos elementos da soma
	 * @return (int) resultado da soma dos parâmetros x e y
	 */
	public static int soma(int x, int y)
	{
		//execução da soma dos parâmetros x e y
		resultado = x + y;
		//retorno do resultado da soma
		return resultado;
	}
	public static int subtracao(int x, int y)
	{
		resultado = x - y;
		return resultado;
	}
	public static int multiplicacao(int x, int y)
	{
		resultado = x * y;
		return resultado;
	}
	public static double divisao(double x, double y)
	{
		double resultado = x/y;
		return resultado;
	}
	/**
	 * Função que devolve o resultado da soma de dois inteiros.
	 * @param x (int) parâmetro inteiro que vai ser um dos elementos da soma 
	 * @param y (int) parâmetro inteiro que vai ser um dos elementos da soma
	 * @return (int) <code>resultado</code> da soma dos parâmetros x e y
	 * 
	 * @deprecated
	 * 
	 * @since 1.0
	 * 
	 */
	public static int adicionar(int x, int y)
	{
		return x+y;
	}
}

package com.marioduarte.calculadora;
/**
 * A class geral disponibiliza funções aritméticas basicas:
 * soma, subtração, multiplicação e divisao.
 * 
 * @autor Alexandre Figueiredo
 * @version 1.0
 * @since 30/04/2020
 * 
 */

public class geral 
{
	/**
	 * A função serve para devolver um valor inteiro da soma de dois numeros que é feita na classe calculadoraAPI.
	 * @param x (int) parâmetro inteiro que vai ser um dos elementos da soma 
	 * @param y (int) parâmetro inteiro que vai ser um dos elementos da soma
	 * @return (int) resultado da soma dos parâmetros x e y
	 */
	public static int soma(int x, int y)
	{
		// retorna a soma dos valores inteiros x e y, que é feita na calsse calculadoraAPI
		return calculadoraAPI.soma(x, y);
	}
	
	/**
	 * A função serve para devolver um valor inteiro da subtração de dois numeros que é feita na classe calculadoraAPI.
	 * @param x (int) parâmetro inteiro que vai ser um dos elementos da subtracao 
	 * @param y (int) parâmetro inteiro que vai ser um dos elementos da subtracao
	 * @return (int) resultado da subtracao dos parâmetros x e y
	 */
	public static int subtracao(int x, int y)
	{
		// retorna a subtracao dos valores inteiros x e y, que é feita na calsse calculadoraAPI
		return calculadoraAPI.subtracao(x, y);
	}
	
	/**
	 * A função serve para devolver um valor inteiro da soma de dois numeros que é feita na classe calculadoraAPI.
	 * @param x (int) parâmetro inteiro que vai ser um dos elementos da soma 
	 * @param y (int) parâmetro inteiro que vai ser um dos elementos da soma
	 * @return (int) resultado da soma dos parâmetros x e y
	 * 
	 * @deprecated
	 * 
	 * @since @version 0.9
	 * 
	 */
	public static int inversaoDaSoma(int x,int y)
	{
		return calculadoraAPI.subtracao(x, y);
	}
	
	/** A função serve para devolver um valor inteiro da multiplicação de dois numeros que é feita na classe calculadoraAPI.
	 * @param x (int) parâmetro inteiro que vai ser um dos elementos da multiplicação 
	 * @param y (int) parâmetro inteiro que vai ser um dos elementos da multiplicação
	 * @return (int) resultado da multiplicação dos parâmetros x e y
	 */
	public static int multiplicacao(int x, int y)
	{
		// retorna a multiplicação dos valores inteiros x e y, que é feita na calsse calculadoraAPI
		return calculadoraAPI.multiplicacao(x, y);
	}
	
	/**
	 * A função serve para devolver um valor double da divisao de dois numeros que é feita na classe calculadoraAPI.
	 * @param x (double) parâmetro double que vai ser um dos elementos da divisao 
	 * @param y (double) parâmetro double que vai ser um dos elementos da divisao
	 * @return (double) resultado da divisao dos parâmetros x e y
	 */
	public static double divisao(double x, double y)
	{
		// retorna a divisao dos valores double x e y, que é feita na calsse calculadoraAPI
		return calculadoraAPI.divisao(x, y);
	}
}

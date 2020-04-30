package com.danielvicente.calculadora;

/**
 * 
 * <b><i>Calculadora</i></b> <br>
 * 
 * @author Daniel Vicente
 * @version 1.0
 * @since 30/4/20
 * 
 * @see #soma(int, int)
 * @see #subtracao(int, int)
 * @see #divisao(int, int)
 * @see #multiplicacao(int, int)
 */
public class Geral {

	/**
	 * Função que devolve o resultado da soma de 2 números inteiros
	 * 
	 * @param x (int) parametro inteiro que vai ser um dos elementos da soma
	 * @param y (int) parametro inteiro que vai ser um dos elementos da soma
	 * @return (int) resultado da soma dos parametros x e y
	 * <br>
	 * {@link com.danielvicente.calculadora.Geral#soma(int x, int y)}
	 */
	public static int soma(int x, int y) {
		// Retorno é feito por usar uma função de somatório que se encontra na API
		// CalculadoraAPI
		return CalculadoraAPI.soma(x, y);
	}

	/**
	 * Função que devolve o resultado da subtração de 2 números inteiros
	 * 
	 * @param x (int) parametro inteiro que vai ser um dos elementos da subtração
	 * @param y (int) parametro inteiro que vai ser um dos elementos da subtração
	 * @return (int) resultado da subtração dos parametros x e y
	 * <br>
	 * {@link com.danielvicente.calculadora.Geral#subtracao(int x, int y)}
	 */
	public static int subtracao(int x, int y) {
		// Retorno é feito por usar uma função de subtração que se encontra na API
		// CalculadoraAPI
		return CalculadoraAPI.subtracao(x, y);
	}

	// Deixou de ser utilizada
	/**
	 * Função que devolve o resultado da subtração de 2 números inteiros
	 * 
	 * @param x (int) parametro inteiro que vai ser um dos elementos da subtração
	 * @param y (int) parametro inteiro que vai ser um dos elementos da subtração
	 * @return (int) resultado da subtração dos parametros x e y
	 * @deprecated
	 * @since 1.0
	 * 
	 */
	public static int inversaoDaSoma(int x, int y) {
		// Retorno é feito por usar uma função de subtração que se encontra na API
		// CalculadoraAPI
		return CalculadoraAPI.subtracao(x, y);
	}

	/**
	 * Função que devolve o resultado da multiplicação de 2 números inteiros
	 * 
	 * @param x (int) parametro inteiro que vai ser um dos elementos da
	 *          multiplicação
	 * @param y (int) parametro inteiro que vai ser um dos elementos da
	 *          multiplicação
	 * @return (int) resultado da subtração dos parametros x e y
	 * <br>
	 * {@link com.danielvicente.calculadora.Geral#multiplicacao(int x, int y)}
	 */
	public static int multiplicacao(int x, int y) {
		// Retorno é feito por usar uma função de multiplicação que se encontra na API
		// CalculadoraAPI
		return CalculadoraAPI.multiplicacao(x, y);
	}

	/**
	 * Função que devolve o resultado da divisão de 2 números inteiros
	 * 
	 * @param x (int) parametro inteiro que vai ser um dos elementos da divisão
	 * @param y (int) parametro inteiro que vai ser um dos elementos da divisão
	 * @return (int) resultado da divisão dos parametros x e y
	 * <br>
	 * {@link com.danielvicente.calculadora.Geral#divisao(int x, int y)}
	 */
	public static double divisao(int x, int y) {
		// Retorno é feito por usar uma função de divisão que se encontra na API
		// CalculadoraAPI
		return CalculadoraAPI.divisao(x, y);
	}
}

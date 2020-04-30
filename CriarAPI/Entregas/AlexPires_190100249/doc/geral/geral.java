package com.alexpires.calculadoraAPI;
/**
 * <b><i>Calculadora</i></b>
 * 
 * A API <strong>CalcoladoraAPI</strong> oferece um conjunto de funções
 * que permitem obter o resultado das funções aritméticas base
 * 
 * Exemplo de utilização:
 * <pre>
 * {@code
 * int resultadoSubtracao = CalculadoraAPI.soma(5,2) // resultado=7
 * }
 * </pre>
 * @author Alex Pires
 * @version 1.1
 * @since 30/04/2020
 * 
 * @see #soma(int, int)
 * @see #subtracao(int, int)
 * @see #multiplicacao(int, int)
 * @see #divisao(double, double)
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
			return calculadoraAPI.soma(x, y);
		}//soma
		
		public static int subtracao(int x, int y)
		{
			return calculadoraAPI.subtracao(x, y);
		}//subtracao
		
		public static int inversaoDaSoma(int x,int y)
		{
			return calculadoraAPI.subtracao(x, y);
		}//inversaoDaSoma
		
		public static int multiplicacao(int x, int y)
		{
			return calculadoraAPI.multiplicacao(x, y);
		}//multiplicacao
		
		public static double divisao(double x, double y)
		{
			return calculadoraAPI.divisao(x, y);
		}//divisao
	}


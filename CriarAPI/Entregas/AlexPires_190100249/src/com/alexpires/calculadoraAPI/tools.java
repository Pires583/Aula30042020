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
 * @version 1.0
 * @since 30/04/2020
 */
public class tools {

	/**
	 * A variavel global resultado recebe o valor das operações;
	 * @see #soma(int x, int y)
	 * @see #subtracao(int x, int y)
	 * @see #multiplicacao(int x, int y)
	 */
		static int resultado;
		
		public static int soma(int x, int y)
		{
			
			/**
			 * Função que desenvolve o resultado de dois inteiros
			 * @param x (int) parametro inteiro que vai ser um dos elementos da soma
			 * @param y (int) parametro inteiro que vai ser um dos elementos da soma
			 * @return (int) resultado da soma dos parametros x e y
			 */
			
			resultado = x + y;
	
			return resultado;
		}//soma
		
		public static int subtracao(int x, int y)
		{
			resultado = x - y;
			return resultado;
		}//subtracao
		
		public static int multiplicacao(int x, int y)
		{
			resultado = x * y;
			return resultado;
		}//multiplicacao
		
		public static double divisao(double x, double y)
		{
			double resultado = x/y;
			return resultado;
		}//divisao
		
		/**
		 * Função que desenvolve o resultado de dois inteiros
		 * @param x (int) parametro inteiro que vai ser um dos elementos da soma
		 * @param y (int) parametro inteiro que vai ser um dos elementos da soma
		 * @return (int) <code>resultado</code> da soma dos parametros x e y
		 * 
		 * @deprecated
		 * 
		 * @since 1.0
		 */
		
		public static int adicionar(int x, int y)
		{
			return x+y;
		}//adicionar
	}


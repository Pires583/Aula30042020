package com.marioduarte.calculadora;

/**
 * @author serge
 * @version 1.2
 * @since 30/04/2020
 * 
 * @see #soma(int, int)
 * @see #subtracao(int, int)
 * @see #inversaoDaSoma(int, int)
 * @see #multiplicacao(int, int)
 * @see #divisao(double, double)
 */
public class geral  {
	
	/**
	 *  Função que chama o metodo soma da classe calculadoraAPI
	 *  e passa os valores x, y para a soma dos valores
	 *  
	 * @param x (int)
	 * @param y (int)
	 * @return
	 * 
	 * {@link calculadoraAPI#soma(int x, int y)}
	 */
	public static int soma(int x, int y) {
		/**
		 * 
		 */
		return calculadoraAPI.soma(x, y);
	}
	
	/**
	 *  Função que chama o metodo subtracao da classe calculadoraAPI
	 *  e passa os valores x, y para a subtracao dos valores
	 *  
	 * @param x (int)
	 * @param y (int)
	 * @return
	 * 
	 * {@link calculadoraAPI#subtracao(int x, int y)}
	 */
	public static int subtracao(int x, int y) {
		return calculadoraAPI.subtracao(x, y);
	}
	
	/**
	 * Função que chama o metodo subtracao da classe calculadoraAPI
	 *  e passa os valores x, y para a subtracao dos valores
	 *  o seu prosito era ser o inverso da soma
	 * 
	 * @param x (float)
	 * @param y (float)
	 * @return
	 * 
	 * {@link calculadoraAPI#subtracao(int x, int y)}
	 * 
	 * @deprecated
	 * @since 1.1
	 */
	public static int inversaoDaSoma(int x,int y) {
		return calculadoraAPI.subtracao(x, y);
	} // inversaoDaSoma
	
	/**
	 *  Função que chama o metodo multiplicacao da classe calculadoraAPI
	 *  e passa os valores x, y para a multiplicacao dos valores
	 *  
	 * @param x (int)
	 * @param y (int)
	 * @return
	 * 
	 * {@link calculadoraAPI#multiplicacao(int x, int y)}
	 */
	public static int multiplicacao(int x, int y) {
		return calculadoraAPI.multiplicacao(x, y);
	} // multiplicacao
	
	/**
	 *  Função que chama o metodo divisao da classe calculadoraAPI
	 *  e passa os valores x, y para a divisao dos valores
	 *  
	 * @param x (int)
	 * @param y (int)
	 * @return
	 * 
	 * {@link calculadoraAPI#divisao(double x, double y)}
	 */
	public static double divisao(double x, double y) {
		return calculadoraAPI.divisao(x, y);
	} // divisao
}

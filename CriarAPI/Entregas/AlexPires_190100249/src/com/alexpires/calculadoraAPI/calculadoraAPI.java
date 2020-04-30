package com.alexpires.calculadoraAPI;

/**
 * <b><i>Calculadora</i></b>
 * 
 * A API <strong>CalcoladoraAPI</strong> oferece um conjunto de fun��es
 * que permitem obter o resultado das fun��es aritm�ticas base
 * 
 * Exemplo de utiliza��o:
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

public class calculadoraAPI {

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
	 * Fun��o que devolve o valor da divis�o de dois parametros
	 * @param x (double) parametro da divis�o
	 * @param y (double) parametro da divis�o
	 * @return (double) parametro da divis�o
	 * 
	 * {@link tools#divisao(double, double)}
	 */
   
   public static double divisao(double x, double y)
   {
       /**
        * Devolve o valor da divis�o de x por y 
        */
       return tools.divisao(x, y);
   }
}
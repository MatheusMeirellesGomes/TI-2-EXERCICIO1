import java.util.Scanner;

public class Exercicio1_SomarDoisNum {
  public static Scanner sc = new Scanner (System.in);
  public static void main(String args []) {
	  //Declarar Variáveis.
	  int num1, num2, resultado; 
	  
	  //Receber Números
	  System.out.println("Digite o primeiro numero: "); //Como um printf.
	  num1 = sc.nextInt(); //Como um scanf. 
	  
	  System.out.println("Digite o segundo numero: "); 
	  num2 = sc.nextInt();
	  
	  //Somar os números e achar o resultado. 
	  resultado = num1 + num2; 
	  
	  //Imprimir resultado na tela. 
	  System.out.println("Soma: " + resultado);
  }
}
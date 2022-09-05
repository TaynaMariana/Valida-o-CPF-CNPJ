package infoUsuario;

import java.util.Scanner;
import infoUsuario.CPFValido;
import infoUsuario.CNPJValido;
import java.util.Calendar;
import java.util.GregorianCalendar;



public class Validacao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Calendar cal = GregorianCalendar.getInstance();
        int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
        int mesAtual = cal.get(Calendar.MONTH) + 1;
        int anoAtual = cal.get(Calendar.YEAR);
		
		System.out.printf("Informe seu nome: ");
		String nome = in.nextLine();
		
		System.out.println("Dia em que você nasceu: ");
		int diaNasc = in.nextInt();
		if ((diaNasc<=0) && (diaNasc>31)) {
			System.out.println("Dia Invalido");
		}
		else {
			System.out.println("Mes em que você nasceu: ");
	        int mesNasc = in.nextInt();
	        if ((mesNasc<=0) && (mesNasc>12)) {
	        	System.out.println("Mes invalido");
	        }
	        else {
	        	System.out.println("Ano em que você nasceu: ");
	            int anoNasc = in.nextInt();
	            if ((anoNasc<=0) && (anoNasc>anoAtual)) {
	            	System.out.println("Ano Invalido");
	            }
	            else {
	            	int Nasc = anoNasc*365;
	                Nasc = Nasc+(mesNasc*31);
	                Nasc = Nasc+diaNasc;
	            int Atual = anoAtual*365;
	                Atual = Atual+(mesAtual*31);
	                Atual = Atual+diaAtual;
	            
	                System.out.println("Você tem "+(Atual-Nasc)+" dias ou "+((Atual-Nasc)/31)+" meses ou "+((Atual-Nasc)/365)+" anos.");
	            }
	        }
		}
		
		
		
		
		System.out.printf("Informe seu CPF: ");
		String CPF = in.next();
        
		System.out.printf("\nResultado: ");
		
		if(CPFValido.isCPF(CPF) == true) {
			System.out.printf("Esse cpf é valido!\n");
			System.out.printf("%s\n", CPFValido.imprimeCPF(CPF));
		}
		else {
			System.out.printf("Erro, CPF invalido !!!\n");
		}
		
		System.out.printf("Informe seu CNPJ: ");
		String CNPJ = in.next();
		
		System.out.printf("\nResultado: ");
		    if (CNPJValido.isCNPJ(CNPJ) == true) {
		    	System.out.printf("Esse CNPJ é valido!\n");
			       System.out.printf("%s\n", CNPJValido.imprimeCNPJ(CNPJ));
		    }
		    else System.out.printf("Erro, CNPJ inválido !!!\n");
		  }
		
		
	}



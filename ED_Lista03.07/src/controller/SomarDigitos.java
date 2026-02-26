package controller;

public class SomarDigitos {

	public SomarDigitos() {
		super();
	}
	
	public int somar(int num) {
		
		int digito;
		
		// Como estamos somando os dígitos de um número, temos que trabalhar
		// Com os resto que a divisão por 10 nos retorna. Logo se esse número for menor que
		// 10, esse será o ponto de parada, assim retornando esse número.
		if(num<10) return num;
		
		digito=num%10;
		
		// Por estarmos trabalhando com cada dígito do número, não nos interessa a parte 
		// Fracionária de num/10 para a próxima chamada da função, pois a mesma já foi considerada
		// em: digito=num%10
		return digito+somar(num/10);
	}

}

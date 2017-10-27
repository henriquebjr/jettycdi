package com.henriquebjr;

import javax.enterprise.event.Observes;

public class ObservadorCalculadora {
	public void escutaCalculoSalario(@Observes Funcionario funcionario) {
		System.out.printf("O sal�rio do(a) %s " + " acabou de ser calculado\n", funcionario.getNome());
	}
}
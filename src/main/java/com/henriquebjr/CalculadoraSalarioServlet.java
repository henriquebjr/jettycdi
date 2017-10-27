package com.henriquebjr;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculadoraSalario")
public class CalculadoraSalarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private CalculadoraSalarios calculadoraSalarios;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Funcionario funcionario = new Funcionario(req.getParameter("funcionario"),
				Double.parseDouble(req.getParameter("salario")));
		double salario = calculadoraSalarios.calculaSalario(funcionario);
		System.out.printf("Salário do(a) %s é %.2f", funcionario.getNome(), salario);
	}
}
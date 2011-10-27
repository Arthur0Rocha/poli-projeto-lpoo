package com.acme.credvarejo.test;

import com.acme.credvarejo.Cliente;
import com.acme.credvarejo.ContaCrediario;
import com.acme.credvarejo.Cpf;
import com.acme.credvarejo.IdentificadorContaCrediario;

public class TestContaCrediario {

	public static void main(String[] args) {
		IdentificadorContaCrediario identificador =
			new IdentificadorContaCrediario(123456);

		Cpf cpf = new Cpf("054377074");
		
		Cliente cliente = new Cliente(cpf, "Bruno Basto", 22, 360, 0);

		ContaCrediario conta = new ContaCrediario(identificador, cliente, 2000, 10);
		
		System.out.println(conta.getVencimento());
	}
	
}
package com.dio.sistemaBancariodio;

import com.dio.sistemaBancariodio.domain.Account;
import com.dio.sistemaBancariodio.domain.CheckAccount;
import com.dio.sistemaBancariodio.domain.SavingsAccount;
import com.dio.sistemaBancariodio.domain.User;
import com.dio.sistemaBancariodio.enums.TipoCliente;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;

@SpringBootApplication
public class SistemaBancarioDioApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(SistemaBancarioDioApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User("Matheus Gigliotti Kassagas", "mgigliotti@gmail.com", "000.000.000-00", TipoCliente.PESSOAFISICA, "1234");
		User user2 = new User("Sthefanie Alves", "sthealves@gmail.com", "111.111.111-11", TipoCliente.PESSOAFISICA, "1234");
		CheckAccount accountMatheus = new CheckAccount(user1);
		Account accountSthefanie = new SavingsAccount(user2);


		// Conta Corrente Matheus Depositando
		accountMatheus.deposit(200);
		accountMatheus.printExtract();

		// Conta Corrente Matheus sacando
		accountMatheus.withdraw(100);
		accountMatheus.printExtract();

		// Conta Corrente Matheus sacando sem saldo
		accountMatheus.withdraw(101);
		accountMatheus.printExtract();

		// Conta Corrente Matheus tranferindo para Sthefanie
		accountSthefanie.printExtract();
		accountMatheus.transfer(100, accountSthefanie);
		accountMatheus.printExtract();
		accountSthefanie.printExtract();

		// Conta Corrente Matheus tranferindo sem saldo para Sthefanie
		accountMatheus.transfer(100, accountSthefanie);
		accountSthefanie.printExtract();
		accountMatheus.printExtract();

		// Conta Corrente Matheus tarifa bancaria
		accountMatheus.bankFee();
		accountMatheus.printExtract();


		// Conta Poupanca Sthefanie




	}
}

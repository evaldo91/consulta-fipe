package br.com.evaldo91.tabelaFipe;

import br.com.evaldo91.tabelaFipe.menu.MenuPrincipal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TabelaFipeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TabelaFipeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		MenuPrincipal menu = new MenuPrincipal();
		menu.menuTipo();

	}

}

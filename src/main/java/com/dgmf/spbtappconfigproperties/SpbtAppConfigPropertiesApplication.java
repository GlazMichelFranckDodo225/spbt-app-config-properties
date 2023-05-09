package com.dgmf.spbtappconfigproperties;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpbtAppConfigPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpbtAppConfigPropertiesApplication.class, args);
	}

}

/* Dans une application Spring Boot, si on veut exécuter quoi que soit au démarrage
de l'application, on peut créer un "initializer" comme ci-dessous
*/
@Component
class AppInitializer implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

	}
}

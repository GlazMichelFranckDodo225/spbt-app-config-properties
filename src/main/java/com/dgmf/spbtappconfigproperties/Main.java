package com.dgmf.spbtappconfigproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationProperties.class)
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}

/* Dans une application Spring Boot, si on veut exécuter quoi que soit au démarrage
de l'application, on peut créer un "initializer" comme ci-dessous
*/
@Component
class AppInitializer implements CommandLineRunner {
	// Liaison de la propriété "appVersion" avec la propriété
	// "app.version" du fichier application.properties
	@Value("${app.version}")
	private String appVersion;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Application version : " + appVersion);
	}
}

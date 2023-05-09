package com.dgmf.spbtappconfigproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;

// Toutes les propriétés commençant par le préfixe "app"
// seront liées aux variables de la classe ci-dessous
@ConfigurationProperties(prefix = "app")
public class ApplicationProperties {
}

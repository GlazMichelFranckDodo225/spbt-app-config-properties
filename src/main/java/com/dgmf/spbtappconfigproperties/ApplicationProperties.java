package com.dgmf.spbtappconfigproperties;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

// Toutes les propriétés commençant par le préfixe "app"
// seront liées aux variables de la classe ci-dessous
@ConfigurationProperties(prefix = "app")
@Validated
public record ApplicationProperties(String version, FtpProperties ftp) {
    public record FtpProperties(
            @NotEmpty String host,
            @Positive int port,
            @NotEmpty String username,
            @NotEmpty String password) {}
}

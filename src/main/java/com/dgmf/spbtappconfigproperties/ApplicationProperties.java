package com.dgmf.spbtappconfigproperties;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

// Toutes les propriétés commençant par le préfixe "app"
// seront liées aux variables de la classe ci-dessous
@ConfigurationProperties(prefix = "app")
@Validated
public class ApplicationProperties {
    private String version;
    // private FtpProperties ftp = new FtpProperties(); ==> si on n'utilise
    // des getters et setters pour l'objet "ftp"
    private FtpProperties ftp;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public FtpProperties getFtp() {
        return ftp;
    }

    public void setFtp(FtpProperties ftp) {
        this.ftp = ftp;
    }

    @Override
    public String toString() {
        return "ApplicationProperties{" +
                "version='" + version + '\'' +
                ", ftp=" + ftp +
                '}';
    }

    public static class FtpProperties {
        @NotEmpty
        private String host;
        @Positive
        private int port;
        @NotEmpty
        private String username;
        @NotEmpty
        private String password;

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public int getPort() {
            return port;
        }

        public void setPort(int port) {
            this.port = port;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public String toString() {
            return "FtpProperties{" +
                    "host='" + host + '\'' +
                    ", port='" + port + '\'' +
                    ", username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }
}

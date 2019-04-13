package com.cmarchive.bank.bankoauth2authorizationserver.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "security")
public class ConfigMap {

    private String client;
    private List<String> authorizedGrantTypes;
    private String scopes;
    private List<String> redirectUris;
    private String password;

    public String getClient() {
        return client;
    }

    public ConfigMap setClient(String client) {
        this.client = client;
        return this;
    }

    public List<String> getAuthorizedGrantTypes() {
        return authorizedGrantTypes;
    }

    public ConfigMap setAuthorizedGrantTypes(List<String> authorizedGrantTypes) {
        this.authorizedGrantTypes = authorizedGrantTypes;
        return this;
    }

    public String getScopes() {
        return scopes;
    }

    public ConfigMap setScopes(String scopes) {
        this.scopes = scopes;
        return this;
    }

    public List<String> getRedirectUris() {
        return redirectUris;
    }

    public ConfigMap setRedirectUris(List<String> redirectUris) {
        this.redirectUris = redirectUris;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public ConfigMap setPassword(String password) {
        this.password = password;
        return this;
    }
}

package com.cmarchive.bank.bankoauth2authorizationserver.configuration;

import com.cmarchive.bank.bankoauth2authorizationserver.domaine.User;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

import java.util.HashMap;
import java.util.Map;


public class CustomTokenEnhancer extends JwtAccessTokenConverter {

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
        User user = (User) authentication.getPrincipal();
        Map<String, Object> infos = new HashMap<>(accessToken.getAdditionalInformation());
        infos.put("nom", user.getNom());
        infos.put("prenom", user.getPrenom());
        infos.put("entreprise", "alithya");

        DefaultOAuth2AccessToken defaultOAuth2AccessToken = new DefaultOAuth2AccessToken(accessToken);
        defaultOAuth2AccessToken.setAdditionalInformation(infos);

        return super.enhance(defaultOAuth2AccessToken, authentication);
    }
}

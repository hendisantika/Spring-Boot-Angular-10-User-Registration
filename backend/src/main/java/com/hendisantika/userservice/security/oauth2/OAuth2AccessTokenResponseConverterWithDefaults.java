package com.hendisantika.userservice.security.oauth2;

import org.springframework.core.convert.converter.Converter;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.security.oauth2.core.endpoint.OAuth2AccessTokenResponse;
import org.springframework.security.oauth2.core.endpoint.OAuth2ParameterNames;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by IntelliJ IDEA.
 * Project : user-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/11/20
 * Time: 06.52
 */
public class OAuth2AccessTokenResponseConverterWithDefaults implements Converter<Map<String, String>,
        OAuth2AccessTokenResponse> {
    private static final Set<String> TOKEN_RESPONSE_PARAMETER_NAMES = Stream
            .of(OAuth2ParameterNames.ACCESS_TOKEN, OAuth2ParameterNames.TOKEN_TYPE, OAuth2ParameterNames.EXPIRES_IN,
                    OAuth2ParameterNames.REFRESH_TOKEN, OAuth2ParameterNames.SCOPE)
            .collect(Collectors.toSet());

    private final OAuth2AccessToken.TokenType defaultAccessTokenType = OAuth2AccessToken.TokenType.BEARER;

}

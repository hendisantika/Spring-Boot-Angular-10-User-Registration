package com.hendisantika.userservice.security.oauth2.user;

import com.hendisantika.userservice.dto.SocialProvider;
import com.hendisantika.userservice.exception.OAuth2AuthenticationProcessingException;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : user-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/11/20
 * Time: 05.23
 */
public class OAuth2UserInfoFactory {
    public static OAuth2UserInfo getOAuth2UserInfo(String registrationId, Map<String, Object> attributes) {
        if (registrationId.equalsIgnoreCase(SocialProvider.GOOGLE.getProviderType())) {
            return new GoogleOAuth2UserInfo(attributes);
        } else if (registrationId.equalsIgnoreCase(SocialProvider.FACEBOOK.getProviderType())) {
            return new FacebookOAuth2UserInfo(attributes);
        } else if (registrationId.equalsIgnoreCase(SocialProvider.GITHUB.getProviderType())) {
            return new GithubOAuth2UserInfo(attributes);
        } else if (registrationId.equalsIgnoreCase(SocialProvider.LINKEDIN.getProviderType())) {
            return new LinkedinOAuth2UserInfo(attributes);
        } else if (registrationId.equalsIgnoreCase(SocialProvider.TWITTER.getProviderType())) {
            return new GithubOAuth2UserInfo(attributes);
        } else {
            throw new OAuth2AuthenticationProcessingException("Sorry! Login with " + registrationId + " is not " +
                    "supported yet.");
        }
    }
}

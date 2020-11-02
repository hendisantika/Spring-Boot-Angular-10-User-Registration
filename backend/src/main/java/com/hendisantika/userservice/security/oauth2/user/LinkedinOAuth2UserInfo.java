package com.hendisantika.userservice.security.oauth2.user;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : user-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/11/20
 * Time: 05.26
 */
public class LinkedinOAuth2UserInfo extends OAuth2UserInfo {

    public LinkedinOAuth2UserInfo(Map<String, Object> attributes) {
        super(attributes);
    }

    @Override
    public String getId() {
        return (String) attributes.get("id");
    }

    @Override
    public String getName() {
        return ((String) attributes.get("localizedFirstName")).concat(" ").concat((String) attributes.get(
                "localizedLastName"));
    }

    @Override
    public String getEmail() {
        return (String) attributes.get("emailAddress");
    }

    @Override
    public String getImageUrl() {
        return (String) attributes.get("pictureUrl");
    }
}

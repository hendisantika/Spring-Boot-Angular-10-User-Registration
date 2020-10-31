package com.hendisantika.userservice.dto;

/**
 * Created by IntelliJ IDEA.
 * Project : user-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 31/10/20
 * Time: 22.49
 */
public enum SocialProvider {

    FACEBOOK("facebook"), TWITTER("twitter"), LINKEDIN("linkedin"), GOOGLE("google"), GITHUB("github"), LOCAL("local");

    private final String providerType;

    SocialProvider(final String providerType) {
        this.providerType = providerType;
    }

    public String getProviderType() {
        return providerType;
    }
}
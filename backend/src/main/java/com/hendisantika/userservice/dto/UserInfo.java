package com.hendisantika.userservice.dto;


import lombok.Value;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : user-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 31/10/20
 * Time: 22.51
 */
@Value
public class UserInfo {
    private String id, displayName, email;
    private List<String> roles;
}
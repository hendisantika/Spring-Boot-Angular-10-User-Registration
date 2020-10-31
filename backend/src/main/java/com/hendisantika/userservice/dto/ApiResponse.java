package com.hendisantika.userservice.dto;

import lombok.Value;

/**
 * Created by IntelliJ IDEA.
 * Project : user-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/11/20
 * Time: 04.54
 */
@Value
public class ApiResponse {
    private Boolean success;
    private String message;
}
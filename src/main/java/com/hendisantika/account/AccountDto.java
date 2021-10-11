package com.hendisantika.account;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * Created by IntelliJ IDEA.
 * Project : reactive-quarkus-rest-api
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/10/21
 * Time: 15.33
 */
@Data
public class AccountDto {
    private Integer accountId;

    @NotEmpty
    private String name;
}

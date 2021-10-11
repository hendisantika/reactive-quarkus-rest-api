package com.hendisantika.account;

import io.quarkus.hibernate.reactive.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

/**
 * Created by IntelliJ IDEA.
 * Project : reactive-quarkus-rest-api
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/10/21
 * Time: 15.31
 */
@ApplicationScoped
public class AccountRepository implements PanacheRepositoryBase<Account, Integer> {
}

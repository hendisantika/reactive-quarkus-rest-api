package com.hendisantika.account;

import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 * Project : reactive-quarkus-rest-api
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/10/21
 * Time: 15.36
 */
@Mapper(componentModel = "cdi")
public interface AccountMapper {
    AccountDto toDomain(Account entity);

    Account toEntity(AccountDto domain);

    default List<AccountDto> toDomainList(List<Account> list) {
        return list.stream().map(this::toDomain).collect(Collectors.toList());
    }

    default List<Account> toEntityList(List<AccountDto> list) {
        return list.stream().map(this::toEntity).collect(Collectors.toList());
    }
}

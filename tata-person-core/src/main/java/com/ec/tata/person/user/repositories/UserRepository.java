package com.ec.tata.person.user.repositories;

import com.ec.tata.account.vo.common.Status;
import com.ec.tata.common.repositories.JPAQueryDslBaseRepository;
import com.ec.tata.person.entities.UserEntity;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;


import java.util.Optional;

import static com.ec.tata.person.entities.QUserEntity.userEntity;

/**
 * Repository for User resources
 *
 * @author Joel Castro
 * @version 1.0
 */
@Lazy
@Repository
public class UserRepository extends JPAQueryDslBaseRepository<UserEntity> implements IUserRepository {

    public UserRepository() {
        super(UserEntity.class);
    }

    public Optional<Long> getUserIdByUsername(String username) {
        return from(userEntity)
                .select(userEntity.id)
                .where(userEntity.username.eq(username))
                .where(userEntity.status.eq(Status.ACTIVE.value))
                .stream().findFirst();
    }
}

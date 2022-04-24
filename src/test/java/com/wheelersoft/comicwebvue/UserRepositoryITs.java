package com.wheelersoft.comicwebvue;

import com.wheelersoft.comicwebvue.domain.User;
import com.wheelersoft.comicwebvue.repositories.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class UserRepositoryITs {

    @Autowired
    private UserRepository repo;

    @Autowired
    private TestEntityManager entityManager;

    @Disabled("Disabled until proper test is created")
    @Test
    public void testCreateUser() throws Exception {
        User user = new User();

        user.setEmail("testuser@test.com");
        user.setPassword("abc123");

        User savedUser = repo.save(user);
        User existingUser = entityManager.find(User.class, savedUser.getId());

        assertThat(existingUser.getEmail()).isEqualTo(user.getEmail());
    }
}

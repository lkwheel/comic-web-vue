package com.wheelersoft.comicwebvue.repositories;

import com.wheelersoft.comicwebvue.domain.ERole;
import com.wheelersoft.comicwebvue.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}

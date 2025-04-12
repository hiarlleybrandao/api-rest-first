package com.brandaostartup.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.brandaostartup.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

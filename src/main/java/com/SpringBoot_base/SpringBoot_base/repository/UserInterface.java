package com.SpringBoot_base.SpringBoot_base.repository;

import com.SpringBoot_base.SpringBoot_base.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInterface extends JpaRepository<User, long> {

}

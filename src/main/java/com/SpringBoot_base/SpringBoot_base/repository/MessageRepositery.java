package com.SpringBoot_base.SpringBoot_base.repository;

import com.SpringBoot_base.SpringBoot_base.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepositery extends JpaRepository<Message, int> {
}

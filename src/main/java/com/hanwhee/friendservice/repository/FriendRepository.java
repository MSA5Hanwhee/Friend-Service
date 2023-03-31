package com.hanwhee.friendservice.repository;

import com.hanwhee.friendservice.domain.entity.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendRepository extends JpaRepository<Friend, Long> {

}

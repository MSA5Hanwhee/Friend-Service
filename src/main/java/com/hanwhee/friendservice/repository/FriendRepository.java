package com.hanwhee.friendservice.repository;

import com.hanwhee.friendservice.domain.entity.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FriendRepository extends JpaRepository<Friend, Long> {

    Optional<Friend> findByMyIdAndFriendId(Long myId, Long friendId);
}

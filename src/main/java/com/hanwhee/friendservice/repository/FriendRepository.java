package com.hanwhee.friendservice.repository;

import com.hanwhee.friendservice.domain.dto.FriendDTO;
import com.hanwhee.friendservice.domain.entity.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FriendRepository extends JpaRepository<Friend, Long> {
    List<Friend> findAllByMyId(Long myId);
    Optional<Friend> findOneByMyId(Long myId);

    Optional<Friend> findByMyIdAndFriendId(Long myId, Long friendId);
}

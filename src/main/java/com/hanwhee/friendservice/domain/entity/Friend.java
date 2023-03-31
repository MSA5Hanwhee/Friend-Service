package com.hanwhee.friendservice.domain.entity;

import com.hanwhee.friendservice.domain.dto.FriendDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity @Getter
@AllArgsConstructor @NoArgsConstructor

public class Friend {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long myId;
    private Long friendId;
    private boolean isFriend;

    public Friend(FriendDTO dto) {
        this.myId = dto.getMyId();
        this.friendId = dto.getFriendId();
    }
}

package com.hanwhee.friendservice.domain.entity;

import com.hanwhee.friendservice.domain.dto.EFriendStatus;
import jakarta.persistence.*;
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
    @Enumerated(EnumType.STRING)
    private EFriendStatus friendStatus = EFriendStatus.STRANGER;
}

package com.hanwhee.friendservice.domain.dto;

import com.hanwhee.friendservice.domain.request.InsertFriendRequest;
import com.hanwhee.friendservice.security.TokenInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class FriendDTO {
    private Long myId;
    private Long friendId;

    public FriendDTO(TokenInfo tokenInfo, InsertFriendRequest request) {
        this.myId = tokenInfo.getId();
        this.friendId = request.getFriendId();
    }
}

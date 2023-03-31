package com.hanwhee.friendservice.domain.dto;

import com.hanwhee.friendservice.domain.request.InsertFriendRequest;

public class FriendDTO {

    private Long myId;
    private Long friendId;
    private EFriendStatus friendStatus;
    public FriendDTO (TokenInfo token, InsertFriendRequest request) {
        this.myId = token.getId();
        this.friendId = request.getFriendId();
    }

}

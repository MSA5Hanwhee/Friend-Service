package com.hanwhee.friendservice.service;

import com.hanwhee.friendservice.domain.request.InsertFriendRequest;
import com.hanwhee.friendservice.repository.FriendRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FriendService {
    private final FriendRepository friendRepository;
    public String insertFriend(InsertFriendRequest request) {
        return null;

    }

}

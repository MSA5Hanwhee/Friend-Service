package com.hanwhee.friendservice.service;

import com.hanwhee.friendservice.domain.dto.FriendDTO;
import com.hanwhee.friendservice.domain.entity.Friend;
import com.hanwhee.friendservice.domain.request.InsertFriendRequest;
import com.hanwhee.friendservice.repository.FriendRepository;
import com.hanwhee.friendservice.security.SecurityService;
import com.hanwhee.friendservice.security.TokenInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FriendService {
    private final FriendRepository friendRepository;
    private final SecurityService securityService;

    public String insertFriend(FriendDTO dto) {
        Friend friend = new Friend(dto);
        friendRepository.save(friend);
        return "친구추가완료";
    }
}

package com.hanwhee.friendservice.service;

import com.hanwhee.friendservice.domain.dto.FriendDTO;
import com.hanwhee.friendservice.domain.entity.Friend;
import com.hanwhee.friendservice.domain.request.InsertFriendRequest;
import com.hanwhee.friendservice.domain.respose.ViewAllFriendList;
import com.hanwhee.friendservice.repository.FriendRepository;
import com.hanwhee.friendservice.security.SecurityService;
import com.hanwhee.friendservice.security.TokenInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public List<ViewAllFriendList> findMyAllFriend(Long myId) {
        List<ViewAllFriendList> viewAllFriendLists = new ArrayList<>();
        List<Friend> all = friendRepository.findAllByMyId(myId);
        for (Friend one : all) {
            viewAllFriendLists.add(new ViewAllFriendList(
                    one.getMyId(),
                    one.getFriendId()
            ));
        }
        return viewAllFriendLists;
    }
}

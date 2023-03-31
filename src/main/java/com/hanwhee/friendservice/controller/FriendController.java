package com.hanwhee.friendservice.controller;

import com.hanwhee.friendservice.domain.dto.FriendDTO;
import com.hanwhee.friendservice.domain.entity.Friend;
import com.hanwhee.friendservice.domain.request.DeleteFriendRequest;
import com.hanwhee.friendservice.domain.request.InsertFriendRequest;
import com.hanwhee.friendservice.repository.FriendRepository;
import com.hanwhee.friendservice.security.SecurityService;
import com.hanwhee.friendservice.security.TokenInfo;
import com.hanwhee.friendservice.service.FriendService;
import jakarta.ws.rs.DELETE;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/friend")
@RequiredArgsConstructor
public class FriendController {
    private final FriendService friendService;
    private final SecurityService securityService;

    @PostMapping
    public String InsertFriend(@RequestBody InsertFriendRequest request){
        TokenInfo tokenInfo = securityService.parseToken(securityService.getToken());
        FriendDTO dto = new FriendDTO(tokenInfo, request);
        return friendService.insertFriend(dto);
    }

    @DeleteMapping("/{friendId}")
    public String DeleteFriend(@PathVariable("friendId") Long friendId){
        TokenInfo tokenInfo = securityService.parseToken(securityService.getToken());
        FriendDTO dto = new FriendDTO(tokenInfo, friendId);
        return friendService.deleteFriend(dto);
    }



}

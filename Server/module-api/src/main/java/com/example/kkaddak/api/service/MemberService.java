package com.example.kkaddak.api.service;


import com.example.kkaddak.api.dto.DataResDto;
import com.example.kkaddak.api.dto.member.AccountReqDto;
import com.example.kkaddak.api.dto.member.EditProfileReqDto;
import com.example.kkaddak.api.dto.member.LogoutReqDto;
import com.example.kkaddak.api.dto.member.ProfileReqDto;
import com.example.kkaddak.core.dto.MyFollowConditionDto;
import com.example.kkaddak.core.entity.Member;
import com.example.kkaddak.core.exception.NoContentException;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {
    DataResDto<?> kakaoLogin(String accessToken) throws JsonProcessingException;
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
    DataResDto<?> signup(ProfileReqDto profileReqDto, Member member);
    Boolean checkNicknameDuplicate(String nickname, Member member);
    DataResDto<?> findMemberById(int memberId);
    DataResDto<?> followMember(Member member, String otherId);
    DataResDto<?> unfollowMember(Member member, String otherId);
    DataResDto<?> getProfile(Member requester, String nickname);
    DataResDto<?> updateProfile(Member member, EditProfileReqDto editInfo) throws Exception;
    DataResDto<?> logout(Member member, LogoutReqDto logoutReqDto);
    DataResDto<?> saveAccount(Member member, AccountReqDto accountReqDto);
    DataResDto<?> getMyProfile(Member member);
    DataResDto<?> getMyFollowers(MyFollowConditionDto condition, Member member) throws NoContentException;
    DataResDto<?> getMyFollowings(MyFollowConditionDto condition, Member member) throws NoContentException;
    DataResDto<?> setNFTThumbnail(Member member, String nftImagePath);
}

package com.web.service;

import java.util.List;

import com.web.dto.UserInfoDTO;
import com.web.repository.UserInfoRepository;

public class UserInfoService {
	private UserInfoRepository uiRepo = new UserInfoRepository();
		
	public List<UserInfoDTO> selectUserInfos(UserInfoDTO userInfo){
		return uiRepo.selectUserInfos(userInfo);
	}
	public UserInfoDTO getUserInfo(int uiNum) {
		return uiRepo.selectUserInfo(uiNum);
	}
	public int insertUserInfo(int uiNum) {
		return uiRepo.selectUserInfo(uiNum);
	}
	public int getUserInfo(UserInfoDTO userInfo) {
		return uiRepo.insertUserInfo(userInfo);
	}
	public UserInfoDTO getUserInfo(int uiNum) {
		return uiRepo.selectUserInfo(uiNum);
	}
}

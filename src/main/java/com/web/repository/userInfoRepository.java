package com.web.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.web.config.sessionFactory;
import com.web.dto.foodInfoDTO;
import com.web.dto.userInfoDTO;

public class userInfoRepository {
	public static List<userInfoDTO>selectUserInfos(userInfoDTO userInfo){
		try(SqlSession session = sessionFactory.getSSF().openSession()){
			return session.selectList("mvn.userInfoMapper.selectUserInfos",userInfo);
		}
	}
	public static userInfoDTO selectUserInfo(userInfoDTO userInfo) {
		try(SqlSession session = sessionFactory.getSSF().openSession()) {
			return session.selectOne("mvn.userInfoMapper.selectUserInfo",userInfo);
		}
	}
	public int insertUserInfo(userInfoDTO userInfo) {
		try(SqlSession session = sessionFactory.getSSF().openSession(true)) {
			return session.insert("mvn.userInfoMapper.insertUserInfo",userInfo);
		}
	}
	public int updateUserInfo(int uiNum) {
		try(SqlSession session = sessionFactory.getSSF().openSession(true)) {
			return session.update("mvn.userInfoMapper.updateUserInfo",uiNum);
		}
	}
	public int deleteUserInfo(int uiNum) {
		try(SqlSession session = sessionFactory.getSSF().openSession(true)) {
			return session.delete("mvn.userInfoMapper.deleteUserInfo",uiNum);
		}
	}
}

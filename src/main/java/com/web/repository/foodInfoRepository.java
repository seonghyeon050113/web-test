package com.web.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.web.config.sessionFactory;
import com.web.dto.foodInfoDTO;

public class foodInfoRepository {
	public List<foodInfoDTO> selectfoodInfos(foodInfoDTO foodInfo) {
		try(SqlSession session = sessionFactory.getSSF().openSession()){
		return session.selectList("mvn.FoodInfoMapper.selectFoodInfo",foodInfo);
		}
	}
	public foodInfoDTO selectfoodInfo(foodInfoDTO foodInfo) {
		try(SqlSession session = sessionFactory.getSSF().openSession()){
		return session.selectOne("mvn.FoodInfoMapper.selectFoodInfo",foodInfo);
		}
	}
	public int insertfoodInfos(foodInfoDTO foodInfo) {
		try(SqlSession session = sessionFactory.getSSF().openSession()){
		return session.insert("mvn.FoodInfoMapper.selectFoodInfo",foodInfo);
		}
	}
	public int deletefoodInfos(int fiNum) {
		try(SqlSession session = sessionFactory.getSSF().openSession()){
		return session.delete("mvn.FoodInfoMapper.selectFoodInfo",fiNum);
		}
	}
	public int updatefoodInfos(int fiNum) {
		try(SqlSession session = sessionFactory.getSSF().openSession()){
		return session.update("mvn.FoodInfoMapper.selectFoodInfo",fiNum);
		}
	}
	
}

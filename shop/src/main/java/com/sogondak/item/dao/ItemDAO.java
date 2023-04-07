package com.sogondak.item.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.sogondak.mybatis.SqlMapConfig;

public class ItemDAO {
	SqlSessionFactory factory = SqlMapConfig.getFactory();
	SqlSession sqlSession;
	
	public ItemDAO() {
		sqlSession = factory.openSession(true);
	}
	
	
	public boolean insertItem(ItemBean item) {
		boolean result = false;
		System.out.println("3");
		if(sqlSession.insert("Item.insertItem", item) == 1) {
			// insert 성공
			System.out.println("4");
			result = true;
		}
		
		return result;
	}
	
	public int getItemCnt() {
		return sqlSession.selectOne("Item.getItemCnt");
	}
	
	public List<ItemBean> getItemList(int startRow, int endRow) {
		HashMap<String, Integer> datas = new HashMap<>();
		datas.put("startRow", startRow);
		datas.put("endRow", endRow);
		
		List<ItemBean> itemList =
				sqlSession.selectList("Item.getItemList", datas);
		
		return itemList;
	}
	public ItemBean getItemDetail(String itemname) {
		return sqlSession.selectOne("Item.getItemDetail", itemname);
	}
	
	
}

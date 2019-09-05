package com.bw.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.entity.Brand;
import com.bw.entity.Category;
import com.bw.entity.Goods;
import com.bw.mapper.GoodsDao;

@Service
public class GoodsServiceImpl implements GoodsService{

	@Resource
	private GoodsDao dao;
	
	public List<Goods> findAll() {
		return dao.findAll();
	}

	//查询所有分类
	public List<Category> findflAll() {
		return dao.findflAll();
	}

	public List<Brand> findppAll(Integer cid) {
		return dao.findppAll(cid);
	}

}

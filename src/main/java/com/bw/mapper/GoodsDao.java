package com.bw.mapper;

import java.util.List;

import com.bw.entity.Brand;
import com.bw.entity.Category;
import com.bw.entity.Goods;

public interface GoodsDao {

	List<Goods> findAll();

	List<Category> findflAll();

	List<Brand> findppAll(Integer cid);

}

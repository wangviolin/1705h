package com.bw.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.entity.Brand;
import com.bw.entity.Category;
import com.bw.entity.Goods;
import com.bw.service.GoodsService;

@Controller
public class GoodsController {

	@Resource
	private GoodsService service;
	
	//列表展示
	@RequestMapping("list.do")
	public String findAll(Model m){
		List<Goods> list = service.findAll();
		m.addAttribute("list",list);
		return "list";
	}
	
	//查询所有分类
	@RequestMapping("findflAll.do")
	@ResponseBody
	public List<Category> findflAll(){
		List<Category> fllist = service.findflAll();
		return fllist;
	}
	
	@RequestMapping("findppAll.do")
	@ResponseBody
	public List<Brand> findppAll(Integer cid){
		List<Brand> pplist = service.findppAll(cid);
		return pplist;
	}
}

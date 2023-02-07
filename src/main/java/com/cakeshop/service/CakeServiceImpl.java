package com.cakeshop.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakeshop.dao.CakeDAO;
import com.cakeshop.entity.Cake;

@Service
public class CakeServiceImpl implements CakeService{
	
	@Autowired
	CakeDAO cakeDao;

	@Override
	public Cake insertCake(Cake cake) {
		// TODO Auto-generated method stub
		return cakeDao.cakeInsert(cake);
	}

	@Override
	public Cake getCake(int id) {
		// TODO Auto-generated method stub
		return cakeDao.getCake(id);
	}
	@Override
	public List<Cake> getCake() {
		// TODO Auto-generated method stub
		return cakeDao.getCake();
	}

	@Override
	public void delCake(int id) {
		// TODO Auto-generated method stub
		cakeDao.delCake(id);
	}

	@Override
	public Cake editCake(Cake cake) {
		return cakeDao.cakeUpdate(cake);
	}

}

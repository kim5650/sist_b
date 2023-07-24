package com.example.demo.dao;

import org.springframework.stereotype.Repository;

import com.example.demo.db.DBManager;
import com.example.demo.entity.Dept;

@Repository
public class DeptDAO_MB {
	public Dept findByDno(int dno) {
		return DBManager.findByDno(dno);
		
		
	}
}

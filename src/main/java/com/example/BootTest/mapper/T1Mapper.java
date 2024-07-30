package com.example.BootTest.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface T1Mapper {

	@Select("SELECT * FROM t1")
	public List<Map> findAll(); 
	
	@Insert("INSERT INTO t1 (nm, age, gend) VALUES ('홍길동', 18, 1)")
	public int input();
	
}

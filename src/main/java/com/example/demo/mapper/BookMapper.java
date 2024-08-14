package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.entity.Book;

@Mapper
public interface BookMapper {
	
	public List<Book> selectAll();
	
	public Book selectByPrimaryKey(@Param("id") Integer id);

}

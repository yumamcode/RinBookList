package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.BooksGenres;
@Mapper
public interface BooksGenresMapper {
	
	public List<BooksGenres> selectAll();

}

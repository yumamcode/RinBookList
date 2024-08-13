package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Sample;

@Mapper
public interface SampleMapper {
	
	public List<Sample> selectAll();
	
	public void insert(Sample sample);

}

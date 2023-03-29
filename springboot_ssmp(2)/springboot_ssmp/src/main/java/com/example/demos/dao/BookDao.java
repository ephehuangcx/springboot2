package com.example.demos.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demos.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookDao extends BaseMapper<Book> {

}

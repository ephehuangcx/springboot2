package com.example.demos.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demos.domain.Book;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.stereotype.Service;

import java.util.List;
public interface BookService {
    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book getById (Integer id);
    List<Book> getAll();
    IPage<Book> getPage (int currentPage,int pageSize);
}

package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demos.domain.Book;
import com.example.demos.service.BookService;
import com.example.demos.service.IBookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {
    @Autowired
    private IBookService bookService;
    @Test
    void testGetById(){
        System.out.println(bookService.getById(4));
    }
    @Test
    void testSave(){
        Book book = new Book();
        book.setType("测试123");
        book.setName("测试123");
        book.setDescription("测试123");
        bookService.save(book);
    }
    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(17);
        book.setType("测试asdfasd");
        book.setName("测试123");
        book.setDescription("测试123");
        bookService.updateById(book);
    }
    @Test
    void testDelete(){
        bookService.removeById(18);
    }
    @Test
    void testGetAll(){
        bookService.list();
    }
    @Test
    void testGetPage(){
        IPage<Book> page = new Page<Book>(2,5);
        bookService.page(page);
    }
}

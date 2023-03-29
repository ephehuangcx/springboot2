package com.example.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demos.dao.BookDao;
import com.example.demos.domain.Book;
import org.apache.ibatis.jdbc.Null;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.image.ImageProducer;

@SpringBootTest
class BookDaoTest {
    @Autowired
    private BookDao bookDao;
    @Test
    void testGetById() {
        bookDao.selectById(1);
    }
    @Test
    void testSave() {
        Book book = new Book();
        book.setType("测试123");
        book.setName("测试123");
        book.setDescription("测试123");
        bookDao.insert(book);
    }
    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(17);
        book.setType("测试asdfasdf");
        book.setName("测试123");
        book.setDescription("测试123");
        bookDao.updateById(book);
    }
    @Test
    void testDelete() {
        bookDao.deleteById(16);
    }
    @Test
    void testGetAll() {
        bookDao.selectList(null);
     }
    @Test
    void testGetPage() {
        IPage page = new Page(1,5);//获取第1页数据，显示5条
        bookDao.selectPage(page,null);
//        System.out.println(page.getPages());
//        System.out.println(page.getCurrent());
//        System.out.println(page.getSize());
//        System.out.println(page.getTotal());
//        System.out.println(page.getRecords());
    }
    @Test
    void testGetBy() {
        QueryWrapper<Book> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name","Spring");
        bookDao.selectList(queryWrapper);
    }
    @Test
    void testGetBy2() {
        String name = "1";
        LambdaQueryWrapper<Book> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(name != null,Book::getName,name);
        bookDao.selectList(lambdaQueryWrapper);
    }
}
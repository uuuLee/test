package com.aaa.test;

import com.aaa.spring.entity.Book;
import com.aaa.spring.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: test01
 * @Author: LF
 * @Date: 2019/10/31
 */
public class test01 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService =  context.getBean(BookService.class);
        bookService.saveBook(new Book());
    }
}

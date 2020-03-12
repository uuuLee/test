package com.aaa.spring.service.impl;

import com.aaa.spring.entity.Book;
import com.aaa.spring.service.BookService;
import org.springframework.stereotype.Component;

/**
 * @ClassName: BookServiceImpl
 * @Author: LF
 * @Date: 2019/10/31
 * 图书service接口实现
 */
@Component
public class BookServiceImpl implements BookService {
    public Integer saveBook(Book book) {
        System.out.println("保存图书");
        return null;
    }
}

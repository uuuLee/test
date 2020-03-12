package com.aaa.spring.service;

import com.aaa.spring.entity.Book;

/**
 * @ClassName: BookService
 * @Author: LF
 * @Date: 2019/10/31
 * 图书service接口
 */
public interface BookService {

    /**
     * 保存图书的方法
     * @return
     */
    public Integer saveBook(Book book);
}

package com.kina.service;

import com.kina.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    // 增加一本书
    int addBook(Books books);

    // 删除一本书
    int deleteBookById(int id);

    // 更新一本书
    int updateBook(Books books);

    // 借阅一本书
    int borrowBook(int id);

    // 归还图书
    int returnBook(int id);

    // 查询一本书
    Books queryBookById(int id);

    // 查询全部书
    List<Books> queryAllBook();

    List<Books> queryBookByName(@Param("bookName") String bookName);
}

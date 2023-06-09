package com.kina.controller;

import com.kina.pojo.Books;
import com.kina.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    // controller层调用service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    // 查询全部的书籍，并且返回到一个书籍展示界面
    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> books = bookService.queryAllBook();
        model.addAttribute("list", books);
        return "allBook";
    }

    @RequestMapping("/toAddBook")
    public String toAddPaper() {
        return "addBook";
    }

    // 添加书籍请求
    @RequestMapping("/addBook")
    public String addBook(Books books) {
        System.out.println("addBook=>" + books);
        bookService.addBook(books);
        // 重定向
        return "redirect:/book/allBook";
    }

    // 跳转到修改页面
    @RequestMapping("/toUpdate")
    public String toUpdatePaper(int id, Model model) {
        Books books = bookService.queryBookById(id);
        model.addAttribute("QBooks", books);
        return "updateBook";
    }

    // 修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books) {
        System.out.println("updateBook===>" + books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/borrowBook/{bookId}")
    public String borrow(@PathVariable("bookId") int id) {
        Books books = bookService.queryBookById(id);
        if (books.getBookCounts() < 1) {
            return "falsePage";
        }
        bookService.borrowBook(id);
        return "truePage";
    }

    @RequestMapping("returnBook/{bookId}")
    public String returnBook(@PathVariable("bookId")int id) {
        int i = bookService.returnBook(id);
        if (i > 0) {
            return "bookTrueReturn";
        }
        return "bookFalseReturn";
    }

    // 删除书籍
    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id) {
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    // 查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName, Model model) {
        List<Books> list = bookService.queryBookByName(queryBookName);
        for (Books books :
                list) {
            System.out.println("book==>" + list);
        }
        model.addAttribute("list", list);
        return "allBook";
    }
}

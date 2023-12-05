package com.service.impl;

import com.controller.Code;
import com.dao.BookDao;
import com.domain.Book;
import com.exception.BusinessException;
import com.exception.SystemException;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    public boolean save(Book book) {
        return bookDao.save(book)>0;
    }

    public boolean update(Book book) {
        return bookDao.update(book)>0;
    }

    public boolean delete(Integer id) {
        return bookDao.delete(id)>0;
    }

    public Book getById(Integer id) {
        /*//此时模拟业务上的异常情况
        if(id==1){
            throw new BusinessException(Code.BUSINESS_ERR,"请不要挑战我的仍耐性");
        }

        //模拟系统异常，此时出现的是对异常情况进行包装，转换为自定义的异常处理
        try {
            int i=1/0;
        }catch (Exception e){
            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,"服务器访问超时，请稍后重试！",e);
        }*/
        return bookDao.getById(id);
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
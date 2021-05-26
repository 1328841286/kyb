package com.example.second.service.impl;
import com.example.second.dao.TeachingBookDao;
import com.example.second.entity.TeachingBook;
import com.example.second.service.TeachingBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


//@Service
//@Transactional(rollbackFor = Exception.class)
//public class TeachingBookServiceBean implements TeachingBookService {
//
//    @Autowired
//    private TeachingBookDao teachingBookDao;
//
//    @Autowired
//    private TeachingBookCountDao teachingBookCountDao;
//
//    @Autowired
//    TeachingBookCopyDao teachingBookCopyDao;
//
//    public List<TeachingBook> findAllTeachingBooks() {
//        return this.teachingBookDao.findAllTeachingBooks();
//    }


//    @Transactional
//    public void addTeachingBook(TeachingBook teachingBook) {
//        this.teachingBookDao.addTeachingBook(teachingBook);
////        this.teachingBookCopyDao.addTeachingBook(teachingBook);
//        Integer count = this.teachingBookDao.getCountTeachingBooks();
//        //没有加@Transactional注解，万一出现错误，新增人数会成功，但是学生表的总人数没有改变，出现了数据的不一致。
////        int x = 5 / 0;
//        this.teachingBookCountDao.addCount(count);
//    }

//    public void deleteTeachingBookById(Long uid) {
//        this.teachingBookDao.deleteTeachingBookById(uid);
//        Integer count = this.teachingBookDao.getCountTeachingBooks();
//        this.teachingBookCountDao.addCount(count);
//    }
//
//    public void updateTeachingBook(TeachingBook teachingBook) {
//        this.teachingBookDao.updateTeachingBook(teachingBook);
//    }
//
//    public List<TeachingBook> findTeachingBookByName(String name) {
//        return this.teachingBookDao.findTeachingBookByName(name);
//    }
//
//    public Integer deleteTeachingBooksByIds(Integer[] ids) {
//        return this.teachingBookDao.deleteTeachingBooksByIds(ids);
//    }
//
//}



//package com.example.second.service.impl;

//import com.example.second.dao.TeachingBookCopyDao;
//import com.example.second.dao.TeachingBookCountDao;


@Service
@Transactional
public class TeachingBookServiceBean implements TeachingBookService {

    @Autowired
    private TeachingBookDao teachingBookDao;

//    @Autowired
//    private TeachingBookCountDao teachingBookCountDao;
//
//    @Autowired
//    TeachingBookCopyDao teachingBookCopyDao;

    public List<TeachingBook> findAllTeachingBooks() {
        return this.teachingBookDao.findAllTeachingBooks();
    }

//    @Override
//    public void addTeachingBook(TeachingBook teachingBook) {
//        this.teachingBookDao.addTeachingBook(teachingBook);
////        this.teachingBookCopyDao.addTeachingBook(teachingBook);
//        Integer count = this.teachingBookDao.getCountTeachingBooks();
//        //没有加@Transactional注解，万一出现错误，新增人数会成功，但是学生表的总人数没有改变，出现了数据的不一致。
////        int x = 5 / 0;
////        this.teachingBookCountDao.addCount(count);
//    }


    @Transactional
    public void addTeachingBook(TeachingBook teachingBook) {
        this.teachingBookDao.addTeachingBook(teachingBook);
        Integer count = this.teachingBookDao.getCountTeachingBooks();
    }


    

    public void deleteTeachingBookById(Long uid) {
        this.teachingBookDao.deleteTeachingBookById(uid);
        Integer count = this.teachingBookDao.getCountTeachingBooks();
//        this.teachingBookCountDao.addCount(count);
    }

    public void updateTeachingBook(TeachingBook teachingBook) {

        this.teachingBookDao.updateTeachingBook(teachingBook);
    }

    public List<TeachingBook> findTeachingBookByName(String name) {
        return this.teachingBookDao.findTeachingBookByName(name);
    }

    public Integer deleteTeachingBooksByIds(Integer[] ids) {
        return this.teachingBookDao.deleteTeachingBooksByIds(ids);
    }

}

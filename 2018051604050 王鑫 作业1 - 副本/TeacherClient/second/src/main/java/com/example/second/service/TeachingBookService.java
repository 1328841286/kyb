package com.example.second.service;

import com.example.second.entity.TeachingBook;

import java.util.List;


public interface TeachingBookService {

    public List<TeachingBook> findAllTeachingBooks();

    public void addTeachingBook(TeachingBook teachingBook);

//    public Check addteachingBook(TeachingBook teachingBook);
    public void deleteTeachingBookById(Long uid);

    public void updateTeachingBook(TeachingBook teachingBook);
    List<TeachingBook> findTeachingBookByName(String name);

    public Integer deleteTeachingBooksByIds(Integer[] ids);
}

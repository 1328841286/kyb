package com.example.second.dao;

import com.example.second.entity.TeachingBook;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component(value = "TeachingBookDao")
public interface TeachingBookDao {

    List<TeachingBook> findAllTeachingBooks();

    int deleteTeachingBookById(Long uid);

    int insert(TeachingBook teachingBook);

    int addTeachingBook(TeachingBook teachingBook);

    TeachingBook selectByPrimaryKey(Long uid);

    int updateTeachingBook(TeachingBook teachingBook);

    int updateByPrimaryKey(TeachingBook teachingBook);

    List<TeachingBook> findTeachingBookByName(String name);

    Integer deleteTeachingBooksByIds(@Param("ids") Integer[] ids);

    int getCountTeachingBooks();
}

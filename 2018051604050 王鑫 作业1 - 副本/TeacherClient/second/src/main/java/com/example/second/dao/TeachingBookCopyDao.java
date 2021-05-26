package com.example.second.dao;


import com.example.second.entity.TeachingBook;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "TeachingBookCopyDao")
public interface TeachingBookCopyDao {

    int addTeachingBook(TeachingBook teachingBookCopy);

}

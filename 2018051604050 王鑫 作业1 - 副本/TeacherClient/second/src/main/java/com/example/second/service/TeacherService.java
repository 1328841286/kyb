package com.example.second.service;

import com.example.second.entity.Check;
import com.example.second.entity.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TeacherService{

    public List<Teacher> findAllTeachers();

//    public void addTeacher(Teacher teacher);

    public Check addTeacher(Teacher teacher);

    public void deleteTeacherById(Long uid);

    public void updateTeacher(Teacher teacher);

    List<Teacher> findTeacherByName(String name);

    public Integer deleteTeachersByIds(Integer[] ids);
}

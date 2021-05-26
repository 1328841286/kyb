package com.example.second.service.impl;

//import com.example.second.dao.TeacherCopyDao;
//import com.example.second.dao.TeacherCountDao;
import com.example.second.dao.TeacherDao;
import com.example.second.entity.Check;
import com.example.second.entity.Teacher;
import com.example.second.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;



@Service
@Transactional
public class TeacherServiceBean implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

//    @Autowired
//    private TeacherCountDao teacherCountDao;
//
//    @Autowired
//    TeacherCopyDao teacherCopyDao;

    public List<Teacher> findAllTeachers() {
        return this.teacherDao.findAllTeachers();
    }


//    @Transactional
//    public void addTeacher(Teacher teacher) {
//        this.teacherDao.addTeacher(teacher);
//        Integer count = this.teacherDao.getCountTeachers();
//    }

    //这里是新加的
    @Transactional
    public Check addTeacher(Teacher teacher){
        if(teacher.getAge()<20 ||teacher.getAge()>99){
            return new Check(false,"年龄必须大于20切小于99");
        }else {
            return null;
        }
    }



    //新加的结束

    public void deleteTeacherById(Long uid) {
        this.teacherDao.deleteTeacherById(uid);
        Integer count = this.teacherDao.getCountTeachers();
//        this.teacherCountDao.addCount(count);
    }

    public void updateTeacher(Teacher teacher) {

        this.teacherDao.updateTeacher(teacher);
    }

    public List<Teacher> findTeacherByName(String name) {
        return this.teacherDao.findTeacherByName(name);
    }

    public Integer deleteTeachersByIds(Integer[] ids) {
        return this.teacherDao.deleteTeachersByIds(ids);
    }

}

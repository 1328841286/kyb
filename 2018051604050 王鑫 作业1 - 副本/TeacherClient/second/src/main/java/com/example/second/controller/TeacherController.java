package com.example.second.controller;
//package com.example.second.entity;
import com.example.second.entity.Check;
import com.example.second.entity.Check;
import com.example.second.entity.Teacher;
import com.example.second.service.MenuService;
import com.example.second.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
@CrossOrigin(allowCredentials = "true")
public class TeacherController {




    @Autowired
    private TeacherService teacherService;

    @Autowired
    MenuService menuService;

    /**
     * 查询所有教师
     */
    @GetMapping("/findAllTeachers")
    public List<Teacher> findAllTeachers() {
        return this.teacherService.findAllTeachers();
    }

    /**
     * 增加教师
     */
    @PostMapping("/addTeacher")
    public Check addTeacher(@RequestBody Teacher teacher) {
        this.teacherService.addTeacher(teacher);
        return null;
    }

    /**
     * 根据教师id删除教师
     */
    @PostMapping("/deleteTeacher")
    public void deleteTeacherById(@RequestParam Long uid) {
        this.teacherService.deleteTeacherById(uid);
    }

    /**
     * 编辑教师
     */
    @PostMapping("/updateTeacher")
    public void updateTeacher(@RequestBody Teacher teacher) {
        this.teacherService.updateTeacher(teacher);
    }

    /**
     * 根据教师姓名查找教师
     */
    @GetMapping("/findTeacherByName")
    public List<Teacher> findTeacherByName(@RequestParam String name) {
        return this.teacherService.findTeacherByName(name);
    }

    /**
     * 批量删除教师
     */
    @PostMapping("/deleteTeachersByIds")
    public Integer deleteTeachersByIds(Integer[] ids) {
        return this.teacherService.deleteTeachersByIds(ids);
    }
}

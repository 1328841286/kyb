package com.example.second.controller;


import com.example.second.entity.TeachingBook;
import com.example.second.service.TeachingBookService;
import com.example.second.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachingBook")
@CrossOrigin(allowCredentials = "true")
public class TeachingBookController {

    @Autowired
    private TeachingBookService teachingBookService;

    @Autowired
    MenuService menuService;

    /**
     * 查询所有教材
     */
    @GetMapping("/findAllTeachingBooks")
    public List<TeachingBook> findAllTeachingBooks() {
        return this.teachingBookService.findAllTeachingBooks();
    }

    /**
     * 增加教材
     */
    @PostMapping("/addTeachingBook")
    public void addTeachingBook(@RequestBody TeachingBook teachingBook) {
        this.teachingBookService.addTeachingBook(teachingBook);
    }

    /**
     * 根据教材id删除教材
     */
    @PostMapping("/deleteTeachingBook")
    public void deleteTeachingBookById(@RequestParam Long uid) {
        this.teachingBookService.deleteTeachingBookById(uid);
    }

    /**
     * 编辑教材
     */
    @PostMapping("/updateTeachingBook")
    public void updateTeachingBook(@RequestBody TeachingBook teachingBook) {
        this.teachingBookService.updateTeachingBook(teachingBook);
    }

    /**
     * 根据教材姓名查找教材
     */
    @GetMapping("/findTeachingBookByName")
    public List<TeachingBook> findTeachingBookByName(@RequestParam String name) {
        return this.teachingBookService.findTeachingBookByName(name);
    }

    /**
     * 批量删除教材
     */
    @PostMapping("/deleteTeachingBooksByIds")
    public Integer deleteTeachingBooksByIds(Integer[] ids) {
        return this.teachingBookService.deleteTeachingBooksByIds(ids);
    }
}

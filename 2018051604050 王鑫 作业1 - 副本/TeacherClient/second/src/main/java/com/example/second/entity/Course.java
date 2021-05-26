package com.example.second.entity;

public class Course {
    private long uid;
    private String courseId;//课程号
    private String courseTeacher;//任课老师
    private String courseName;//课程名称；
    private String courseDiscription;//课程描述
    private String courseSemester;//开课学期
    private String courseAddress;//上课地点

    //新加的
    private String whetherTextbook;//是否预定教材
    private String textbookName;//教材名称
    private String courseDifficulty;//课程难度

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDiscription() {
        return courseDiscription;
    }

    public void setCourseDiscription(String courseDiscription) {
        this.courseDiscription = courseDiscription;
    }

    public String getCourseSemester() {
        return courseSemester;
    }

    public void setCourseSemester(String courseSemester) {
        this.courseSemester = courseSemester;
    }

    public String getCourseAddress() {
        return courseAddress;
    }

    public void setCourseAddress(String courseAddress) {
        this.courseAddress = courseAddress;
    }

    public String getWhetherTextbook() {
        return whetherTextbook;
    }

    public void setWhetherTextbook(String whetherTextbook) {
        this.whetherTextbook = whetherTextbook;
    }

    public String getTextbookName() {
        return textbookName;
    }

    public void setTextbookName(String textbookName) {
        this.textbookName = textbookName;
    }

    public String getCourseDifficulty() {
        return courseDifficulty;
    }

    public void setCourseDifficulty(String courseDifficulty) {
        this.courseDifficulty = courseDifficulty;
    }
}

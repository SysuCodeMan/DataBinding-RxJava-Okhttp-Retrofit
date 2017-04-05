package com.example.chen.coursequery.model;

/**
 * Created by Chen on 2017/4/5.
 */

public class CourseScore {
    private String courseName;
    private String gpa;
    private String rank;
    private String teacherName;

    public CourseScore(String courseName, String gpa, String rank, String teacherName) {
        this.courseName = courseName;
        this.gpa = gpa;
        this.rank = rank;
        this.teacherName = teacherName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}

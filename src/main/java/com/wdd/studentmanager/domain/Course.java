package com.wdd.studentmanager.domain;

import lombok.Data;
@Data
public class Course {
    private int id;
    private String name;
    private int teacherId;
    private String courseDate;
    private int selectedNum = 0;//已选人数
    private int maxNum = 50;//课程最大选课人数
    private String info;

}

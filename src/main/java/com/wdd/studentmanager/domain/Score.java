package com.wdd.studentmanager.domain;

import lombok.Data;

//成绩实体表
@Data
public class Score {
    private Integer id;
    private Integer studentId;
    private Integer courseId;
    private double score;
    private String remark;

    //关联表
    private String courseName;
    private String studentName;
}

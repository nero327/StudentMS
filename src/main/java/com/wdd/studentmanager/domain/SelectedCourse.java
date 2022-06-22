package com.wdd.studentmanager.domain;

import lombok.Data;

// 选课信息实体类

@Data
public class SelectedCourse {
    private Integer id;
    private Integer studentId;
    private Integer courseId;

}

package com.wdd.studentmanager.domain;

import lombok.Data;

/**
 考勤实体类
 */
@Data
public class Attendance {
    private Integer id;
    private Integer courseId;
    private Integer studentId;
    private String type;
    private String date;

}

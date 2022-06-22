package com.wdd.studentmanager.domain;

import lombok.Data;

//成绩统计

@Data
public class ScoreStats {
    private Double max_score;
    private Double avg_score;
    private Double min_score;
    private String courseName;//课程名称

}

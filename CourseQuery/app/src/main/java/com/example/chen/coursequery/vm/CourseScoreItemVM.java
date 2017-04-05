package com.example.chen.coursequery.vm;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;

import com.example.chen.coursequery.model.CourseScore;

/**
 * Created by Chen on 2017/4/5.
 */

public class CourseScoreItemVM extends BaseObservable {
    public ObservableField<String> courseName = new ObservableField<>();
    public ObservableField<String> gpa = new ObservableField<>();
    public ObservableField<String> rank = new ObservableField<>();
    public ObservableField<String> teacherName = new ObservableField<>();

    public CourseScoreItemVM(CourseScore courseScore) {
        courseName.set(courseScore.getCourseName());
        gpa.set(courseScore.getGpa());
        rank.set(courseScore.getRank());
        teacherName.set(courseScore.getTeacherName());
    }
}

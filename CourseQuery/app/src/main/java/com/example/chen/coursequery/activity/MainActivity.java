package com.example.chen.coursequery.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.chen.coursequery.R;
import com.example.chen.coursequery.databinding.LayoutMainBinding;
import com.example.chen.coursequery.vm.CourseScoreListVM;

/**
 * Created by Chen on 2017/4/5.
 */

public class MainActivity extends AppCompatActivity {
    LayoutMainBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.layout_main);
        CourseScoreListVM courseScoreListVM = new CourseScoreListVM();
        binding.setCourseScoreList(courseScoreListVM);
    }
}

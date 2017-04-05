package com.example.chen.coursequery.vm;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;

import com.example.chen.coursequery.BR;
import com.example.chen.coursequery.R;
import com.example.chen.coursequery.model.CourseScore;

import me.tatarka.bindingcollectionadapter.ItemView;
import me.tatarka.bindingcollectionadapter.ItemViewSelector;

/**
 * Created by Chen on 2017/4/5.
 */

public class CourseScoreListVM extends BaseObservable {
    @Bindable
    public ObservableList<CourseScoreItemVM> courseScoreItemVMs = new ObservableArrayList<>();

    @Bindable
    public ItemViewSelector<CourseScoreItemVM> courseScoreItemViews = new ItemViewSelector<CourseScoreItemVM>() {
        @Override
        public void select(ItemView itemView, int position, CourseScoreItemVM item) {
            itemView.set(BR.courseScoreItem, R.layout.item_coursescore);
        }

        @Override
        public int viewTypeCount() {
            return 1;
        }
    };

    public CourseScoreListVM() {
        mockData();
    }

    private void mockData() {
        for(int i = 0; i < 5; i++) {
            courseScoreItemVMs.add(new CourseScoreItemVM(new CourseScore("算法与数据结构", "3.9", "5/45", "刘聪")));
        }
    }
}

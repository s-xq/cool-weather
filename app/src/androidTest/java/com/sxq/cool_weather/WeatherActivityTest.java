package com.sxq.cool_weather;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.swipeDown;
import static android.support.test.espresso.action.ViewActions.swipeUp;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by shixiaoqiang01 on 2017/11/26.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class WeatherActivityTest {
    @Rule
    public ActivityTestRule<WeatherActivity> mActivityRule = new ActivityTestRule<WeatherActivity>(WeatherActivity.class);

    /**
     * 测试点击导航按钮
     */
    @Test
    public void testClickNavigation() {
        onView(withId(R.id.nav_button)).perform((click()));
    }

    /**
     * 测试滑动，下拉刷新数据
     */
    @Test
    public void testSwipe() {
        onView(withId(R.id.swipe_refresh)).perform(swipeUp());
        onView(withId(R.id.swipe_refresh)).perform(swipeDown());
    }

    /**
     * 测试选择地区页面的纵向滑动
     */
    @Test
    public void testListView() {
        onView(withId(R.id.list_view)).perform(swipeDown());
        onView((withId(R.id.list_view))).perform(swipeUp());
    }


    /**
     * 测试选择地区
     */
    @Test
    public void testSelectArea() {
        onView(withId(R.id.title_text)).perform(click());
    }

    /**
     * 测试点击回退按钮
     */
    @Test
    public void testBackButton() {
        onView(withId(R.id.back_button)).perform(click());
    }

}

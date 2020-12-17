package com.example.myfindshow.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myfindshow.R;
import com.example.myfindshow.base.BaseActivity;
import com.example.myfindshow.bean.NewsBaen;
import com.example.myfindshow.contract.IMyMain;
import com.example.myfindshow.prenter.MainPrenter;

import java.util.List;

public class MainActivity extends BaseActivity<MainPrenter> implements IMyMain.Iview {


    private TextView tv;

    @Override
    protected void initDatas() {

    }

    @Override
    protected void initView() {
        tv = findViewById(R.id.tv);
    }

    @Override
    protected int getView() {
        return R.layout.activity_main;
    }

    @Override
    protected MainPrenter getPrenter() {
        return new MainPrenter(this);
    }

    @Override
    public void getNews(NewsBaen newsBaen) {
        List<NewsBaen.NewsDTO> news = newsBaen.getNews();
        tv.setText(news.get(0).getTile());
    }
}
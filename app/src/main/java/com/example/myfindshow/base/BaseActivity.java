package com.example.myfindshow.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity<T extends BasePrenter> extends AppCompatActivity {
    public T Iprenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getView());
        if (Iprenter==null){
            Iprenter=getPrenter();
        }
        initView();
        initDatas();
    }

    protected abstract void initDatas();
    protected abstract void initView();
    protected abstract int getView();
    protected abstract T getPrenter();;
}
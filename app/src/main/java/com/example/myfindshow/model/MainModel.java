package com.example.myfindshow.model;

import com.example.myfindshow.contract.ICallBack;
import com.example.myfindshow.contract.IMyMain;

public class MainModel implements IMyMain.Imodel {

    @Override
    public <T> void getNews(String url, ICallBack<T> callBack) {

    }
}

package com.example.myfindshow.model;


import com.example.myfindshow.contract.IMyMain;
import com.example.mylibrarys.base.utils.ICallBack;
import com.example.mylibrarys.base.utils.MyNetworkframework;


public class MainModel implements IMyMain.Imodel {
    @Override
    public <T> void getNews(String url, ICallBack<T> callBack) {
        MyNetworkframework.getInstance().get(url,callBack);
    }
}

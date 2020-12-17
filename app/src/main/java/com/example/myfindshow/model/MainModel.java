package com.example.myfindshow.model;

import com.example.myfindshow.contract.ICallBack;
import com.example.myfindshow.contract.IMyMain;
import com.example.myfindshow.utils.MyNetworkframework;

public class MainModel implements IMyMain.Imodel {
     //   private IMyMain.Iprenter iprenter;
    @Override
    public <T> void getNews(String url, ICallBack<T> callBack) {
        //MyNetworkframework.getmyNetworkframework().get(url,callBack);
       // getmyNetworkframework
        MyNetworkframework.getmyNetworkframework().get(url,callBack);
    }
}

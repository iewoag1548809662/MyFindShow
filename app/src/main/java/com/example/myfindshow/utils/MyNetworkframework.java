package com.example.myfindshow.utils;

import com.example.myfindshow.contract.ICallBack;

import java.util.HashMap;

public class MyNetworkframework implements InewsGson {

    public static MyNetworkframework myNetworkframework;

    public static MyNetworkframework getInstance(){
        if (myNetworkframework==null){
            synchronized (MyNetworkframework.class){
                if (myNetworkframework==null){
                    myNetworkframework =new MyNetworkframework();
                }
            }
        }
        return myNetworkframework;
    }

    public MyNetworkframework(){
        
    }
    @Override
    public <D> void get(String url, ICallBack<D> callBack) {

    }

    @Override
    public <D> void post(String url, ICallBack<D> callBack) {

    }

    @Override
    public <D> void post(String url, HashMap<String, String> map, ICallBack<D> callBack) {

    }
}

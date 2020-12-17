package com.example.myfindshow.utils;

import com.example.myfindshow.contract.ICallBack;

import java.util.HashMap;

public interface InewsGson {
    <D> void get(String url, ICallBack<D> callBack);
    <D> void post(String url, ICallBack<D> callBack);
    <D> void post(String url, HashMap<String,String> map, ICallBack<D> callBack);
}

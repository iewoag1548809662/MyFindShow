package com.example.mylibrarys.base.utils;

public interface ICallBack<D> {
    void getSuccess(D d);
    void getFails();
}

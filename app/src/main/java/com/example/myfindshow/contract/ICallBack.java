package com.example.myfindshow.contract;

public interface ICallBack<D> {
    void getSuccess(D d);
    void getFails();
}

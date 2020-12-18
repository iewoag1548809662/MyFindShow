package com.example.mylibrarys.base;

public abstract class BasePrenter<D extends BaseView,M extends BaseModel> {
    public D Iview;
    public M IModel;
    public void addACter(D iview) {
        Iview = iview;
        IModel =getIModel();
    }
    public void detachView(){
        Iview = null;
        IModel =null;
    }

    protected abstract M getIModel();



}

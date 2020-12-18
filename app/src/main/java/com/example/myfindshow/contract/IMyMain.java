package com.example.myfindshow.contract;

import com.example.myfindshow.bean.NewsBaen;
import com.example.mylibrarys.base.BaseModel;
import com.example.mylibrarys.base.BaseView;
import com.example.mylibrarys.base.utils.ICallBack;

public interface IMyMain {

    interface Imodel extends BaseModel {
        <T> void getNews (String url, ICallBack<T> callBack);
    }
    interface Iprenter{
        void getNews();
    }
    interface Iview extends BaseView {
        void getNews(NewsBaen newsBaen);
    }
}

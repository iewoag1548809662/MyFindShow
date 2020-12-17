package com.example.myfindshow.contract;

import com.example.myfindshow.base.BaseView;
import com.example.myfindshow.bean.NewsBaen;

public interface IMyMain {

    interface Imodel{
        <T> void getNews(String url, ICallBack<T> callBack);
    }
    interface Iprenter{
        void getNews();
    }
    interface Iview extends BaseView {
        void getNews(NewsBaen newsBaen);
    }
}

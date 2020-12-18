package com.example.myfindshow.prenter;


import com.example.myfindshow.bean.NewsBaen;

import com.example.myfindshow.contract.IMyMain;
import com.example.myfindshow.model.MainModel;
import com.example.mylibrarys.base.BasePrenter;
import com.example.mylibrarys.base.utils.ICallBack;
import com.example.mylibrarys.base.utils.MyUel;

//开始操作111

public class MainPrenter extends BasePrenter<IMyMain.Iview,IMyMain.Imodel> implements IMyMain.Iprenter {

    @Override
    public void getNews() {
        IModel.getNews(MyUel.NEWL_URL, new ICallBack<NewsBaen>() {
            @Override
            public void getSuccess(NewsBaen newsBaen) {
                Iview.getNews(newsBaen);
            }

            @Override
            public void getFails() {

            }
        });
    }

    @Override
    protected IMyMain.Imodel getIModel() {
        return new MainModel();
    }
}

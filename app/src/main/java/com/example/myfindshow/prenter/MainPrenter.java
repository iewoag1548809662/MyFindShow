package com.example.myfindshow.prenter;

import com.example.myfindshow.base.BasePrenter;
import com.example.myfindshow.bean.NewsBaen;
import com.example.myfindshow.contract.ICallBack;
import com.example.myfindshow.contract.IMyMain;
import com.example.myfindshow.model.MainModel;
import com.example.myfindshow.utils.MyUel;

public class MainPrenter extends BasePrenter<IMyMain.Iview> implements IMyMain.Iprenter {
    public IMyMain.Imodel imodel;

    public MainPrenter() {
        this.imodel = new MainModel();
    }

    @Override
    public void getNews() {
        imodel.getNews(MyUel.NEWL_URL, new ICallBack<NewsBaen>() {
            @Override
            public void getSuccess(NewsBaen newsBaen) {
                Iview.getNews(newsBaen);
            }

            @Override
            public void getFails() {

            }
        });
    }
}

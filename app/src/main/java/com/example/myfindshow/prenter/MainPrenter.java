package com.example.myfindshow.prenter;

import com.example.myfindshow.base.BasePrenter;
import com.example.myfindshow.contract.IMyMain;
import com.example.myfindshow.model.MainModel;

public class MainPrenter extends BasePrenter<IMyMain.Iview> implements IMyMain.Iprenter {
    public IMyMain.Imodel imodel;

    public MainPrenter(IMyMain.Imodel imodel) {
        this.imodel = new MainModel();
    }

    @Override
    public void getNews() {

    }
}

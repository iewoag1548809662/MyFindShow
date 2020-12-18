package com.example.myfindshow.view;

import android.view.View;
import android.widget.TextView;

import com.example.myfindshow.R;
import com.example.myfindshow.bean.NewsBaen;
import com.example.myfindshow.contract.IMyMain;
import com.example.myfindshow.prenter.MainPrenter;
import com.example.mylibrarys.base.BaseFragment;

import java.util.List;


public class BlankFragment extends BaseFragment<MainPrenter> implements IMyMain.Iview {


    private TextView tv;

    @Override
    protected int getViewLayout() {
        return R.layout.fragment_blank;
    }

    @Override
    protected void initDatas() {
        Ipresenter.getNews();
    }

    @Override
    protected MainPrenter getPresenter() {
        return new MainPrenter();
    }

    @Override
    protected void initView(View inflate) {
        tv = inflate.findViewById(R.id.tvss);

    }

    @Override
    public void getNews(NewsBaen newsBaen) {
        List<NewsBaen.NewsDTO> news = newsBaen.getNews();
        tv.setText(news.get(0).getTile());
    }
}
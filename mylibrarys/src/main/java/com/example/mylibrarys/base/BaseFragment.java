package com.example.mylibrarys.base;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public abstract class BaseFragment<T extends BasePrenter> extends Fragment implements BaseView{

    protected T Ipresenter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(getViewLayout(),container,false);
        if (Ipresenter==null){
            Ipresenter=getPresenter();
            Ipresenter.addACter(this);
        }
        initView(inflate);
        initDatas();
        return inflate;
    }

    protected abstract int getViewLayout();
    protected abstract void initDatas();
    protected abstract T getPresenter();
    protected abstract void initView(View inflate);
}

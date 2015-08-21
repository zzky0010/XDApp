package xdapp.cn.shell.com.xdapp.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;


import java.util.List;

import xdapp.cn.shell.com.xdapp.interfaces.AdapterRespondent;
import xdapp.cn.shell.com.xdapp.interfaces.UIRespondent;

public abstract class ContentFragmentBase<T> extends Fragment implements UIRespondent<T>, AdapterRespondent, SwipeRefreshLayout.OnRefreshListener {


    @Override
    public void onInitializeStart() {

    }

    @Override
    public void onInitializeDone(Exception e, List<T> data) {

    }

    @Override
    public void onLoadingMoreStart() {

    }

    @Override
    public void onLoadMoreDone(Exception e, List<T> data) {

    }

    @Override
    public void onRefreshingStart() {

    }

    @Override
    public void onRefreshDone(Exception e, List<T> data) {

    }

    @Override
    public void onEnd() {

    }
}

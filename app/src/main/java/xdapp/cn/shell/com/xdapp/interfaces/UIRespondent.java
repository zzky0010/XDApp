package xdapp.cn.shell.com.xdapp.interfaces;

import java.util.List;

public interface UIRespondent<T> {

    void onInitializeStart();

    void onInitializeDone(Exception e, List<T> data);

    void onLoadingMoreStart();

    void onLoadMoreDone(Exception e, List<T> data);

    void onRefreshingStart();

    void onRefreshDone(Exception e, List<T> data);

    void onEnd();

}

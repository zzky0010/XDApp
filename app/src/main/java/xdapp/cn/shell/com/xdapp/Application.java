package xdapp.cn.shell.com.xdapp;

import com.avos.avoscloud.AVOSCloud;

/**
 * Created by shell on 15/8/14.
 */
public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AVOSCloud.initialize(getApplicationContext(),"fkysmqq7764a492wojb24br0733f7umfwswj10q1rj7fx2lk","asxf4ljb5incnjibn7axteh4u30hmcwxajhyjeiwqtd2ir1a");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}

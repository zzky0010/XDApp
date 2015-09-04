package xdapp.cn.shell.com.xdapp;

import android.content.Context;

import com.avos.avoscloud.AVOSCloud;
import com.avos.avoscloud.AVObject;

import xdapp.cn.shell.com.xdapp.model.Item;
import xdapp.cn.shell.com.xdapp.model.Note;
import xdapp.cn.shell.com.xdapp.model.NoteItem;

/**
 * Created by shell on 15/8/14.
 */
public class Application extends android.app.Application {
    public static Context sContext;
    @Override
    public void onCreate() {
        super.onCreate();
        sContext = this;
        AVObject.registerSubclass(NoteItem.class);
        AVObject.registerSubclass(Note.class);
        AVObject.registerSubclass(Item.class);
        AVOSCloud.initialize(getApplicationContext(),"fkysmqq7764a492wojb24br0733f7umfwswj10q1rj7fx2lk","asxf4ljb5incnjibn7axteh4u30hmcwxajhyjeiwqtd2ir1a");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}

package xdapp.cn.shell.com.xdapp.model;

import com.avos.avoscloud.AVClassName;
import com.avos.avoscloud.AVObject;

/**
 * Created by Administrator on 2015/8/16.
 */
@AVClassName("Item")
public class Item extends AVObject {
    public Item()
    {
        super();
    }
    public String getName()
    {
        return getString("Name");
    }
    public String getURL()
    {
        return getString("URL");
    }
}

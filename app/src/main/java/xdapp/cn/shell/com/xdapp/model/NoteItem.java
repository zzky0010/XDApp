package xdapp.cn.shell.com.xdapp.model;

import com.avos.avoscloud.AVClassName;
import com.avos.avoscloud.AVObject;

import java.util.List;

/**
 * Created by Administrator on 2015/8/16.
 */
@AVClassName("NoteItem")
public class NoteItem extends AVObject{
    public NoteItem()
    {
        super();
    }
    public String getName()
    {
        return getString("Name");
    }
    public List<Item> getItems()
    {
        return getList("Items",Item.class);
    }
}

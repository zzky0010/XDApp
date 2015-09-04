package xdapp.cn.shell.com.xdapp.model;

import com.avos.avoscloud.AVClassName;
import com.avos.avoscloud.AVObject;

import java.util.List;

/**
 * Created by Administrator on 2015/8/15.
 */
@AVClassName("Note")
public class Note extends AVObject{
    public Note(){
        super();
    }
    public String getName()
    {
        return getString("Name");
    }
    public String getDate()
    {
        return getString("Date");
    }
    public String getMMUrl()
    {
        return getString("MMURL");
    }
    public List<NoteItem> getNoteItems()
    {
        return getList("NoteItems", NoteItem.class);
    }
}

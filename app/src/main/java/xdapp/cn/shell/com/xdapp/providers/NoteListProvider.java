package xdapp.cn.shell.com.xdapp.providers;


import java.util.List;

import xdapp.cn.shell.com.xdapp.actions.DataController;
import xdapp.cn.shell.com.xdapp.model.Note;

public class NoteListProvider extends DataController<Note> {


    public List<Note> getData() throws Exception {

       return  null;
    }

    public List<Note> getLatest() throws Exception {
       return  null;
    }

    @Override
    public List<Note> doInitialize() throws Exception {
        return getData();
    }

    @Override
    public List<Note> doRefresh() throws Exception {
        return getLatest();
    }

    @Override
    public List<Note> doMore() throws Exception {
        return getData();
    }
}

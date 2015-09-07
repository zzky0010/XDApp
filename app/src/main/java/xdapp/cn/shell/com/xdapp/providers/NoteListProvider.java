package xdapp.cn.shell.com.xdapp.providers;


import android.util.Log;

import com.avos.avoscloud.AVQuery;

import java.util.List;

import xdapp.cn.shell.com.xdapp.XDSingleTon;
import xdapp.cn.shell.com.xdapp.actions.DataController;
import xdapp.cn.shell.com.xdapp.model.Item;
import xdapp.cn.shell.com.xdapp.model.Note;
import xdapp.cn.shell.com.xdapp.model.NoteItem;

public class NoteListProvider extends DataController<Note> {


    public List<Note> getData() throws Exception {
        AVQuery<Note> Note_query = AVQuery.getQuery("Note");
        Note_query.include("NoteItems");
        Note_query.include("NoteItems.Items");
        List<Note> noteList = Note_query.find();
//        for(Note note:noteList)
//        {
//            for(NoteItem noteItem:note.getNoteItems())
//            {
//                for(Item item:noteItem.getItems())
//                {
//                    item = item.fetchItem();
//                }
//            }
//        }
//        int size = noteList.get(0).getNoteItems().get(0).getItems().size();
//        String type = noteList.get(0).getNoteItems().get(0).getItems().get(0).getName();
//        Log.d("",type + size);
        XDSingleTon.getSingleton().SetNoteList(noteList);
       return  noteList;
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

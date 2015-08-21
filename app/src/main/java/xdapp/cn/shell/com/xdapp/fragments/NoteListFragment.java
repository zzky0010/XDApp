package xdapp.cn.shell.com.xdapp.fragments;

import android.support.v7.widget.RecyclerView;

import xdapp.cn.shell.com.xdapp.actions.DataController;
import xdapp.cn.shell.com.xdapp.adapters.NoteListAdapter;
import xdapp.cn.shell.com.xdapp.model.Note;
import xdapp.cn.shell.com.xdapp.providers.NoteListProvider;


public class NoteListFragment extends CommonFragment<Note> {
    @Override
    protected DataController<Note> onGenerateDataController() {
        return new NoteListProvider();
    }

    @Override
    protected RecyclerView.Adapter onGenerateAdapter(DataController<Note> controller) {
        return new NoteListAdapter(getActivity(), controller);
    }

    @Override
    protected boolean enableRefresh() {
        return true;
    }
}

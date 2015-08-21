package xdapp.cn.shell.com.xdapp.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import xdapp.cn.shell.com.xdapp.actions.DataController;
import xdapp.cn.shell.com.xdapp.holders.EntryViewHolder;
import xdapp.cn.shell.com.xdapp.model.Note;


public class NoteListAdapter extends ContentAdapterBase<Note> {

    private Context mContext;

    public NoteListAdapter(Context context, DataController<Note> dataController) {
        super(context, dataController);
        this.mContext = context;
    }


    @Override
    protected RecyclerView.ViewHolder onCreateCustomContentHolder(ViewGroup parent, int viewType) {
        return EntryViewHolder.create(mContext, parent);
    }

    @Override
    protected void onBindCustomViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((EntryViewHolder) holder).onBindViewHolder(mDataController.getData(position));
    }

}

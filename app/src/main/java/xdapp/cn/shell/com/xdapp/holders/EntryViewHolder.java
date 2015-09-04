package xdapp.cn.shell.com.xdapp.holders;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;

import xdapp.cn.shell.com.xdapp.R;
import xdapp.cn.shell.com.xdapp.adapters.NoteListAdapter;
import xdapp.cn.shell.com.xdapp.model.Note;
import xdapp.cn.shell.com.xdapp.widget.RatioImageView;

public class EntryViewHolder extends RecyclerView.ViewHolder {
    public final RatioImageView thumb;
    public final TextView title;
    public static View parent;
    private static NoteListAdapter mAdapter;
    private EntryViewHolder(View itemView) {
        super(itemView);
        thumb = (RatioImageView) itemView.findViewById(R.id.thumb);
        title = (TextView) itemView.findViewById(R.id.title);
        parent = itemView;
    }

    public static EntryViewHolder create(NoteListAdapter adapter,final Context context, ViewGroup parent) {
        mAdapter = adapter;
        EntryViewHolder.parent = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_item, parent, false);

        return new EntryViewHolder(EntryViewHolder.parent);
    }

    public void onBindViewHolder(Note entry) {
        parent.setTag(entry);
        title.setText(entry.getName());
        thumb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAdapter.mOnMMClickListener.OnMMClick(thumb,title,thumb,entry.getMMUrl(),entry.getName(),entry.getDate());
            }
        });
        EntryViewHolder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAdapter.mOnMMClickListener.OnMMClick(title,title,thumb,entry.getMMUrl(),entry.getName(),entry.getDate());
            }
        });
        thumb.setOriginalSize((int) (50), 50);

        Glide.with(thumb.getContext())
                .load(entry.getMMUrl())
                .centerCrop()
                .into(thumb);
    }

}

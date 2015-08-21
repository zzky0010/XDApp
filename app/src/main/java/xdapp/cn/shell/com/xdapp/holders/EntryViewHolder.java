package xdapp.cn.shell.com.xdapp.holders;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import xdapp.cn.shell.com.xdapp.R;
import xdapp.cn.shell.com.xdapp.model.Note;

public class EntryViewHolder extends RecyclerView.ViewHolder {
    public final ImageView thumb;
    public final TextView title, content, time;
    public final View parent;

    private EntryViewHolder(View itemView) {
        super(itemView);
        thumb = (ImageView) itemView.findViewById(R.id.thumb);
        title = (TextView) itemView.findViewById(R.id.title);
        content = (TextView) itemView.findViewById(R.id.content);
        time = (TextView) itemView.findViewById(R.id.time);
        parent = itemView;
    }

    public static EntryViewHolder create(final Context context, ViewGroup parent) {
        View v = LayoutInflater.from(context).inflate(R.layout.note_item, parent, false);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return new EntryViewHolder(v);
    }

    public void onBindViewHolder(Note entry) {
        parent.setTag(entry);

    }
}

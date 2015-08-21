package xdapp.cn.shell.com.xdapp.holders;

import android.support.v4.widget.ContentLoadingProgressBar;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import xdapp.cn.shell.com.xdapp.R;


public class FooterViewHolder extends RecyclerView.ViewHolder {
    public final ContentLoadingProgressBar progressBar;
    public final TextView tips;

    public FooterViewHolder(View itemView) {
        super(itemView);
        progressBar = (ContentLoadingProgressBar) itemView.findViewById(R.id.loading_more_progress);
        tips = (TextView) itemView.findViewById(R.id.loading_more_tips);
    }

    public void onBindViewHolder() {
        tips.setText("到头了");
        tips.setVisibility(View.VISIBLE);
        progressBar.hide();
    }
}

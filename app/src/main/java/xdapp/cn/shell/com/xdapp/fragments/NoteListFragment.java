package xdapp.cn.shell.com.xdapp.fragments;

import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import xdapp.cn.shell.com.xdapp.actions.DataController;
import xdapp.cn.shell.com.xdapp.adapters.NoteListAdapter;
import xdapp.cn.shell.com.xdapp.interfaces.OnMMClickListener;
import xdapp.cn.shell.com.xdapp.model.Note;
import xdapp.cn.shell.com.xdapp.providers.NoteListProvider;
import xdapp.cn.shell.com.xdapp.ui.PictureActivity;
import xdapp.cn.shell.com.xdapp.ui.TecActivity;


public class NoteListFragment extends CommonFragment<Note> {
    private NoteListAdapter mNoteListAdapter;
    @Override
    protected DataController<Note> onGenerateDataController() {
        return new NoteListProvider();
    }

    @Override
    protected RecyclerView.Adapter onGenerateAdapter(DataController<Note> controller) {
        mNoteListAdapter = new NoteListAdapter(getActivity(), controller);
        mNoteListAdapter.setOnMeizhiClick(new OnMMClickListener() {
            @Override
            public void OnMMClick(View v, View title_View, View mm_View, String mm_url, String title,String date) {
                if(v == null)return;
                else if(v == title_View)
                {
                    Intent intent = new Intent(getActivity(), TecActivity.class);
                    intent.putExtra(TecActivity.EXTRA_GANK_DATE, date);
                    startActivity(intent);
                }
                else if(v == mm_View)
                {
                    Picasso.with(getActivity()).load(mm_url).fetch(new Callback() {
                        @Override
                        public void onSuccess() {
                            startPictureActivity(mm_url,title,mm_View);
                        }

                        @Override
                        public void onError() {
                        }
                    });
                }
            }
        });
        return mNoteListAdapter;
    }

    @Override
    protected boolean enableRefresh() {
        return true;
    }
    private void startPictureActivity(String mm_url,String title, View transitView) {
        Intent i = new Intent(getActivity(), PictureActivity.class);
        i.putExtra(PictureActivity.EXTRA_IMAGE_URL, mm_url);
        i.putExtra(PictureActivity.EXTRA_IMAGE_TITLE, title);

        ActivityOptionsCompat optionsCompat =
                ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(), transitView,
                        PictureActivity.TRANSIT_PIC);
        ActivityCompat.startActivity(getActivity(), i, optionsCompat.toBundle());
    }
}

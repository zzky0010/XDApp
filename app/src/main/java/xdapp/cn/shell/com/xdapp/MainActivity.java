package xdapp.cn.shell.com.xdapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVObject;
import com.avos.avoscloud.AVUser;
import com.google.gson.Gson;

import xdapp.cn.shell.com.xdapp.model.Note;
import xdapp.cn.shell.com.xdapp.model.NoteItem;
import xdapp.cn.shell.com.xdapp.model.SubItem;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Thread(new Runnable() {
            @Override
            public void run() {
                 Note note = new Note();
                note.setDate("77777");
                note.setICON_URL("2222");
                note.setName("23333");
                NoteItem n_item = new NoteItem();
                n_item.setType(1);
                n_item.setTypeName("4444");
                SubItem s_item = new SubItem();
                s_item.setDes("55555");
                s_item.setLink("66666");
                n_item.addSubItems(s_item);
                note.setItem(n_item);

                AVObject notetable = new AVObject("Note");
                Gson g = new Gson();
                String json = g.toJson(note, note.getClass());
                notetable.put("JSON",json);
                try {
                    notetable.save();
                } catch (AVException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

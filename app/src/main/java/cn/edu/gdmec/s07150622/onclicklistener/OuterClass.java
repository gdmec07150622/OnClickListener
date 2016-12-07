package cn.edu.gdmec.s07150622.onclicklistener;

import android.app.Activity;
import android.view.View;
import android.widget.Toast;



public class OuterClass implements View.OnClickListener {
   private Activity MainActivity;

    public OuterClass(Activity MainActivity) {
        this.MainActivity = MainActivity;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity,"外部类的监听",Toast.LENGTH_LONG).show();
    }
}


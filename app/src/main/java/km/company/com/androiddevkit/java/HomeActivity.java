package km.company.com.androiddevkit.java;

import android.os.Bundle;
import android.support.annotation.Nullable;

import km.company.com.androiddevkit.R;
import km.company.com.androiddevkit.java.base.BaseActivity;
import km.company.com.androiddevkit.java.utils.Log;

public class HomeActivity extends BaseActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Log.log("java");

        toast("java toast");
    }
}

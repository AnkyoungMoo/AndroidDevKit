package km.company.com.androiddevkit.java;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import km.company.com.androiddevkit.java.base.BaseActivity;
import km.company.com.androiddevkit.java.utils.Log;

public class HomeActivity extends BaseActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        Log.log("java");

        toast("java toast");
    }
}

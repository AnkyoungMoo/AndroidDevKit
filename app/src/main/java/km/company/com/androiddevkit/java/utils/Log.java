package km.company.com.androiddevkit.java.utils;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

public class Log {

    public static void log(Object any) {
        Logger.addLogAdapter(new AndroidLogAdapter());
        if(any == null) {
            log("null");
            return;
        }

        if(any.getClass() == Throwable.class) {
            Logger.e(new Throwable((String) any).getMessage());
        } else {
            Logger.d(any.toString());
        }
    }
}

package walinns.com.starterproject;

import android.app.Application;
import android.support.multidex.MultiDex;

/**
 * Created by walinnsinnovation on 22/02/18.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);
    }
}

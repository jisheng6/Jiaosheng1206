package com.example.adminjs.jiaosheng1206;

import android.app.Activity;
import android.os.Bundle;


/**
 * Created by Adminjs on 2017/12/6.
 */

public abstract class BaseMVPActivity<V,T extends BasePresenter<V>> extends Activity {
//              class BaseMvpActivity<LoginView,LoginPresenter extends BasePresneter<LoginView>> extends Activity {

    public T t;

    public abstract T initPresenter();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        t = initPresenter();





    }


    @Override
    protected void onResume() {
        super.onResume();
        t.attach((V) this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        t.detach();
    }
}

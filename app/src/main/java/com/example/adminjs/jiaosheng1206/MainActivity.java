package com.example.adminjs.jiaosheng1206;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.Toast;

import com.example.adminjs.jiaosheng1206.adapter.MyAdapter;
import com.example.adminjs.jiaosheng1206.bean.Bean;
import com.example.adminjs.jiaosheng1206.presenter.MainPresenter;
import com.example.adminjs.jiaosheng1206.view.MaView;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.List;

public class MainActivity extends BaseMVPActivity<MaView,MainPresenter> implements MaView{

    private XRecyclerView xr;
    private MyAdapter adapter;

    public MainPresenter initPresenter(){
        return  new MainPresenter();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t.login();
        xr = findViewById(R.id.xrecyclerview);
        LinearLayoutManager manager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        xr.setLayoutManager(manager);
        //适配器
        adapter = new MyAdapter(MainActivity.this);
        xr.setAdapter(adapter);
    }

    @Override
    public void success(Bean bean) {
        adapter.addData(bean);
        Toast.makeText(MainActivity.this,bean.toString(),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void failure() {

    }
}

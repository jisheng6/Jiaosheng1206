package com.example.adminjs.jiaosheng1206.presenter;

import com.example.adminjs.jiaosheng1206.BasePresenter;
import com.example.adminjs.jiaosheng1206.bean.Bean;
import com.example.adminjs.jiaosheng1206.model.MoldelImpl;
import com.example.adminjs.jiaosheng1206.view.MaView;

/**
 * Created by Adminjs on 2017/12/6.
 */

public class MainPresenter extends BasePresenter<MaView>{
   public MoldelImpl moldel;
    public MainPresenter() {
        this.moldel = new MoldelImpl();
    }
    public void login(){
        moldel.getData(new MoldelImpl.ModelCallBack() {
            @Override
            public void success(Bean bean) {
                view.success(bean);
            }
        });
    }
}

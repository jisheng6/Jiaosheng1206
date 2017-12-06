package com.example.adminjs.jiaosheng1206;

import com.example.adminjs.jiaosheng1206.bean.Bean;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by Adminjs on 2017/12/6.
 */

public interface Inters {
    @GET("/nba")
    Observable<Bean> get(@QueryMap Map<String,String> map);

}

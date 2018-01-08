package com.mipl.rxandroiddemo.retrofit;


import com.mipl.rxandroiddemo.Android;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AllService {

    @GET("android/jsonarray/")
    Observable<List<Android>> register();

}
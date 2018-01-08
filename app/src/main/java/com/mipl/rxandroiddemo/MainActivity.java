package com.mipl.rxandroiddemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.mipl.rxandroiddemo.databinding.ActivityMainBinding;

import rx.Observable;
import rx.Observer;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Observable<String> mObservable;
    private Observer<String> mObserver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suscribeNow();
            }
        });

        mObservable = Observable.just("This is the updated text!");

        mObserver = new Observer<String>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(String s) {
                binding.tv.setText(s);
            }
        };
    }


    private void suscribeNow(){
        mObservable.subscribe(mObserver);
    }
}

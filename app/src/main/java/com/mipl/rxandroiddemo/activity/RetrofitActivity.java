package com.mipl.rxandroiddemo.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.mipl.rxandroiddemo.R;
import com.mipl.rxandroiddemo.databinding.ActivityRetrofitBinding;

import io.reactivex.disposables.Disposable;

/**
 * Created by MIPL on 1/8/2018.
 */

public class RetrofitActivity extends AppCompatActivity {

    private ActivityRetrofitBinding binding;
    private Disposable disposable;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_retrofit);

        binding.btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}

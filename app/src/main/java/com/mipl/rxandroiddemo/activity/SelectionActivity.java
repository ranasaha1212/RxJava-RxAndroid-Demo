package com.mipl.rxandroiddemo.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.mipl.rxandroiddemo.MainActivity;
import com.mipl.rxandroiddemo.R;
import com.mipl.rxandroiddemo.databinding.ActivitySelectionBinding;

/**
 * Created by Rana Saha Roy on 1/8/2018.
 */

public class SelectionActivity extends AppCompatActivity implements View.OnClickListener{

    private ActivitySelectionBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_selection);

        binding.btnTextviewExample.setOnClickListener(this);
        binding.btnRetrofitExample.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_textview_example:
                startActivity(new Intent(SelectionActivity.this, MainActivity.class));
                break;
            case R.id.btn_retrofit_example:
                break;
        }
    }
}

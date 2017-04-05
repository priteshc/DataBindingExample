package com.data.databindingsample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.data.databindingsample.Interface.MainActivityContract;
import com.data.databindingsample.databinding.ActivityMainBinding;
import com.data.databindingsample.pojo.User;
import com.data.databindingsample.presenter.MainActivityPresenter;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainActivityPresenter mainActivityPresenter = new MainActivityPresenter(this);
        User userData = new User("pritesh");
        binding.setUser(userData);
       // binding.setPresenter(mainActivityPresenter);



    }

    @Override
    public void showData(User userData) {
        String user = userData.getFname();
        Toast.makeText(this, user, Toast.LENGTH_SHORT).show();

    }
}

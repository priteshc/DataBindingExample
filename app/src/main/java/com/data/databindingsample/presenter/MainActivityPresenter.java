package com.data.databindingsample.presenter;

import com.data.databindingsample.Interface.MainActivityContract;
import com.data.databindingsample.pojo.User;

/**
 * Created by pritesh on 4/5/2017.
 */

public class MainActivityPresenter {

    private MainActivityContract.View view;


    public MainActivityPresenter(MainActivityContract.View view) {
        this.view = view;
    }


    public void onShowData(User userData) {
        view.showData(userData);
    }

}

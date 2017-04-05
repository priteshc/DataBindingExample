package com.data.databindingsample.Interface;

import com.data.databindingsample.pojo.User;

/**
 * Created by pritesh on 4/5/2017.
 */

public interface MainActivityContract {


    public interface Presenter {
        void onShowData(User userData);
    }

    public interface View {
        void showData(User userData);
    }


}

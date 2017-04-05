package com.data.databindingsample.pojo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.data.databindingsample.BR;

/**
 * Created by pritesh on 4/5/2017.
 */

public class User extends BaseObservable {


    String fname,lname;

    public User(String fname) {
        this.fname = fname;

    }

    @Bindable
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
        notifyPropertyChanged(BR.fname);
    }



}

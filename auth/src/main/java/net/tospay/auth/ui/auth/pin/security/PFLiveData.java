package net.tospay.auth.ui.auth.pin.security;

import androidx.lifecycle.LiveData;

public class PFLiveData<T> extends LiveData<T> {

    public void setData(T data) {
        setValue(data);
    }

}
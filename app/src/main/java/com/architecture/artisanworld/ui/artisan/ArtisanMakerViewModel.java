package com.architecture.artisanworld.ui.artisan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ArtisanMakerViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ArtisanMakerViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
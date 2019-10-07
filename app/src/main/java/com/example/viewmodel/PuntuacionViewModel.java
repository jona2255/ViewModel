package com.example.viewmodel;
import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class PuntuacionViewModel extends AndroidViewModel {

    public int puntosA, puntosB;

    public PuntuacionViewModel(@NonNull Application application) {
        super(application);


    }
}
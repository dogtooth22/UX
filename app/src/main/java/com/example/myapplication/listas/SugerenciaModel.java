package com.example.myapplication.listas;

import android.media.Image;
import android.widget.ImageView;

public class SugerenciaModel {
    private String Name;
    private String Job;
    private String Ubication;
    private int IdR;

    public SugerenciaModel(String name, String job, String ubication, int idR) {
        Name = name;
        Job = job;
        Ubication = ubication;
        IdR = idR;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    public String getUbication() {
        return Ubication;
    }

    public void setUbication(String ubication) {
        Ubication = ubication;
    }

    public int getIdR() {
        return IdR;
    }

    public void setIdR(int idR) {
        IdR = idR;
    }
}

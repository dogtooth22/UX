package com.example.myapplication.listas;

import android.media.Image;
import android.widget.ImageView;

import java.io.Serializable;

public class SugerenciaModel implements Serializable {
    private String Name;
    private String Job;
    private String Ubication;
    private String Number;
    private String Mail;
    private int IdR;

    public SugerenciaModel(String name, String job, String ubication, String number, String mail, int idR) {
        Name = name;
        Job = job;
        Ubication = ubication;
        Number = number;
        Mail = mail;
        IdR = idR;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

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

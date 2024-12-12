package com.immo.immoApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

public class Biens {

    private String biensID;
    private String biensName;
    private int prix;

    public Biens(String biensID, String biensName, int prix) {
        this.biensID = biensID;
        this.biensName = biensName;
        this.prix = prix;
    }

    public String getBiensID() {
        return biensID;
    }

    public void setBiensID(String biensID) {
        this.biensID = biensID;
    }

    public String getBiensName() {
        return biensName;
    }

    public void setBiensName(String biensName) {
        this.biensName = biensName;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Biens{" +
                "biensID='" + biensID + '\'' +
                ", biensName='" + biensName + '\'' +
                ", prix=" + prix +
                '}';
    }
}

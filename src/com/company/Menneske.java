package com.company;

public class Menneske {


    public IEgenskaber getiEgenskaber() {
        return iEgenskaber;
    }

    public void setiEgenskaber(IEgenskaber iEgenskaber) {
        this.iEgenskaber = iEgenskaber;
    }

    IEgenskaber iEgenskaber = null;

    public String behov() {

        return "spise og sove";

    }

}

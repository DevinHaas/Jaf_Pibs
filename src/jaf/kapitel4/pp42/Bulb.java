package jaf.kapitel4.pp42;

public class Bulb {
    private boolean light;

    public Bulb(boolean light){
        this.light = light;
    }

    public void setLight(boolean light) {
        this.light = light;
    }

    public String isLight() {
        if (this.light){
            return "Light is on";
        }
        else{
            return "Light is off";
        }
    }

}

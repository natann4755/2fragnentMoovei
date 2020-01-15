package com.example.frame2;

public class datamoovei {
    private String titel;
    private String text;
    private int imeg;

    public datamoovei(String titel, String text, int imeg) {
        this.titel = titel;
        this.text = text;
        this.imeg = imeg;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImeg() {
        return imeg;
    }

    public void setImeg(int imeg) {
        this.imeg = imeg;
    }
}

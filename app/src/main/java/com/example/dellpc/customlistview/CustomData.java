package com.example.dellpc.customlistview;

import android.widget.TextView;

/**
 * Created by DELL pc on 15-05-2018.
 */

public class CustomData {
    private char icon;
    private String name;
    private String number;

    public CustomData(String n, String nu) {

        name = n;
        number = nu;
        icon = name.charAt(0);

    }
    public CustomData() {
    }
    public char getIcon() {
        return icon;
    }

    public void setIcon(char icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

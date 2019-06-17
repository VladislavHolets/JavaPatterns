package com.sefl.kpi.builder;

public class Phone {
    private int display_h;
    private int display_w;
    private String name;

    @Override
    public String toString() {
        return "Phone{" +
                "display_h=" + display_h +
                ", display_w=" + display_w +
                ", name='" + name + '\'' +
                '}';
    }

    public int getDisplay_h() {
        return display_h;
    }

    public void setDisplay_h(int display_h) {
        this.display_h = display_h;
    }

    public int getDisplay_w() {
        return display_w;
    }

    public void setDisplay_w(int display_w) {
        this.display_w = display_w;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

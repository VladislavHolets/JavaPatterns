package com.sefl.kpi.factory;

import com.sefl.kpi.builder.Phone;

public class Nokla extends Phone {
    @Override
    public void setDisplay_h(int display_h) {
        super.setDisplay_h(display_h+5);
    }
}

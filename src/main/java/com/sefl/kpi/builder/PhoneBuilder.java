package com.sefl.kpi.builder;

public class PhoneBuilder {
    private Phone phone;

    public PhoneBuilder() {
        this.phone = new Phone();
    }
    public PhoneBuilder setDisplay_h(int display_h){
        this.phone.setDisplay_h(display_h);
        return this;
    }
    public PhoneBuilder setDisplay_w(int display_w){
        this.phone.setDisplay_w(display_w);
        return this;
    }
    public PhoneBuilder setName(String name){
        this.phone.setName(name);
        return this;
    }

    public Phone build() {
        Phone result=this.phone;
        this.phone=new Phone();
        return result;
    }
}

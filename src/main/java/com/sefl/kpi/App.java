package com.sefl.kpi;

import com.sefl.kpi.builder.Phone;
import com.sefl.kpi.builder.PhoneBuilder;
import com.sefl.kpi.factory.Nokla;
import com.sefl.kpi.factory.PhoneFactory;
import com.sefl.kpi.listener.ActionListener;
import com.sefl.kpi.listener.OurButton;
import com.sefl.kpi.multiton.Multiton;
import com.sefl.kpi.singleton.Singleton;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Phone phone=new PhoneBuilder()
                .setDisplay_h(10)
                .setDisplay_w(15)
                .setName("name")
                .build();
        System.out.println(phone);
        Singleton singleton=Singleton.getInstance();
        Singleton gun=Singleton.getInstance();
        Singleton.getInstance().setName("apple");
        gun.setName("2");
        System.out.println(singleton);

        Phone first= Multiton.getInstance("1");
        Phone second= Multiton.getInstance("22");
        first.setName("nokla");
        second.setName("gnusmas");
        Phone test = Multiton.getInstance("1");
        test.setDisplay_h(27);
        System.out.println(Multiton.toStringMethod());
        Nokla nokla= (Nokla) PhoneFactory.getInstance().getPhoneByName("nokla");
        nokla.setDisplay_h(10);//adds 5 if nokla
        System.out.println(nokla);

        OurButton button=new OurButton();
        button.addActionListener(new ActionListener() {
            @Override
            public void onAction() {
                System.out.println("got it");
            }
        });
        OurButton button1=new OurButton();
        button.click();
    }
}

package com.sefl.kpi.listener;

import java.util.ArrayList;

public class OurButton {
    private ArrayList<ActionListener> actionListeners=new ArrayList<>();
    public OurButton() {
        this.addActionListener(new ActionListener() {
            @Override
            public void onAction() {
                onClick();
            }
        });
    }

    public void click(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (ActionListener listener:actionListeners
                ) {
                    listener.onAction();
                }
            }
        }).start();

    }

    private void onClick(){
        System.out.println("done");
    }

    public void addActionListener(ActionListener listener){
        actionListeners.add(listener);

    }
}

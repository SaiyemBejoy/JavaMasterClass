package com.company;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("alien") || validModel.equals("dreamer")) {
            this.model = model;
        }else {
            this.model = model;
        }
    }
    public String getModel(){
        return this.model;
    }
}

package edu.hanover.kitchenhelper;

import java.util.ArrayList;

public class MeasurementClass {
    //data members
    private ArrayList<String> name;
    private String quantity;

    //constructor
    public MeasurementClass(ArrayList<String> measurements, String numMeasure) {
        name = measurements;
        quantity = numMeasure;
    }

    //convert function where one measurement gets converted to another
    public static String convert() {
        return "not yet implemented";
    }
}

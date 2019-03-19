package edu.hanover.kitchenhelper;

public class Measurement {
    //data members
    private String name;
    private Integer quantity;

    //constructor
    public Measurement(String measurements, Integer numMeasure) {
        name = measurements;
        quantity = numMeasure;
    }

    //convert function where one measurement gets converted to another
    public static String convert() {
        return "not yet implemented";
    }
}

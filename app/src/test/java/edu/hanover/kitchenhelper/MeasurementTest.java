package edu.hanover.kitchenhelper;

import android.util.Pair;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MeasurementTest {
    @Test
    public void IMPERIAL_TO_METRIC_IS_VALID() {
        List<Pair<String, Measurement>> IMP_TO_MET = new ArrayList<>();
        Measurement tsp_mea = new Measurement("mL", 5);
        IMP_TO_MET.add(new Pair<String, Measurement>("tsp", tsp_mea));
        System.out.println(IMP_TO_MET);
    }

    @Test
    public void setImperialToMetric(List<Pair<String, Measurement>> IMP_TO_MET) {
    }

    @Test
    public void convert() {
    }
}
package fi.arcada.codechallenge;

import java.util.ArrayList;

public class MeanCalc {
    public static double calcMean(ArrayList<Double> numericValues) {
        double sum = 0;


        for (double val : numericValues) {
            sum += val;
        }


        return sum / numericValues.size();
    }
}

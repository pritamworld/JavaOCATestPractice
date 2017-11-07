/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaocatestpractice;

/**
 *
 * @author pritesh.patel
 */
public class SampleStatic {

    public static String NAME = "Pritesh Patel";

    public static String getName() {
        return NAME;
    }

    public void getDouble() {
        String dataa = "0.121 0.547 0.875 0.245";
        String delimiter = " ";

        String spectrainstring[] = dataa.split(delimiter);

        int size = spectrainstring.length;

        double[] spectraldata = new double[size];

        for (int i = 0; i < size; i++) {
            spectraldata[i] = Double.parseDouble(spectrainstring[i].toString());
            System.out.println(spectraldata[i]);
        }
    }
}

/*
 * Copyright (C) 2022 Zhengguo Tan <zhengguo.tan@fau.de>
 *
 * Distributed under terms of the GPLv3 license.
 */
package project;
import mt.Image;

public class test_MaxPooling2d {

    public static void main(String[] args) {

        float[][] arr = {{130,   5,  15, 73},
                         { 73, 173, 146, 11},
                         { 62, 103, 118, 50}};

        // define input image
        Image input = new Image(4, 3, "input image");

        System.out.println(">> input: ");
        for (int h = 0; h < input.height(); h++) {
            for (int w = 0; w < input.width(); w++) {

                input.setAtIndex(w, h, arr[h][w]);
                System.out.printf(String.format("%5.1f", input.atIndex(w, h)) + ", ");
            }
            System.out.println();
        }

        // define & apply filter
        MaxPooling2d mp = new MaxPooling2d(2, 2, 1, 1);

        Image output = mp.apply(input);

        // display output
        System.out.println(">> output: ");
        for (int h = 0; h < output.height(); h++) {
            for (int w = 0; w < output.width(); w++) {

                System.out.printf(String.format("%5.1f", output.atIndex(w, h)) + ", ");
            }
            System.out.println();
        }
    }
}
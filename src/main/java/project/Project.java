/*
 * Copyright (C) 2022 Bruno Riemenschneider <bruno.riemenschneider@fau.de>; Zhengguo Tan <zhengguo.tan@fau.de>; Jinho Kim <jinho.kim@fau.de>
 *
 * Distributed under terms of the GPLv3 license.
 */
package project;

import lme.DisplayUtils;
import mt.Signal;
import mt.Image;

import java.util.Arrays;

public class Project {
    public static void main(String[] args) {
        (new ij.ImageJ()).exitWhenQuitting(true);

        //ProjectHelpers.LoadKSpace("kdata_knee.h5");

        /* @@@@ Project work 2: k-Space @@@@ */
        // The ProjectHelpers.java will be provided and does not need to be implemented
        // Load data
        // setBufferFrom2dArray() in the Image class (provided in package mt) is needed for this. Needs to be implemented.
        // and show
        // TODO: Create visualizations after implementing the logic
        ComplexImage kSpace = null;

        //DisplayUtils.showImage(ComplexImage, "2)log(k-Space Magnitude)", kSpace.getWidth());


        /* @@@@ Project work 3: Image Reconstruction @@@@ */
        /* ShowArray part should be comment out for showImage(). */
        ComplexSignal cmplx_signal = null;
        //DisplayUtils.showArray(cmplx_signal.getReal(), "3)real", 0,1);
        //ProjectHelpers.FFT1D(cmplx_signal);
        // TODO: Create visualizations after implementing the logic


        // Reconstruct image
        // (i)FFT is provided in ProjectHelpers
        // the fftShift on the image(k-space needs to be implemented, then image can be reconstructed
        // plot image magnitude, phase, real, imag
        // TODO should the students implement fftShift or do we add it to the FFT?
        // No inverse fftShift here, as it's not needed and even more complicated to explain


        // Backtesting the (i)DFT
        // We are providing a iFFT for image reconstruction, let's double-check that when using a forward FFT, k-space
        // is reproduced. Don't forget the fftShifts. Show the k-space again


        /* @@@@ Project work 4: Filters @@@@ */
        // Do down-sampling by filtering in image space
        // Let's use a sinc filter. For the advanced students, the convolution theorem could be explained in the blackboard exercise
        // The basic learning objective should be that dampening of the high frequencies in k-space relates to less resolution
        // We could also do gaussian filter and then a sinc filter (separately) to see the different yet similar effect.
        // First, implement the LinearComplexImageFilter class (basing on the exercise code base in the package mt)
        SincFilter2d filter = null;
        //var complexFilter = null;
        //complexFilter.apply(mrImage);
        // TODO: Create visualizations after implementing the logic
    }
}

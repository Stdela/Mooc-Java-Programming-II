package com.mycompany.part11_03validatingparameters;

/**
 *
 * @author delam
 */
public class Calculator {

    public int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number should be 0 or positive");
        }
        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {
        if (setSize< 0 || subsetSize<0|| subsetSize> setSize) {
            throw new IllegalArgumentException("Numbers should be 0 or positive, subset size lower than set size");
        }

        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}

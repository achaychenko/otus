package ru.achaychenko.datatypes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6,4,3,0};

        setValue(nums, 3, 300);
        System.out.println(Arrays.toString(nums));

    }
}

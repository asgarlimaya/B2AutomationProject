package com.loop.test.day9_config_driver;

import com.loop.test.utilities.ConfigurationReader;

public class T0_test_config {
    public static void main(String[] args) {
        System.out.println(ConfigurationReader.getProperty("browser"));
    }
}

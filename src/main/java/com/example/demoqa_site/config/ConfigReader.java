package com.example.demoqa_site.config;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private static final Properties props = new Properties();

    static {
        try (InputStream is = ConfigReader.class
                .getClassLoader()
                .getResourceAsStream("App.properties")) {

            if (is == null) {
                throw new RuntimeException("App.properties not found in src/test/resources");
            }
            props.load(is);

        } catch (Exception e) {
            throw new RuntimeException("Failed to load App.properties", e);
        }
    }

    public static String getValue(String key) {
        String value = props.getProperty(key);
        if (value == null) {
            throw new IllegalArgumentException("No such key in App.properties: " + key);
        }
        return value.trim();
    }
}

package com.cccexamstudy.pdf_book.util;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

public class StudyProperties {

    private static final String FILE_NAME = "studies.properties";

    private Properties properties;

    public StudyProperties(Context context) {
        try {
            this.properties = new Properties();
            AssetManager assetManager = context.getAssets();
            InputStream inputStream = assetManager.open(FILE_NAME);
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String key) {
        /*
        * Load key value pairs from properties file
        * Return value pair for matching key
         */

        return properties.getProperty(key);
    }

    public List<String> getPropertyNames() {
        /*
        * Return all available property names
         */

        List<String> propertyNames = new ArrayList<>(properties.stringPropertyNames());
        Collections.sort(propertyNames);

        return propertyNames;
    }
}

package com.cccexamstudy.pdf_book.util;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Util {

    private static final String FILE_NAME = "studies.properties";

    public static String getProperty(String key, Context context) throws IOException {
        /*
        * Load key value pairs from properties file
        * Return value pair for matching key
         */

        Properties properties = new Properties();
        AssetManager assetManager = context.getAssets();
        InputStream inputStream = assetManager.open(FILE_NAME);
        properties.load(inputStream);
        return properties.getProperty(key);
    }
}

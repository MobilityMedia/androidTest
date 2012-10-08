package com.example.android.mediafx;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.example.android.mediafx.HelloEffectsTest \
 * com.example.android.mediafx.tests/android.test.InstrumentationTestRunner
 */
public class HelloEffectsTest extends ActivityInstrumentationTestCase2<HelloEffects> {

    public HelloEffectsTest() {
        super("com.example.android.mediafx", HelloEffects.class);
    }

}

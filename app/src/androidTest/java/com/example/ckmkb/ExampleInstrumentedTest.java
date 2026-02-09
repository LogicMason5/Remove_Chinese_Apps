package com.example.ckmkb;

import android.content.Context;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

/**
 * Instrumented tests, which run on an Android device or emulator.
 *
 * These tests verify Android framework behavior and app context.
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    private static final String EXPECTED_PACKAGE_NAME = "com.example.ckmkb";

    @Test
    public void appContext_isCorrect() {
        // Obtain the app context
        Context appContext =
                InstrumentationRegistry.getInstrumentation().getTargetContext();

        // Basic sanity check
        assertNotNull("App context should not be null", appContext);

        // Verify package name
        assertEquals(
                "Package name should match applicationId",
                EXPECTED_PACKAGE_NAME,
                appContext.getPackageName()
        );
    }
}

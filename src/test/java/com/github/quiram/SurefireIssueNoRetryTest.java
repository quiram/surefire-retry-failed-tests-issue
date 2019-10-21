package com.github.quiram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SurefireIssueNoRetryTest {

    private static int count = 0;

    @BeforeEach
    void setUp() {
        count++;
        assertEquals(3, count);
        count = 0;
    }

    @Test
    void thisTestWillRetry() {
    }

    @Test
    @DisplayName("Adding a DisplayName will prevent this test from retrying, it will just fail")
    void thisTestWillNotRetry() {
    }
}

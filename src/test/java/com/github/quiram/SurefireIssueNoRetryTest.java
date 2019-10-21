package com.github.quiram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SurefireIssueNoRetryTest {

    @BeforeEach
    void setUp() {
        fail("Forcing retry");
    }

    @Test
    void thisTestWillRetry() {
    }

    @Test
    @DisplayName("Adding a DisplayName will prevent this test from retrying, it will just fail")
    void thisTestWillNotRetry() {
    }
}

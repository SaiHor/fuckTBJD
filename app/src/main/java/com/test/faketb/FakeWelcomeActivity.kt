package com.test.faketb

import android.app.Activity
import android.os.Bundle

class FakeWelcomeActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        finish()
    }
}
package com.test.faketb

import android.app.Activity
import android.os.Bundle

class FakeDLActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        finish()
    }

}

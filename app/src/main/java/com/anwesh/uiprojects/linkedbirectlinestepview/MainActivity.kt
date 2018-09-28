package com.anwesh.uiprojects.linkedbirectlinestepview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.birectlinestepview.BiRectStepLineView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BiRectStepLineView.create(this)
    }
}

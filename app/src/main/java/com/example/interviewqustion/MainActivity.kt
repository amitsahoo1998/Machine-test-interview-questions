package com.example.interviewqustion

import android.os.Bundle
import android.text.Html
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.interview_qustion_4.*
import android.os.Build

import android.text.SpannableString

import android.text.Spanned
import android.text.InputFilter
import kotlinx.android.synthetic.main.qustion_5.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.qustion_5)

        editTextTextPersonName.filters = arrayOf<InputFilter>(InputFilterMinMax("1", "100"))
    }
}
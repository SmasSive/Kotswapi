package com.smassive.kotswapi.main

import android.os.Bundle
import com.smassive.kotswapi.R
import com.smassive.kotswapi.base.view.BaseActivity
import com.smassive.kotswapi.main.injector.module.MainModule


class MainActivity : BaseActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }

  override fun initializeInjector() {
    getApplicationComponent().plus(MainModule(this)).inject(this)
  }
}
package com.smassive.kotswapi.base.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.smassive.kotswapi.App
import com.smassive.kotswapi.base.injector.component.ApplicationComponent


abstract class BaseActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    initializeInjector()
  }

  abstract fun initializeInjector()

  protected fun getApplicationComponent(): ApplicationComponent = (application as App).applicationComponent
}
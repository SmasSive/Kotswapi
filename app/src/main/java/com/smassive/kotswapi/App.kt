package com.smassive.kotswapi

import android.app.Application
import com.smassive.kotswapi.base.injector.component.ApplicationComponent
import com.smassive.kotswapi.base.injector.component.DaggerApplicationComponent
import com.smassive.kotswapi.base.injector.module.ApplicationModule


class App : Application() {

  lateinit var applicationComponent : ApplicationComponent

  override fun onCreate() {
    super.onCreate()
    initializeInjector()
  }

  private fun initializeInjector() {
    applicationComponent = DaggerApplicationComponent.builder().applicationModule(
        ApplicationModule(this)).build()
  }
}
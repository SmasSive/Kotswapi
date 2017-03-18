package com.smassive.kotswapi.base.injector.component

import com.smassive.kotswapi.base.injector.module.ApplicationModule
import com.smassive.kotswapi.main.injector.component.MainComponent
import com.smassive.kotswapi.main.injector.module.MainModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

  fun plus(module: MainModule): MainComponent
}
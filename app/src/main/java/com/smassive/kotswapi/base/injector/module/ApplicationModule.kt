package com.smassive.kotswapi.base.injector.module

import com.smassive.kotswapi.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val app: App) {

  @Provides @Singleton
  fun provideApplication(): App = app
}
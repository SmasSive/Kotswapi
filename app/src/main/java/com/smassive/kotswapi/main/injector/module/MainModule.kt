package com.smassive.kotswapi.main.injector.module

import com.smassive.kotswapi.base.injector.module.ActivityModule
import com.smassive.kotswapi.base.injector.scope.ActivityScope
import com.smassive.kotswapi.main.view.MainActivity
import dagger.Module
import dagger.Provides

@Module
class MainModule(activity : MainActivity) : ActivityModule(activity) {

  @Provides @ActivityScope
  fun provideMainActivity() : MainActivity = baseActivity as MainActivity
}
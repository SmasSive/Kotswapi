package com.smassive.kotswapi.base.injector.module

import com.smassive.kotswapi.base.injector.scope.ActivityScope
import com.smassive.kotswapi.base.view.BaseActivity
import dagger.Module
import dagger.Provides

@Module
open class ActivityModule(protected val baseActivity: BaseActivity) {

  @Provides @ActivityScope
  fun provideBaseActivity(): BaseActivity = baseActivity
}
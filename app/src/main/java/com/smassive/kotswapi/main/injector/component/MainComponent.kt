package com.smassive.kotswapi.main.injector.component

import com.smassive.kotswapi.base.injector.scope.ActivityScope
import com.smassive.kotswapi.main.MainActivity
import com.smassive.kotswapi.main.injector.module.MainModule
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = arrayOf(MainModule::class))
interface MainComponent {

  fun inject(activity: MainActivity)
}
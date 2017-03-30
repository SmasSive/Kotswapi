package com.smassive.kotswapi.main.presenter

import com.smassive.kotswapi.base.presenter.BasePresenter
import javax.inject.Inject


class MainPresenter @Inject constructor() : BasePresenter<MainPresenter.View>() {

  fun onMainImageClicked() = view.openFilmsScreen()

  interface View : BasePresenter.View {
    fun openFilmsScreen()
  }
}
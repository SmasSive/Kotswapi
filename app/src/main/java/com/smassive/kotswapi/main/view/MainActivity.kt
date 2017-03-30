package com.smassive.kotswapi.main.view

import android.os.Bundle
import com.smassive.kotswapi.R
import com.smassive.kotswapi.base.view.BaseActivity
import com.smassive.kotswapi.main.injector.module.MainModule
import com.smassive.kotswapi.main.presenter.MainPresenter
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject


class MainActivity : MainPresenter.View, BaseActivity() {

  @Inject
  lateinit var presenter: MainPresenter

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    initPresenter()
    setListeners()
  }

  private fun initPresenter() {
    presenter.bindView(this)
  }

  private fun setListeners() {
    iv_main_image.setOnClickListener { presenter.onMainImageClicked() }
  }

  override fun showLoading() {

  }

  override fun hideLoading() {

  }

  override fun openFilmsScreen() {

  }

  override fun initializeInjector() {
    getApplicationComponent().plus(MainModule(this)).inject(this)
  }
}
package com.smassive.kotswapi.base.presenter


open class BasePresenter<T> where T : BasePresenter.View {

  lateinit var view : T

  fun bindView (view : T) {
    this.view = view
  }

  interface View {
    fun showLoading()
    fun hideLoading()
  }
}
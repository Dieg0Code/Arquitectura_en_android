package com.anncode.offersandcoupons.view

import com.anncode.offersandcoupons.model.Coupon

interface CouponView {

    //Presenter
    fun getCoupons()

    //View
    fun showCoupons(coupons: ArrayList<Coupon>?)
}
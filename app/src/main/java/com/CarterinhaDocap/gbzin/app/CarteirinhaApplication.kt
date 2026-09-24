package com.CarterinhaDocap.gbzin.app

import android.app.Application
import com.CarterinhaDocap.gbzin.app.di.AppContainer
import com.CarterinhaDocap.gbzin.app.di.DefaultAppContainer

class CarteirinhaApplication : Application() {
    val container: AppContainer by lazy {
        DefaultAppContainer()
    }
}
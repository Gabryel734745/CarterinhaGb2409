package com.CarterinhaDocap.gbzin.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.CarterinhaDocap.gbzin.app.di.AppContainer
import com.CarterinhaDocap.gbzin.app.navigation.AppNavHost
import com.CarterinhaDocap.gbzin.core.designsystem.theme.CarteirinhaDigital2DEVEST_BTheme

@Composable
fun App(container: AppContainer) {


        val systemDarkTheme = isSystemInDarkTheme()
        var darkTheme by rememberSaveable { mutableStateOf(systemDarkTheme) }
    CarteirinhaDigital2DEVEST_BTheme(
        darkTheme = darkTheme
    ) {
        val navController = rememberNavController()

        AppNavHost(
            navController = navController,
            darkTheme = darkTheme,
            onDarkThemeChange = { darkTheme = it },
            container = container
        )
    }
}



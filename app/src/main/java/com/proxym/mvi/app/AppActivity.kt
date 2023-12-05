package com.proxym.mvi.app

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.proxym.mvi.base.activity.BaseActivity
import com.proxym.mvi.features.authentication.authentication
import com.proxym.mvi.features.dashboard.dashboard
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AppActivity : BaseActivity() {

    @Composable
    override fun ActivityLayout() {
        val navController = rememberNavController()
        MaterialTheme {
            NavHost(
                navController = navController,
                startDestination = AppRoutes.Authentication.route
            ) {
                authentication(
                    route = AppRoutes.Authentication.route,
                    navController = navController,
                )

                dashboard(
                    route = AppRoutes.Dashboard.route,
                    navController = navController,
                )
            }
        }
    }

}


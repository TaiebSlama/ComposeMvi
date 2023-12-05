package com.proxym.mvi.app

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.proxym.mvi.app.common.activity.BaseActivity
import com.proxym.mvi.features.authentication.Authentication
import com.proxym.mvi.features.dashboard.Dashboard
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

                // Authentication
                composable(route = AppRoutes.Authentication.route) {
                    Authentication {}
                }

                composable(route = AppRoutes.Dashboard.route) {
                    Dashboard {}
                }
            }
        }
    }

}


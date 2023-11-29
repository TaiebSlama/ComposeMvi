package com.proxym.mvi.features.authentication

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.proxym.mvi.base.activity.BaseActivity
import com.proxym.mvi.features.authentication.signIn.SignInScreen
import com.proxym.mvi.features.authentication.signUp.SignUpScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AuthenticationActivity : BaseActivity() {

    @Composable
    override fun ActivityLayout() {
        val navController = rememberNavController()
        MaterialTheme {
            NavHost(
                navController = navController,
                startDestination = AuthenticationScreens.SIGN_IN.route
            ) {
                composable(AuthenticationScreens.SIGN_IN.route) { SignInScreen(navController) }
                composable(AuthenticationScreens.SIGN_UP.route) { SignUpScreen(navController) }
            }
        }
    }

}


package com.proxym.mvi.features.authentication

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.proxym.mvi.features.authentication.signIn.SignInScreen
import com.proxym.mvi.features.authentication.signUp.SignUpScreen

/**
 * Created by taieb.slama@zeta-box.com on 11/29/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */
@Composable
fun AuthenticationScreen() {
    val navController = rememberNavController()
    MaterialTheme {
        NavHost(
            navController = navController,
            startDestination = AuthenticationHosts.SIGN_IN.route
        ) {
            composable(route = AuthenticationHosts.SIGN_IN.route) { SignInScreen(navController) }
            composable(route = AuthenticationHosts.SIGN_UP.route) { SignUpScreen(navController) }
        }
    }
}
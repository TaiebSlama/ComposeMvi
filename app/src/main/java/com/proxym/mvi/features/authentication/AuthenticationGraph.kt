package com.proxym.mvi.features.authentication

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
fun Authentication(callback: () -> Unit) {
    val authenticationNavController = rememberNavController()
    NavHost(
        navController = authenticationNavController,
        startDestination = AuthenticationRoutes.SignIn.route
    ) {
        composable(route = AuthenticationRoutes.SignIn.route) {
            SignInScreen(authenticationNavController)
        }
        composable(route = AuthenticationRoutes.SignUp.route) {
            SignUpScreen(authenticationNavController)
        }
    }
}
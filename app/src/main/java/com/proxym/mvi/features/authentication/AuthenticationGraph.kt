package com.proxym.mvi.features.authentication

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.proxym.mvi.features.authentication.signIn.SignInScreen
import com.proxym.mvi.features.authentication.signUp.SignUpScreen

/**
 * Created by taieb.slama@zeta-box.com on 11/29/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */
fun NavGraphBuilder.authentication(
    route: String,
    navController: NavController
) {
    navigation(
        route = route,
        startDestination = AuthenticationRoutes.SignIn.route
    ) {
        composable(route = AuthenticationRoutes.SignIn.route) { SignInScreen(navController) }
        composable(route = AuthenticationRoutes.SignUp.route) { SignUpScreen(navController) }
    }
}
package com.proxym.mvi.features.dashboard

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation

/**
 * Created by taieb.slama@zeta-box.com on 12/5/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */
fun NavGraphBuilder.dashboard(
    route: String,
    navController: NavController
) {
    navigation(
        route = route,
        startDestination = DashboardRoutes.Home.route
    ) {
        composable(route = DashboardRoutes.Home.route) { }
        composable(route = DashboardRoutes.Plan.route) { }
        composable(route = DashboardRoutes.Nearby.route) { }
        composable(route = DashboardRoutes.Departures.route) { }
        composable(route = DashboardRoutes.Happiness.route) { }
    }
}
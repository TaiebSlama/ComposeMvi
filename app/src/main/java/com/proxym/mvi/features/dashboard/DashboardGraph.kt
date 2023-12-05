package com.proxym.mvi.features.dashboard

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

/**
 * Created by taieb.slama@zeta-box.com on 12/5/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */
@Composable
fun Dashboard(callback: () -> Unit) {
    val dashboardNavController = rememberNavController()
    NavHost(
        navController = dashboardNavController,
        startDestination = DashboardRoutes.Home.route
    ) {
        composable(route = DashboardRoutes.Home.route) { }
        composable(route = DashboardRoutes.Plan.route) { }
        composable(route = DashboardRoutes.Nearby.route) { }
        composable(route = DashboardRoutes.Departures.route) { }
        composable(route = DashboardRoutes.Happiness.route) { }
    }
}
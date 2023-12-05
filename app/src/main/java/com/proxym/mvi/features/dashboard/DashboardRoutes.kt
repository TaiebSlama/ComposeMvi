package com.proxym.mvi.features.dashboard

/**
 * Created by taieb.slama@zeta-box.com on 12/5/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */
sealed class DashboardRoutes(var route: String) {

    object Home : DashboardRoutes(route = "Home")
    object Plan : DashboardRoutes(route = "Plan")
    object Nearby : DashboardRoutes(route = "Nearby")
    object Departures : DashboardRoutes(route = "Departures")
    object Happiness : DashboardRoutes(route = "Happiness")

}
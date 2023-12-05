package com.proxym.mvi.app

/**
 * Created by taieb.slama@zeta-box.com on 11/29/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */
sealed class AppRoutes(var route: String) {
    object Authentication : AppRoutes("Authentication")
    object Dashboard : AppRoutes("Dashboard")
}
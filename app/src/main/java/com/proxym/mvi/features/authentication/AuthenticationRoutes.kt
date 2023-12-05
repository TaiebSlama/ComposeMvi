package com.proxym.mvi.features.authentication

/**
 * Created by taieb.slama@zeta-box.com on 12/5/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */
sealed class AuthenticationRoutes(var route: String) {

    object SignIn : AuthenticationRoutes(route = "SIGN_IN")
    object SignUp : AuthenticationRoutes(route = "SIGN_UP")
}
package com.proxym.mvi.features.authentication

/**
 * Created by taieb.slama@zeta-box.com on 11/29/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */
enum class AuthenticationScreens(var route: String) {
    SIGN_IN(route = "signIn"),
    SIGN_UP(route = "SignUp")

}
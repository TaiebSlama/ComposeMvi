package com.proxym.mvi.features.authentication.signIn

/**
 * Created by taieb.slama@zeta-box.com on 11/29/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */
sealed class SignInStates {

    object SignInSuccess : SignInStates()
    data class SignInFailure(var error: String) : SignInStates()

}

sealed class SignInEvents {
    data class SignIn(var username: String, var pwd: String) : SignInEvents()

}
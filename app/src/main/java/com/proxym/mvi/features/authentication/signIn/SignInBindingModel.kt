package com.proxym.mvi.features.authentication.signIn

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

/**
 * Created by taieb.slama@zeta-box.com on 11/30/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */
class SignInBindingModel {

    var signInButtonEnable by mutableStateOf(false)

    var username by mutableStateOf("")

    var pwd by mutableStateOf("")

}
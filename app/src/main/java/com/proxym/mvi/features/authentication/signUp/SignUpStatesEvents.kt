package com.proxym.mvi.features.authentication.signUp

/**
 * Created by taieb.slama@zeta-box.com on 11/29/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

sealed class SignUpStates {
    object SignUpSuccess : SignUpStates()
    data class SignUpFailure(var error: String) : SignUpStates()
}

sealed class SignUpEvents {

}
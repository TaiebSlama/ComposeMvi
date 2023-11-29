package com.proxym.mvi.features.authentication.signUp

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel

/**
 * Created by taieb.slama@zeta-box.com on 11/29/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

@Composable
fun SignUpScreen() {

    val viewModel: SignUpViewModel = hiltViewModel()
    val signUpState = viewModel.viewStates

    signUpState.value?.let { state ->
        when (state) {
            is SignUpStates.SignUpFailure -> {}
            SignUpStates.SignUpSuccess -> {}
        }
    }
}
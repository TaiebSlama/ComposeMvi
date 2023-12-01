package com.proxym.mvi.features.authentication.signIn

import com.proxym.mvi.base.viewModel.MVIViewModel
import com.proxym.mvi.domain.AuthenticationFunctions
import com.proxym.mvi.domain.AuthenticationManager
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Created by taieb.slama@zeta-box.com on 11/29/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

@HiltViewModel
class SignInViewModel @Inject constructor() : MVIViewModel<SignInStates, SignInEvents>() {

    var authenticationManager: AuthenticationFunctions = AuthenticationManager()

    override suspend fun initStates() {
    }

    override fun handleEvents(viewEvent: SignInEvents) {
        when (viewEvent) {
            is SignInEvents.SignIn -> {
                authenticationManager.signIn(viewEvent.username, viewEvent.pwd,
                    success = {
                        moveToState(SignInStates.SignInSuccess)
                    },
                    failure = { error ->
                        moveToState(SignInStates.SignInFailure(error))
                    })

            }
        }
    }
}
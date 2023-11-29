package com.proxym.mvi.features.authentication.signIn

import com.proxym.mvi.base.viewModel.MVIViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Created by taieb.slama@zeta-box.com on 11/29/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

@HiltViewModel
class SignInViewModel @Inject constructor() : MVIViewModel<SignInStates, SignInEvents>() {
    override suspend fun initStates() {
    }

    override fun handleEvents(viewEvent: SignInEvents) {
        when (viewEvent) {
            is SignInEvents.SignIn -> {
                if (viewEvent.username.isEmpty() || viewEvent.pwd.isEmpty())
                    moveToState(SignInStates.SignInFailure("missing data"))
                else
                    moveToState(SignInStates.SignInSuccess)
            }
        }
    }
}
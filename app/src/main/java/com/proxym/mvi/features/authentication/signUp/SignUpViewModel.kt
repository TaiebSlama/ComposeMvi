package com.proxym.mvi.features.authentication.signUp

import com.proxym.mvi.base.viewModel.MVIViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Created by taieb.slama@zeta-box.com on 11/29/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

@HiltViewModel
class SignUpViewModel @Inject constructor() : MVIViewModel<SignUpStates, SignUpEvents>() {
    override suspend fun initStates() {

    }

    override fun handleEvents(viewEvent: SignUpEvents) {
    }
}
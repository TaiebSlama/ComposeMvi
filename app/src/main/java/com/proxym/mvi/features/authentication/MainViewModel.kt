package com.proxym.mvi.features.authentication

import com.proxym.mvi.base.MVIViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Created by taieb.slama@zeta-box.com on 11/28/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */
@HiltViewModel
class MainViewModel @Inject constructor() : MVIViewModel<MainStates, MainEvents>() {

    override suspend fun initStates() {

    }

    override fun handleEvents(viewEvent: MainEvents) {
        when (viewEvent) {
            MainEvents.Event -> {}
        }
    }
}
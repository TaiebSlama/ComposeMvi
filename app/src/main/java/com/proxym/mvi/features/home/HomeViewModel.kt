package com.proxym.mvi.features.home

import com.proxym.mvi.app.common.viewModel.MVIViewModel

/**
 * Created by taieb.slama@zeta-box.com on 12/5/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */
class HomeViewModel : MVIViewModel<HomeStates, HomeEvents>() {
    override suspend fun initStates() {}

    override fun handleEvents(viewEvent: HomeEvents) {
        when (viewEvent) {
            HomeEvents.Event1 -> {}
        }
    }
}
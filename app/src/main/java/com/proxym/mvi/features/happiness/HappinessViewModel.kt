package com.proxym.mvi.features.happiness

import com.proxym.mvi.app.common.viewModel.MVIViewModel

/**
 * Created by taieb.slama@zeta-box.com on 12/5/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

class HappinessViewModel : MVIViewModel<HappinessStates, HappinessEvents>() {
    override suspend fun initStates() {}

    override fun handleEvents(viewEvent: HappinessEvents) {
        when (viewEvent) {
            HappinessEvents.Event1 -> {}
        }
    }
}
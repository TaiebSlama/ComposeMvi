package com.proxym.mvi.features.nearby

import com.proxym.mvi.app.common.viewModel.MVIViewModel

/**
 * Created by taieb.slama@zeta-box.com on 12/5/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

class NearbyViewModel : MVIViewModel<NearbyStates, NearbyEvents>() {
    override suspend fun initStates() {}

    override fun handleEvents(viewEvent: NearbyEvents) {
        when (viewEvent) {
            NearbyEvents.Event1 -> {}
        }
    }
}
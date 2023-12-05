package com.proxym.mvi.features.alarms

import com.proxym.mvi.app.common.viewModel.MVIViewModel

/**
 * Created by taieb.slama@zeta-box.com on 12/5/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

class AlarmsViewModel : MVIViewModel<AlarmsStates, AlarmsEvents>() {
    override suspend fun initStates() {}

    override fun handleEvents(viewEvent: AlarmsEvents) {
        when (viewEvent) {
            AlarmsEvents.Event1 -> {}
        }
    }
}
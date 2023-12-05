package com.proxym.mvi.features.plan

import com.proxym.mvi.app.common.viewModel.MVIViewModel

/**
 * Created by taieb.slama@zeta-box.com on 12/5/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

class PlanViewModel : MVIViewModel<PlanStates, PlanEvents>() {
    override suspend fun initStates() {}

    override fun handleEvents(viewEvent: PlanEvents) {
        when (viewEvent) {
            PlanEvents.Event1 -> {}
        }
    }
}
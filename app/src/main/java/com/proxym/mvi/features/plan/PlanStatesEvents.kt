package com.proxym.mvi.features.plan

/**
 * Created by taieb.slama@zeta-box.com on 12/5/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

sealed class PlanStates {
    object State1 : PlanStates()
}

sealed class PlanEvents {
    object Event1 : PlanEvents()
}
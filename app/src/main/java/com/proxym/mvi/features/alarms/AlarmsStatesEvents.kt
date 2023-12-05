package com.proxym.mvi.features.alarms

/**
 * Created by taieb.slama@zeta-box.com on 12/5/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

sealed class AlarmsStates {
    object State1 : AlarmsStates()
}

sealed class AlarmsEvents {
    object Event1 : AlarmsEvents()
}
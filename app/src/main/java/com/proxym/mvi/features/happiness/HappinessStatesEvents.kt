package com.proxym.mvi.features.happiness

/**
 * Created by taieb.slama@zeta-box.com on 12/5/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

sealed class HappinessStates {
    object State1 : HappinessStates()
}

sealed class HappinessEvents {
    object Event1 : HappinessEvents()
}
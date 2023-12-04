package com.proxym.mvi.app

import androidx.compose.runtime.Composable
import com.proxym.mvi.base.activity.BaseActivity
import com.proxym.mvi.features.map.MapScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AppActivity : BaseActivity() {

    @Composable
    override fun ActivityLayout() {
        //  AuthenticationScreen()
        MapScreen()
    }

}


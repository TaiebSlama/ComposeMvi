package com.proxym.mvi.features.authentication

import androidx.compose.runtime.Composable
import com.proxym.mvi.base.activity.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AuthenticationActivity : BaseActivity() {

    @Composable
    override fun ActivityLayout() {
        AuthenticationScreen()
    }

}


package com.proxym.mvi.features.authentication

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.proxym.mvi.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AuthenticationActivity : BaseActivity() {

    @Composable
    override fun ActivityLayout() {
        MaterialTheme {
            MainScreen()
        }
    }

}


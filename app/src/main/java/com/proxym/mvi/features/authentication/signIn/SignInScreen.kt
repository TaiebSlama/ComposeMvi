package com.proxym.mvi.features.authentication.signIn

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.Lifecycle
import androidx.navigation.NavController
import com.proxym.mvi.app.common.helper.ObserveLifeCycle
import com.proxym.mvi.features.authentication.AuthenticationRoutes

/**
 * Created by taieb.slama@zeta-box.com on 11/29/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

var bindingModel: SignInBindingModel = SignInBindingModel()

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignInScreen(navController: NavController) {
    val viewModel: SignInViewModel = hiltViewModel()
    val signInState = viewModel.viewStates

    signInState.value?.let { state ->
        when (state) {
            is SignInStates.SignInFailure -> Toast.makeText(
                LocalContext.current,
                state.error,
                Toast.LENGTH_SHORT
            ).show()

            SignInStates.SignInSuccess -> Toast.makeText(
                LocalContext.current,
                "SignInSuccess",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    ObserveLifeCycle {
        when (it) {
            Lifecycle.State.DESTROYED -> Log.d("ObserveLifeCycle", "Login DESTROYED")
            Lifecycle.State.INITIALIZED -> Log.d("ObserveLifeCycle", "Login INITIALIZED")
            Lifecycle.State.CREATED -> Log.d("ObserveLifeCycle", "Login CREATED")
            Lifecycle.State.STARTED -> Log.d("ObserveLifeCycle", "Login STARTED")
            Lifecycle.State.RESUMED -> Log.d("ObserveLifeCycle", "Login RESUMED")
        }
    }

    Scaffold(modifier = Modifier.fillMaxSize(), topBar = {}, content = { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Welcome to sign in")
            Spacer(modifier = Modifier.size(50.dp))
            TextField(
                value = bindingModel.username,
                onValueChange = { newValue ->
                    bindingModel.username = newValue
                },
                placeholder = { Text(text = "Username") }
            )

            Spacer(modifier = Modifier.size(10.dp))

            TextField(
                value = bindingModel.pwd,
                onValueChange = { newValue ->
                    bindingModel.pwd = newValue
                },
                placeholder = { Text(text = "Pwd") })

            Spacer(modifier = Modifier.size(50.dp))

            Button(onClick = {
                viewModel.handleEvents(
                    SignInEvents.SignIn(
                        username = bindingModel.username,
                        pwd = bindingModel.pwd
                    )
                )
            }) {
                Text(text = "Sign In")
            }

            Spacer(modifier = Modifier.size(10.dp))

            Button(onClick = {
                navController.navigate(AuthenticationRoutes.SignUp.route)
            }) {
                Text(text = "Sign Up")
            }
        }
    }, bottomBar = {})
}
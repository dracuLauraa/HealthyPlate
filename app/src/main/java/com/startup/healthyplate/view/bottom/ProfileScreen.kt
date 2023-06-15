package com.startup.healthyplate.view.bottom

import android.content.res.Configuration
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.startup.healthyplate.navigation.Screen
import com.startup.healthyplate.ui.theme.colorBlack
import com.startup.healthyplate.ui.theme.colorGray
import com.startup.healthyplate.ui.theme.colorWhite

@Composable
fun ProfileScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(if (isSystemInDarkTheme()) Color.Black else colorWhite)
            .verticalScroll(rememberScrollState())
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "My Profile",
                style = MaterialTheme.typography.h6,
                color = colorBlack,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(com.startup.healthyplate.R.drawable.profile),
                    contentDescription = "Profile Picture",
                    modifier = Modifier.size(80.dp)
                )
                Column(
                    modifier = Modifier.padding(start = 16.dp),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ){
                    Text(
                        text = "Laura Wilhelmina Theresia",
                        style = MaterialTheme.typography.h5,
                        color = colorBlack
                    )
                    Text(
                        text = "laurawilther@gmail.com",
                        style = MaterialTheme.typography.h6,
                        color = colorBlack
                    )
                }
            }
            Spacer(modifier = Modifier.height(50.dp))
            Button(
                onClick = {
                    navController.popBackStack()
                    navController.navigate(Screen.HomeScreen.route)
                },
                colors = ButtonDefaults.buttonColors(backgroundColor = colorGray),
                modifier = Modifier
                    .width(350.dp)
                    .height(50.dp)
                    .align(Alignment.CenterHorizontally),
                shape = RoundedCornerShape(24.dp)
            ){
                Text(
                    text = "Order history",
                    color = colorWhite,
                    style = MaterialTheme.typography.button,
                    modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                    navController.popBackStack()
                    navController.navigate(Screen.HomeScreen.route)
                },
                colors = ButtonDefaults.buttonColors(backgroundColor = colorGray),
                modifier = Modifier
                    .width(350.dp)
                    .height(50.dp)
                    .align(Alignment.CenterHorizontally),
                shape = RoundedCornerShape(24.dp)
            ){
                Text(
                    text = "Payment method",
                    color = colorWhite,
                    style = MaterialTheme.typography.button,
                    modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                    navController.popBackStack()
                    navController.navigate(Screen.HomeScreen.route)
                },
                colors = ButtonDefaults.buttonColors(backgroundColor = colorGray),
                modifier = Modifier
                    .width(350.dp)
                    .height(50.dp)
                    .align(Alignment.CenterHorizontally),
                shape = RoundedCornerShape(24.dp)
            ){
                Text(
                    text = "My favorite",
                    color = colorWhite,
                    style = MaterialTheme.typography.button,
                    modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                    navController.popBackStack()
                    navController.navigate(Screen.HomeScreen.route)
                },
                colors = ButtonDefaults.buttonColors(backgroundColor = colorGray),
                modifier = Modifier
                    .width(350.dp)
                    .height(50.dp)
                    .align(Alignment.CenterHorizontally),
                shape = RoundedCornerShape(24.dp)
            ){
                Text(
                    text = "Health info",
                    color = colorWhite,
                    style = MaterialTheme.typography.button,
                    modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                    navController.popBackStack()
                    navController.navigate(Screen.LoginScreen.route)
                },
                colors = ButtonDefaults.buttonColors(backgroundColor = colorBlack),
                modifier = Modifier
                    .width(350.dp)
                    .height(50.dp)
                    .align(Alignment.CenterHorizontally),
                shape = RoundedCornerShape(24.dp)
            ){
                Text(
                    text = "Sign out",
                    color = colorWhite,
                    style = MaterialTheme.typography.button,
                    modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)
                )
            }
            }
    }
}

@Composable
@Preview
fun ProfileScreenPreview() {
    val navController = rememberNavController()
    ProfileScreen(navController = navController)
}

@Composable
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
fun ProfileScreenDarkPreview() {
    val navController = rememberNavController()
    ProfileScreen(navController = navController)
}

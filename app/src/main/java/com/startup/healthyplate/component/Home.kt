package com.startup.healthyplate.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.DashboardCustomize
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.outlined.Dashboard
import androidx.compose.material.icons.outlined.DashboardCustomize
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.startup.healthyplate.R
import com.startup.healthyplate.ui.theme.colorBlack
import com.startup.healthyplate.ui.theme.colorWhite
import com.startup.healthyplate.view.OtpVerifyScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.startup.healthyplate.navigation.Screen

@Composable
fun Home() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(50.dp)
                .clip(shape = CircleShape)
                .background(colorWhite)

        ) {
            IconButton(onClick = {}) {
                Image(
                    painter = painterResource(R.drawable.profile),
                    contentDescription = "",
                    modifier = Modifier.size(60.dp)
                )
            }
        }

        var userselectaddress by remember { mutableStateOf("") }

        TextField(
            modifier = Modifier
                .height(50.dp)
                .weight(0.85f)
                .padding(start = 20.dp, end = 20.dp),
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = colorWhite,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
            ),
            value = userselectaddress,
            shape = RoundedCornerShape(24.dp),
            singleLine = true,
            onValueChange = { userselectaddress = it },
            placeholder = {
                Text(
                    text = "Surabaya",
                    color = colorBlack
                )
            },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Filled.KeyboardArrowDown,
                    contentDescription = "",
                    tint = colorBlack
                )
            },
        )

        Box(
            modifier = Modifier
                .size(50.dp)
                .clip(shape = CircleShape)
                .background(colorWhite)
        ) {
            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Outlined.Notifications,
                    contentDescription = "",
                    tint = colorBlack
                )

            }
        }

    }
}


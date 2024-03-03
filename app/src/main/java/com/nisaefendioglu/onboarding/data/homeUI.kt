package com.nisaefendioglu.onboarding.data

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.lang.reflect.Modifier


@Composable
@Preview
fun homeUi()
{
    Column(
        horizontalAlignment=Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Hello World",
            style = TextStyle(
                fontSize = 12.sp,
                fontFamily = FontFamily.SansSerif,
                color = Color.Green)
            )
        }

Row(
    horizontalArrangement = Arrangement.SpaceBetween,
    modifier = androidx.compose.ui.Modifier
        .padding(start = 20.dp, end = 20.dp, bottom = 50.dp)
        .fillMaxWidth()
) {
    Text(text = "Hello World",
        style = TextStyle(
            fontSize = 12.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Green)
    )

}

}




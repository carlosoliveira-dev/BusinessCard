package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    BusinessCard(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(name: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_logo)


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(color = 0xFFd2e8d4)),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(Modifier.background(Color(color = 0xFF073042))) {
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier.height(150.dp),
            )
        }
        Text(
            text = "Carlos Júnior Torres de Oliveira",
            fontWeight = FontWeight.Normal,
            fontSize = 20.sp,
            modifier = Modifier.padding(
                top = 10.dp,
                bottom = 10.dp
            )
        )
        Text(
            text = "Android Developer",
            fontWeight = FontWeight.Bold,
            color = Color(0xFF026e3c),
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        Row {
            Icon(
                Icons.Rounded.Phone, contentDescription = "Localized description",
                modifier = Modifier.padding(end = 10.dp)
            )
            Text(
                text = "+55 (51) 98017-3684",
                fontWeight = FontWeight.Bold,
                color = Color(0xFF026e3c),
            )
        }
        Row {
            Icon(

                Icons.Rounded.Share, contentDescription = "Localized description",
                modifier = Modifier.padding(end = 10.dp)

            )
            Text(
                text = "@carlosoliveiradev",
                fontWeight = FontWeight.Bold,
                color = Color(0xFF026e3c),
            )
        }
        Row {
            Icon(

                Icons.Rounded.Email, contentDescription = "Localized description",
                modifier = Modifier.padding(end = 10.dp)

            )
            Text(
                text = "carlos.oliveira.dev.junior@gmail.com",
                fontWeight = FontWeight.Bold,
                color = Color(0xFF026e3c),
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCard("Android")
    }
}
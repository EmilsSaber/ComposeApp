package com.example.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapp.ui.theme.ComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAppTheme {
                Column {
                    PaymentInfoValue(
                        fromText = "Откуда",
                        cardText = "5449",
                        iconImageVector = R.drawable.ic_card,
                        iconCard = R.drawable.frame_1321315239,

                        )
                    PaymentInfoValue(
                        fromText = "Откуда",
                        cardText = "5449",
                        iconImageVector = R.drawable.ic_card,
                        iconCard = R.drawable.frame_1321315239,

                        )
                    PaymentInfoValue(
                        fromText = "Откуда",
                        cardText = "5449",
                        iconImageVector = R.drawable.ic_card,
                        iconCard = R.drawable.frame_1321315239,
                    )
                }
            }
        }
    }

    @Composable
    fun PaymentInfoValue(
        fromText: String,
        cardText: String,
        iconImageVector: Int,
        iconCard: Int,
    ) {
        Column(
            modifier = Modifier
                .width(374.dp)
                .height(75.dp)
                .background(color = Color(0xFFFFFFFF))
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            Text(
                modifier = Modifier.padding(start = 1.dp),
                text = fromText,
                fontSize = 12.sp
            )
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = ImageVector.vectorResource(iconImageVector),
                    contentDescription = null,
                    modifier = Modifier
                )
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 12.dp),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = cardText,
                        fontSize = 16.sp,
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = ImageVector.vectorResource(iconCard),
                            contentDescription = null,
                            modifier = Modifier.padding(end = 4.dp)
                        )
                        Text(
                            text = cardText,
                            fontSize = 14.sp
                        )
                    }
                }
            }
        }
    }


    @Preview
    @Composable
    private fun TimesTable() {

        Column(

            modifier = Modifier

                .fillMaxSize()

        ) {

            for (i in 1 until 10) {

                Row(
                    modifier = Modifier

                        .fillMaxWidth()
                        .weight(1f),

                    ) {

                    for (j in 1 until 10) {
                        val color = if ((j + i) % 2 == 0) {
                            Color.Yellow
                        } else {
                            Color.White
                        }

                        Box(
                            modifier = Modifier
                                .background(
                                    color = color
                                )
                                .fillMaxHeight()
                                .weight(1f)
                                .border(
                                    width = 1.dp,
                                    color = Color.Black
                                ),
                            contentAlignment = Alignment.Center

                        ) {
                            Text(text = "${i * j}")
                        }

                    }
                }
            }
        }
    }
}


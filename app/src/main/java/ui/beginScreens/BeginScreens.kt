package ui.beginScreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mobilevtb.R
import utils.Screen


@Composable
fun BeginScreen1(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.payment_solid),
            contentDescription = "Payment solid",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .weight(3f)
                .fillMaxWidth()
        )
        Text(
            text = "Финансовое приложение",
            textAlign = TextAlign.Center,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .weight(2f)
                .padding(10.dp)
        )

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .weight(1f)
                .padding(20.dp)
                .fillMaxWidth()
        ) {
            Button(
                onClick = {
                    navController.navigate(Screen.StartScreen.route)
                }
            ) {
                Text(text = "Skip")
            }
            Button(
                onClick = {
                    navController.navigate(Screen.BeginScreen2.route)
                }
            ) {
                Text(text = "Next")
            }
        }
    }
}

@Composable
fun BeginScreen2(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.safe),
            contentDescription = "Safe",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .weight(3f)
                .fillMaxWidth()
        )
        Text(
            text = "С помощью игры увеличь свои знания о",
            textAlign = TextAlign.Center,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .weight(2f)
                .padding(10.dp)
        )

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .weight(1f)
                .padding(20.dp)
                .fillMaxWidth()
        ) {
            Button(
                onClick = {
                    navController.navigate(Screen.StartScreen.route)
                }
            ) {
                Text(text = "Skip")
            }
            Button(
                onClick = {
                    navController.navigate(Screen.BeginScreen3.route)
                }
            ) {
                Text(text = "Next")
            }
        }
    }
}


@Composable
fun BeginScreen3(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.girl_with_comp),
            contentDescription = "Girl with comp",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .weight(3f)
                .fillMaxWidth()
        )
        Text(
            text = "Ну или нет, хуй знает",
            textAlign = TextAlign.Center,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .weight(2f)
                .padding(10.dp)
        )

        Row(
            horizontalArrangement = Arrangement.End,
            modifier = Modifier
                .weight(1f)
                .padding(20.dp)
                .fillMaxWidth()
        ) {
            Button(
                onClick = {
                    navController.navigate(Screen.StartScreen.route)
                }
            ) {
                Text(text = "Next")
            }
        }
    }
}


@Composable
fun StartScreen(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
    ) {
        Card(
            elevation = 4.dp,
            shape = RoundedCornerShape(10),
            modifier = Modifier
                .fillMaxWidth()
                .padding(40.dp)
                .weight(4f)
        ) {
            Image(
                painter = painterResource(id = R.drawable.petuh),
                contentDescription = "Petuh",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color(0xff527b9b),
                                Color(0xffffffff)
                            )
                        )
                    )
            )
        }
        Text(
            text = "FinGram",
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .weight(1f)
                .padding(10.dp)
        )
        Text(
            text = "Приложение созданное для повышения финансовой подготовленности населения при помощи интерактивного метода",
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            modifier = Modifier
                .weight(2f)
                .padding(10.dp)
        )

        Row(
            modifier = Modifier
                .weight(2f)
                .padding(20.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = {

                },
                modifier = Modifier
                    .width(200.dp),
                shape = RoundedCornerShape(30)
            ) {
                Text(
                    text = "Начнём",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
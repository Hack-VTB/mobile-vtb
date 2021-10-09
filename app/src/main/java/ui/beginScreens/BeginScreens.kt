package ui.beginScreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
                .weight(6f)
                .fillMaxWidth()
        )
        Text(
            text = "Повышение финансовой грамотности - в наше время важная хуйня",
            textAlign = TextAlign.Center,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .weight(3f)
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
            painter = painterResource(id = R.drawable.payment_solid),
            contentDescription = "Payment solid",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .weight(6f)
                .fillMaxWidth()
        )
        Text(
            text = "Второй экран нахуй",
            textAlign = TextAlign.Center,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .weight(3f)
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

                }
            ) {
                Text(text = "Skip")
            }
            Button(
                onClick = {

                }
            ) {
                Text(text = "Next")
            }
        }
    }
}
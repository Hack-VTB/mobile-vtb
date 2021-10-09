package ui.lessons

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.mobilevtb.R
import com.example.mobilevtb.ui.theme.MobileVTBTheme
import com.google.accompanist.pager.ExperimentalPagerApi


@ExperimentalMaterialApi
@Composable
fun Lesson1Screen2(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            "Эпизод №1",
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(10.dp)
        )
        lesson1Screen1Head(navController)
        lesson1Screen2Body()
    }
}

@Composable
fun lesson1Screen2Head()
{
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
    ) {
        Card(
            shape = RoundedCornerShape(10.dp),
            elevation = 20.dp,
            modifier = Modifier
                .padding(15.dp),
            backgroundColor = colorResource(com.example.mobilevtb.R.color.blueCard)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.padding(7.dp)
            ) {
                Icon(Icons.Default.ArrowBack, "back")
                Text("К урокам")
            }
        }

        Card(
            shape = RoundedCornerShape(10.dp),
            elevation = 20.dp,
            modifier = Modifier
                .padding(15.dp),
            backgroundColor = colorResource(com.example.mobilevtb.R.color.blueCard)
        ) {
            Text(
                "Акция - это прибыль",
                modifier = Modifier.padding(7.dp)
            )
        }

    }
}

@Composable
fun lesson1Screen2Body()
{
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.padding(7.dp)
            ) {
                Text(
                    text = "Джек сразу подумал о двух вариантах решения проблемы: положить деньги в Банк или на Биржу\n" +
                            "Банк или Биржа.\n",
                    modifier = Modifier
                        .weight(2f)
                        .padding(start = 16.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal
                )
                Image(
                    painter = painterResource(R.drawable.jack),
                    contentDescription = "Jack",
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                )
            }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth().weight(2f)
            ) {
                Card(
                    shape = RoundedCornerShape(10.dp),
                    elevation = 20.dp,
                    modifier = Modifier
                        .padding(15.dp),
                    backgroundColor = colorResource(com.example.mobilevtb.R.color.blueCard)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.padding(7.dp)
                    ) {
                        Text("Биржа")
                    }
                }

                Card(
                    shape = RoundedCornerShape(10.dp),
                    elevation = 20.dp,
                    modifier = Modifier
                        .padding(15.dp),
                    backgroundColor = colorResource(com.example.mobilevtb.R.color.blueCard)
                ) {
                    Text(
                        "Банк",
                        modifier = Modifier.padding(7.dp)
                    )
                }
            }
        }
}



@Preview
@Composable
fun lesson1Screen2Prev() {
    MobileVTBTheme {
        Surface(color = MaterialTheme.colors.background) {
//            Lesson1Screen2()
        }
    }
}

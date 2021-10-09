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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mobilevtb.ui.theme.MobileVTBTheme
import com.google.accompanist.pager.ExperimentalPagerApi
import ui.routes.RoutesScreen
import ui.routes.listRoutes
import utils.Screen
import com.example.mobilevtb.R

@ExperimentalMaterialApi
@Composable
fun Lesson1Screen1(navController: NavController) {
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
        lesson1Screen1Main(navController)

    }
}

@ExperimentalMaterialApi
@Composable
fun lesson1Screen1Head(navController: NavController)
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
            backgroundColor = colorResource(com.example.mobilevtb.R.color.blueCard),
            onClick = {navController.navigate(Screen.RoutesScreen.route)}
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
fun lesson1Screen1Main(navController: NavController) {
    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = 20.dp,
        modifier = Modifier
            .padding(15.dp)
            .fillMaxSize(),
        backgroundColor = colorResource(com.example.mobilevtb.R.color.blueCard)
    ) {
        Column {
            Text(
                "Джек - пекарь кондитер в обычной  пекарне города Метрополис. У него есть большая мечта. С самого детства Джек  мечтает открыть свою пекарню. На счёте Джек имеет 1000000 руб.  \n" +
                        "\n" +
                        "Твоя задача, если ты возмёшься за её выполнение:\n" +
                        "Помочь Джеку увеличить накопленный капитал до 2000000руб \n" +
                        "за 5 лет",
                modifier = Modifier
                    .padding(7.dp)
                    .weight(3f),
                fontSize = 20.sp
            )
            Image(
                painter = painterResource(listRoutes[0].avatar),
                "${listRoutes[0].name}",
                modifier = Modifier
                    .fillMaxSize()
                    .weight(2f)
            )
            Button(
                onClick = {
                    navController.navigate(Screen.Lesson1Screen1.route)
                },
                modifier = Modifier
                    .weight(1f)
                    .padding(20.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally),
                shape = RoundedCornerShape(35),
                colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.darkBlue))
            ) {
                Text(
                    text = "Давайте попробуем!",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        }
    }
}


@Preview
@Composable
fun lesson1Screen1Prev() {
    MobileVTBTheme {
        Surface(color = MaterialTheme.colors.background) {
//            Lesson1Screen1(navController = )
        }
    }
}

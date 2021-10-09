package ui.routes

import android.graphics.Color
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
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
import com.example.mobilevtb.ui.theme.MobileVTBTheme
import com.google.accompanist.pager.ExperimentalPagerApi
import com.example.mobilevtb.R
import com.google.accompanist.pager.HorizontalPager


data class RoutesData(
    val name: String = "",
    val description: String = "",
    val avatar: Int
)

var listRoutes: List<RoutesData> = listOf<RoutesData>(
    RoutesData(
        name = "Джек",
        avatar = R.drawable.jack,
        description = "Тебе предстоит занкомство с миром инвестиций и персонажами. у каждого персонажа своя "
    ),
    RoutesData(
        name = "Хью",
        avatar = R.drawable.hugh,
        description = "Привет, я Хью! Узнаем что тамое акции?"
    ),
    RoutesData(
        name = "Джулия",
        avatar = R.drawable.julia,
        description = "Привет, я Джулия! Налоги - это просто, давай выяним это"
    ),
    RoutesData(
        "Вика",
        avatar = R.drawable.vika,
        description = "Привет, я Вика! Узнаем об облигациях?"
    )
)


@ExperimentalPagerApi
@Composable
fun RoutesScreen(data: List<RoutesData>) {
    Column {
        Text(
            text = "Выбери историю",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(start = 10.dp, top  = 8.dp)
        )
        HorizontalPager(
            count = data.size,
            modifier = Modifier.fillMaxSize()
        ) { page ->
                RoutesCard(page, data[page])
        }
    }
}

@Composable
fun RoutesCard(index: Int, route: RoutesData) {
    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = 20.dp,
        modifier = Modifier
            .padding(15.dp)
            .fillMaxSize(),
        backgroundColor = colorResource(R.color.blueCard)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                "Эпизод №${index + 1}",
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 16.dp, top = 8.dp),
                textAlign = TextAlign.Start,
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold
            )
            Card(
                shape = RoundedCornerShape(10.dp),
                elevation = 20.dp,
                modifier = Modifier
                    .padding(15.dp)
                    .weight(1f)
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth(),
                backgroundColor = colorResource(R.color.white)
            ) {
                Text(
                    route.description,
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 16.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal
                )
            }
            Image(
                painter = painterResource(route.avatar),
                "${route.name}",
                modifier = Modifier
                    .weight(4f)
                    .fillMaxSize()
                    .align(Alignment.Start)
            )
        }
    }
}


@ExperimentalPagerApi
@Preview
@Composable
fun routesScreenPrev() {
    MobileVTBTheme {
        Surface(color = MaterialTheme.colors.background) {
            RoutesScreen(listRoutes)
        }
    }
}



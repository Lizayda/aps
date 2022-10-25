package com.example.test2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.VectorConverter
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.layout.RowScopeInstance.align
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Clear
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test2.ui.theme.Teal200
import com.example.test2.ui.theme.Test2Theme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            //call method component
            //17.10.22
      ScaffoldCompose()

        }
    }
}
@Composable
fun Imss() {
    Column(
        modifier = Modifier.padding(6.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .paddingFromBaseline(top = 45.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Card(
                border = BorderStroke(1.dp, Color.LightGray),
                elevation = 8.dp,
                shape = RoundedCornerShape(25.dp),
                modifier = Modifier.padding(4.dp)
            ) {
                Column(
                    modifier = Modifier.padding(1.dp, vertical = 30.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pulmon),
                        contentDescription = null,
                        modifier = Modifier.size(60.dp)

                    )

                    Text(
                        text = "Modulo Atención Respiratoria (MARS)",
                        modifier = Modifier
                            .width(185.dp)
                            .height(42.dp),
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Card(
                border = BorderStroke(1.dp, Color.LightGray),
                elevation = 8.dp,
                shape = RoundedCornerShape(25.dp),
                modifier = Modifier.padding(4.dp)
            ) {
                Column(
                    modifier = Modifier.padding(1.dp, vertical = 40.dp),
                   horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.bacterias),
                        contentDescription = null,
                        modifier = Modifier.size(60.dp)



                    )
                    Text(
                        text = "Permiso COVID 4.0",
                        modifier = Modifier.width(200.dp),
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center
                    )
                }

            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .paddingFromBaseline(top = 12.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Card(
                border = BorderStroke(1.dp, Color.LightGray),
                elevation = 8.dp,
                shape = RoundedCornerShape(25.dp),
                modifier = Modifier.padding(4.dp)
            ) {
                Column(
                    modifier = Modifier.padding(1.dp, vertical = 35.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.cita),
                        contentDescription = null,
                        modifier = Modifier.size(60.dp)
                    )
                    Text(
                        text = "Cita Medicina Familiar",
                        modifier = Modifier
                            .width(185.dp)
                            .height(18.dp),
                        fontSize = 17.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Card( border = BorderStroke(1.dp, Color.LightGray),
                elevation = 8.dp,
                shape = RoundedCornerShape(25.dp),
                modifier = Modifier.padding(4.dp)
            ) {
                Column(
                    modifier = Modifier.padding(1.dp, vertical = 30.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.estetoscopio),
                        contentDescription = null,
                        modifier = Modifier.size(70.dp)
                    )
                    Text(
                        text = "CHKT en línea",
                        modifier = Modifier
                            .width(185.dp)
                            .height(18.dp),
                        fontSize = 17.sp,
                        textAlign = TextAlign.Center
                    )
                }

            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .paddingFromBaseline(top = 100.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Card( border = BorderStroke(1.dp, Color.LightGray),
                elevation = 8.dp,
                shape = RoundedCornerShape(25.dp),
                modifier = Modifier.padding(10.dp)
            ) {
                Column(
                    modifier = Modifier.padding(1.dp, vertical = 35.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.archivo),
                        contentDescription = null,
                        modifier = Modifier.size(60.dp)
                    )
                    Text(
                        text = "Vigencia de derechos",
                        modifier = Modifier
                            .width(185.dp)
                            .height(18.dp),
                        fontSize = 17.sp,
                        textAlign = TextAlign.Center
                    )
                }

            }
            Card( border = BorderStroke(1.dp, Color.LightGray),
                elevation = 8.dp,
                shape = RoundedCornerShape(25.dp),
                modifier = Modifier.padding(4.dp)
            ) {
                Column(
                    modifier = Modifier.padding(1.dp, vertical = 30.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.maps),
                        contentDescription = null,
                        modifier = Modifier.size(60.dp)
                    )
                    Text(
                        text = "Alta o cambio de clinica",
                        modifier = Modifier
                            .width(185.dp)
                            .height(40.dp),
                        fontSize = 17.sp,
                        textAlign = TextAlign.Center
                    )
                }


            }

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .paddingFromBaseline(top = 100.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Card( border = BorderStroke(1.dp, Color.LightGray),
                elevation = 8.dp,
                shape = RoundedCornerShape(25.dp),
                modifier = Modifier.padding(4.dp)
            ) {
                Column(
                    modifier = Modifier.padding(9.dp, vertical =28.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pregunta),
                        contentDescription = null,
                        modifier = Modifier.size(60.dp)
                    )
                    Text(
                        text = "Informate de tu familiar",
                        modifier = Modifier
                            .width(185.dp)
                            .height(30.dp),
                        fontSize = 17.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Card( border = BorderStroke(1.dp, Color.LightGray),
                elevation = 8.dp,
                shape = RoundedCornerShape(25.dp),
                modifier = Modifier.padding(4.dp)
            ) {
                Column (
                    modifier = Modifier.padding(1.dp, vertical =29.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                ){
                    Image(
                        painter = painterResource(id = R.drawable.oso),
                        contentDescription = null,
                        modifier = Modifier.size(60.dp)
                    )
                    Text(
                        text = "Licencia 140 Bis",
                        modifier = Modifier
                            .width(185.dp)
                            .height(29.dp),
                        fontSize = 17.sp,
                        textAlign = TextAlign.Center)}


            }
            }



        }
    }


@Composable
fun MenuInferior() {

    Spacer(
        modifier = Modifier
            .padding(bottom = 10.dp)
    )
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.home),
                contentDescription = null,
                modifier = Modifier
                    .size(80.dp)
                    .align(Alignment.CenterStart)
                    .padding(start = 40.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.puntero),
                contentDescription = null,
                modifier = Modifier.size(45.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.calendario),
                contentDescription = "ima1",
                modifier = Modifier
                    .size(85.dp)
                    .align(Alignment.CenterEnd)
                    .padding(end = 40.dp)
            )
        }
    }
}

@Preview(showBackground=true)
@Composable
fun ScaffoldCompose(){
     Scaffold(
         topBar = {TopAppBarCompose()},
         modifier = Modifier.background(MaterialTheme.colors.onError)
     ) {
           Column {
               Imss()
               MenuInferior()
           }
     }
}

@Composable
fun TopAppBarCompose(){
    TopAppBar(
        //titulo
        title = { Text(text = ".")},
        //background
        backgroundColor = (MaterialTheme.colors.secondaryVariant),
        navigationIcon = {
        },
        actions = {
                  Column() {
                      Text(text ="Consulta",color=Color.White)
                      Text(text ="NSS",color=Color.Black, modifier = Modifier
                          .clip(CircleShape)
                          .background(Color.White)
                          .padding(horizontal = 8.dp, vertical = 4.dp))
                  }
        },
    )
    Column(modifier= Modifier
        //.fillMaxSize()
        //.fillMaxWidth()
        .padding(10.dp)) {
        Text(text = " IMSS  Digital",
            color = Color.White, fontWeight = FontWeight.Bold,
            fontSize = 22.sp)
        Text(text = "  Bienvenido", color = Color.White,
            fontSize = 15.sp,fontWeight = FontWeight.Bold)
    }

}




package br.com.victor.ecommercecadeiras.view

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.victor.e_commercecadeiras.R
import br.com.victor.ecommercecadeiras.Graph
import br.com.victor.ecommercecadeiras.model.Chair
import br.com.victor.ecommercecadeiras.ui.theme.*

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ChairList(navController: NavController) {

    var bottomState by remember {
        mutableStateOf("chair")
    }

    Scaffold(
        backgroundColor = GRAY,
        topBar = {
            TopAppBar(
                backgroundColor = GRAY,
                elevation = 8.dp
            ) {
                IconButton(onClick = {

                }) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = null,
                        tint = BLACK
                    )

                }

                Spacer(modifier = Modifier.padding(100.dp))

                IconButton(onClick = {

                }) {
                    Icon(
                        imageVector = Icons.Filled.ShoppingCart,
                        contentDescription = null,
                        tint = BLACK
                    )

                }

                IconButton(onClick = {

                }) {
                    Icon(
                        imageVector = Icons.Filled.Menu,
                        contentDescription = null,
                        tint = BLACK
                    )

                }

            }
        },
        bottomBar = {
            BottomNavigation(
                backgroundColor = GRAY
            ) {
                BottomNavigationItem(
                    selected = bottomState == "chair",
                    onClick = {
                        navController.navigate(Graph.CHAIRS)

                    },
                    label = {
                        Text(text = "Chairs")
                    },
                    icon = {
                        Icon(
                            imageVector = Icons.Filled.Home,
                            contentDescription = null
                        )
                    },
                    unselectedContentColor = MEDIUM_GRAY,
                    selectedContentColor = BLACK
                )
                BottomNavigationItem(
                    selected = bottomState == "tables",
                    onClick = {
                        navController.navigate(Graph.TABLES)

                    },
                    label = {
                        Text(text = "Tables")
                    },
                    icon = {
                        Icon(
                            imageVector = Icons.Filled.Favorite,
                            contentDescription = null
                        )
                    },
                    unselectedContentColor = MEDIUM_GRAY,
                    selectedContentColor = BLACK
                )
                BottomNavigationItem(
                    selected = bottomState == "sofa",
                    onClick = {
                        navController.navigate(Graph.SOFA)

                    },
                    label = {
                        Text(text = "Sofas")
                    },
                    icon = {
                        Icon(
                            imageVector = Icons.Filled.Favorite,
                            contentDescription = null
                        )
                    },
                    unselectedContentColor = MEDIUM_GRAY,
                    selectedContentColor = BLACK
                )

            }
        }
    ) {
        val chairList = mutableListOf<Chair>(
            Chair(
                image = R.drawable.imag1,
                title = "Teste",
                description = LoremIpsum(5).toString(),
                price = "680"
            ),
            Chair(
                image = R.drawable.imag2,
                title = "Teste2",
                description = LoremIpsum(5).toString(),
                price = "680"
            ),
            Chair(
                image = R.drawable.imag3,
                title = "Teste3",
                description = LoremIpsum(5).toString(),
                price = "680"
            ),
            Chair(
                image = R.drawable.imag4,
                title = "Teste4",
                description = LoremIpsum(5).toString(),
                price = "680"
            )

        )
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.Center,
            horizontalArrangement = Arrangement.Center
        ) {
            itemsIndexed(chairList) { position, _ ->
                val image = chairList[position].image
                val title = chairList[position].title
                val description = chairList[position].description
                val price = chairList[position].price

                Card(
                    backgroundColor = WHITE,
                    shape = CardShape.small,
                    elevation = 8.dp,
                    modifier = Modifier.padding(10.dp)
                ) {
                    Column(
                        Modifier
                            .fillMaxWidth()
                            .padding(20.dp)
                    ) {
                        Image(
                            painter = painterResource(id = image!!),
                            contentDescription = null,
                            alignment = Alignment.Center,
                            contentScale = ContentScale.FillWidth,
                            modifier = Modifier
                                .width(200.dp)
                                .height(100.dp)
                        )
                        Text(
                            text = title!!,
                            color = BLACK,
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,
                            modifier = Modifier.padding(top = 10.dp)
                        )
                        Text(
                            text = description!!,
                            color = LIGHT_GRAY,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 10.dp)
                        )
                        Text(
                            text = price!!,
                            color = MEDIUM_GRAY,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 10.dp)
                        )



                    }

                }

            }
        }
    }

}
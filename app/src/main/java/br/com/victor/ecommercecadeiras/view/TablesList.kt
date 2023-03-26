package br.com.victor.ecommercecadeiras.view

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.com.victor.ecommercecadeiras.Graph
import br.com.victor.ecommercecadeiras.ui.theme.BLACK
import br.com.victor.ecommercecadeiras.ui.theme.GRAY
import br.com.victor.ecommercecadeiras.ui.theme.MEDIUM_GRAY

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun TablesList(navController: NavController) {

    var bottomState by remember {
        mutableStateOf("table")
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
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(text = "Table List")
        }
    }

}
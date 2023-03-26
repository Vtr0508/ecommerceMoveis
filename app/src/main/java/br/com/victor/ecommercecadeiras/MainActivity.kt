package br.com.victor.ecommercecadeiras

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.victor.ecommercecadeiras.ui.theme.EcommerceCadeirasTheme
import br.com.victor.ecommercecadeiras.view.ChairList
import br.com.victor.ecommercecadeiras.view.SofaList
import br.com.victor.ecommercecadeiras.view.TablesList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EcommerceCadeirasTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    route = Graph.ROOT,
                    startDestination = Graph.CHAIRS
                ) {
                    composable(route = Graph.CHAIRS){
                        ChairList(navController = navController)
                    }
                    composable(route = Graph.TABLES){
                        TablesList(navController = navController)
                    }
                    composable(route = Graph.SOFA){
                        SofaList(navController = navController)
                    }
                }

            }
        }
    }
}

object Graph {
    const val ROOT = "root_graph"
    const val CHAIRS = "chairs_graph"
    const val TABLES = "tables_graph"
    const val SOFA = "sofa_graph"
}


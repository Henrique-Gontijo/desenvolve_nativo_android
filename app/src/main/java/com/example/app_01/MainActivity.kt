//Código padrão "Hello Android!"

/*

// Define o pacote do applicativo, usado para organizar o código
package com.example.app_01

// Importa as classes necessárias  do Android e do Jetpack Compose
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.app_01.ui.theme.App_01Theme

// Define a classe principal da aplicação, herdando de ComponentActivity
class MainActivity: ComponentActivity() {

    // Metodo chamado quando a Activity é criada
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // Chama a implementação padrão do metodo

        enableEdgeToEdge() // Ativa a exibição de borda na tela

        // Define a interface do usuário usando Jetpack Compose
        setContent {
            // Aplica o tema do aplicativo
            App_01Theme {
                // Cria uma estrutura de layout baseada no Material3
                Scaffold(
                    modifier = Modifier.fillMaxSize() // Faz com que o layout ocupe toda a tela
                ){innerPadding -> // Recebe um espaço interno para ajustar o conteúdo
                    // Exibe a função Greeting, passando "Android" como nome
                    Greeting(
                        name="Android",
                        modifier = Modifier.padding(innerPadding) // Aplica o padding interno
                    )
                }
            }
        }
    }
}

// Função composável que exibe um texto na tela
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!", // Define o texto a ser exibido na tela
        modifier = modifier // Aplica modificadores ao Text (como padding)
    )
}

// Função para pré-visualizar a UI no AndroidStudio
@Preview(showBackground = true)
@Composable
fun GreetingPreview(){
    App_01Theme{// Aplica o tema do app na visualização
        Greeting("Android") // Chama função Greeting para ser visualizada
    }
}

*/

package com.example.app_01
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MinhaTela()
        }
    }
}
@Composable
fun MinhaTela() {
    // Estado para armazenar a cor do texto
    var corTexto by remember { mutableStateOf(Color.Black) }
    // Obtém a cor primária do Material Theme
    val corBotao = MaterialTheme.colorScheme.primary
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Texto que alterna de cor ao clicar no botão
        Text(
            text = "Olá, Jetpack Compose!",
            color = corTexto, // Define a cor do texto dinamicamente
            style = MaterialTheme.typography.headlineMedium
        )
        Spacer(modifier = Modifier.height(16.dp)) // Espaço entre os componentes
        Button(
            onClick = {
                // Alterna a cor do texto entre preto e a cor do botão
                corTexto = if (corTexto == Color.Black) corBotao else Color.Black
            }
        ) {
            Text(text = "Clique Aqui")
        }
    }
}

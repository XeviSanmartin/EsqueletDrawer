package cat.institutmontivi.esqueletdrawer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import cat.institutmontivi.esqueletdrawer.ui.Aplicacio

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Aplicacio {

            }
        }
    }
}


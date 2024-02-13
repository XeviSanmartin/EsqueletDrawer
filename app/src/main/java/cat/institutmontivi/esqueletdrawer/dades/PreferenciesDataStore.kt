package cat.institutmontivi.esqueletdrawer.dades

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.longPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class PreferenciesDataStore (private val context: Context)  {
    companion object {
        private val Context.dataStore: DataStore<Preferences> by preferencesDataStore("preferencies")
        private val TEMPS_CARA_O_CREU = longPreferencesKey("temps_cara_o_creu")
        private val MINIM_TRIA_NUMERO = intPreferencesKey("minim_tria_numero")
        private val MAXIM_TRIA_NUMERO = intPreferencesKey("maxim_tria_numero")
        private val PREGUNTA_PER_DEFECTE = stringPreferencesKey("pregunta_per_defecte")
    }

    val getTempsCaraOCreu: Flow<Long> = context.dataStore.data.map { preferencies ->
        preferencies[TEMPS_CARA_O_CREU] ?: 0
    }

    suspend fun saveTempsCaraOCreu(valor: Long){
        context.dataStore.edit { preferencies->
            preferencies[TEMPS_CARA_O_CREU] = valor;
        }
    }

    val getMinimTriaNumero: Flow<Int> = context.dataStore.data.map { preferencies ->
        preferencies[MINIM_TRIA_NUMERO] ?: 0
    }

    suspend fun saveMinimTriaNumero(valor: Int){
        context.dataStore.edit { preferencies->
            preferencies[MINIM_TRIA_NUMERO] = valor;
        }
    }

    val getMaximTriaNumero: Flow<Int> = context.dataStore.data.map { preferencies ->
        preferencies[MAXIM_TRIA_NUMERO] ?: 0
    }

    suspend fun saveMaximTriaNumero(valor: Int){
        context.dataStore.edit { preferencies->
            preferencies[MAXIM_TRIA_NUMERO] = valor;
        }
    }

    val getPreguntaPerDefecte: Flow<String> = context.dataStore.data.map { preferences ->
        preferences[PREGUNTA_PER_DEFECTE] ?: ""
    }

    suspend fun savePreguntaPerDefecte(token: String) {
        context.dataStore.edit { preferences ->
            preferences[PREGUNTA_PER_DEFECTE] = token
        }
    }


}
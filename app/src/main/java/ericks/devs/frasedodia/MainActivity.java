package ericks.devs.frasedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createFrase(View view){
        String[] versos = {
                "No princípio, criou Deus os céus e a terra.\n" + "\n" + "Gênesis 1:1",
                "A terra, porém, estava sem forma e vazia; havia trevas sobre a face do abismo, e o Espírito de Deus pairava por sobre as águas.\n" + "\n" + " Gênesis 1:2",
                "No princípio era o Verbo, e o Verbo estava com Deus, e o Verbo era Deus.\n" + "\n" + "João 1:1",
                " Porque Deus amou ao mundo de tal maneira que deu o seu Filho unigênito, para que todo o que nele crê não pereça, mas tenha a vida eterna.\n" + "\n" + "João 3:16"
        };
        int num = new Random().nextInt(4);
        TextView texto = findViewById(R.id.versiculo);
        texto.setText(versos[num]);
    }
}
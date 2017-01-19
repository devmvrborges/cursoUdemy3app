package idadedecachorro.studio.com.idadedecachorro;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/*
Aplicativo desenvolvido por Maurício Valentim Rodrigues Borges dia 18/01/2017
estudante de Ciência da computação na Faculdade de Jaguariúna.

DESCRIÇÃO: A ideia é utilizar um EditText para inserir um número Inteiro e com
a ajuda de um botão apresentar o resultado em uma TextView formula: (x*7=y).

Desenvolvido durante o Curso Completo do Desenvolvedor Android - Crie 15 Apps (UDEMY)
*/

public class MainActivity extends AppCompatActivity {

    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Para bloquear o LANDSCAPE
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaTexto = (EditText) findViewById(R.id.caixaTextoId);
        botaoIdade = (Button) findViewById(R.id.botaoIdadeId);
        resultadoIdade = (TextView) findViewById(R.id.resultadoIdadeId);


        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Recuperar o que foi digitado no EditText caixaTexto

                String textoDigitado = caixaTexto.getText().toString();

                //Validação para ver se a string não está vazia
                if (textoDigitado.isEmpty()) {
                    resultadoIdade.setText("Nenhum numero digitado");
                } else {
                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int resultadoFinal = valorDigitado * 7;
                    resultadoIdade.setText("A idade do cachorro em anos humanos é: " + resultadoFinal + " anos.");
                }
            }
        });
    }
}

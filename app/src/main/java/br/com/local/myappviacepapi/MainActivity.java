package br.com.local.myappviacepapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.ExecutionException;

import br.com.local.myappviacepapi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnBuscaCep.setOnClickListener(view -> {

            // String endereco = txtCep.getText().toString().trim();

            try {
                //preencher o cep no lblResposta do layout
                CEP retorno = new HttpService(binding.txtCep.getText().toString().trim()).execute().get();
                binding.lblResposta.setText(retorno.toString());
            } catch (ExecutionException | InterruptedException e) {
                e.printStackTrace();
            }

            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);

        });

    }
}
package id.test.strings.testingsha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.UUID;

public class MainActivity extends AppCompatActivity {
    EditText inputString;
    TextView finalResult;
    Button convertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputString = findViewById(R.id.inputText);
        finalResult = findViewById(R.id.finalResult);
        convertButton = findViewById(R.id.buttonConvert);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getTexts = inputString.getText().toString();
                UUID shopciety = UUID.fromString("1b671a64-40d5-491e-99b0-da01ff1f3341");
                UUID test = UUIDType5.nameUUIDFromNamespaceAndString(shopciety, getTexts);
                finalResult.setText("Yang diminta seperti ini : \n36b6d27f-ced7-5d71-81b0-81befabaecc5");
                Toast.makeText(MainActivity.this, "Hasilnya :\n" + test.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

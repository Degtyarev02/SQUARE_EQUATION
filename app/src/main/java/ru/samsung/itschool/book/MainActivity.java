package ru.samsung.itschool.book;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {

    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answer = findViewById(R.id.res);
    }


    public void OnClick(View view) {

        double a = Double.parseDouble( ((EditText)
                findViewById(R.id.a)).getText().toString());
        double b = Double.parseDouble( ((EditText)
                findViewById(R.id.b)).getText().toString());
        double c = Double.parseDouble( ((EditText)
                findViewById(R.id.c)).getText().toString());

        double x1, x2;
        double D = (b * b) - (4 * a * c);

        if (D > 0 && a != 0)
        {
            x1 = (-b + sqrt(D)) / (2 * a);
            x2 = (-b - sqrt(D)) / (2 * a);
            answer.setText(String.valueOf("x1 = " + x1 + "  x2 = " + x2));
        }

        else if (D == 0 && a != 0)
        {
            x1 = -b / (2 * a);
            answer.setText(String.valueOf("x = " + x1));
        }

        else
        {
            answer.setText("Уравнение не имеет решения");
        }
    }
}

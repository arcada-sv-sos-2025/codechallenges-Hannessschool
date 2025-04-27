package fi.arcada.codechallenge;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

import kotlinx.coroutines.channels.Channel;

public class MainActivity extends AppCompatActivity {

    ArrayList<Double> numericValues = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //first challenge
        TextView myFirstCode = findViewById(R.id.my_first_code);
        myFirstCode.setText("Min app funkar");


        //second challenge
        numericValues.add(1.0);
        numericValues.add(1.5);
        numericValues.add(2.0);
        numericValues.add(2.5);
        numericValues.add(3.0);


        Button calculator = findViewById(R.id.calculator);
        calculator.setOnClickListener(v -> calculate());

        Button meanCalculator = findViewById(R.id.mean_calculator);  // Button for mean
        meanCalculator.setOnClickListener(v -> showMean());
    }

    private void calculate()
    {
        double sum = 0;

        for (double val : numericValues)
        {
            sum += val;
        }

        TextView myFirstCode = findViewById(R.id.my_first_code);
        myFirstCode.setText("Summa: " + sum);
    }

    private void showMean()
    {
        double mean = MeanCalc.calcMean(numericValues);

        TextView resultTextView = findViewById(R.id.my_first_code);
        resultTextView.setText("Medelvärde: " + mean);
    }
}
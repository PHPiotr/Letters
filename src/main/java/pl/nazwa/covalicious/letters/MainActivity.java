package pl.nazwa.covalicious.letters;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends Activity {

    private String[] letters = {
            "a", "ą", "b", "c", "ć", "d", "e", "ę", "f", "g", "h", "i",
            "j", "k", "l", "ł","m", "n", "ń", "o", "ó", "p", "q", "r",
            "s", "ś", "t", "u", "v", "w", "x", "y", "z", "ź", "ż"
    };

    private Button letter;

    private Random rand;

    private int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        letter = (Button) findViewById(R.id.letter);

        rand = new Random();

        index = rand.nextInt(letters.length - 1);

        randomizeLetter();

        letter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index = rand.nextInt(letters.length - 1);
                randomizeLetter();
            }
        });
    }

    private void randomizeLetter() {
        letter.setText(letters[index]);
        letter.setBackgroundColor(Color.rgb(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
        letter.setTextColor(Color.rgb(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
    }
}

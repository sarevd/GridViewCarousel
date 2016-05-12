package carousel.test.gridviewcarousel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        ImageAdapter imageAdapter = new ImageAdapter(this);

        gridview.setAdapter(imageAdapter);
       // int listViewLength = imageAdapter.getCount();
      //  gridview.setSelection(imageAdapter.MIDDLE);
        //recipeListView.setSelection((span * (howManySpans / 2)) - 3);
    }
}

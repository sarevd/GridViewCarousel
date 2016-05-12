package carousel.test.gridviewcarousel;

/**
 * Created by nenad on 5/12/2016.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    public static final int HALF_MAX_VALUE = Integer.MAX_VALUE/2;
    public final int MIDDLE;

    // Constructor
    public ImageAdapter(Context c) {
        mContext = c;
        MIDDLE = HALF_MAX_VALUE - HALF_MAX_VALUE % mThumbIds.length;
    }

    public int getCount() {
        return  mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        View grid;

        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(200, 200);

        if (convertView == null) {
            grid = new View(mContext);
            grid = inflater.inflate(R.layout.grid_item, null);
            TextView textView = (TextView) grid.findViewById(R.id.grid_text);
            ImageView imageView = (ImageView) grid.findViewById(R.id.grid_item_image);

         //   grid.setLayoutParams(layoutParams);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
            imageView.setImageResource(this.mThumbIds[position]);

        }
        else
        {
            grid = (View) convertView;
        }

        return grid;
    }

    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.puppy_01, R.drawable.puppy_02,
            R.drawable.puppy_03, R.drawable.puppy_04,
            R.drawable.puppy_05, R.drawable.puppy_06,
            R.drawable.puppy_07, R.drawable.puppy_08,

    };
}
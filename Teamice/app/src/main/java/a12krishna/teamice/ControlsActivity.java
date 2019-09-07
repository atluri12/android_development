package a12krishna.teamice;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

public class ControlsActivity extends AppCompatActivity {

    private static final String TAG = ControlsActivity.class.getSimpleName();

    GridView androidGridView;

    Integer[] imageIDs = {
            R.drawable.academics, R.drawable.admin, R.drawable.director,
            R.drawable.media, R.drawable.student, R.drawable.contact,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controls);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        androidGridView = (GridView) findViewById(R.id.grid_example);
        androidGridView.setAdapter(new ImageAdapterGridView(this));

        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Toast.makeText(getBaseContext(), "Item " + (position + 1) + " Selected", Toast.LENGTH_LONG).show();
                switch (position) {
                    case 0:
                        Intent intent0 = new Intent(ControlsActivity.this, AcademicsActivity.class);
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1 = new Intent(ControlsActivity.this, AdminActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(ControlsActivity.this, DirectActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(ControlsActivity.this, MediaActivity.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(ControlsActivity.this, StudentActivity.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(ControlsActivity.this, ContactActivity.class);
                        startActivity(intent5);
                        break;
                    default:
                        break;
                }
            }
        });
    }
    public class ImageAdapterGridView extends BaseAdapter {
        private Context mContext;

        public ImageAdapterGridView(Context c) {
            mContext = c;
        }

        public int getCount() {
            return  imageIDs.length;
        }

        public Object getItem(int position) {
            return null;
        }

        public long getItemId(int position) {
            return position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView mImageView;
            if(convertView == null) {
                mImageView = new ImageView(mContext);
                mImageView.setLayoutParams(new GridView.LayoutParams(400,400));
                mImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                mImageView.setPadding(8,8,8,8);
            } else {
                mImageView = (ImageView) convertView;
            }
            mImageView.setImageResource(imageIDs[position]);
            return mImageView;
        }
    }
}

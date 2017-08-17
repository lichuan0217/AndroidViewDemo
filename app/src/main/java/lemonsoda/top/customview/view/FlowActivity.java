package lemonsoda.top.customview.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;

import lemonsoda.top.customview.R;

public class FlowActivity extends AppCompatActivity {

    private String[] vals = new String[]{
            "Hello", "Android", "Google", "Apple", "Big Bang Theory",
            "Hello", "Android", "Google", "Apple", "Big Bang Theory",
            "Test One Two Three Four", "Big Pig Bag Box"
    };
    private FlowLayout flowLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flow);

        flowLayout = (FlowLayout) findViewById(R.id.flowLayout);
        initData();
    }

    private void initData() {
        LayoutInflater inflater = LayoutInflater.from(this);
        for (int i = 0; i < vals.length; i++) {
            TextView tv = (TextView) inflater.inflate(R.layout.item_tv, flowLayout, false);
            tv.setText(vals[i]);
            flowLayout.addView(tv);
        }
    }
}

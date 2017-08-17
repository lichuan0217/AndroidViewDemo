package lemonsoda.top.customview.listview;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import lemonsoda.top.customview.R;

public class ListDemoActivity extends AppCompatActivity {

    @BindView(R.id.myListView)
    MyListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_demo);
        ButterKnife.bind(this);

        myListView.setAdapter(new myAdapter(this, null));
    }

    static class myAdapter extends ArrayAdapter<String> {

        private Context context;

        public myAdapter(Context context, ArrayList<String> users) {
            super(context, 0, users);
            this.context = context;
        }

        static class ViewHolder {
            Button button;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            View rootView = convertView;

            if (rootView == null) {
                LayoutInflater layoutInflater = LayoutInflater.from(context);

                rootView = layoutInflater.inflate(R.layout.layout_item, parent, false);
                ViewHolder viewHolder = new ViewHolder();
                viewHolder.button = (Button)rootView.findViewById(R.id.btn_list);
                rootView.setTag(viewHolder);
            }

            ViewHolder holder = (ViewHolder)rootView.getTag();

            return rootView;
        }

        @Override
        public int getCount() {
            return 20;
        }
    }
}

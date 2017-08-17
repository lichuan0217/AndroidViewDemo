package lemonsoda.top.customview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.OnClick;
import lemonsoda.top.customview.conflict.ScrollActivity;
import lemonsoda.top.customview.listview.ListDemoActivity;
import lemonsoda.top.customview.measure.MeasureActivity;
import lemonsoda.top.customview.toolbar.ToolbarDemoActivity;
import lemonsoda.top.customview.touchEvent.TouchEventActivity;
import lemonsoda.top.customview.view.FlowActivity;
import lemonsoda.top.customview.view.FlowLayout;

public class MainActivity extends AppCompatActivity {


    @OnClick(R.id.btn_conflict)
    void onConflict() {
        goTo(ScrollActivity.class);
    }

    @OnClick(R.id.btn_flowLayout)
    void onFlowLayout() {
        goTo(FlowActivity.class);
    }

    @OnClick(R.id.btn_touchEvent)
    void onTouchEvent() {
        goTo(TouchEventActivity.class);
    }

    @OnClick(R.id.btn_toolbar)
    void onToolbar() {
        goTo(ToolbarDemoActivity.class);
    }

    @OnClick(R.id.btn_measure)
    void onMeasureTest() {
        goTo(MeasureActivity.class);
    }

    @OnClick(R.id.btn_listView)
    void onListView() {
        goTo(ListDemoActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }


    private void goTo(Class<?> clazz) {
        Intent intent = new Intent(MainActivity.this, clazz);
        startActivity(intent);
    }

}

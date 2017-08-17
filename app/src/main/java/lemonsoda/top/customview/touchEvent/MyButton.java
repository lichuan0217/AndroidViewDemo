package lemonsoda.top.customview.touchEvent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

import lemonsoda.top.customview.R;

/**
 * Created by Chuan on 24/05/2017.
 */

public class MyButton extends android.support.v7.widget.AppCompatButton {
    private static final String TAG = MyButton.class.getCanonicalName();


    public MyButton(Context context) {
        super(context);
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, "onTouchEvent ---- " + getId() + " ---- " + event.getAction());
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Log.d(TAG, "------Down-----");
            setBackgroundColor(getResources().getColor(R.color.colorAccent));
        } else if (event.getAction() == MotionEvent.ACTION_CANCEL) {
            Log.d(TAG, "------Cancel-----");
            setBackgroundColor(getResources().getColor(android.R.color.white));
        }
        return super.onTouchEvent(event);
    }
}

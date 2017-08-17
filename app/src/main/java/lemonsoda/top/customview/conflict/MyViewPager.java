package lemonsoda.top.customview.conflict;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

/**
 * Created by Chuan on 17/05/2017.
 */

public class MyViewPager extends ViewPager {
    private static final String TAG = MyViewPager.class.getCanonicalName();

    public MyViewPager(Context context) {
        super(context);
    }

    public MyViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d(TAG, "Action: " + ev.getAction());
        Log.d(TAG, "Position: " + ev.getX() + ", " + ev.getY());
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                if (ev.getY() < 450) {
                    Log.d(TAG, "Action Down and Top 450");
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                break;
            case MotionEvent.ACTION_UP:
                getParent().requestDisallowInterceptTouchEvent(false);
                break;
        }
        return super.dispatchTouchEvent(ev);
    }
}

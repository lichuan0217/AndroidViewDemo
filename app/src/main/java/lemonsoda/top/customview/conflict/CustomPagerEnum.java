package lemonsoda.top.customview.conflict;

import lemonsoda.top.customview.R;

/**
 * Created by Chuan on 17/05/2017.
 */

public enum CustomPagerEnum {

    RED(R.string.red, R.layout.view_red),
    BLUE(R.string.blue, R.layout.view_blue),
    ORANGE(R.string.orange, R.layout.view_orange);

    private int titleResId;
    private int layoutResId;

    CustomPagerEnum(int titleRes, int layoutRes) {
        titleResId = titleRes;
        layoutResId = layoutRes;
    }

    public int getTitleResId() {
        return titleResId;
    }

    public int getLayoutResId() {
        return layoutResId;
    }
}

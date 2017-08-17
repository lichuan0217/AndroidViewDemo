package lemonsoda.top.customview.toolbar;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import lemonsoda.top.customview.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ToolbarDemoFragment extends Fragment {

//    private Toolbar toolbar;
    private OnToolbarInteraction listener;

    public ToolbarDemoFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_toolbar_demo, container, false);
//        toolbar = (Toolbar) view.findViewById(R.id.toolbar);
//        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
//        setHasOptionsMenu(true);
//        listener.onSetToolbar("");
//        toolbar.setTitle("ahahah");
        return view;
    }

    public interface OnToolbarInteraction {
        void onSetToolbar(String title);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnToolbarInteraction) {
            listener = (OnToolbarInteraction) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }
}

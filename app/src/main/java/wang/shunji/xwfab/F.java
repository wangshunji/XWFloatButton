package wang.shunji.xwfab;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import wang.shunji.myapplication.R;

/**
 * Created by shunjiwang on 2018/3/28.
 */

public class F extends Fragment {

    FloatingActionsMenu multiple_actions;
    FloatingActionButton action_a;
    FloatingActionButton action_b;
    FloatingActionButton actionC;
    View bg_view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = View.inflate(getContext(), R.layout.activity_right_bottom, null);
        initView(view);
        initData();
        initEvent();
        return view;
    }


    private void initView(View view) {
        bg_view = view.findViewById(R.id.bg_view);
        multiple_actions = (FloatingActionsMenu)view. findViewById(R.id.multiple_actions);
        action_a = (FloatingActionButton) view.findViewById(R.id.action_a);
        action_b = (FloatingActionButton)view. findViewById(R.id.action_b);
        actionC = new FloatingActionButton(getContext());

        TextView tv=view.findViewById(R.id.clicktv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "dddd", Toast.LENGTH_SHORT).show();
            }
        });
        bg_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getContext(), "dddd", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initData() {
        actionC.setTitle("Hide/Show Action above");
        multiple_actions.addButton(actionC);
        multiple_actions.setBgView(bg_view);

//        multiple_actions.setbackgroundAlph(getWindow());
    }

    private void initEvent() {
        //监听点击事件
        action_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action_a.setTitle("Action A clicked");
            }
        });

        action_b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getActivity(), "右边底下第二个按钮", Toast.LENGTH_SHORT).show();
            }
        });

        actionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action_a.setVisibility(action_a.getVisibility() == View.GONE ? View.VISIBLE : View.GONE);
            }
        });
    }
}

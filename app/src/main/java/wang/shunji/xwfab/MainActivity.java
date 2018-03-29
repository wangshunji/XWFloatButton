package wang.shunji.xwfab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.guoqi.highlightview.Guide;
import com.guoqi.highlightview.GuideBuilder;

import java.util.ArrayList;

import wang.shunji.myapplication.R;

public class MainActivity extends AppCompatActivity {

    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        view = View.inflate(this, R.layout.activity_right_bottom, null);
        setContentView(R.layout.activity_main);
//        initView();
//        initData();
//        initEvent();
        final ArrayList<Fragment> fragments=new ArrayList<>();
        fragments.add(new F());
        fragments.add(new F());
        ViewPager vp=findViewById(R.id.vp);
        vp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }
        });

    }


    public void cl(View view) {
        Toast.makeText(this, "dasdf", Toast.LENGTH_SHORT).show();
    }
}

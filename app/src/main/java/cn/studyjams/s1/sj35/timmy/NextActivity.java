package cn.studyjams.s1.sj35.timmy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/4/29.
 */
public class NextActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    private ViewPager mViewPager;
    private TextView mTextView;
    private List<ResourceInfo> mData = new ArrayList<>();

    public NextActivity() {
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        initView();
        initData();
    }

    private void initData() {


        ResourceInfo resourceInfo0 = new ResourceInfo();
        resourceInfo0.str = getString(R.string.next_text1);
        ImageView imageView0 = new ImageView(this);
        imageView0.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView0.setBackgroundResource(R.drawable.ic_0);
        resourceInfo0.image = imageView0;


        ResourceInfo resourceInfo1 = new ResourceInfo();
        resourceInfo1.str = getString(R.string.next_text2);
        ImageView imageView1 = new ImageView(this);
        imageView1.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView1.setBackgroundResource(R.drawable.ic_1);
        resourceInfo1.image = imageView1;

        ResourceInfo resourceInfo2 = new ResourceInfo();
        resourceInfo2.str = getString(R.string.next_text3);
        ImageView imageView2 = new ImageView(this);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView2.setBackgroundResource(R.drawable.ic_2);
        resourceInfo2.image = imageView2;

        ResourceInfo resourceInfo3 = new ResourceInfo();
        resourceInfo3.str = getString(R.string.next_text4);
        ImageView imageView3 = new ImageView(this);
        imageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView3.setBackgroundResource(R.drawable.ic_3);
        resourceInfo3.image = imageView3;

        ResourceInfo resourceInfo4 = new ResourceInfo();
        resourceInfo4.str = getString(R.string.next_text5);
        ImageView imageView4 = new ImageView(this);
        imageView4.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView4.setBackgroundResource(R.drawable.ic_4);
        resourceInfo4.image = imageView4;



        mData.add(resourceInfo0);
        mData.add(resourceInfo1);
        mData.add(resourceInfo2);
        mData.add(resourceInfo3);
        mData.add(resourceInfo4);

        mViewPager.setAdapter(new MyAdapter());
        mViewPager.setCurrentItem(0);
        mTextView.setText(mData.get(0).str);
    }

    private void initView() {
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mTextView = (TextView) findViewById(R.id.textview);

        mViewPager.addOnPageChangeListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        mTextView.setText(mData.get(position).str);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    public class MyAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return mData != null ? mData.size() : 0;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            /*super.destroyItem(container, position, object);*/
            container.removeView(mData.get(position).image);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(mData.get(position).image);
            return mData.get(position).image;
        }
    }

    public class ResourceInfo {
        public String str;
        public ImageView image;
    }


}

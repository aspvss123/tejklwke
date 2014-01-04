
package com.myphone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TabHost;
import android.app.TabActivity;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {
	private TabHost mTabHost;			
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.main);
		mTabHost = this.getTabHost();
		LayoutInflater.from(this).inflate(R.layout.main, mTabHost.getTabContentView(),true);
		mTabHost.addTab(
				mTabHost.newTabSpec("选项卡1")
				.setIndicator("概览",getResources().getDrawable(R.drawable.ic_launcher)	)
				.setContent(R.id.Line1)
				);
		mTabHost.addTab(
				mTabHost.newTabSpec("选项卡2")
				.setIndicator("趋势",getResources().getDrawable(R.drawable.ic_launcher)	)
				.setContent(R.id.Line2)				
				);
		mTabHost.addTab(
				mTabHost.newTabSpec("选项卡3")
				.setIndicator("分析",getResources().getDrawable(R.drawable.ic_launcher)	)
				.setContent(R.id.Line3)				
				);
		mTabHost.addTab(
				mTabHost.newTabSpec("选项卡4")
				.setIndicator("历史",getResources().getDrawable(R.drawable.ic_launcher)	)
				.setContent(R.id.Line4)				
				);
	}
}

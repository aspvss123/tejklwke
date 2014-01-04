
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
				mTabHost.newTabSpec("ѡ�1")
				.setIndicator("����",getResources().getDrawable(R.drawable.ic_launcher)	)
				.setContent(R.id.Line1)
				);
		mTabHost.addTab(
				mTabHost.newTabSpec("ѡ�2")
				.setIndicator("����",getResources().getDrawable(R.drawable.ic_launcher)	)
				.setContent(R.id.Line2)				
				);
		mTabHost.addTab(
				mTabHost.newTabSpec("ѡ�3")
				.setIndicator("����",getResources().getDrawable(R.drawable.ic_launcher)	)
				.setContent(R.id.Line3)				
				);
		mTabHost.addTab(
				mTabHost.newTabSpec("ѡ�4")
				.setIndicator("��ʷ",getResources().getDrawable(R.drawable.ic_launcher)	)
				.setContent(R.id.Line4)				
				);
	}
}

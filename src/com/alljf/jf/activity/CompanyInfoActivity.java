package com.alljf.jf.activity;


import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.Application.SysApplication;
import com.alljf.jf.R;

@SuppressLint("NewApi")
public class CompanyInfoActivity extends Activity implements OnClickListener{
	
	
	private ImageView mBack;
	private ImageView mHome;
	private TextView mCompanyinfo;
	private String str="这里是测试数据这里是测试数据这里是测试数据这里是测试数据这里是测试数据这里是测试数据这里是测试数据这里是测试数据这里是测试数据这里是测试数据这里是测试数据这里是测试数据";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_companyinfo);
		SysApplication.getInstance().addActivity(this);
		initview();
	}
	
	private void initview() {
		// TODO Auto-generated method stub
		mBack=(ImageView) findViewById(R.id.companyinfo_back);
		mBack.setOnClickListener(this);
		mHome=(ImageView) findViewById(R.id.companyinfo_home);
		mHome.setOnClickListener(this);
		mCompanyinfo=(TextView) findViewById(R.id.companyinfo_content);
		mCompanyinfo.setText(" \u3000\u3000"+str);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.companyinfo_back:
			finish();
			break;
		case R.id.companyinfo_home:
			finish();	
			startActivity(new Intent(CompanyInfoActivity.this,MainActivity.class));
			break;

		default:
			break;
		}
	}
	

}

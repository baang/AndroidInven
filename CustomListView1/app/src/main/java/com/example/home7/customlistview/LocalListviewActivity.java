package com.example.home7.customlistview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.locallistview.R;

import java.util.ArrayList;

public class LocalListviewActivity extends Activity {
	ArrayList<MyItem> arItem;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contacts_list);

		arItem = new ArrayList<MyItem>();
		MyItem mi;
		mi = new MyItem(R.mipmap.paris, "PARIS BAGUETTE","파리바게트");
		arItem.add(mi);
		mi = new MyItem(R.mipmap.jours, "TOUS LES JOURS","뚜레쥬르");
		arItem.add(mi);
		mi = new MyItem(R.mipmap.ic_lee, "이성당","이성당");
		arItem.add(mi);
		mi = new MyItem(R.mipmap.ic_lee, "이성당","이성당");
		arItem.add(mi);
		mi = new MyItem(R.mipmap.ic_lee, "이성당","이성당");
		arItem.add(mi);
		mi = new MyItem(R.mipmap.ic_lee, "이성당","이성당");
		arItem.add(mi);




		MyListAdapter MyAdapter = new MyListAdapter(this, R.layout.listitem, arItem);

		ListView MyList;
		MyList=(ListView)findViewById(R.id.list);
		MyList.setAdapter(MyAdapter);
		MyList.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
									int position, long id) {

				Intent intent = new Intent(LocalListviewActivity.this,
						ItemView.class);
				intent.putExtra("itemi", position);
				startActivity(intent);
				/**
				 Toast.makeText(getApplicationContext(), ((TextView)view).getText(),
				 Toast.LENGTH_SHORT).show();
				 **/

			}
		});

	}
}

//리스트 뷰에 출력할 항목
class MyItem {
	MyItem(int aIcon, String aName, String aContents) {
		Icon = aIcon;
		Name = aName;
		Contents = aContents;
	}
	int Icon;
	String Name;
	String Contents;
}

//어댑터 클래스
class MyListAdapter extends BaseAdapter {
	Context maincon;
	LayoutInflater Inflater;
	ArrayList<MyItem> arSrc;
	int layout;

	public MyListAdapter(Context context, int alayout, ArrayList<MyItem> aarSrc) {
		maincon = context;
		Inflater = (LayoutInflater)context.getSystemService(
				Context.LAYOUT_INFLATER_SERVICE);
		arSrc = aarSrc;
		layout = alayout;
	}

	public int getCount() {
		return arSrc.size();
	}

	public String getItem(int position) {
		return arSrc.get(position).Name;
	}

	public long getItemId(int position) {
		return position;
	}

	// 각 항목의 뷰 생성
	public View getView(int position, View convertView, ViewGroup parent) {
		final int pos = position;
		if (convertView == null) {
			convertView = Inflater.inflate(layout, parent, false);
		}
		ImageView img = (ImageView)convertView.findViewById(R.id.img);
		img.setImageResource(arSrc.get(position).Icon);

		TextView txt01 = (TextView)convertView.findViewById(R.id.text01);
		txt01.setText(arSrc.get(position).Name);

		TextView txt02 = (TextView)convertView.findViewById(R.id.text02);
		txt02.setText(arSrc.get(position).Contents);

		return convertView;

	}
}


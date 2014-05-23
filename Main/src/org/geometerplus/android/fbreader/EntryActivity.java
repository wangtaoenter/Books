package org.geometerplus.android.fbreader;

import org.geometerplus.zlibrary.ui.android.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class EntryActivity extends Activity {
	
	View entryView;
	
	private OnClickListener onClickListener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			int id = v.getId();
			switch (id) {
			case R.id.entry_view:
				Intent i = new Intent(EntryActivity.this, FBReader.class);
				startActivity(i);
				finish();
				break;
			default:
				break;
			}
		}
	};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.entry);
		entryView = findViewById(R.id.entry_view);
		entryView.setOnClickListener(onClickListener);
	}
}
package com.xilehang.my3dlunbo;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;
/**
 * 
 * @author wwq
 * @time 2017-1-10下午7:42:52
 * @version 1.0
 */
public class MainActivity extends Activity {
	public static Button butqianmian, buthoumian;
	private Image3DSwitchView imageswitch;
	public static Context context;
	private Image3DSwitchView imageswitchview;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_main);
		context = this;
		butqianmian = (Button) findViewById(R.id.qianmiann);
		buthoumian = (Button) findViewById(R.id.houmiann);
		imageswitchview = (Image3DSwitchView) findViewById(R.id.image_switch_view);
		click();
	}
/**
 * 
 * Time:2017-1-10
 * Description: 点击方法
 * return:void
 */
	public void click() {
/*		butqianmian.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				if(event.getAction()==MotionEvent.ACTION_DOWN){
					imageswitchview.flag = false;
					imageswitchview.sendmymessage();
					
				}else if(event.getAction()==MotionEvent.ACTION_UP){
				}
				return true;
			}
		});*/
		butqianmian.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				imageswitchview.sendmymessage();
			}
		});
		buthoumian.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				imageswitchview.sendmymessagehou();
			}
		});
	}


}

/*    
}*/

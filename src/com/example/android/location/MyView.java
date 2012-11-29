package com.example.android.location;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView; 
import srl.gui.android.EditSketch;

public class MyView extends View{

	Bitmap overlay;
	
	public MyView(Context context, Bitmap b) {
		super(context);
		overlay = b;
		// TODO Auto-generated constructor stub
	}

	/*public void resizeOverlay(){
		//int height = Configuration.;
		//int width = Display.getWidth();
		
		//Bitmap smallMap = Bitmap.createScaledBitmap(overlay, width, height, true);
		Matrix rotation = new Matrix();
		rotation.postRotate(-90);
		Bitmap rotatedMap = Bitmap.createBitmap(overlay,0,0, overlay.getWidth(), overlay.getHeight(), rotation, true);
		
		
		overlay = rotatedMap;
	}*/
	@Override
	protected void onDraw(Canvas canvas){
		super.onDraw(canvas);

		/*Drawable drawable = new BitmapDrawable(getResources(), overlay);
		Context context;
		ImageView iv = new ImageView(context);
		iv.setBackgroundDrawable(drawable);
		drawCanvas = (EditSketch)findViewById(R.id.edit_sketch);
		drawCanvas.setBackgroundColor(Color.TRANSPARENT);*/
		Matrix rotation = new Matrix();
		rotation.postRotate(-90);
		Bitmap rotatedMap = Bitmap.createBitmap(overlay,0,0, overlay.getWidth(), overlay.getHeight(), rotation, true);
		
		canvas.drawColor(Color.WHITE);
		canvas.drawBitmap(rotatedMap, 0, 0, null);
	}
}

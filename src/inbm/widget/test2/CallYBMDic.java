package inbm.widget.test2;

import android.media.audiofx.BassBoost.Settings;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.RemoteViews;
import android.widget.Spinner;
import android.support.v4.app.NavUtils;
import android.view.View;

public class CallYBMDic extends AppWidgetProvider {

	String selectedItem;
	
	public void onEnabled(Context context) {
		/*PackageManager pm = context.getPackageManager();
		pm.setComponentEnabledSetting(
				new ComponentName("inbm.widget.test2", ".ExampleAppWidgetProvider"),
				PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
				PackageManager.DONT_KILL_APP
		);*/
	
	}
	
	public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
		super.onUpdate(context, appWidgetManager, appWidgetIds);
		
		for(int cnt = 0; cnt < appWidgetIds.length; cnt++) {
			
			//Intent intent = new Intent(context, WidgetTemplete.class);
            //PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);
			
			int appWidgetId = appWidgetIds[cnt];
			RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.call_ybm);
           






ComponentName name=new ComponentName("com.diotek.diodict3.hc.samsung.p5", "com.diotek.diodict3.hc.DioAuthActivity");
       
Intent intent =new Intent(Intent.ACTION_MAIN);

intent.addCategory(Intent.CATEGORY_LAUNCHER);
intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK |
Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
intent.setComponent(name);

PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);

views.setOnClickPendingIntent(R.id.button, pendingIntent);


appWidgetManager.updateAppWidget(appWidgetId, views);
 			
			
			
			
			
			
			
			
			
			
			/*final String[] items = new String[] {"one", "Two", "Three"};
           
            Spinner spinner = (Spinner) context.findViewById(R.id.myspinner);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(context,
                        android.R.layout.simple_spinner_item, items);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);

            spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
             @Override
             public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {               
                    items[0] = "One";
                    selectedItem = items[position];

             }

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
            });*/
            
            
			
			
			
			
           
		}
		
	};
}
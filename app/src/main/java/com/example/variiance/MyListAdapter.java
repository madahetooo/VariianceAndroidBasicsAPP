package com.example.variiance;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter extends ArrayAdapter<String > {
    private final Activity context;
    private final String[] mainName;
    private final String[] subTitle;
    private final Integer[] image;

    public MyListAdapter(Activity context, String[] employeeName, String[] employeeTitle, Integer[] employeeImage) {
        super(context,R.layout.employee_item,employeeName);
        this.context = context;
        this.mainName = employeeName;
        this.subTitle = employeeTitle;
        this.image = employeeImage;
    }



    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.employee_item,null,true);
        TextView employeeName = (TextView) rowView.findViewById(R.id.tvEmployeeName);
        TextView employeeTitle = (TextView) rowView.findViewById(R.id.tvEmployeeTitle);
        ImageView employeeImage = (ImageView) rowView.findViewById(R.id.ivEmployeeImage);

        employeeName.setText(mainName[position]);
        employeeTitle.setText(subTitle[position]);
        employeeImage.setImageResource(image[position]);
        return rowView;
    }
}

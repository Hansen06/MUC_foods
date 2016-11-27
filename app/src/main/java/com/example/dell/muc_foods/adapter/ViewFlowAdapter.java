package com.example.dell.muc_foods.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.dell.muc_foods.R;
import com.example.dell.muc_foods.util.Resfood_Viewflow;

import java.util.List;


public class ViewFlowAdapter extends BaseAdapter {
	
	private LayoutInflater mInflater;//得到一个LayoutInfalter对象用来导入布局 
	  
    private Context context;
    private List<Resfood_Viewflow> Resfood_Viewflow;
    
    public ViewFlowAdapter(Context context,List<Resfood_Viewflow> datas){
        this.context = context;
        this.Resfood_Viewflow = datas;
        this.mInflater = LayoutInflater.from(context);
    }

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return Resfood_Viewflow.size();
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		final ViewHolder holder;
		if (view == null) {
			view = mInflater.inflate(R.layout.viewflow,null);
			holder = new ViewHolder();
			holder.imageView = (ImageView) view.findViewById(R.id.imag);
            view.setTag(holder);//绑定ViewHolder对象    
			
		} else {
			holder = (ViewHolder) view.getTag();
		}

		holder.imageView.setImageResource(Resfood_Viewflow.get(position).getFood_img());
		
		return view;
	
	}
	
	private static class ViewHolder {

		ImageView imageView;
	}
	
	private Resfood_Viewflow getPosition(int pos) {
		// TODO Auto-generated method stub
		return Resfood_Viewflow.get(pos);
	}
	
	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

}

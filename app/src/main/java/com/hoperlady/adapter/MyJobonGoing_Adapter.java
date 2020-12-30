package com.hoperlady.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.hoperlady.Pojo.MyjobOngoingPojo;
import com.hoperlady.R;

import java.util.ArrayList;

/**
 * Created by user88 on 12/11/2015.
 */
public class MyJobonGoing_Adapter extends BaseAdapter {

    private ArrayList<MyjobOngoingPojo> data;
    private LayoutInflater mInflater;
    private Context context;

    public MyJobonGoing_Adapter(Context c, ArrayList<MyjobOngoingPojo> d) {
        context = c;
        mInflater = LayoutInflater.from(context);
        data = d;
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view;
        ViewHolder holder;

        if (convertView == null) {
            view = mInflater.inflate(R.layout.myjob_ongoing_new_single, parent, false);
            holder = new ViewHolder();

            holder.ongoing_bookingtime_Tv = (TextView) view.findViewById(R.id.myjob_ongoing_bookingtime_textView);
            holder.ongoinjob_location_Tv = (TextView) view.findViewById(R.id.myjob_ongoing_locationTv);
            holder.ongoinjob_orderidTv = (TextView) view.findViewById(R.id.myjob_ongoing_orderid);
            holder.ongoing_username = (TextView) view.findViewById(R.id.myjob_ongoing_username);
            holder.ongoing_category = (TextView) view.findViewById(R.id.myjob_ongoing_category);
//            holder.ongoingjob_profile_img = (RoundedImageView) view.findViewById(R.id.ongongjob_profileimg);
            holder.job_status_Tv = (TextView) view.findViewById(R.id.Job_status);
//            holder.ongongjob_map_icon = (ImageView) view.findViewById(R.id.ongongjob_map_icon);

            view.setTag(holder);
        } else {
            view = convertView;
            holder = (ViewHolder) view.getTag();
        }

        if (data.get(position).getJob_status().equalsIgnoreCase("Accepted")) {
            holder.job_status_Tv.setTextColor(context.getResources().getColor(R.color.appmain_color));//Color.parseColor("#f88204"));
        }

        holder.job_status_Tv.setText(data.get(position).getJob_status());
        holder.ongoing_bookingtime_Tv.setText(data.get(position).getOngoing_date());
        holder.ongoing_category.setText(data.get(position).getOngoing_category());
        holder.ongoing_username.setText(data.get(position).getOngoing_user_name());
        holder.ongoinjob_orderidTv.setText(data.get(position).getOrder_id());

        if (data.get(position).getAddress() != null) {
            if (data.get(position).getAddress().equalsIgnoreCase("")) {
//                holder.ongongjob_map_icon.setVisibility(View.GONE);
                holder.ongoinjob_location_Tv.setText("");
            } else {
                holder.ongoinjob_location_Tv.setText(data.get(position).getAddress());
//                holder.ongongjob_map_icon.setVisibility(View.VISIBLE);
            }
        } else {
//            holder.ongongjob_map_icon.setVisibility(View.GONE);
            holder.ongoinjob_location_Tv.setText("");
        }

//        Picasso.with(context).load(String.valueOf(data.get(position).getOngoing_user_image())).placeholder(R.drawable.nouserimg).memoryPolicy(MemoryPolicy.NO_CACHE).into(holder.ongoingjob_profile_img);

        return view;
    }

    public class ViewHolder {
        private TextView ongoinjob_location_Tv, ongoing_bookingtime_Tv, job_status_Tv;
        private TextView ongoinjob_orderidTv, ongoing_username, ongoing_category;
//        private RoundedImageView ongoingjob_profile_img;
//        private ImageView ongongjob_map_icon;
    }
}

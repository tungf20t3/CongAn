package com.reddog.btcuoiky.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.reddog.btcuoiky.R;
import com.reddog.btcuoiky.model.CongAn;

import java.util.List;

public class CongAnAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<CongAn> singerList;

    public CongAnAdapter(Context context, int layout, List<CongAn> singerList) {
        this.context = context;
        this.layout = layout;
        this.singerList = singerList;
    }

    @Override
    public int getCount() {
        return singerList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        ImageView imgCongAn;
        TextView txtTenCongAn, txtQuocGia, txtNoiCongTac, txtCapBac;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder = new ViewHolder();
            //anh xa
            holder.txtTenCongAn = view.findViewById(R.id.tvNameCA);
            holder.txtQuocGia = view.findViewById(R.id.tvQuocGia);
            holder.txtNoiCongTac = view.findViewById(R.id.tvNoiCongTac);
            holder.txtCapBac = view.findViewById(R.id.tvCapBac);
            holder.imgCongAn = view.findViewById(R.id.imgCongAn);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        //gán giá trị
        CongAn congAn = singerList.get(i);
        holder.txtTenCongAn.setText(congAn.getTen());
        holder.txtQuocGia.setText(congAn.getQuoc_gia());
        holder.txtNoiCongTac.setText(congAn.getNoi_cong_tac());
        holder.txtCapBac.setText(congAn.getCap_bac());
        holder.imgCongAn.setImageResource(congAn.getHinh_anh());
        return view;
    }
}

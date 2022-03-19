package com.example.modul_spp_ukk2021.UI.UI.Home.punyaAdmin;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.example.modul_spp_ukk2021.R;
import com.example.modul_spp_ukk2021.UI.Data.Model.Petugas;
import com.example.modul_spp_ukk2021.UI.Data.Model.Siswa;
import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class DataSiswaAdapter extends RecyclerView.Adapter<DataSiswaAdapter.ViewHolder> {
    private List<Siswa> siswa;
    private Context context;
    private static OnRecyclerViewItemClickListener mListener;

    public interface OnRecyclerViewItemClickListener {
        void onItemClicked(String nisn, String refresh);
    }

    public void setOnRecyclerViewItemClickListener(DataSiswaAdapter.OnRecyclerViewItemClickListener listener) {
        mListener = listener;
    }

    public DataSiswaAdapter(Context context, List<Siswa> siswa) {
        this.context = context;
        this.siswa = siswa;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pa_container_data_siswa, parent, false);
        return new ViewHolder(view);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP_MR1)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Siswa siswa = this.siswa.get(position);

        holder.tvNama.setText(siswa.getNama());
        holder.tvNISN.setText(siswa.getNisn());
        holder.tvKelas.setText("Siswa " + siswa.getNama_kelas());

//        holder.deleteData.setOnClickListener(v -> {
//            PopupMenu popup = new PopupMenu(context, v, Gravity.END, R.attr.popupMenuStyle, 0);
//            MenuInflater inflater = popup.getMenuInflater();
//            inflater.inflate(R.menu.cardmenu, popup.getMenu());
//            popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//                @Override
//                public boolean onMenuItemClick(MenuItem item) {
//                    if (item.getItemId() == R.id.action_delete) {
//                        mListener.onItemClicked(petugas.getId_petugas(), null);
//                    }
//                    return true;
//                }
//            });
//            popup.show();
//        });
//
//        holder.detailStaff.setOnClickListener(v -> {
//            new Handler().postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    AlertDialog.Builder builder = new AlertDialog.Builder(context, R.style.AlertDialogTheme);
//                    View view = LayoutInflater.from(context).inflate(R.layout.pa_dialog_view_spp, (ConstraintLayout) v.findViewById(R.id.layoutDialogContainer));
//                    builder.setView(view);
//                    ((TextView) view.findViewById(R.id.tvTahun)).setText("Tahun       : " + spp.getTahun());
//                    ((TextView) view.findViewById(R.id.tvNominal)).setText("Nominal   : " + format.format(spp.getNominal()));
//                    ((TextView) view.findViewById(R.id.tvAngkatan)).setText("Angkatan : " + spp.getAngkatan());
//                    final AlertDialog alertDialog = builder.create();
//                    view.findViewById(R.id.buttonOK).setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View view) {
//                            alertDialog.dismiss();
//                        }
//                    });
//                    view.findViewById(R.id.buttonEdit).setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            alertDialog.dismiss();
//                            AlertDialog.Builder builder = new AlertDialog.Builder(context, R.style.AlertDialogTheme);
//                            View view2 = LayoutInflater.from(context).inflate(R.layout.pa_dialog_edit_spp, (ConstraintLayout) v.findViewById(R.id.layoutDialogContainer));
//                            builder.setView(view2);
//                            final TextView angkatan = (TextView) view2.findViewById(R.id.angkatan_spp);
//                            final TextView tahun = (TextView) view2.findViewById(R.id.tahun_spp);
//                            final EditText nominal = (EditText) view2.findViewById(R.id.nominal_spp);
//                            angkatan.setText(" " + spp.getAngkatan());
//                            tahun.setText(" " + spp.getTahun());
//                            nominal.setText(spp.getNominal().toString());
//                            final AlertDialog alertDialog2 = builder.create();
//                            view2.findViewById(R.id.buttonKirim).setOnClickListener(new View.OnClickListener() {
//                                @Override
//                                public void onClick(View view) {
//                                    Retrofit retrofit = new Retrofit.Builder()
//                                            .baseUrl(url)
//                                            .addConverterFactory(GsonConverterFactory.create())
//                                            .build();
//                                    ApiEndPoints api = retrofit.create(ApiEndPoints.class);
//                                    Call<SPPRepository> call = api.updateSPP(spp.getId_spp(), nominal.toString());
//                                    call.enqueue(new Callback<SPPRepository>() {
//                                        @Override
//                                        public void onResponse(Call<SPPRepository> call, Response<SPPRepository> response) {
//                                            String value = response.body().getValue();
//                                            String message = response.body().getMessage();
//                                            if (value.equals("1")) {
//                                                alertDialog2.dismiss();
//                                                mListener.onItemClicked(null, "1");
//                                            }
//                                        }
//
//                                        @Override
//                                        public void onFailure(Call<SPPRepository> call, Throwable t) {
//                                            Log.e("DEBUG", "Error: ", t);
//                                        }
//                                    });
//                                }
//                            });
//                            view2.findViewById(R.id.buttonBatal).setOnClickListener(new View.OnClickListener() {
//                                @Override
//                                public void onClick(View view) {
//                                    alertDialog2.dismiss();
//                                }
//                            });
//                            if (alertDialog2.getWindow() != null) {
//                                alertDialog2.getWindow().setBackgroundDrawable(new ColorDrawable(0));
//                            }
//                            alertDialog2.show();
//                        }
//                    });
//                    if (alertDialog.getWindow() != null) {
//                        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
//                    }
//                    alertDialog.show();
//                }
//            }, 400);
//        });
    }

    @Override
    public int getItemCount() {
        return siswa.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView deleteData;
        MaterialCardView detailSiswa;
        TextView tvNama, tvNISN, tvKelas;

        public ViewHolder(View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.nama);
            tvNISN = itemView.findViewById(R.id.NISN);
            tvKelas = itemView.findViewById(R.id.Kelas);
            detailSiswa = itemView.findViewById(R.id.detailSiswa);
            deleteData = itemView.findViewById(R.id.deleteData);
        }
    }
}
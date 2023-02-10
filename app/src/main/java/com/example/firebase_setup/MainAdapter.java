package com.example.firebase_setup;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainAdapter extends FirebaseRecyclerAdapter<MainModal, MainAdapter.MyViewHolder> {

    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public MainAdapter(@NonNull FirebaseRecyclerOptions<MainModal> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull MyViewHolder holder, int position, @NonNull MainModal model) {
        holder.username.setText(model.getUsername());
        holder.specialisation.setText(model.getSpecialisation());
        holder.email.setText(model.getEmail());

        Glide.with(holder.image.getContext())
                .load(model.getImage())
                .placeholder(R.drawable.ic_launcher_background)
                .circleCrop()
                .error(com.firebase.ui.database.R.drawable.common_google_signin_btn_icon_dark_normal)
                .into(holder.image);

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_item, parent, false);
        return new MyViewHolder(view);
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        CircleImageView image;
        TextView username, specialisation, email;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image = (CircleImageView) itemView.findViewById(R.id.img1);
            username = (TextView) itemView.findViewById(R.id.nametext);
            email = (TextView) itemView.findViewById(R.id.email);
            specialisation = (TextView) itemView.findViewById(R.id.specialisation);
        }

    }
}

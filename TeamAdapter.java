package com.example.footballapp;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.TeamViewHolder> {

    private List<Team> teamList;

    public TeamAdapter(List<Team> teamList) {
        this.teamList = teamList;
    }

    @NonNull
    @Override
    public TeamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_team, parent, false);
        return new TeamViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeamViewHolder holder, int position) {
        Team team = teamList.get(position);
        holder.nameTextView.setText(team.getName());
        holder.winsTextView.setText("Wins: " + team.getWins());
        holder.drawsTextView.setText("Draws: " + team.getDraws());
        holder.lossesTextView.setText("Losses: " + team.getLosses());
    }

    @Override
    public int getItemCount() {
        return teamList.size();
    }

    public static class TeamViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView, winsTextView, drawsTextView, lossesTextView;

        public TeamViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
            winsTextView = itemView.findViewById(R.id.winsTextView);
            drawsTextView = itemView.findViewById(R.id.drawsTextView);
            lossesTextView = itemView.findViewById(R.id.lossesTextView);
        }
    }
}

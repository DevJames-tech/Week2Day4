package examples.aaronhoskins.com.homeworkexample;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import examples.aaronhoskins.com.homeworkexample.model.ZooAnimal.ZooAnimal;

public class AnimalListAdapter extends RecyclerView.Adapter<AnimalListAdapter.ViewHolder> {
    ArrayList<ZooAnimal> zooAnimals;

    public AnimalListAdapter(ArrayList<ZooAnimal> zooAnimals) {
        this.zooAnimals = zooAnimals;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.zoo_animal_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final ZooAnimal zooAnimal = zooAnimals.get(position);
        holder.tvSpecies.setText(zooAnimal.getmSpecies());
        holder.tvLife.setText(zooAnimal.getmLiveExpediency());
        holder.tvSound.setText(zooAnimal.getmSound());
        holder.tvDiet.setText(zooAnimal.getmDiet());
        holder.tvCategory.setText(zooAnimal.getmCategory());
        holder.setZooAnimal(zooAnimal);
    }

    @Override
    public int getItemCount() {
        return zooAnimals.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tvSpecies;
        TextView tvCategory;
        TextView tvDiet;
        TextView tvSound;
        TextView tvLife;
        ZooAnimal zooAnimal;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvSpecies = itemView.findViewById(R.id.tvSpecies);
            tvCategory = itemView.findViewById(R.id.tvCategory);
            tvDiet = itemView.findViewById(R.id.tvDiet);
            tvSound = itemView.findViewById(R.id.tvSound);
            tvLife = itemView.findViewById(R.id.tvLifeExp);
            itemView.setOnClickListener(this);

        }

        public ZooAnimal getZooAnimal() {
            return zooAnimal;
        }

        public void setZooAnimal(ZooAnimal zooAnimal) {
            this.zooAnimal = zooAnimal;
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(view.getContext(), DetailsActivity.class);
            intent.putExtra("animal", zooAnimal);
            view.getContext().startActivity(intent);
        }
    }
}

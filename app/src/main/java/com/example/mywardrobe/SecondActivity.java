package com.example.mywardrobe;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mywardrobe.databinding.ActivitySecondBinding;
import com.example.mywardrobe.models.Clothes;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private ActivitySecondBinding binding;
    private RecyclerView recyclerView;
    private List<Clothes> list = new ArrayList<>();
    private UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.secondToolbar);
        getSupportActionBar().setTitle("Гардероб");

        list.add(new Clothes(R.drawable.coat, "Пальто", "Пальто демисезонное. Подходит для работы и выходного дня"));
        list.add(new Clothes(R.drawable.downjacket, "Пуховик зимний", "Подходит для использования при температуре от - 10 градусов"));
        list.add(new Clothes(R.drawable.trousers, "Брюки классические", "Подходит для Business casual, а также выходного дня"));
        list.add(new Clothes(R.drawable.shoes, "Туфли классические", "Элегантная обувь из натуральной кожи с открытой шнуровкой"));
        list.add(new Clothes(R.drawable.shirt, "Рубашка классическая", "базовый элемент делового гардероба (Business casual)"));
        list.add(new Clothes(R.drawable.casualshirt, "Рубашка повседневная", "современная мужская одежда, сочетающая комфорт и кэжуал стиль"));
        list.add(new Clothes(R.drawable.hoody, "Толстовка casual friday", "Комфортный hoody в преддверии выходных"));
        list.add(new Clothes(R.drawable.sportsuit, "Спортивный костюм", "Для повседневного использования"));
        list.add(new Clothes(R.drawable.runningsuit, "Спортивный костюм", "Спортивный костюм для бега"));
        list.add(new Clothes(R.drawable.jeans, "Джинсы", "Для повседневного использования"));


        userAdapter = new UserAdapter(list);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(userAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.exit) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

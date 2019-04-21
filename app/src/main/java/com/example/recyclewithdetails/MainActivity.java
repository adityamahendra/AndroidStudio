package com.example.recyclewithdetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private String title = "Mode List";

    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<String> description = new ArrayList<>();
    private ArrayList<String> imageUrl = new ArrayList<>();
    private ArrayList<String> descriptionDetail = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate:started.");
        initImageBitmaps();
    }

    private void initImageBitmaps() {
        imageUrl.add("https://instagram.fsub3-1.fna.fbcdn.net/vp/1f718f7d6c13849e786b06924b482d7d/5D3164E5/t51.2885-15/e35/55931175_139609693762291_2353971581656349577_n.jpg?_nc_ht=instagram.fsub3-1.fna.fbcdn.net&_nc_cat=107");
        names.add("Doberman");
        description.add("Type of Big Dog");
        descriptionDetail.add("Masa hidup: 10 sampai 13 tahun\n" +
                "Asal: Jerman\n" +
                "Warna: Putih, Hitam, Coklat Kekuningan, Black & Rust, Blue & Rust, Fawn & Rust, Biru, Merah, Red & Rust\n" +
                "Sifat: Tak kenal takut, Setia, Patuh, Energik, Pandai, Siaga, Percaya Diri\n" +
                "Tinggi: Jantan: 66–72 cm, Betina: 61–68 cm\n" +
                "Berat: Jantan: 40–45 kg, Betina: 32–35 kg");

        imageUrl.add("https://instagram.fsub3-1.fna.fbcdn.net/vp/805328106a7197c9f9fbb2426327b97f/5D366E14/t51.2885-15/sh0.08/e35/p640x640/56197342_409167676332605_4176802439734380649_n.jpg?_nc_ht=instagram.fsub3-1.fna.fbcdn.net&_nc_cat=105 640w,https://instagram.fsub3-1.fna.fbcdn.net/vp/22ce50bf91801d0b03082dc16a6fa367/5D3B6214/t51.2885-15/sh0.08/e35/p750x750/56197342_409167676332605_4176802439734380649_n.jpg?_nc_ht=instagram.fsub3-1.fna.fbcdn.net&_nc_cat=105 750w,https://instagram.fsub3-1.fna.fbcdn.net/vp/497292975406a0ed4c53574223400d45/5D2DA6E2/t51.2885-15/e35/56197342_409167676332605_4176802439734380649_n.jpg?_nc_ht=instagram.fsub3-1.fna.fbcdn.net&_nc_cat=105 1080w");
        names.add("Miniature Pinscher");
        description.add("Type of Small Dog");
        descriptionDetail.add("Lifespan: 15 years\n" +
                "Origin: Germany\n" +
                "Weight: Male: 4–5 kg, Female: 3.5–4 kg\n" +
                "Colors: Stag Red, Chocolate & Rust, Chocolate & Tan, Black & Rust, Black & Tan, Red\n" +
                "Temperament: Clever, Responsive, Outgoing, Energetic, Playful, Friendly\n" +
                "Height: Male: 25–30 cm, Female: 25–28 cm");

        imageUrl.add("https://instagram.fsub3-1.fna.fbcdn.net/vp/91a0f274928f94837351669fcbbf3438/5D4FE296/t51.2885-15/sh0.08/e35/p640x640/55931156_2243526955885778_5312205300427944138_n.jpg?_nc_ht=instagram.fsub3-1.fna.fbcdn.net&_nc_cat=102%20640w,https://instagram.fsub3-1.fna.fbcdn.net/vp/85c8751b617ae6322ec2404348583516/5D2AF252/t51.2885-15/sh0.08/e35/p750x750/55931156_2243526955885778_5312205300427944138_n.jpg?_nc_ht=instagram.fsub3-1.fna.fbcdn.net&_nc_cat=102%20750w,https://instagram.fsub3-1.fna.fbcdn.net/vp/78f52d1eb66c7211fedf3899020352c1/5D29B1FC/t51.2885-15/e35/55931156_2243526955885778_5312205300427944138_n.jpg?_nc_ht=instagram.fsub3-1.fna.fbcdn.net&_nc_cat=102%201080w");
        names.add("Rottweiler");
        description.add("Type of Big Dog");
        descriptionDetail.add("Life expectancy: 8 – 10 years\n" +
                "Origin: Germany\n" +
                "Temperament: Steady, Fearless, Obedient, Good-natured, Devoted, Alert, Confident, Self-assured, Calm, Courageous\n" +
                "Weight: Female: 35–48 kg, Male: 50–60 kg\n" +
                "Height: Female: 56–63 cm, Male: 61–69 cm\n" +
                "Colors: Black, Blue, Tan, Mahogany");

        imageUrl.add("https://instagram.fsub3-1.fna.fbcdn.net/vp/8483f03e3916c66b9b322829cfbed73c/5D40FC0E/t51.2885-15/sh0.08/e35/s640x640/54447387_554427881747923_5941447072511342819_n.jpg?_nc_ht=instagram.fsub3-1.fna.fbcdn.net&_nc_cat=107 640w,https://instagram.fsub3-1.fna.fbcdn.net/vp/9cc659b08a930be11050bc9f3c3f03ac/5D34370E/t51.2885-15/sh0.08/e35/s750x750/54447387_554427881747923_5941447072511342819_n.jpg?_nc_ht=instagram.fsub3-1.fna.fbcdn.net&_nc_cat=107 750w,https://instagram.fsub3-1.fna.fbcdn.net/vp/d8c5dc3d6b54fdbfee39443f55ac9ee2/5D43AEEB/t51.2885-15/e35/54447387_554427881747923_5941447072511342819_n.jpg?_nc_ht=instagram.fsub3-1.fna.fbcdn.net&_nc_cat=107 1080w");
        names.add("Pitbull");
        description.add("Type of Big Dog");
        descriptionDetail.add("Lifespan: 8 – 15 years\n" +
                "Temperament: Stubborn, Affectionate, Loyal, Obedient, Clownish, Intelligent, Strong Willed, Friendly, Courageous\n" +
                "Mass: Male: 16 – 30 kg (Adult), Female: 14 – 27 kg (Adult)\n" +
                "Origin: United States, United Kingdom\n" +
                "Colors: Black, White, Brindle, Fawn, Tan, Blue, Brown, Grey, Red\n" +
                "Height: Male: 45 – 53 cm, Female: 43 – 50 cm");

        imageUrl.add("https://instagram.fsub4-1.fna.fbcdn.net/vp/130986a9385df73d3a5755dfb71ab189/5D337D34/t51.2885-15/sh0.08/e35/s640x640/54446908_972067226332148_2503307505836817588_n.jpg?_nc_ht=instagram.fsub4-1.fna.fbcdn.net&_nc_cat=108 640w,https://instagram.fsub4-1.fna.fbcdn.net/vp/9cef55f38621784e8cf2d7eea4f5b962/5D4B37D1/t51.2885-15/e35/54446908_972067226332148_2503307505836817588_n.jpg?_nc_ht=instagram.fsub4-1.fna.fbcdn.net&_nc_cat=108 750w,https://instagram.fsub4-1.fna.fbcdn.net/vp/9cef55f38621784e8cf2d7eea4f5b962/5D4B37D1/t51.2885-15/e35/54446908_972067226332148_2503307505836817588_n.jpg?_nc_ht=instagram.fsub4-1.fna.fbcdn.net&_nc_cat=108 1080w");
        names.add("American Bully");
        description.add("Type of Big Dog");
        descriptionDetail.add("Lifespan: 8 – 15 years\n" +
                "Temperament: Stubborn, Affectionate, Loyal, Obedient, Clownish, Intelligent, Strong Willed, Friendly, Courageous\n" +
                "Mass: Male: 16 – 30 kg (Adult), Female: 14 – 27 kg (Adult)\n" +
                "Origin: United States, United Kingdom\n" +
                "Colors: Black, White, Brindle, Fawn, Tan, Blue, Brown, Grey, Red\n" +
                "Height: Male: 45 – 53 cm, Female: 43 – 50 cm");

        imageUrl.add("https://instagram.fsub3-1.fna.fbcdn.net/vp/bf75d89106f801b7a3f41d775c0eca36/5D4C13EB/t51.2885-15/sh0.08/e35/s640x640/57321724_130584078011490_8143412191859162616_n.jpg?_nc_ht=instagram.fsub3-1.fna.fbcdn.net&_nc_cat=106 640w,https://instagram.fsub3-1.fna.fbcdn.net/vp/28d6f40de3e8f31a1d627f0131feb6dd/5D2FCBEB/t51.2885-15/sh0.08/e35/s750x750/57321724_130584078011490_8143412191859162616_n.jpg?_nc_ht=instagram.fsub3-1.fna.fbcdn.net&_nc_cat=106 750w,https://instagram.fsub3-1.fna.fbcdn.net/vp/f051e48324a3afe5355a71681dd7a17f/5D32EF0E/t51.2885-15/e35/57321724_130584078011490_8143412191859162616_n.jpg?_nc_ht=instagram.fsub3-1.fna.fbcdn.net&_nc_cat=106 1080w");
        names.add("Labrador Retriever");
        description.add("Type of Big Dog");
        descriptionDetail.add("Masa hidup: 10 sampai 14 tahun\n" +
                "Berat: Jantan: 29–36 kg, Betina: 25–32 kg\n" +
                "Tinggi: Jantan: 57–62 cm, Betina: 55–60 cm\n" +
                "Warna: Hitam, Cokelat, Kuning\n" +
                "Sifat: Baik, Ramah, Tangkas, Pandai, Trusting, Kalem, Lembut\n" +
                "Tahukah Anda: Labrador Retriever is the most popular dog breed by registrations (191,988) ");

        imageUrl.add("https://instagram.fsub4-1.fna.fbcdn.net/vp/d19edab3e5d449c23d6fca2cd231d871/5D46CF9C/t51.2885-15/sh0.08/e35/p640x640/56319309_2213909768670884_2334066133467422440_n.jpg?_nc_ht=instagram.fsub4-1.fna.fbcdn.net&_nc_cat=108 640w,https://instagram.fsub4-1.fna.fbcdn.net/vp/79ebcbe7d5dbe3c757f14544d86fc2b8/5D2BBF58/t51.2885-15/sh0.08/e35/p750x750/56319309_2213909768670884_2334066133467422440_n.jpg?_nc_ht=instagram.fsub4-1.fna.fbcdn.net&_nc_cat=108 750w,https://instagram.fsub4-1.fna.fbcdn.net/vp/eb62fd4b5aa22b6966e8a1e970cf08b0/5D2959F6/t51.2885-15/e35/56319309_2213909768670884_2334066133467422440_n.jpg?_nc_ht=instagram.fsub4-1.fna.fbcdn.net&_nc_cat=108 1080w");
        names.add("Golden Retriever");
        description.add("Type of Big Dog");
        descriptionDetail.add("Masa hidup: 10 sampai 12 tahun\n" +
                "Warna: Emas tua, Krem, Emas muda, Keemasan\n" +
                "Berat: Betina: 25–32 kg, Jantan: 30–34 kg\n" +
                "Sifat: Baik, Pandai, Handal, Terpercaya, Percaya Diri, Bersahabat\n" +
                "Tinggi: Betina: 51–56 cm, Jantan: 56–61 cm\n" +
                "Tahukah Anda: Golden Retriever is the fifth-most popular dog breed by registrations (92,994)");

        imageUrl.add("https://instagram.fsub3-1.fna.fbcdn.net/vp/89fe498ad5dca8fae440e54562eb83d3/5D499A23/t51.2885-15/sh0.08/e35/s640x640/46340527_467740380296617_2979084758070418140_n.jpg?_nc_ht=instagram.fsub3-1.fna.fbcdn.net&_nc_cat=101 640w,https://instagram.fsub3-1.fna.fbcdn.net/vp/bb94e24acacc8dd0fa3ed955d8b17f26/5D44AE23/t51.2885-15/sh0.08/e35/s750x750/46340527_467740380296617_2979084758070418140_n.jpg?_nc_ht=instagram.fsub3-1.fna.fbcdn.net&_nc_cat=101 750w,https://instagram.fsub3-1.fna.fbcdn.net/vp/5aabaccdc8c698b0e1a66e696a9ab160/5D4989C6/t51.2885-15/e35/46340527_467740380296617_2979084758070418140_n.jpg?_nc_ht=instagram.fsub3-1.fna.fbcdn.net&_nc_cat=101 1080w");
        names.add("Dalmatian");
        description.add("Type of Big Dog");
        descriptionDetail.add("Masa hidup: 10 sampai 13 tahun\n" +
                "Asal: Kroasia\n" +
                "Warna: Liver & White, Hitam dan Putih\n" +
                "Sifat: Ramah, Energik, Pandai, Sensitif, Senang bermain, Bersahabat, Aktif\n" +
                "Tinggi: Betina: 56–58 cm, Jantan: 58–61 cm\n" +
                "Berat: Betina: 16–24 kg, Jantan: 15–32 kg");

        imageUrl.add("https://instagram.fsub4-1.fna.fbcdn.net/vp/8a86338694d42e4dde482810e743335e/5D3F9A72/t51.2885-15/sh0.08/e35/s640x640/57234194_130372174743504_1399340712610551047_n.jpg?_nc_ht=instagram.fsub4-1.fna.fbcdn.net&_nc_cat=100 640w,https://instagram.fsub4-1.fna.fbcdn.net/vp/4c5fb4dc4e280a4e057a7f0d6cbbd514/5D353372/t51.2885-15/sh0.08/e35/s750x750/57234194_130372174743504_1399340712610551047_n.jpg?_nc_ht=instagram.fsub4-1.fna.fbcdn.net&_nc_cat=100 750w,https://instagram.fsub4-1.fna.fbcdn.net/vp/00d34e6b4f0da6a800b6afb3b01f3705/5D3A6497/t51.2885-15/e35/57234194_130372174743504_1399340712610551047_n.jpg?_nc_ht=instagram.fsub4-1.fna.fbcdn.net&_nc_cat=100 1080w");
        names.add("German Shepherd");
        description.add("Type of Big Dog");
        descriptionDetail.add("Life expectancy: 9 – 13 years\n" +
                "Temperament: Loyal, Obedient, Curious, Intelligent, Alert, Confident, Watchful, Courageous\n" +
                "Weight: Male: 30–40 kg, Female: 22–32 kg\n" +
                "Colors: Black, Red & Black, Black & Tan, Sable, Black & Silver, Grey\n" +
                "Height: Male: 60–65 cm, Female: 55–60 cm\n" +
                "Did you know: German Shepherd is the second-most popular dog breed by registrations (129,186) ");

        imageUrl.add("https://instagram.fsub4-1.fna.fbcdn.net/vp/5add2ef834681b036233035ee1ab6110/5D406A4E/t51.2885-15/sh0.08/e35/p640x640/56433459_276737726569536_7162199736633051817_n.jpg?_nc_ht=instagram.fsub4-1.fna.fbcdn.net&_nc_cat=100 640w,https://instagram.fsub4-1.fna.fbcdn.net/vp/ae6db6e81c5fdb35424b4e1ea643a66d/5D4AD14E/t51.2885-15/sh0.08/e35/p750x750/56433459_276737726569536_7162199736633051817_n.jpg?_nc_ht=instagram.fsub4-1.fna.fbcdn.net&_nc_cat=100 750w,https://instagram.fsub4-1.fna.fbcdn.net/vp/06a17af59f1376f1190ff840793927f2/5D2F62B8/t51.2885-15/e35/56433459_276737726569536_7162199736633051817_n.jpg?_nc_ht=instagram.fsub4-1.fna.fbcdn.net&_nc_cat=100 1080w");
        names.add("English Mastiff");
        description.add("Type of Big Dog");
        descriptionDetail.add("Life expectancy: 10 – 12 years\n" +
                "Origin: England\n" +
                "Temperament: Affectionate, Dignified, Good-natured, Protective, Calm, Courageous\n" +
                "Weight: Female: 54–77 kg, Male: 73–100 kg\n" +
                "Height: Female: 70–91 cm, Male: 70–91 cm\n" +
                "Colors: Brindle, Fawn, Apricot");

        imageUrl.add("https://instagram.fsub3-1.fna.fbcdn.net/vp/2cd75c22fc8456e31a62bcef64863033/5D34BAED/t51.2885-15/sh0.08/e35/s640x640/25011427_2108558586038932_4235061186644672512_n.jpg?_nc_ht=instagram.fsub3-1.fna.fbcdn.net&_nc_cat=104%20640w,https://instagram.fsub3-1.fna.fbcdn.net/vp/b198894efac107370d4ef4485e061685/5D303D29/t51.2885-15/sh0.08/e35/s750x750/25011427_2108558586038932_4235061186644672512_n.jpg?_nc_ht=instagram.fsub3-1.fna.fbcdn.net&_nc_cat=104%20750w,https://instagram.fsub3-1.fna.fbcdn.net/vp/84c983165f66d15787d2059eab921b4f/5D320857/t51.2885-15/e35/25011427_2108558586038932_4235061186644672512_n.jpg?_nc_ht=instagram.fsub3-1.fna.fbcdn.net&_nc_cat=104%201080w");
        names.add("Scotish Deerhound");
        description.add("Type of Big Dog");
        descriptionDetail.add("Hypoallergenic: No\n" +
                "Life expectancy: 8 – 11 years\n" +
                "Origin: Scotland\n" +
                "Weight: Male: 39–50 kg, Female: 34–43 kg\n" +
                "Temperament: Docile, Dignified, Friendly, Gentle\n" +
                "Colors: Brindle, Fawn, Red Fawn, Blue, Grey, Yellow");

        imageUrl.add("https://instagram.fsub3-1.fna.fbcdn.net/vp/b8ec67904590e3aa887e02eab913c177/5D4A027E/t51.2885-15/sh0.08/e35/s640x640/26070250_862212657281911_9148211685427773440_n.jpg?_nc_ht=instagram.fsub3-1.fna.fbcdn.net&_nc_cat=107 640w,https://instagram.fsub3-1.fna.fbcdn.net/vp/8249bc30b2428f54f09e23ad01e5bde9/5D47697E/t51.2885-15/sh0.08/e35/s750x750/26070250_862212657281911_9148211685427773440_n.jpg?_nc_ht=instagram.fsub3-1.fna.fbcdn.net&_nc_cat=107 750w,https://instagram.fsub3-1.fna.fbcdn.net/vp/616eaa63d715657e7a205cfcd1065aa6/5D37EE9B/t51.2885-15/e35/26070250_862212657281911_9148211685427773440_n.jpg?_nc_ht=instagram.fsub3-1.fna.fbcdn.net&_nc_cat=107 1080w");
        names.add("Newfoundland");
        description.add("Type of Big Dog");
        descriptionDetail.add("Life expectancy: 8 – 10 years\n" +
                "Weight: Male: 60–70 kg, Female: 45–55 kg\n" +
                "Height: Male: 69–74 cm, Female: 63–69 cm\n" +
                "Temperament: Sweet-Tempered, Trainable, Gentle\n" +
                "Colors: Black, Black & White, Brown, Grey\n" +
                "Origin: Canada, England");

        imageUrl.add("https://instagram.fsub4-1.fna.fbcdn.net/vp/290974033f8b5e1d7af24b55155ecb3d/5D33DA51/t51.2885-15/sh0.08/e35/s640x640/56300307_127201951765438_5550418063076835168_n.jpg?_nc_ht=instagram.fsub4-1.fna.fbcdn.net&_nc_cat=110 640w,https://instagram.fsub4-1.fna.fbcdn.net/vp/682af494ce4316ecf1973327ec45d284/5D377B51/t51.2885-15/sh0.08/e35/s750x750/56300307_127201951765438_5550418063076835168_n.jpg?_nc_ht=instagram.fsub4-1.fna.fbcdn.net&_nc_cat=110 750w,https://instagram.fsub4-1.fna.fbcdn.net/vp/56f27061e8754e3ad3745af9bc7ec4a5/5D4F8FB4/t51.2885-15/e35/56300307_127201951765438_5550418063076835168_n.jpg?_nc_ht=instagram.fsub4-1.fna.fbcdn.net&_nc_cat=110 1080w");
        names.add("Pug");
        description.add("Type of Small Dog");
        descriptionDetail.add("Hypoallergenic: No\n" +
                "Life expectancy: 12 – 15 years\n" +
                "Origin: China\n" +
                "Temperament: Charming, Stubborn, Docile, Clever, Sociable, Playful, Quiet, Attentive\n" +
                "Colors: Black, Fawn, Silver Fawn, Apricot\n" +
                "Height: Male: 30 cm (At the withers), Female: 25 cm (At the withers)");

        initRecyclerView();

    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecycleViewAdapter adapter = new RecycleViewAdapter(this, names, imageUrl, description, descriptionDetail);
        recyclerView.setAdapter(adapter);
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, names, imageUrl, description, descriptionDetail);
        recyclerView.setAdapter(adapter);

    }

    private void showRecyclerGrid() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        GridActivity adapter = new GridActivity(this, names, imageUrl, description, descriptionDetail);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_list:
                setActionBarTitle("Mode List");
                showRecyleList();
                break;
            case R.id.action_grid:
                setActionBarTitle("Mode Grid");
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                setActionBarTitle("Mode Card View");
                initRecyclerView();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);

    }
}
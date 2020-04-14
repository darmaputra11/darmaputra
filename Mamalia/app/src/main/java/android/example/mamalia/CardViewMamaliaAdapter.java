package android.example.mamalia;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CardViewMamaliaAdapter extends RecyclerView.Adapter<CardViewMamaliaAdapter.CardViewViewHolder>{
    private Context context;
    LayoutInflater layoutInflater;
    public CardViewMamaliaAdapter(Context context) {
        this.context = context;
        layoutInflater = layoutInflater.from(context);
    }

    @Override
    public CardViewViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = layoutInflater.inflate(R.layout.item_cardview_mamalia, viewGroup, false);
        CardViewViewHolder holder = new CardViewViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(CardViewViewHolder cardViewViewHolder, final int position) {
        cardViewViewHolder.imgPhoto.setImageResource(dataimg[position]);
        cardViewViewHolder.tvName.setText(name[position]);
        cardViewViewHolder.tvRemarks.setText(remarks[position]);
        cardViewViewHolder.imgPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent idetail = new Intent(context, Main2Activity.class);
                idetail.putExtra("tvName", name[position]);
                idetail.putExtra("tvRemarks", remarks[position]);
                idetail.putExtra("imgPhoto", dataimg[position]);
                idetail.putExtra("tvDesc", desc[position]);
                context.startActivity(idetail);

            }
        });
        cardViewViewHolder.btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent idetail = new Intent(context, Main2Activity.class);
                idetail.putExtra("tvName", name[position]);
                idetail.putExtra("tvRemarks", remarks[position]);
                idetail.putExtra("imgPhoto", dataimg[position]);
                idetail.putExtra("tvDesc", desc[position]);
                context.startActivity(idetail);

            }
        });

        cardViewViewHolder.btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Favorite", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvRemarks;
        Button btnDetail, btnFavorite;
        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            btnDetail = itemView.findViewById(R.id.btn_set_detail);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
        }
    }

    String [] name = new String[] {
            "Kangguru", "Platipus", "Kelelawar", "Tikus", "Harimau", "Lumba-lumba", "Rusa", "Singa"
    };
    String [] remarks = new String[]{
            "Mamalia khas benua Australia", "Mamalia yang paruhnya mirip bebek", "Mamalia terbang yang beraktifitas di Malam Hari",
            "Mamalia kecil yang rakus", "Mamalia mirip kucing yang langka", "Mamalia Air yang bernafas dengan paru-paru",
            "Mamalia yang mempunyai tanduk", "Mamalia yang dijuluki raja hutan"
    };
    String [] desc = new String[]{
            "Kangguru adalah hewan yang banyak ditemukan di kawasan Australia. Ciri khas hewan ini adalah melahirkan bayi dalam keadaan prematur kemudian menyimpannya dalam kantung. Hewan kangguru ini termasuk ke dalam ordo marsupilia karena dilengkapi dengan kantung. Induk akan menyimpan  anaknya di kantung kemudian membawa anak tersebut kemana pun dia berada. Kangguru memiliki kaki belakang yang lebih panjang sehingga saat berlari akan melompat. Sistem eksresi pada hewan vertebrata ini telah memiliki slauran yang khusus.Kangguru adalah hewan yang banyak ditemukan di kawasan Australia. Ciri khas hewan ini adalah melahirkan bayi dalam keadaan prematur kemudian menyimpannya dalam kantung. Hewan kangguru ini termasuk ke dalam ordo marsupilia karena dilengkapi dengan kantung. Induk akan menyimpan  anaknya di kantung kemudian membawa anak tersebut kemana pun dia berada. Kangguru memiliki kaki belakang yang lebih panjang sehingga saat berlari akan melompat. Sistem eksresi pada hewan vertebrata ini telah memiliki slauran yang khusus.",
            "Platipus adalah hewan yang banyak ditemui di benua Australia. Platipus memiliki paruh menyerupai bebek. Platipus akan melahirkan anaknya atau vivipar. Bagian kaki pada platipus berselaput seperti bebek sehingga memungkinkan untuk hidup di area berair dan berlumpur.",
            "Kelelawar adalah hewan mamalia terbang yang aktif di malam hari yakni berupa buah – buahan tergantung pada jenis. Kelelawar akan dengan mudah ditemukan di gua – gua. Mereka memiliki kehidupan berkelompok dan memiliki kelenjar mamae yang akan digunakan saat setelah melahirkan anak kelelawar. Struktur dan jaringan tulang pada hewan mamalia terbang ini pada organ gerak terdapat selaput yang berfungsi sebagai sayap.",
            "Tikus banyak ditemukan di daerah pemukiman maupun diternakan untuk kebutuhan laboratorium. Tikus memiliki anatomi yang sangat mirip dengan manusia, hal ini menjadi alasan tikus banyak digunakan untuk hewan percobaan. Tikus seringkali dikenal sebagai hewan rakus yang dapat memakan segala makanan atau omnivora.",
            "Harimau adalah hewan langka. Harimau jawa telah dinyatakan punah. Hewan ini banyak diburu bulunya. Hewan predator sebagai puncak rantai makanan ini memiliki taring dan kuku yang tajam. Mereka seringkali menandai batas kekuasaan dengan kuku. Hewan harimau yang tersisa adalah di kawasan Sumatera. Hewan ini juga memiliki kesulitan dalam reproduksi dan memiliki anak karena daerah jelajah yang luas.",
            "Lumba – lumba termasuk ke dalam jenis mamalia air. Meski hewan ini hidup di dalam air namun memiliki alat pernafasan selayaknya hewan darat yakni dengan menggunakan paru – paru. Hewan lumba – lumba dikenal dengan hewan yang sangat bersahabat dengan manusia. Lumba – lumba dapat mendeteksi gelombang tak kasat mata dimana mengetahui pergerakan. Lumba – lumba juga berkembangbiak dengan cara melahirkan sehingga bukan contoh hewan ovovivipar. Mereka di lengkapi dengan kelenjar mamae.",
            "Rusa adalah hewan yang banyak diburu. Hewan ini memiliki kaki sebagai alat pergerakan sebanyak 4 buah sehingga dapat berlari saat dikejar oleh predator. Rusa juga memiliki kelenjar mamae yang akan berguna saat melahirkan bayinya.",
            "Singa adalah salah satu jenis predator yang termasuk jenis kucing besar. Singa akan hidup dengan cara berkelompok. Singa juga berkembangbiak dengan melahirkan."
    };
    int []dataimg = new int[]{
            R.drawable.kangguru, R.drawable.platipus, R.drawable.kelelawar, R.drawable.tikus,
            R.drawable.harimau, R.drawable.lumbalumba, R.drawable.rusa, R.drawable.singa
    };
}

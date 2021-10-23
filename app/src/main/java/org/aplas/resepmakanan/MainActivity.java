package org.aplas.resepmakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> foto = new ArrayList<>();
    private ArrayList<String> nama = new ArrayList<>();
    private ArrayList<String> info = new ArrayList<>();
    private ArrayList<String> bahan = new ArrayList<>();
    private ArrayList<String> caraMasak = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();
    }
    private void proses(){
        RecyclerView recyclerView = findViewById(R.id.recyleview);
        RecycleViewAdapter adapter = new RecycleViewAdapter(foto, nama, info, bahan, caraMasak, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
    private void getData(){
        nama.add("Soto Bandung");
        foto.add("https://cdn-brilio-net.akamaized.net/news/2020/07/08/187924/1264654-1000xauto-resep-makanan-bandung.jpg");
        info.add("Soto Bandung adalah soto khas Bandung, Jawa Barat. Sepintas, soto yang berbahan dasar daging sapi (biasanya bagian tetelan atau has dalam) ini hampir sama dengan jenis soto yang lain, tetapi yang membuatnya berbeda adalah adanya tambahan lobak, tomat, dan kedelai goreng di dalamnya. Soto tanpa santan ini biasa disantap dengan nasi dan kerupuk.");
        bahan.add("Bahan :\n" +
                "350 gram daging bagian sengkel (potong-potong)\n" +
                "1 buah lobak kecil (potong tipis)\n" +
                "1 batang sereh, geprek\n" +
                "1 lembar daun salam\n" +
                "3 lembar daun jeruk\n" +
                "1 ruas lengkuas, geprek\n" +
                "1 ruas jahe, geprek\n" +
                "garam dan kaldu bubuk secukupnya\n" +
                "air 500 ml dan 1000 ml\n" +
                "minyak goreng\n"+

                "Bumbu halus :\n" +
                "5 siung bawang merah\n" +
                "2 siung bawang putih\n" +
                "1/2 sdt lada butir\n" +

                "Pelengkap :\n" +
                "kacang kedelai (rendam 1 jam, goreng)\n" +
                "emping\n" +
                "sambal rawit\n" +
                "seledri\n" +
                "bawang goreng\n" +
                "jeruk nipis\n" +
                "lobak yang sudah direbus");

        caraMasak.add("1. Rebus daging. Diamkan selama 30 menit.\n" +
                "2. Angkat daging, cuci bersih.\n" +
                "3. Rebus daging lagi dengan campuran serai, jahe, lengkuas, daun salam, dan daun jeruk.\n" +
                "4. Tumis bumbu halus, tuang ke rebusan daging. Beri garam dan kaldu bubuk.\n" +
                "5. Sajikan soto dengan pelengkap.");


        nama.add("Cimol Bandung");
        foto.add("https://cdn-brilio-net.akamaized.net/news/2020/07/08/187924/1264656-1000xauto-resep-makanan-bandung.jpg");
        info.add("Cimol adalah camilan khas Bandung terbuat dari tepung aci, kemudian digoreng. Setelah matang diberi taburan bubuk cabai");
        bahan.add("Bahan :\n" +
                "15 sendok tepung tapioka\n" +
                "3 sdm terigu\n" +
                "100-120 ml air mendidih\n" +
                "4 siung bawang putih halus\n" +
                "penyedap makanan\n" +
                "garam, merica secukupnya\n" +
                "daun bawang\n" +
                "bumbu untuk taburan");
        caraMasak.add("1. Campur 10 sendok tepung tapioka, terigu, dan bumbu lainnya.\n" +
                "2. Tuang air panas, aduk rata. Uleni sambil tambahkan sisa 5 sendok tapioka.\n" +
                "3. Bentuk bulat. Goreng sampai matang.\n" +
                "4. Sajikan cimol dengan taburan bumbu.");

        nama.add("Colenak");
        foto.add("https://sirclocdn.com/buminini/products/_200506141348_colenak_zoom.jpg");
        info.add("Colenak atau dikenal juga dengan tape bakar adalah nama yang diberikan pada kudapan yang dibuat dari peuyeum (tapai singkong) yang dibakar yang disantap dengan dicocolkan pada gula jawa cair yang dicampur dengan serutan kelapa.");
        bahan.add("200 gram Tape\n" +
                "20 gram Mentega\n" +
                "100 gram Kelapa\n" +
                "100 gram Gula Merah\n" +
                "50 gram Gula Pasir\n" +
                "100 ml Santan\n" +
                "1/2 sendok teh Vanili");
        caraMasak.add("1. Iris gula merah, lalu campur dengan gula pasir.\n" +
                "2. Masukkan santan ke dalam campuran gula pasir.\n" +
                "3. Masak sampai tercampur rata, kemudian masukkan kelapa parut.\n" +
                "4. Aduk-aduk terus sampai airnya mengering.\n" +
                "5. Setelah mengering, sisihkan.\n" +
                "6. Panaskan panggangan, kemudian oles dengan mentega.\n" +
                "7. Panggang tape singkong di atas panggangan yang sudah dioles mentega. Panggang terus sampai tape berubah warna.\n" +
                "8. Colenak siap disajikan");

        nama.add("Seblak");
        foto.add("https://akcdn.detik.net.id/visual/2020/03/11/f718bfa7-2b28-4d87-bb55-3eddbfb18f32_169.jpeg?w=480&q=90");
        info.add("adalah salah satu jajanan khas Bandung yang belakangan sedang sangat populer. Seblak khas Bandung berbahan dasar kerupuk mentah yang direndam ke dalam air panas agar lembek.");
        bahan.add("Bahan :\n" +
                "1 buah paha ayam, direbus, disuwir\n" +
                "150 gram kerupuk putih\n" +
                "4 buah sosis, dipotong-potong\n" +
                "2 lembar kol, diiris\n" +
                "5 buah bakso, diiris tipis\n" +
                "50 gram kwetiau\n" +
                "1 butir telur, dikocok lepas\n" +
                "2 batang caisim, dipotong 2 cm\n" +
                "1/4 sendok teh merica bubuk\n" +
                "1 batang daun bawang, diiris\n" +
                "2 sendok teh garam\n" +
                "50 gram taoge\n" +
                "1/4 sendok teh gula pasir\n" +
                "600 ml air\n" +
                "2 sendok makan minyak untuk menumis\n" +

                "Bumbu yang Dihaluskan: :\n" +
                "2 cm kencur\n" +
                "2 siung bawang putih\n" +
                "3 butir bawang merah\n" +
                "4 buah cabai merah keriting");

        caraMasak.add("1. Untuk membuat seblak Bandung anda akan dapat melakukannya dengan terlebih dahulu menyiapkan sebuah wajan diatas kompor. Lalu kemudian panaskan minyak kedalamnya dan tunggu sampai minyak matang dan merata.\n" +
                "2. Setelah itu, anda akan dapat menuangkan bumbu seblak halus kedalamnya dan aduk-aduk sampai merata hingga tercium bau harum yang enak dan mantap. Kepinggirkan bumbu tumisan dengan menggunakan spatula.\n" +
                "3. Lalu masukkan telur kedalamnya dan aduk-aduk sajian ini sampai berbutir dan telur menjadi lebih matang dan kasar. Baru kemudian masukkan suwiran ayam kedalamnya dan aduk kembali dengan merata.\n" +
                "4. Masukkan potongan bakso sapi kedalam tumisan bersama dengan sosis dan aduk-aduk dengan merata semua sajian ini agar tercampur. Lalu kemudian masukan caisim kedalamnya bersama dengan taoge dan aduk dengan merata.\n" +
                "5. Tuangkan makaroni yang sudah direndam bersama dengan kerupuk dan juga kwetiau. Lalu kemudian aduk-aduk semua sajian ini denga merata hingga sempurna. Baru kemudan bubuhi dengan garam dan berikan merica bubuk kedalamnya.\n" +
                "6. Tuangkan air bersama dengan gula pasir dan aduk-aduk merata semua sajian ini. Masak sajian ini hidangan matang dan berkuah. menjelang diangkat silahkan masukkan daun bawang kedalamnya dan aduk dengan merata.");

        nama.add("Tahu jeletot");
        foto.add("https://cdn-brilio-net.akamaized.net/news/2020/07/08/187924/1264660-1000xauto-resep-makanan-bandung.jpg");
        info.add("Tahu jeletot merupakan tahu goreng khas Bandung dengan isi yang sangat pedas dan membakar lidah.");
        bahan.add("Bahan :\n" +
                "1. 12-15 potong tahu goreng\n" +
                "2. 250 gram tauge" +
                "3. 5-6 siung bawang merah\n" +
                "4. 2-3 siung bawang putih\n" +
                "5. 100 gram cabai rawit\n" +
                "6. 11 batang bawang daun\n" +
                "7. garam\n" +
                "8. 1 bungkus terasi\n" +
                "9. garam\n" +
                "10. kaldu bubuk secukupnya\n" +

                "Bahan lapisan tepung :\n" +
                "1. 5 sdm tepung bumbu serbaguna\n" +
                "2. 3 sdm tepung terigu\n" +
                "3. sedikit kunyit bubuk\n" +
                "4. daun bawang secukupnya\n" +
                "5. air secukupnya");
        caraMasak.add("1. Untuk isian: Haluskan cabai, bawang merah dan bawang putih. Tumis. Lalu masukan garam, kaldu bubuk, dan daun bawang. Masukan tauge, aduk rata, lalu matikan api.\n" +
                "2. Lubangi tahu, masukkan bahan isi. Lakukan sampai habis.\n" +
                "3. Untuk bahan pelapis: campur semua bahan, tuang air sedikit demi sedikit sambil diaduk. Masukkan tahu.\n" +
                "4. Goreng tahu sampai matang.");

        nama.add("Nasi tutug oncom");
        foto.add("https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/Makanan_Khas_Sunda.jpg/1200px-Makanan_Khas_Sunda.jpg");
        info.add("Nasi campur oncom khas Sunda ini biasanya disajikan dengan lalapan, sambel, dan lauk seperti tahu/tempe goreng, ikan asin, atau ayam goreng.");
        bahan.add("Bahan Nasi Tutug Oncom :\n" +
                "1. 1 papan oncom\n" +
                "2. 2 porsi nasi\n" +
                "3. Secukupnya garam,gula,merica dan kaldu bubuk\n" +
                "4. Segenggam daun kemangi\n" +

                "Bumbu Halus :\n" +
                "5 siung bawang merah\n" +
                "4 siung bawang putih\n" +
                "3 cm kencur/cikur\n" +
                "2 cm terasi (sangrai dahulu)\n" +
                "10 buah cabe merah kerinting\n" +
                "Secukupnya cabe rawit (sesuai selera)\n" +
                "1/2 sdt garam\n" +

                "Bahan Pelengkap\n" +
                "Ayam Goreng Serundeng\n" +
                "Tahu Goreng\n" +
                "Tempe Goreng\n" +
                "Karedok leunca\n" +
                "Selada Air goreng\n" +
                "Sambal Terasi\n" +
                "Kerupuk Aci\n"+
                "Lalapan");
        caraMasak.add("1. Siapkan semua bahan. Cuci bersih\n" +
                "2. Potong oncom lalu panggang tanpa minyak diatas teflon hingga matang.\n" +
                "3. Setelah matang, hancurkan kasar (bisa diulek kasar / di cincang kasar).\n" +
                "4. Haluskan semua bumbu\n" +
                "5. Tumis bumbu hingga harum lalu masukan oncom, tambahkan garam gula dan kaldu. Aduk aduk, koreksi rasa\n" +
                "6. Sambal oncom uda jadi. Bisa disimpan dikulkas. Saat mau bikin nasi tutug oncom tinggal campur nasi dan kemangi. Saya bikin pisah\n" +
                "7. Tambahkan nasi. Aduk rata nasi, matikan kompor. Terakhir masukkan kemangi. Saya ga masak kemangi nya, karena suka kemangi yg fresh.\n" +
                "8. Cetak nasi diatas piring. Beri pelengkap dipinggirannya. Sajikan hangat.");

        nama.add("Karedok");
        foto.add("https://asset.kompas.com/crops/a2uk_9_e0d2eHl-dDgnaj1ZAB9c=/0x0:698x465/750x500/data/photo/2021/02/17/602d25f98fc20.jpg");
        info.add("Karedok adalah salah satu makanan Khas Sunda, dibuat dengan bahan-bahan sayuran mentah antara lain; mentimun, tauge, kembang kol, kacang panjang, daun kemangi dan terong. Lezat untuk penggemar makanan sehat.");
        bahan.add("Bahan :\n" +
                "1. ¼ buah kol, iris tipis\n" +
                "2. 5 buah kacang panjang, iris tipis" +
                "3. 100g taoge\n" +
                "4. 1 buah mentimun, iris tipis\n" +
                "5. 10 lembar daun kemangi\n" +
                "6. 2 buah terung gelatik, iris tipis\n" +
                "7. 2 buah cabai merah keriting\n" +
                "8. 3 buah cabai rawit hijau\n" +
                "9. 1/2 siung bawang putih\n" +
                "10. 1 ruas jari kencur\n" +
                "11. 1 sdt garam\n" +
                "12. 200 gram kacang tanah goreng, haluskan\n" +
                "13. 2 sdm gula merah\n" +
                "14. 1 sdm ubi rebus\n" +
                "15. 1 sdm air asam jawa\n" +
                "16. pelengkap kerupuk");
        caraMasak.add("1. Siapkan semua sayuran yang sudah dicuci bersih. Sisihkan.\n" +
                "2. Haluskan cabai merah, cabai rawit, bawang putih, kencur, dan garam. Masukkan kacang tanah, gula merah, dan ubi rebus. Ulek hingga rata dan halus. Tambahkan air asam jawa, aduk rata.\n" +
                "3. Masukkan irisan kacang panjang, ulek hingga rata. Masukkan sayuran lain, aduk rata. Sajikan karedok segera dengan kerupuk.\n");

        nama.add("Cireng");
        foto.add("https://cdn-brilio-net.akamaized.net/news/2020/07/08/187924/1264661-resep-makanan-bandung.jpg");
        info.add("Cireng adalah salah satu jajanan asli asal Bandung yang enak dan ramah di kantong. Cireng, makanan yang merupakan salah satu jajanan lain yang berbahan dasar dari tepung kanji. Asal kata cireng yaitu dari kata aci yang digoreng.Cireng biasanya disajikan dengan saus kacang atau saus tomat atau saus sambal.");
        bahan.add("Bahan :\n" +
                "1. 250 gr tepung tapioka\n" +
                "2. 4 siung bawang putih (haluskan)" +
                "3. 1 sdt garam\n" +
                "4. 1 sdt lada\n" +
                "5. 1 sdt kaldu jamur\n" +
                "6. 175 ml air\n" +

                "Bahan saus bumbu rujak :\n" +
                "1. 3 buah cabai rawit\n" +
                "2. 1/2 sdt garam\n" +
                "3. 2 lembar daun jeruk\n" +
                "4. 3 sdt gula jawa\n" +
                "5. 1/2 sdt air jeruk nipis\n" +
                "3 sdt air asam jawa");
        caraMasak.add("1. Rebus air, masukkan bawang putih, 2 sdm tepung tapioka, lada, garam, dan kaldu jamur. Aduk rata dan masak hingga mengental.\n" +
                "2. Tuang ke wadah, masukkan sisa tepung tapioka. Uleni, lalu bentuk pipih. Goreng cireng.\n" +
                "3. Untuk saus: Ulek cabai rawit, garam, daun jeruk, dan gula jawa. Kucuri air jeruk nipis dan air asam jawa.\n" +
                "4. Sajikan cireng dengan saus.");

        nama.add("Batagor Bandung");
        foto.add("https://www.masakapahariini.com/wp-content/uploads/2020/11/batagor-bandung-disajikan.jpg");
        info.add("Batagor merupakan nama makanan dari singkatan bakso, tahu dan goreng. Makanan khas Sunda ini adalah adaptasi dari hidangan Tionghoa-Indonesia.");
        bahan.add("Bahan :\n" +
                "300g daging ikan tenggiri filet, haluskan\n" +
                "60g tepung tapioka\n" +
                "5 siung bawang putih, haluskan\n" +
                "1 sdt Royco Kaldu Jamur\n" +
                "1 sdt gula pasir\n" +
                "2 batang daun bawang, iris halus\n" +
                "150 ml air es\n" +
                "1 butir telur ayam\n" +
                "9 lembar kulit pangsit\n" +
                "6 buah tahu putih\n" +

                "Bumbu kacang :\n" +
                "5 buah cabai rawit merah\n" +
                "2 siung bawang putih, goreng\n" +
                "1/2 sdt Royco Kaldu Jamur\n" +
                "40g gula merah, sisir\n" +
                "150g kacang tanah goreng\n" +
                "4 sdm air\n" +
                "6 sdm minyak\n" +

                "Pelengkap :\n" +
                "mentimun, iris\n" +
                "Jawara Saus Sambal Hot\n" +
                "Bango Kecap Manis\n" +
                "Jeruk limau");
        caraMasak.add("1. Potong tahu 2 bagian membentuk segitiga. Keruk bagian tengahnya menggunakan sendok untuk diisi dengan adonan batagor. Sisihkan.\n" +
                "2. Aduk rata ikan tenggiri bersama tepung tapioka, bawang putih, gula pasir, dan daun bawang. Tuang air es, dan Royco Kaldu Jamur, aduk kembali hingga adonan tercampur rata. Tambahkan telur, uleni hingga rata.\n" +
                "3. Ambil 1 lembar kulit pangsit, letakkan 1 sdm adonan ikan ke bagian tengahnya. Rekatkan membentuk seperti mangkuk. Ulangi proses serupa pada sisa bahan. Sisihkan.\n" +
                "4. Ambil tahu, isi bagian tengahnya dengan adonan ikan. Ulangi proses serupa pada sisa bahan.\n" +
                "5. Panaskan minyak, goreng batagor di atas api sedang hingga matang. Angkat dan tiriskan.\n" +
                "6. Bumbu kacang: Blender semua bahan hingga tercampur rata.\n" +
                "7. Siapkan piring saji yang sudah diisi dengan batagor dan potongan mentimun. Tuang bumbu kacang ke atas batagor. Sajikan dengan Saus Sambal Jawara, Bango Kecap Manis, dan jeruk limau.");

        nama.add("Mie kocok");
        foto.add("https://upload.wikimedia.org/wikipedia/id/thumb/a/a8/Rujak_soto.jpg/800px-Rujak_soto.jpg");
        info.add("Masih di Banyunwangi, ada makanan yang dikenal dengan nama Rujak Soto. Rujak Soto adalah merupakan paduan unik antara rujak sayur dengan soto, bisa soto daging (daging sapi) atau sato babat. Bahkan ada yang memadukan dengan soto ayam atau soto ceker (kaki ayam), ini biasa dilakukan sebagai alternatif ketika ingin menikmati rujak soto tetapi harga daging sedang melambung.");
        bahan.add("1/2 kg ceker ayam\n" +
                "1 kg sayap ayam\n" +
                "2 L air\n" +
                "Secukupnya garam\n" +
                "1 buah jeruk nipis\n" +
                "Bumbu Halus (Kuah Soto) :\n" +
                "12 siung bawang merah\n" +
                "8 siung bawang putih\n" +
                "4 butir kemiri, sangrai\n" +
                "2 ruas kunyit, bakar\n" +
                "5 cm jahe\n" +
                "5 cm lengkuas\n" +
                "1 sdt ketumbar bubuk\n" +
                "1 sdt lada bubuk\n" +
                "1 sdt garam\n" +
                "Bumbu Pelengkap (Kuah Soto) :\n" +
                "1 batang daun bawang, iris\n" +
                "6 lembar daun jeruk\n" +
                "2 batang serai, geprek\n" +
                "Secukupnya gula dan kaldu jamur\n" +
                "Bahan Sayur-sayuran :\n" +
                "1 ikat kangkung, siangi\n" +
                "1 ikat genjer, siangi\n" +
                "1/2 buah kol, iris\n" +
                "100 gr taoge\n" +
                "10 buah kacang panjang, potong\n" +
                "Bumbu Kuah Pecel :\n" +
                "5 sdm kacang tanah, goreng sebentar, haluskan\n" +
                "8 buah cabe rawit merah\n" +
                "1 sdm gula merah\n" +
                "1/2 sdt garam\n" +
                "1 sdm petis\n" +
                "Secukupnya air matang\n" +
                "Bahan Pelengkap :\n" +
                "8 buah lontong, potong-potong\n" +
                "6 buah tahu goreng, potong kecil\n" +
                "6 buah tempe, potong kecil\n" +
                "2 batang seledri, iris\n" +
                "1 batang daun bawang, iris\n" +
                "1 buah timun, iris bagi 4\n" +
                "Secukupnya bawang goreng\n" +
                "Secukupnya kecap manis");
        caraMasak.add("Cuci bersih ayam, beri perasan jeruk nipis dan garam. Diamkan selama 15 menit. Bilas kembali. Siram dengan air panas mendidih, diamkan sebentar, buang air.\n" +
                "Didihkan air dalam panci. Setelah mendidih, masukkan ayam. Rebus dengan api kecil sampai mendidih.\n" +
                "Tumis bumbu halus tanpa minyak, sampai matang (krn sy blendernya pake air). Setelah matang, baru ditambahkan minyak, dan masukkan daun jeruk dan serai. Masak kembali hingga matang (sampai mengeluarkan minyak). Dijamin lebih sedap.\n" +
                "Masukkan daun bawang, tumis sebentar. Masukkan bumbu yg sudah matang ke dalam panci. Masak dengan api kecil sampai ayam lunak. Koreksi rasa dengan garam, gula dan kaldu jamur. Sisihkan.\n" +
                "Didihkan air, beri garam. Rebus sayuran satu persatu sampai layu, sayuran hijau terakhir. Kalau saya, kacang panjang - kol - taoge - kangkung. Khusus genjer gak perlu direbus, cukup direndam aja dg air sisa rebusan sampe layu.\n" +
                "Bumbu Pecel : Ulek cabe rawit, gula merah dan garam. Masukkan kacang tanah, petis dan air secukupnya. Ulek sampai halus dan tercampur rata, tekstur jangan terlalu cair.\n" +
                "Penyajian : Siapkan mangkok. Masukkan potongan lontong, tahu dan tempe. Tambahkan sayur-sayuran sesuai selera. Disusul timun, bawang goreng, seledri dan daun bawang. Beri 4 sdm bumbu pecel dan kecap sesuai selera. Siram dengan kuah soto sampai penuh. Diaduk-aduk dulu sebelum disantap, cobain deh, wuennnaaak banget.");

        nama.add("Pecel Rawon");
        foto.add("https://2.bp.blogspot.com/-CZZ312PCfuk/WCTZ66pPOvI/AAAAAAAAQQE/2RDzXLCsT1E7iqmmNlPI0SxuwQ_hxj1FgCLcB/s1600/pecel%2Brawon.jpg");
        info.add("Satu lagi makanan Khas Jawa Timur yang berasal dari daerah Banyuwangi adalah Pecel Rawon. Sesuai dengan namanya, makanan ini merupakan perpaduan antara nasi pecel dengan rawon yang sudah kita bahas diatas.");
        bahan.add("1/4 daging ayam potong dadu\n" +
                "Masako\n" +
                "Lada bubuk\n" +
                "secukupnya Daun bawang\n" +
                "Santan instan\n" +
                "Sawi hijau\n" +
                "Bamboo rawon\n" +
                "Sambel pecel jadi\n" +
                "secukupnya Garam\n");
        caraMasak.add("Rebus sawi yang telah dipotong. Tiris kan. Encerkan sambel pecel jadi, sisihkan\n" +
                "Tuangkan minyak goreng sedikit, tumis bumbu bamboo rawon tunggu hingga matang. Tambahkan air secukupnya, masukkan potongan daging ayam, santan instan, daun bawang. Tambahkan masako, lada bubuk, dan garam secukupnya. Koreksi rasa.\n" +
                "Siapkan nasi, letakkan sawi rebus dan siram dengan sambel pecel. Kemudian tuangkan rawon ayam di atasnya. Pecel Rawon khas Banyuwangi siap dinikmati.\n" +
                "Pecel Rawon Banyuwangi langkah memasak 3 foto");

        nama.add("Sego Becek");
        foto.add("https://3.bp.blogspot.com/-yOesqlGmHp0/WCTbwKTcQZI/AAAAAAAAQQM/qXuN7QkdGq4odOx7indj5u3OteWGaEe8QCLcB/s320/sego%2Bbecek.jpg");
        info.add("Sego Becek adalah makanan khas dari Nganjuk Jawa Timur. Sego dalam bahasa jawa artinya adalah Nasi. Nasi Becek atau Sego Becek ini adalah hidangan yang mirip dengan gulai, kare kambing khas wilayah Mataraman.");
        bahan.add("200 gr Daging Kambing, potong2\n" +
                "150 gr Daging jeroan kambing, rebus potong2\n" +
                "Bumbu halus Kuah :\n" +
                "5 siung bawang merah\n" +
                "3 siung bawang putih\n" +
                "4 butir Kemiri sangrai\n" +
                "1/2 sdt Ketumbar bubuk\n" +
                "1 sdt Merica bubuk\n" +
                "1/4 sdt Pala bubuk\n" +
                "1/4 sdt Jinten\n" +
                "1/2 batang kayu Manis\n" +
                "1/4 klabet\n" +
                "1/2 sdt kapulaga\n" +
                "3 cm jahe\n" +
                "3 cm Lengkuas\n" +
                "3 butir cengkeh\n" +
                "1 cm kencur\n" +
                "3 cm kunyit\n" +
                "3 Lembar daun jeruk\n" +
                "2 Lembar daun salam\n" +
                "1 sdt garam\n" +
                "1 sdt gula\n" +
                "1 sdt bubuk Kaldu sapi\n" +
                "1 Sdm Kecap manis\n" +
                "1 Sdm air perasan jeruk nipis\n" +
                "1/2 butir kelapa parut");
        caraMasak.add("Siapkan semua bumbu halus. Campurkan kelapa parut dg bumbu halus, aduk rata. Tuang 1,5 liter air ke dalamnya, peras dan sharing air kelapa bumbu. Sisihkan\n" +
                "Nyalakan kompor, masak air Santan bumbu diatasnya, tambahkan gula garam dan Kaldu bubuk. Koreksi rasa. Kemudian Masukkan jeroan rebus ke dlm nya. Aduk2, tambahkan kecap manis. Masak sampai bumbu meresap. Marinasi daging dg kecap, merica dan Ketumbar. Bakar spt sate sampai matang. Campurkan ke dlm kuah matang tambahkan 1 Sdm air perasan jeruk nipis. Sajikan bersama nasi, Seledri, kubis dan sambal kecap.\n");

        nama.add("Tahu Campur Lamongan");
        foto.add("https://3.bp.blogspot.com/-ZUr1bCEogcc/WCTqem9O89I/AAAAAAAAQQo/DdzSsJ-qYvM9v0inm9vFE4_1cP_b6zXMQCLcB/s320/tahu%2Bcampur%2Blamongan.jpg");
        info.add("Kembali ke Lamongan, ada tahu campur lamongan yang merupakan makanan khas dari daerah Lamongan Jawa Timur. ");
        bahan.add("500 gr kikil sapi\n" +
                "1 buah selada\n" +
                "1/4 toge\n" +
                "5 potong tahu\n" +
                "1 bks mie telur (bisa ditambah)\n" +
                "Petis udang (1/2sdm tiap piring) Bisa juga di skip\n" +
                "Bumbu Kuah (1)\n" +
                "5 bawang merah\n" +
                "8 bawang putih\n" +
                "1 sdt kunyit bubuk\n" +
                "2 ruas jahe\n" +
                "2 ruas kencur\n" +
                "1/2 sdt merica bubuk\n" +
                "1/2 sdt ketumbar bubuk\n" +
                "Bumbu kuah (2)\n" +
                "2 daun salam\n" +
                "2 batang sereh\n" +
                "3-4 daun jeruk\n" +
                "1 sdm gula merah\n" +
                "1/2 sdt penyedap rasa\n" +
                "Secukupnya gula & garam");
        caraMasak.add("Haluskan semua bumbu kuah (1).\n" +
                "Kemudian tumis bersama bumbu kuah (2). Tambahkan air (1ltr). Kemudian koreksi rasa hingga pas.\n" +
                "Masak sampai kuah mendidih.\n" +
                "Potong2 kikil sapi & rebus sampai empuk. Setelah empuk bisa juga di rebus bersama kuahnya.\n" +
                "Rebus mie hingga matang, lalu tiriskan.\n" +
                "Goreng tahu setengah matang.\n" +
                "Siapkan piring bubuhi petis udang sesuai selera kemudian campur merata dengan kuah. Tambahkan mie, potongan tahu, toge, selada & kikil sapi.\n" +
                "Kalau mau pedas bisa ditambah sambel cabai rebus.");

        nama.add("Gethuk Pisang");
        foto.add("https://2.bp.blogspot.com/-Tl-g4gcureo/WCTtAKA_HaI/AAAAAAAAQQs/UotR1FPwAHwy7AyI-oniyekkvAZkk1RSwCLcB/s320/gethuk-pisang.jpg");
        info.add("Gethuk pada umumnya dibuat dari Singkong, tapi makanan dan camilan khas Kediri Jawa Timur ini dibuat dari pisang.");
        bahan.add("10 bh pisang \n" +
                "3 sdm gulpas\n" +
                "2-3 sdm Tepung Beras\n" +
                "2-3 sdm Tepung tapioka\n" +
                "1-2 sdm gula merah, tambahan sy, optional\n" +
                "Topping\n" +
                "100 gr kelapa parut\n" +
                "1 sdt garam");
        caraMasak.add("Kukus pisang sekitar 15 menit, sampai matang\n" +
                "Kelapanya jg ikutan dikukus ya diatas pisang Angkat, hilangkan uapnya, kemudian kupas & ulek halus pisang dgn ditambah gula pasir selagi hangat\n" +
                "Kemudian setelah halus masukkan tepung2an, aduk rata Jika suka boleh tambahkan gula merah, aduk rata * Kukus 30 - 45 menit, hingga matang (tes tusuk)\n" +
                "Jika sdh matang, angkat di dinginkan, setelah itu potong2 sesuai selera Terakhir beri topping, kelapa kukus+garam sebelum disajikan.");

        proses();
    }
}
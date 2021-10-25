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
        getSupportActionBar().hide();


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
        info.add("Mi kocok adalah hidangan mi bercitarasa kaldu sapi khas kota Bandung, Jawa Barat. Hidangan ini terdiri atas mi kuning yang disajikan dalam kuah kaldu sapi kental, irisan kikil, taoge, bakso, jeruk nipis, dan ditaburi irisan seledri, daun bawang, dan bawang goreng.");
        bahan.add("Bahan : \n" +
                "500 gram mie basah\n" +
                "1 ons tauge mentah\n" +
                "Seledri secukupnya\n" +
                "1 buah kaki sapi (kira kira 1 kg)\n" +
                "1,5 liter air\n" +

                "Bumbu : \n" +
                "4 lembar daun salam\n" +
                "3 batang serai\n" +
                "2 ruas jahe\n" +

                "Bumbu halus :\n" +
                "5 siung bawang putih \n" +
                "5 sing bawang merah\n" +
                "penyedap secukupnya");

        caraMasak.add("1. Pertama, siapkan kaki sapi. Masak dalam panci presto selama satu jam, tidak perlu diberi bumbu. Jika sudah matang, angkat dan tiriskan. \n" +
                "2. Siapkan panci, didihkan air 1,5 liter. Kemudian masukkan daun salam, serai yang sudah digeprek, dan potongan jahe yang sudah digeprek ke dalam air.\n" +
                "3. Masukkan kaki sapi yang sudah dipresto tadi, kemudian rebus sampai matang dan empuk. \n" +
                "4. Sambil menunggu kaki sapi matang, siapkan bumbu halus. Iris tipis bawang merah dan bawang putih. Goreng hingga harum, matikan api dan tiriskan.");

        nama.add("Gehu");
        foto.add("https://awsimages.detik.net.id/community/media/visual/2016/11/03/e502582c-3fdd-47d4-8589-d0afdad768ac.jpg?w=700&q=90");
        info.add("Masyarakat Bandung paling bangga dengan resep Gehu Pedas khasnya. Soalnya, tahu isi dengan rasa pedas jeletot ini sudah diakui kelezatannya oleh setiap orang.");
        bahan.add("Bahan :\n" +
                "10 buah tahu pong/4 buah tahu besar\n" +

                "Bahan Isi :\n" +
                "100 gr kol iris\n" +
                "100 gr toge buang ekornya\n" +
                "1 buah wortel parut/potong korek api\n" +
                "3 butir bawang merah cincang\n" +
                "2 butir bawang putih cincang\n" +
                "25 buah cabe rawit iris\n" +
                "1/4 sdt merica bubuk\n" +
                "1/2 sdt kaldu bubuk\n" +
                "1 batang daun bawang iris\n" +
                "1 sdm minyak untuk menumis\n" +

                "Bahan pencelup :\n" +
                "250 gr terigu\n" +
                "50 gr sagu\n" +
                "2 batang daun bawang iris\n" +
                "375 ml air\n" +
                "Kurleb 1 sdt garam");
        caraMasak.add("1. Potong 2 tahu lalu rendam dengan air yang sudah di beri garam secukupnya rendam sampai garam meresap ke tahu.Buang airnya lalu goreng\n" +
                "2. Bahan isi:tumis bawang merah,bawang putih & cabe rawit hingga harum.\n" +
                "3. Masukan sayuran aduk- aduk.Tidak perlu menambah air karena sayurannya sudah mengandung air.\n" +
                "4. Tambahkan merica,kaldu bubuk & daun bawang tumis hingga matang.angkat & sisihkan\n" +
                "5. Belah tahu lalu masukan bahan adonan isi lakukan sampai habis\n" +
                "6. Dalam wadah campur semua bahan pencelup aduk hingga rata\n" +
                "7. Panaskan minyak yg banyak lalu celupkan tahu yg sudah di isi sayuran lalu celupksn ke bahan pencelup lalu goreng hingga matang.angkat & tiriskan.\n" +
                "8. Sajian siap untuk di nikmati");

        nama.add("Peuyeum");
        foto.add("https://cdn-2.tstatic.net/travel/foto/bank/images/peuyeum-camilan-khas-bandung-yang-terbuat-dari-singkong.jpg");
        info.add("Peuyeum Bandung merupakan makanan khas Sunda, terbuat dari singkong yang telah melalui proses fermentasi.");
        bahan.add("Bahan :\n" +
                "1 kg singkong\n" +
                "5 butir ragi tape\n" +
                "Daun pisang");
        caraMasak.add("1. Siapkan alat dan bahan yang diperlukan untuk membuat peuyem bandung.\n" +
                "2. Kupas singkong dari kulitnya dan cuci bersih\n" +
                "3. Rebus singkong terlebih dahulu selama 10 sampai 15 menit\n" +
                "4. Angkat dan tiriskan. Tunggu sampai singkong menjadi dingin dan airnya turun.\n" +
                "5. Haluskan ragi tape. Moms bisa menggunakan sendok untuk menghancurkan dan mengaluskannya.\n" +
                "6. Siapkan panci, baskom, atau wadah yang cukup besar untuk menampung seluruh singkong. Lapisi dengan daun pisang.\n" +
                "7. Ambil satu singkong yang sudah dingin dan lumuri seluruh permukaannya dengan ragi tape. Jika singkongnya berlubang di tengah, bisa dimasukkan juga ragi ke dalamnya.\n" +
                "8. Simpan singkong yang sudah dilumuri ragi ke dalam wadah. Kemudian lakukan hal yang sama ke singkong lainnya.\n" +
                "9. Jika semua singkong sudah dilumuri ragi, taburkan ragi yang tersisa ke atas singkong-singkong tersebut.\n" +
                "10. Tutup singkong dengan daun pisang dan tutup wadah dengan rapat. Jika menggunakan panci bisa menggunakan tutupnya.\n" +
                "11. Diamkan singkong tersebut selama 2 hari agar terfermentasi.\n" +
                "12. Setelah 2 hari, singkong sudah terfermentasi menjadi peuyeum khas Bandung.\n" +
                "13. Peuyeum Bandung siap untuk disajikan dan dinikmati bersama");

        nama.add("Pisang Bollen Bandung");
        foto.add("https://cdn.idntimes.com/content-images/post/20191030/54247261-2145874318864856-3557674617174342807-n-166d5dd037df92b99dc6f19137714dba.jpg");
        info.add("Pisang bollen khas Bandung terbuat dari pisang, tepung, telur, dan mentega. Makin mantap dinikmati dengan secangkir teh hangat.");
        bahan.add("Bahan A:\n" +
                "1. Siapkan tepung terigu serbaguna/protein sedang (segitiga biru) - 100 gr.\n" +
                "2. Siapkan margarin - 75 gr.\n" +

                "Bahan B:\n" +
                "1. Siapkan tepung terigu protein tinggi (cakra kembar) - 100 gr.\n" +
                "2. Siapkan gula pasir - 50 gr.\n" +
                "3. Siapkan margarin - 75 gr.\n" +
                "4. Siapkan air - 50 ml.\n" +

                "Bahan Isi :\n" +
                "1. Siapkan pisang cavendish sedang (bisa pisang apa aja) - 2 buah.\n" +
                "2. Siapkan Keju Parut.\n"+
                "3. Siapkan Ceres.\n" +

                "Toping :\n" +
                "1. Siapkan kuning telur - 1 buah.\n" +
                "2. Siapkan Keju parut.");
        caraMasak.add("1. Campurkan bahan A uleni sampai tidak ada tepung terigu yang menempel, lalu simpan di ke kulkas selama 15-20 menit. Lakukan hal yang sama pada bahan B.\n" +
                "2. Setelah 20 menit bagi adonan sebanyak 12 buah (paling bagus di timbang sama rata) lakukan pada bahan A dan B.\n" +
                "3. Lalu giling bahan B dengan rolling pin, kemudian masukan bahan A, lipat seperti amplop, giling lalu lipat kembali, ulangi sampai 3x, semakin banyak lipatan semakin bagus, adonan akan jadi semakin \"flakky\". Adonan juga bisa disimpan di kulkas, lalu bisa dilipat lagi dan digunakan jika perlu.\n" +
                "4. Untuk isian goreng pisang sebentar, lalu potong menjadi 12 bagian. Giling kulit lalu isi dengan pisang, keju dan ceres jangan lupa untuk menutup pinggiran adonan dengan menekan bagian samping.\n" +
                "5. Siapkan loyang, jangan lupa taburi dengan margarin dan tepung olesi adonan dengan kuning telur lalu tambahkan keju/ceres diatasnya.\n" +
                "6. Panggang selama 35 menit dengan suhu 200°C.");

        nama.add("Surabi Bandung");
        foto.add("https://cdn.idntimes.com/content-images/post/20191030/71508207-200305200961828-4254607348075778087-n-b262d5491053356656462c761fbce9e7.jpg");
        info.add("Camilan hits Bandung adalah surabi. Dibuat dari tepung beras, makanan ini disajikan dengan beragam rasa dan topping lezat.");
        bahan.add("Bahan :\n" +
                "1. 400 gram tepung beras.\n" +
                "2. 125 gram kelapa parut setengah tua\n" +
                "3. 1 sdm gula\n" +
                "4. ½ sdt garam\n" +
                "5. ½ sdt ragi\n" +
                "6. 500 ml santan cair\n" +


                "Toping :\n" +
                "1. Coklat batang parut\n" +
                "2. Siapkan Keju parut.");
        caraMasak.add("1. Campurkan tepung beras, kelapa parut, gula, garam, dan ragi ke dalam satu wadah.\n" +
                "2. Tuang air ke dalam bahan-bahan yang sudah dicampur.\n" +
                "3. Aduk hingga semua bahan tercampur rata.\n" +
                "4. Diamkan selama 30 menit.\n" +
                "5. Panaskan tungku. Jika tidak punya tungku tanah liat, bisa pakai wajan yang cekung.\n" +
                "6. Masak adonan ke dalam tungku. Tutup tungku dan diamkan hingga matang.\n" +
                "7. Jika sudah matang, pindahkan ke piring.\n" +
                "8. Ulangi prosesnya hingga semua adonan selesai dimasak\n." +
                "9. Saat serabi masih panas, taburi topping coklat atau keju.\n" +
                "10. Serabi Bandung siap dihidangkan.");

        proses();
    }
}
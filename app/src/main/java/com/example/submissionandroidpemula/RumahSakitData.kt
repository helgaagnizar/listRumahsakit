package com.example.submissionandroidpemula

import java.util.ArrayList

object RumahSakitData {
    private val rsNames = arrayOf(
        "RSUD Arifin Achmad",
        "RS Awal Bros",
        "RS Eka Hospital",
        "RS Syafira",
        "RS Santa Maria",
        "RS Aulia",
        "RS Bersalin Annisa",
        "RS Islam Ibnu Sina",
        "RS Ibu dan Anak Eria Bunda",
        "RSIA Sansani"
    )

    private val rsAlamats = arrayOf(
        "Jl. Diponegoro No. 2, Pekanbaru",
        "Jl. Sudirman No. 117, Pekanbaru",
        "Jl. Soekarno-Hatta Km. 6,5, Pekanbaru",
        "Jl. Jenderal SUdirman No. 134, Pekanbaru",
        "Jl. A. Yani 68, Pekanbaru",
        "Jl. HR. Soebrantas No.63, Panam, Pekanbaru",
        "Jl. Garuda Ujung No. 66, Pekanbaru",
        "Jl. Melati No. 60, Pekanbaru",
        "Jl. KH. Ahmad Dahlan No. 163, Pekanbaru",
        "Jl. Soekarno Hatta Atas Pekanbaru"
    )

    private val rsKodeposs = arrayOf(
        "28285",
        "28282",
        "28282",
        "28282",
        "28127",
        "28291",
        "-",
        "28122",
        "28128",
        "-"
    )

    private val rsTelps = arrayOf(
        "0761-21618",
        "0761-47333",
        "0761-6989999",
        "0761-856517",
        "0761-22213",
        "0761-670001",
        "0761-848652",
        "0761-24242",
        "0761-23100",
        "0761 564666"
    )

    private val rsFaxs = arrayOf(
        "0761-20253",
        "0761-47222",
        "0761-6989944",
        "0761-41887",
        "0761-26071",
        "-",
        "-",
        "0761-35698",
        "0761-857013",
        "0761-562061"
    )

    private val rsEmails = arrayOf(
        "hikrsudaa@yahoo.co.id",
        "mkt.pku@awalbros.com",
        "infopku@ekahospital.com",
        "-",
        "rsssmpku@gmail.com",
        "-",
        "-",
        "rsiis@rsi-ibnusina.com",
        "layanan@rsia-eriabunda.com",
        "-"
    )
    private val rsTentangs = arrayOf(
            "RSUD Arifin Achmad Provinsi Riau di Pekanbaru adalah Rumah Sakit Tipe B Pendidikan, merupakan institusi pemerintah Provinsi Riau yang mempunyai tugas dan fungsi mencakup upaya pelayanan kesehatan perorangan, pusat rujukan dan pembina Rumah Sakit Kabupaten/Kota se-Provinsi Riau serta merupakan tempat pendidikan mahasiswa Fakultas Kedokteran Universitas Riau dan Institusi Pendidikan Kesehatan lainnya.\n" +
                    "\nRumah Sakit Arifin Achmad diresmikan pada tahun 1976 dengan nama Rumah Sakit Umum Provinsi (RSUP) Pekanbaru. Pada tahun 1993, statusnya meningkat dari RS Kelas C menjadi RS Kelas B Non Pendidikan dan berganti nama menjadi Rumah Sakit Umum Daerah (RSUD) Pekanbaru. Pada tahun 1999, RS ditingkatkan kelasnya menjadi RS Kelas B Pendidikan, dan pada tanggal 09 Agustus 2005, RSUD Pekanbaru berganti nama menjadi RSUD Arifin Achmad dengan kapasitas 370 tempat tidur.",
            "Rumah Sakit Awal Bros Pekanbaru berdiri sejak 29 Agustus 1998 dan hingga saat ini sudah  melayani banyak pasien, baik dari Pekanbaru maupun dari daerah sekitarnya. Saat ini Rumah Sakit yang terletak di pusat kota Pekanbaru (hanya berjarak 10 menit dari Bandara Sultan Syarif Kasim II). Bersama dengan 3 Rumah Sakit Awal Bros Grup lainnya, Rumah Sakit Awal Bros Pekanbaru telah terakreditasi nasional dari Komisi Akreditasi Rumah Sakit (KARS) dan sejak tahun 2014 telah memperoleh akreditasi Internasional dari Joint Commission Internasional (JCI). Rumah Sakit Awal Bros Pekanbaru mengutamakan layanan berkualitas, keselamatan pasien, dan siap melayani pasien dengan kapasitas 251 tempat tidur tersedia.\n" +
                    "\nDedikasi Rumah Sakit Awal Bros Pekanbaru dalam meningkatkan kesehatan pasien tercermin pada penawaran program pelayanan kesehatan yang komprehensif. Sebagai rumah sakit yang mengedepankan  keselamatan pasien dan kualitas rumah sakit, kami memfokuskan pelayanan kami terutama pada Pusat Onkologi (Oncology Center), Pusat Jantung dan Pembuluh Darah (Cardiology Center), Stroke Center, serta Geriatri Terpadu.",
            "Mulai beroperasi pada 2008, Eka Hospital adalah sebuah jaringan rumah sakit yang mengedepankan mutu dan keselamatan dalam menyediakan layanan kesehatan berkualitas terdepan. Pengaplikasian teknologi dan metode terkini di bidang kedokteran yang didukung oleh tim dokter, tenaga medis, serta staf profesional yang berdedikasi tinggi, menjadikan Eka Hospital sebagai rumah sakit rujukan terpercaya bagi keluarga maupun perusahaan dan institusi pemerintah di Indonesia.\n" +
                    "\nHadir di dua lokasi strategis, Bumi Serpong Damai-Tangerang dan Pekanbaru-Sumatera, Eka Hospital semakin matang menghadirkan inovasi terbaru di bidang kesehatan. Dengan kapasitas 500 tempat tidur, Eka Hospital memiliki lebih dari 180 dokter yang bekerja  purna waktu (full time) dan lebih dari 60 konsultan yang mengkhususkan diri dalam bidang medis dan bedah.\n" +
                    "\nDalam waktu relatif singkat, yaitu di tahun-tahun pertama beroperasi, Eka Hospital telah terakreditasi secara nasional dilakukan oleh Tim Surveyor dari Komisi Akreditasi Rumah Sakit (KARS), Eka Hospital juga telah memenuhi Akreditasi Internasional yang diterbitkan  oleh  JCI (Joint Commission International). Semua akreditasi ini merupakan bukti nyata dari komitmen kami untuk selalu berusaha mengedepankan pelayanan bermutu sesuai dengan Visi dan Misi Eka Hospital.",
            "Rumah Sakit Syafira Pekanbaru sebelumnya merupakan suatu  Praktek mandiri dr. Khairul Nasir, SpOG yang bergabung dengan Apotek Bertuah pada tahun 2002, kemudian pada tahun 2006 dr. Khairul Nasir, SpOG mendirikan Klinik Syafira yang hanya berdiri 1 ruko dengan hanya memiliki beberapa karyawan/i, mutu pelayanan yang sangat kurang, fasilitas kesehatan yang belum memadai,yang hanya mampu mengandalkan keahlian serta keramahtamahan beliau sendiri kepada pasien-pasien beliau, bidan-bidan rekanan, klinik-klinik rekanan yang mampu melayani dan bekerja sama dengan baik, hingga menghasilkan ratusan pasien," +
                    "kemudian berkembang cukup pesat pada tahun 2009 dr. Khairul Nasir, SpOG yang didukung serta didampingi oleh Lucky Kartika Sari, SE ( Istri dari dr. Khairul Nasir, SpOG ) yang sama-sama memiliki semangat tanpa putus asa, daya juang tinggi, gigih, pekerja keras dan keramahtamahan sifat sosial mereka sehingga berhasil mendirikan Klinik yang berubah menjadi Rumah Sakit Bedah dan Kebidanan yang berdiri teguh kokoh menjadi 5 lantai, dengan memiliki kapasitas 114 tempat tidur untuk kamar rawat inap, UGD 24 Jam,  fasilitas penunjang medis, maupun non medis, perbaikan mutu dan pelayanan, perbaikan perlengkapan alat-alat medis, memiliki karyawan/i lebih dari 200, mampu untuk memperjuangkan hingga terakreditasi PARIPURNA KARS dengan tim medis yang profesional, bersertifikasi dan ahli di bidangnya, kemudian berkembang dengan sangat pesat, hingga di tahun 2017 membangun Rumah Sakit Syafira menjadi 11 lantai dengan kapasitas  yang sangat lengkap dan memadai, memiliki kapasitas 184 kamar rawat inap dari yang super megah hingga standart yang mampu memberikan kenyamanan serta kepuasan terhadap pasien, memiliki karyawan/i lebih dari 600 orang, mutu pelayanan yang sangat baik, fasilitas penunjang medis yang lengkap serta ruangan yang nyaman, keramahtamahan sigap dan tanggap para staf/petugas, dan mampu bersaing secara sehat dengan rumah sakit swasta disekitarnya.",
            "Rumah Sakit Santa Maria Pekanbaru menerapkan administrasi dan pelatihan kesehatan berstandar internasional guna meningkatkan pelayanan kesehatan beserta keseluruhan strukturnya.\n" +
                    "\nDengan para dokter dan profesional kesehatan terbaik yang berkompeten dalam bidangnya masing-masing, Rumah Sakit Santa Maria Pekanbaru telah mempunyai nama dan reputasi yang baik dan telah terpercaya dalam memberikan pelayanan kesehatan yang berkualitas tinggi.\n" +
                    "\nRumah Sakit Santa Maria Pekanbaru bertujuan untuk memberikan pelayanan kesehatan berkualitas dengan harga terjangkau bagi setiap masyarakat Indonesia .",
            "Merupakan hospital (rumah sakit) yang berada di Kota Pekanbaru. Rumah sakit ini melayani pasien baik dari Kota Pekanbaru maupun dari luar daerah karena merupakan jenis rumah sakit umum. Aulia Hospital menerima pasien-pasien untuk disembuhkan dengan dukungan dokter ahli dan perawat berkualitas.\n" +
                    "\nPelayanan juga berkualitas dengan alat-alat medis yang modern dan lengkap. Terdapat kamar rumah sakit bagi pasien rawat inap. Jam jenguk pasien Aulia Hospital juga diatur dengan baik agar pasien baik anak dan dewasa dapat istrahat maksimal.\n" +
                    "\nSegera kunjungi rumah sakit terdekat ini (hospital near you) untuk informasi harga, ketersedian kamar inap, penggunaan BPJS, uni-unit, dan lainnya. Anda juga dapat menghubungi kontak telepon atau call center untuk respon cepat. Kunjungi juga hospital website untuk informasi umum lainnya.",
            "Rumah Sakit Annisa merupakan Rumah Sakit Khusus Ibu dan Anak yang terletak di Jalan Garuda No. 66 Tangkerang Tengah, Pekanbaru. Memiliki layanan unggulan dalam bidang kebidanan dan kandungan yaitu Hypnobirthing, sehingga para calon ibu bisa melahirkan dengan normal, tenang, dan tanpa rasa sakit. Hadir dengan Motto ”Mendampingi Sedekat Sahabat”, rumah sakit ini memiliki beberapa ruang perawatan diantaranya, Super VIP, VIP, Kelas 1A, Kelas 1B, Kelas 2, dan Kelas 3.",
            "Sebuah cita – cita untuk mendirikan Yayasan Rumah Sakit Islam (YARSI) Riau dimulai sejak tahun 1968. Rumah Sakit Islam Ibnu sina merupakan suatu bangunan monumental kebanggan umat islam baik di Indonesia apalagi di Bumi Lancang Kuning ini. YARSI Riau didirikan pada tanggal 7 Januari 1980 dengan Akta pendirian No. 19/1980 dihadapan Notaris Syawal Sutan Diatas.\n" +
                    "\nSejarah dimulainya kegiatan pembangunan YARSI Riau diawali dengan lembaran panjang sejarah sebuah gagasan. Pada mulanya beberapa gagasan untuk pendirian sebuah rumah sakit yang bernuansa Islami muncul dari keadaan kebutuhan umat Islam akan pelayanan kesehatan.\n" +
                    "\nYARSI Riau yang telah berganti badan hukum menjadi PT. Syifa Utama berdasarkan Akta Notaris No. 02/2005 tanggal 02 April 2005 Notaris Zulfakhri, SH, MH dengan salah satu unit bisnisnya mengelola sebuah rumah sakit dengan nama Rumah Sakit Islam (RSI) Ibnu Sina Pekanbaru yang mengalami kemajuan dan berkembang dengan pesat. Diawali dengan sebuah klinik pengobatan yang mengontrak sebuah bangunan dengan seorang dokter hingga kini telah berkembang menjadi sebuah rumah sakit swasta yang mendapat tempat dihati masyarakat dengan ciri memberikan pelayanan secara islam lengkap dengan dokter – dokter spesialis dan penunjang medis yang dibutuhkan.",
            "Rumah Sakit Ibu dan Anak Eria Bunda Pekanbaru berdasarkan Kepmenkes RI No. HK.03.05/I/1715/11 menjadi RS Khusus Kelas C, pada 07 Juli 2011 serta telah Terakreditas Perdana SNARS Edisi 1 oleh KARS pada Tahun 2018, dmn saat ini memiliki kapasitas 88 tempat tidur untuk rawat inap kebidanan & kandungan, anak serta NICU/PICU/HCU.\n" +
                    "\nCakupan layanan kesehatan yang diberikan oleh RSIA Eria Bunda Pekanbaru meliputi instalasi gawat darurat, poliklinik rawat jalan, instalasi farmasi, rawat inap, HCU, ICU, NICU, PICU, instalasi gizi, laboratorium dan penunjang medis lainnya.",
            "RS Sansani merupakan rumah sakit yang berada di Tampan, Kota Pekanbaru. Rumah Sakit Sansani merupakan Rumah Sakit Umum Swasta Kelas C dalam memberikan pelayanan kesehatan. Rumah Sakit Sansani didirikan atas dasar kepedulian terhadap nilai kesehatan, untuk itu salah satu tokoh medis di kota pekanbaru yang juga berprofesi seorang dokter mendirikan sebuah Rumah Sakit yang diberi nama RSIA Sansani, beliau adalah dr. Hj. Dian Astuti.\n" +
                    "\nBermula dari balai pengobatan kemudian berkembang menjadi klinik dan guna memberikan pelayanan kesehatan yang lebih baik, cepat dan akurat dalam suatu sistem management terpadu dan pada akhirnya bertransformasi menjadi Rumah Sakit Umum tipe-C yang diresmikan pada 30 April 2015 lalu yang dinaungi oleh Perseroan Terbatas PT Sansani Barokah Sentosa dengan Surat Keputusan Menteri Hukum dan HAM RI, No. C-357.HT.03.01.Th 2007 pada tanggal 09 Oktober 2007 tentang pengesahan Akte Pendirian PT. Sansani Barokah Sentosa.\n" +
                    "\nTerletak di pinggir Jl. Soekarno Hatta (Arengka Atas), dengan lokasi pada jalur lintas kota Pekanbaru menjadikan Rumah Sakit Sansani salah satu pelayanan kesehatan yang mudah di akses oleh masyarakat sekitar Unit kesehatan yang dimiliki oleh RS Sansani Pekanbaru adalah Unit rawat jalan meliputi : (Spesialis Bedah Umum, Spesialis Paru, Spesialis Anak, Spesialis Penyakit Dalam, Spesialis THT, Spesialis Penyakit Saraf, Spesialis Urologi, Spesialis Mata, Gigi dan Mulut), Unit Rawat Inap, Unit Gawat Darurat, Unit Rawat Intensif (HCU/ICU), Unit kamar Operasi, Unit Hemodialisa, it Laboratorium, Unit Gizi, Unit Rekam Medis, Unit Farmasi, Unit Radiologi. RS Sansani juga melayani pemeriksaan diagnostik seperti: Ekokardiografi, USG 2, 3 dan 4 Dimensi, Laboratorium Klinik, Radiologi, Slit lamp dan juga melayani pasien BPJS Kesehatan, BPJS Ketenagakerjaan, Jamkesda, Asuransi Lain, dan Umum."
    )

    private val rsPhotos = intArrayOf(
        R.drawable.arifin_achmad,
        R.drawable.awal_bros,
        R.drawable.eka_hospital,
        R.drawable.syafira,
        R.drawable.santa_maria,
        R.drawable.aulia,
        R.drawable.annisa,
        R.drawable.ibnu_sina,
        R.drawable.eriabunda,
        R.drawable.sansani
    )

    val listData: ArrayList<RumahSakit>
    get() {
        val list = arrayListOf<RumahSakit>()
        for (position in rsNames.indices){
            val rs = RumahSakit()
            rs.nama = rsNames[position]
            rs.alamat = rsAlamats[position]
            rs.kodepos = rsKodeposs[position]
            rs.telepon = rsTelps[position]
            rs.fax = rsFaxs[position]
            rs.email = rsEmails[position]
            rs.photo = rsPhotos[position]
            rs.tentang = rsTentangs[position]
            list.add(rs)
        }
        return list
    }
}
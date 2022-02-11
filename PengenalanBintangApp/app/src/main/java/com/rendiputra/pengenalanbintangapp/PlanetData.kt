package com.rendiputra.pengenalanbintangapp

// static data
object PlanetData {
    private val planetNames = arrayOf(
        "Matahari", // matahari
        "Merkurius", // merkurius
        "Venus", // venus
        "Bumi", // bumi
        "Mars", // Mars
        "Jupiter", // Jupiter
        "Saturnus", // Saturnus
        "Uranus", // Uranus
        "Neptunus", // Neptunus
        "Pluto", // Pluto

    )

    private val planetJenis = arrayOf(
        "Bintang", // matahari
        "Planet", // merkurius
        "Planet", // venus
        "Planet", // bumi
        "Planet", // Mars
        "Planet", // Jupiter
        "Planet", // Saturnus
        "Planet", // Uranus
        "Planet", // Neptunus
        "Planet Katai", // Pluto
    )

    private val planetDetails = arrayOf(
        "\t\t\tMatahari atau Surya adalah bintang di pusat tata surya. Bentuknya nyaris bulat dan terdiri dari plasma panas bercampur medan magnet. Diameternya sekitar 1.392.684 km, kira-kira 109 kali diameter Bumi, dan massanya (sekitar 2×1030 kilogram, 330.000 kali massa Bumi) mewakili kurang lebih 99,86 % massa total tata surya.\n\n\t\t\tSecara kimiawi, sekitar tiga perempat massa matahari terdiri dari hidrogen, sedangkan sisanya didominasi helium. Sisa massa tersebut (1,69%, setara dengan 5.629 kali massa Bumi) terdiri dari elemen-elemen berat seperti oksigen, karbon, neon, dan besi.", // matahari
        "\t\t\tMerkurius adalah planet terkecil di Tata Surya sekaligus yang terdekat dari Matahari. Periode revolusi planet ini merupakan yang terpendek dari semua planet di Tata Surya, yakni 87,79 hari. Planet ini dinamai menurut nama dewa Merkurius, sang pembawa pesan para dewa dalam mitologi Romawi. \n\n\t\t\tSeperti halnya Venus, Merkurius merupakan planet inferior yang letak orbitnya berada di sebelah dalam orbit Bumi, dan ketika diamati dari Bumi, jarak sudutnya dari Matahari tidak pernah melebihi 28°. Karena jarak yang dekat dengan Matahari, planet ini hanya dapat dilihat di dekat ufuk barat setelah matahari terbenam atau ufuk timur sebelum matahari terbit, atau biasanya ketika aram. Merkurius akan tampak seperti bintang yang terang jika diamati pada waktu tersebut, tetapi sering kali jauh lebih sulit untuk diamati daripada Venus. Jika diamati dari teleskop, Merkurius akan menampilkan serangkaian fase yang mirip dengan fase Venus dan Bulan, ketika bergerak di orbit bagian dalamnya yang relatif terhadap Bumi dan terjadi berulang dalam satu siklus sinodiknya, yakni sekitar 116 hari.", // merkurius
        "\t\t\tVenus adalah planet terdekat kedua dari Matahari setelah Merkurius. Planet ini mengorbit Matahari selama 224,7 hari Bumi. Venus tidak memiliki satelit alami dan dinamai dari dewi cinta dan kecantikan dalam mitologi Romawi. Setelah Bulan, planet ini merupakan objek alami tercerah di langit malam, dengan magnitudo tampak sebesar −4,6 yang cukup cerah untuk menghasilkan bayangan. Venus merupakan planet inferior dengan sudut elongasi yang mencapai 47,8°. Kecerahan maksimal planet ini dapat dilihat segera sebelum matahari terbit atau setelah matahari terbenam, sehingga disebut Bintang Fajar atau Bintang Senja. \n\n\t\t\tVenus adalah planet kebumian dan kadang-kadang disebut “planet saudara” Bumi karena ukuran, gravitasi, dan komposisi yang mirip (Venus merupakan planet terdekat dari Bumi dan planet yang ukurannya paling mendekati Bumi). Namun, dalam hal lain planet ini sangat berbeda dari Bumi. Planet ini memiliki atmosfer terpadat di antara empat planet kebumian yang terdiri dari 96% karbon dioksida. Tekanan atmosfer permukaan Venus 92 kali lebih besar daripada Bumi. Dengan rata-rata suhu permukaan sebesar 735 K (462 °C; 863 °F), Venus merupakan planet terpanas di Tata Surya. Planet ini tidak memiliki siklus karbon yang memerangkap karbon dalam batuan dan kenampakan permukaan, dan juga tidak memiliki kehidupan organik yang dapat menyerap karbon dalam bentuk biomassa. Venus diselimuti oleh lapisan buram yang terdiri dari awan asam sulfat yang sangat reflektif, sehingga permukaannya tidak dapat dilihat dari luar angkasa. Venus mungkin pernah memiliki samudra, namun samudra tersebut menguap karena peningkatan suhu yang disebabkan oleh efek rumah kaca berketerusan. Sebagian besar air mungkin telah terfotodisosiasi, dan angin matahari telah membuat hidrogen bebas mengalami pelepasan ke luar angkasa sebagai akibat dari ketiadaan medan magnet internal di Venus. Permukaan Venus sendiri bergurun, kering, dan diselingi oleh batuan yang diperbarui secara periodik oleh aktivitas vulkanik.", // Venus
        "\t\t\tBumi adalah planet ketiga dari Matahari yang merupakan planet terpadat dan terbesar kelima dari delapan planet dalam Tata Surya. Bumi juga merupakan planet terbesar dari empat planet kebumian Tata Surya. Bumi terkadang disebut dengan dunia atau Planet Biru.\n\n\t\t\tBumi terbentuk sekitar 4,54 miliar tahun yang lalu, dan kehidupan sudah muncul di permukaannya paling tidak sekitar 3,5 miliar tahun yang lalu. Biosfer Bumi kemudian secara perlahan mengubah atmosfer dan kondisi fisik dasar lainnya, yang memungkinkan terjadinya perkembangbiakan organisme serta pembentukan lapisan ozon, yang bersama medan magnet Bumi menghalangi radiasi surya berbahaya dan mengizinkan makhluk hidup mikroskopis untuk berkembang biak dengan aman di daratan. Sifat fisik, sejarah geologi, dan orbit Bumi memungkinkan kehidupan untuk bisa terus bertahan.\n\n\t\t\tLitosfer Bumi terbagi menjadi beberapa segmen kaku, atau lempeng tektonik, yang mengalami pergerakan di seluruh permukaan Bumi selama jutaan tahun. Lebih dari 70% permukaan Bumi ditutupi oleh air, dan sisanya terdiri dari benua dan pulau-pulau yang memiliki banyak danau dan sumber air lainnya yang bersumbangsih terhadap pembentukan hidrosfer. Kutub Bumi sebagian besarnya tertutup es; es padat di Antarktika dan es laut di paket es kutub. Interior Bumi masih tetap aktif, dengan inti dalam terdiri dari besi padat, sedangkan inti luar berupa fluida yang menciptakan medan magnet, dan lapisan tebal yang relatif padat di bagian mantel.", // bumi
        "\t\t\tMars adalah planet terdekat keempat dari Matahari. Namanya diambil dari dewa perang Romawi, Mars. Planet ini sering dijuluki sebagai 'planet merah' karena tampak dari jauh berwarna kemerah-kemerahan. Ini disebabkan oleh keberadaan besi(III) oksida di permukaan planet Mars. Mars adalah planet bebatuan dengan atmosfer yang tipis. Di permukaan Mars terdapat kawah, gunung berapi, lembah, gurun, dan tudung es. Periode rotasi dan siklus musim Mars mirip dengan Bumi. Di Mars berdiri Olympus Mons, gunung tertinggi di Tata Surya, dan Valles Marineris, lembah terbesar di Tata Surya. Selain itu, di belahan utara terdapat cekungan Borealis yang meliputi 40% permukaan Mars.\n\n\t\t\tLingkungan Mars lebih bersahabat bagi kehidupan dibandingkan keadaan planet Venus. Namun begitu, keadaannya tidak cukup ideal untuk manusia. Suhu udara yang cukup rendah dan tekanan udara yang rendah, ditambah dengan komposisi udara yang sebagian besar karbondioksida, menyebabkan manusia harus menggunakan alat bantu pernapasan jika ingin tinggal di sana. Misi-misi ke planet merah ini, sampai penghujung abad ke-20, belum menemukan jejak kehidupan di sana, meskipun yang amat sederhana.\n\n\t\t\tDi planet Mars, terdapat sebuah kenampakan unik di daerah Cydonia Mensae. Kenampakan ini merupakan sebuah perbukitan yang bila dilihat dari atas tampak sebagai sebuah wajah manusia. Banyak orang yang menganggapnya sebagai sebuah bukti dari peradaban yang telah lama musnah di Mars, walaupun pada masa kini, telah terbukti bahwa kenampakan tersebut hanyalah sebuah kenampakan alam biasa.", // Mars
        "\t\t\tJupiter atau Yupiter adalah planet terdekat kelima dari Matahari setelah Merkurius, Venus, Bumi, dan Mars. Planet ini juga merupakan planet terbesar di Tata Surya. Jupiter merupakan raksasa gas dengan massa seperseribu massa Matahari dan dua setengah kali jumlah massa semua planet lain di Tata Surya. Planet ini dan raksasa gas lain di Tata Surya (yaitu Saturnus, Uranus, dan Neptunus) kadang-kadang disebut planet Jovian atau planet luar. Jupiter telah dikenal oleh para astronom sejak zaman kuno, dan dikaitkan dengan mitologi dan kepercayaan religius banyak peradaban. Bangsa Romawi menamai planet ini dari dewa Jupiter dalam mitologi Romawi. Saat diamati dari Bumi, magnitudo tampak Jupiter dapat mencapai −2,94, yang cukup terang untuk menghasilkan bayangan, dan juga menjadikannya objek tercerah ketiga di langit malam setelah Bulan dan Venus, walaupun Mars dapat menyaingi kecerahan Jupiter pada saat tertentu.\n\n\t\t\tJupiter sebagian besar terdiri dari hidrogen dan helium. Seperempat massa Jupiter merupakan helium, walaupun jumlahnya hanya sepersepuluh komposisi Jupiter. Planet ini mungkin memiliki inti berbatu yang terdiri dari unsur-unsur berat, namun tidak memiliki permukaan yang padat layaknya raksasa gas lainnya. Akibat rotasinya yang cepat, planet ini berbentuk bulat pepat (terdapat tonjolan di sekitar khatulistiwa Jupiter). Atmosfer luar terbagi menjadi beberapa lapisan di lintang yang berbeda, dan interaksi antara batas-batas lapisan tersebut menghasilkan badai. Salah satu dampaknya adalah Bintik Merah Raksasa, yaitu badai besar yang telah diketahui keberadaannya semenjak abad ke-17 dengan menggunakan teleskop. Di sekeliling Jupiter terdapat cincin yang tipis dan magnetosfer yang kuat. Selain itu terdapat paling tidak 67 satelit alami, termasuk empat satelit besar yang disebut satelit-satelit Galileo yang pertama kali ditemukan oleh Galileo Galilei pada tahun 1610. Satelit terbesar Jupiter, yaitu Ganimede, memiliki diameter yang lebih besar daripada planet Merkurius.\n\n\t\t\tJupiter sebagian besar terdiri dari materi gas dan cair. Planet ini merupakan planet terbesar di antara empat raksasa gas dan terbesar di Tata Surya dengan diameter sebesar 142984 km (88846 mi) di khatulistiwanya. Kepadatan Jupiter, yaitu 1,326 g/cm3, merupakan yang terbesar kedua di antara raksasa gas, namun lebih rendah dari empat planet kebumian lainnya.", // Jupiter
        "\t\t\tSaturnus adalah planet keenam dari Matahari dan merupakan planet terbesar kedua di Tata Surya setelah Jupiter. Saturnus juga merupakan sebuah raksasa gas yang memiliki radius rata-rata sekitar 9 kali radius rata-rata Bumi. Massa jenis rata-rata Saturnus hanya 1/8 massa jenis rata-rata Bumi, tetapi dengan volume yang lebih besar dari Bumi, massa Saturnus tercatat 95 kali massa Bumi. Saturnus dinamai menurut dewa kesejahteraan dan agribudaya dalam mitologi Yunani; simbol astronominya (♄) melambangkan sabit yang digunakan oleh dewa tersebut.\n\n\t\t\tInterior Saturnus kemungkinan besar terdiri dari inti yang mengandung besi, nikel, dan batuan (senyawa silikon dan oksigen). Inti Saturnus dikelilingi oleh lapisan dalam yang terdiri dari hidrogen metalik, lapisan menengah yang terdiri dari hidrogen cair dan helium cair, dan lapisan luar yang mengandung gas. Saturnus memiliki rona kuning pucat karena kristal-kristal amonia yang memenuhi atmosfer bagian atasnya. Arus listrik yang terdapat di dalam lapisan hidrogen metaliknya diperkirakan merupakan penghasil medan magnet Saturnus, yang diketahui lebih lemah dari medan magnet Bumi, tetapi memiliki momen magnetik 580 kali lebih besar dari milik Bumi karena ukuran Saturnus yang lebih besar. Kekuatan medan magnet Saturnus hanya sekitar 1/20 dari kekuatan medan magnet Jupiter. Meskipun penampilan atmosfer bagian luarnya tampak biasa, terdapat ketampakan berumur panjang yang memenuhi lapisan atmosfer ini. Kecepatan angin di Saturnus dapat mencapai 1800 km/h (1100 mph; 500 m/s), lebih tinggi dari kecepatan angin di Jupiter, tetapi tidak setinggi kecepatan angin di Neptunus.\n\n\t\t\tSaturnus terkenal dengan sistem cincinnya yang unik, yang sebagian besar terdiri dari partikel-partikel es dengan sedikit puing-puing batu dan debu. Setidaknya diketahui ada 82 satelit alami yang mengorbit Saturnus, 53 di antaranya telah menerima nama resmi; jumlah ini tidak termasuk ratusan satelit alami minor pada sistem cincinnya. Titan, satelit alami terbesar Saturnus dan satelit alami terbesar kedua di Tata Surya, memiliki diameter yang lebih besar dari Merkurius, tetapi massa Titan lebih kecil dari massa Merkurius. Titan juga merupakan satu-satunya satelit alami di Tata Surya yang memiliki atmosfer tebal.", // Saturnus
        "\t\t\tUranus (berasal dari nama Latin Ūranus untuk nama dewa Yunani Οὐρανός) adalah planet ketujuh dari Matahari. Uranus merupakan planet yang memiliki jari-jari terbesar ketiga sekaligus massa terbesar keempat di Tata Surya. Uranus juga merupakan satu-satunya planet yang namanya berasal dari tokoh dalam mitologi Yunani, dari versi Latinisasi nama dewa langit Yunani Ouranos. Komposisi Uranus serupa dengan Neptunus, dan keduanya mempunyai komposisi kimiawi yang berbeda dari raksasa gas yang lebih besar, Jupiter dan Saturnus. Karenanya, para astronom sering menempatkan Uranus dan Neptunus dalam kategori \"raksasa es\" untuk membedakan keduanya dari raksasa gas. Atmosfer Uranus serupa dengan Jupiter dan Saturnus karena kandungan utamanya adalah hidrogen dan helium, tetapi mengandung lebih banyak unsur \"es\" seperti air, amonia dan metana, bersama dengan sisa hidrokarbon. Atmosfer Uranus merupakan atmosfer planet terdingin di Tata Surya, dengan suhu terendah mencapai 49 K (−224 °C; −371 °F). Atmosfer Uranus mempunyai struktur awan berlapis-lapis dan kompleks, serta diperkirakan lapisan awan terendahnya terdiri atas air dan lapisan awan tertingginya terdiri atas metana. Bagian dalam Uranus sebagian besar terdiri atas es dan bebatuan.\n\n\t\t\tSeperti planet raksasa lain, Uranus memiliki sistem cincin, magnetosfer, serta banyak satelit alami. Sistem Uranus mempunyai konfigurasi yang unik di antara planet-planet karena kemiringan sumbunya miring ke samping, hampir pada bidang revolusinya mengelilingi Matahari. Oleh karena itu, kutub utara dan selatannya terletak pada tempat yang merupakan khatulistiwa bagi planet lain. Pada tahun 1986, citra yang diabadikan oleh wahana antariksa Voyager 2 menunjukkan Uranus sebagai planet yang terlihat tidak memiliki ketampakan pada cahaya tampak, yaitu tanpa pita awan atau badai yang biasanya dimiliki oleh planet raksasa. Meskipun demikian, pengamat di Bumi melihat tanda-tanda perubahan musim dan aktivitas cuaca yang meningkat ketika Uranus mencapai ekuinoksnya pada tahun 2007. Kecepatan angin di permukaan Uranus dapat mencapai 250 meter per detik (900 km/h; 560 mph).", // Uranus
        "\t\t\tNeptunus merupakan planet terjauh (kedelapan) jika ditinjau dari Matahari. Planet ini dinamai dari dewa lautan Romawi. Neptunus merupakan planet terbesar keempat berdasarkan diameter (49.530 km) dan terbesar ketiga berdasarkan massa. Massa Neptunus tercatat 17 kali lebih besar daripada Bumi, dan sedikit lebih kecil daripada Uranus. Neptunus mengorbit Matahari pada jarak 30,1 sa atau sekitar 4.450 juta km. Periode rotasi planet ini adalah 16,1 jam, sedangkan periode revolusinya adalah 164,8 tahun. Simbol astronomisnya adalah ♆, yang merupakan trisula dewa Neptunus.\n\n\t\t\tKomposisi penyusun planet ini mirip dengan Uranus, dan komposisi keduanya berbeda dari raksasa gas Jupiter dan Saturnus. Atmosfer Neptunus mengandung hidrogen, helium, hidrokarbon, kemungkinan nitrogen, dan kandungan 'es' yang besar seperti es air, amonia, dan metana. Astronom kadang-kadang mengategorikan Uranus dan Neptunus sebagai 'raksasa es' untuk menekankan perbedaannya. Seperti Uranus, interior Neptunus terdiri dari es dan batu. Metana di wilayah terluar planet merupakan salah satu penyebab kenampakan kebiruan Neptunus.\n\n\t\t\tSementara atmosfer Uranus relatif tidak berciri, atmosfer Neptunus bersifat aktif dan menunjukkan pola cuaca. Contohnya, pada saat Voyager 2 terbang melewatinya pada tahun 1989, di belahan selatan planet terdapat Titik Gelap Besar yang mirip dengan Titik Merah Besar di Jupiter. Pola cuaca tersebut diakibatkan oleh angin yang sangat kencang, dengan kecepatan hingga 2.100 km/jam. Karena jaraknya yang jauh dari Matahari, atmosfer luar Neptunus merupakan salah satu tempat terdingin di Tata Surya, dengan suhu terdingin −218 °C (55 K). Suhu di inti planet diperkirakan sebesar 5.400 K (5.000 °C). Neptunus memiliki sistem cincin yang tipis. Sistem cincin tersebut baru dilacaktemu pada tahun 1960-an dan dipastikan keberadaannya oleh Voyager 2 pada tahun 1989.", // Neptunus
        "\t\t\tPluto (nama planet minor: 134340 Pluto) adalah planet katai di sabuk Kuiper dan objek trans-Neptunus pertama yang ditemukan. Pluto merupakan planet katai terbesar dan bermassa terbesar kedua di Tata Surya dan benda terbesar kesembilan dan bermassa terbesar kesepuluh yang mengorbit Matahari secara langsung. Pluto merupakan objek trans-Neptunus dengan volume terbesar dan massa yang sedikit lebih kecil daripada Eris, planet katai di piringan tersebar. Layaknya objek lain di sabuk Kuiper, Pluto terdiri dari batu dan es dan relatif kecil—kurang lebih seperenam massa Bulan dan sepertiga volume Bulan. Pluto memiliki orbit eksentris dan miring dengan jarak 30 sampai 49 satuan astronomi (4,4–7,3 miliar km) dari Matahari. Ini berarti ada saatnya Pluto lebih dekat ke Matahari daripada Neptunus; resonansi orbit yang stabil dengan Neptunus membuat kedua planet ini tidak bertabrakan. Pada tahun 2014, Pluto berjarak 32,6 sa dari Matahari. Cahaya Matahari butuh waktu 5,5 jam untuk mencapai Pluto pada jarak rata-ratanya (39,4 sa).\n\n\t\t\tPluto ditemukan tahun 1930 dan awalnya dinyatakan sebagai planet kesembilan dari Matahari. Setelah 1992, status planetnya dipertanyakan setelah para astronom menemukan sabuk Kuiper, lingkaran objek di luar Neptunus yang mencakup Pluto dan benda-benda lainnya. Tahun 2005, Eris, yang massanya 27% lebih besar daripada Pluto, ditemukan. Persatuan Astronomi Internasional (IAU) mengeluarkan definisi resmi \"planet\" untuk pertama kalinya pada tahun 2006. Pluto tidak sesuai dengan definisi ini dan dipindahkan ke golongan \"planet katai\" yang baru saja dibuat, lebih tepatnya plutoid. Sejumlah astronom meyakini bahwa Pluto masih dianggap sebagai planet.\n\n\t\t\tPluto sejauh ini diketahui memiliki lima satelit: Charon (terbesar; diameternya separuh diameter Pluto), Styx, Nix, Kerberos, dan Hydra. Pluto dan Charon kadang dianggap sistem biner karena barisenter orbit mereka terletak di antara kedua objek ini. IAU belum meresmikan definisi planet katai biner, dan Charon dinyatakan secara resmi sebagai satelit Pluto.", // Pluto
    )

    private val planetImages = arrayOf(
        "https://akm-img-a-in.tosshub.com/indiatoday/images/story/202108/Sun.jpg?98lriJ8dr7iOQArK1GNsWLqTZVBHIU.w&size=1200:675", // matahari
        "https://asset-a.grid.id/crop/109x0:1279x741/700x465/photo/2018/12/11/2445410172.jpg", // merkurius
        "https://cdn0-production-images-kly.akamaized.net/y6PZ9wTaNWuqpT0-zuBEYX3HZzs=/0x0/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/1292240/original/074682000_1468915840-venus.jpg", // venus
        "https://akcdn.detik.net.id/visual/2020/05/14/690f1887-c2c2-40e3-aecc-d95187910f12_169.jpeg?w=650", // bumi
        "https://media.suara.com/pictures/970x544/2021/02/11/31256-planet-mars.jpg", // Mars
        "https://img.okezone.com/content/2021/12/23/56/2521511/ilmuwan-telah-temukan-planet-10-kali-lebih-besar-dari-jupiter-hiY9IqCUpj.jpg", // Jupiter
        "https://media.suara.com/pictures/653x366/2020/07/27/62636-planet-saturnus.jpg", // Saturnus
        "https://akcdn.detik.net.id/visual/2017/04/06/a8163440-9ce1-4272-98bb-9b119bd6958f_169.jpg?w=650", // Uranus
        "https://cdn0-production-images-kly.akamaized.net/pxylc5vE1B37N9euNmbEG6qtU5w=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/3006619/original/026536600_1577425240-neptune.jpg", // Neptunus
        "https://asset.kompas.com/crops/5fJgE8LSpGmGnnlp0FZZQrViySU=/0x0:0x0/780x390/data/photo/2015/07/14/2205439pluto-cinta780x390.JPG", // Pluto
    )

    private val planetJariJari = arrayOf(
        ": 695.700 KM", // matahari
        ": 2.439,7 ± 1,0 km", // merkurius
        ": 6.051,8 ± 1,0 km", // Venus
        ": 6.371,0 km", // bumi
        ": 3.396,2 ± 0,1 km", // Mars
        ": 69,911 ± 6 km", // Jupiter
        ": 58.232 km", // Saturnus
        ": 25.559 ± 4 km", // Uranus
        ": 24.764 ± 15 km", // Neptunus
        ": 1185 ± 10 km", // Pluto
    )

    private val planetLuasPermukaan = arrayOf(
        ": 4,379 × 10^6 km^2", // matahari
        ": 7,48 × 10^7 km^2", // merkurius
        ": 4,60 × 10^8 km^2", // Venus
        ": 510.072.000 km^2", // bumi
        ": 144.798.500 km^2", // Mars
        ": 6,1419 × 10^10 km^2", // Jupiter
        ": 4,27 × 10^10 km^2", // Saturnus
        ": 8,1156 × 10^9 km^2", // Uranus
        ": 7,6408 × 10^9 km^2", // Neptunus
        ": 1,665 × 10^7 km^2", // Pluto
    )

    private val planetVolume = arrayOf(
        ": 1.300.000 × Bumi", // matahari
        ": 6,083 × 1010 km^3", // merkurius
        ": 6,083 × 1010 km^3", // Venus
        ": 1,08321 × 10^12 km^3", // bumi
        ": 1,6318 × 10^11 km^3", // Mars
        ": 1,4313 × 10^15 km^3", // Jupiter
        ": 8,2713 × 10^14 km^3", // Saturnus
        ": 6,833 × 10^13 km^3", // Uranus
        ": 6,254 × 10^13 km^3", // Neptunus
        ": 6,39 × 10^9 km^3", // Pluto
    )

    private val planetMassa = arrayOf(
        ": 333.000 × Bumi", // matahari
        ": 3,3022 × 10^23 kg", // merkurius
        ": 9,28 × 1011 km^3", // Venus
        ": 5,97219 × 10^24 kg", // bumi
        ": 6,4185 × 10^23 kg", // Mars
        ": 1,8986 × 10^27 kg", // Jupiter
        ": 5,6834 × 10^26 kg", // Saturnus
        ": (8,6810 ± 0,0013) × 10^25 kg", // Uranus
        ": 1,0243 × 10^26 kg", // Neptunus
        ": (1,305 ± 0,007)×10^22 kg", // Pluto
    )

    private val planetAtmosfer = arrayOf(
        ":\tHidrogen (73,46%) \n\tHelium (24,85%) \n\tOksigen (0,77%) \n\tKarbon (0,29%) \n\tBesi (0,16%) \n\tNeon (0,12%) \n\tNitrogen (0,09%) \n\tSilikon (0,07%) \n\tMagnesium (0,05%) \n\tBelerang (0,04%)", // matahari
        ":\tOksigen (42,0%) \n" +
        "\tNatrium (29,0%) \n" +
        "\tHidrogen (22,0%) \n" +
        "\tHellium (6,0%) \n" +
        "\tKalium (0,5%) ", // merkurius
        ":\tKarbon dioksida (96,5%) \n\tNitrogen (3,5%) \n\tSulfur dioksida (0,015%) \n\tArgon (0,007%) \n\tUap air (0,002%) \n\tKarbon monoksida (0,0017%) \n\tHelium (0,0012%) \n\tNeon (0,0007%)", // venus
        ":\tNitrogen (78,08%) \n\tOksigen (20,95%) \n\tArgon (0,93%) \n\tKarbon dioksida (0,039%) \n\tUap air (Sekitar 1% sesuai iklim)", // bumi
        ":\tKarbon dioksida (95,72%) \n\tNitrogen (2,7%) \n\tArgon (1.6%) \n\tOksigen(0,2%) \n\tKarbon monoksida (0,7%) \n\tUap air (0,03%)\n\t Nitrogen monoksida (0,,01%)", // Mars
        ":\tNitrogen (78,08%) \n\tOksigen (20,95%) \n\tArgon (0,93%) \n\tKarbon dioksida (0,039%) \n\tUap air (Sekitar 1% sesuai iklim)", // Jupiter
        ":\tHidrogen (89,8%) \n\tHellium (10,2%) \n\tMetana (~0,3%) \n\tAmonia (~0,026%) \n\tHidrogen deuterida (~0,003%), Etana (~0,00006%)", // Saturnus
        ":\tHidrogen (80,2%) \n\tHellium (19,2%) \n\tMetana (1,5%) \n\tHidrogen deuterida (~0,0019%), Etana (~0,00015%)", // Uranus
        ":\tHidrogen (83 ± 3%) \n\tHellium (15 ± 3%) \n\tMetana (2,3%) \n\tHidrogen (0,009%)", // Neptunus
        ":\tNitrogen \n\tMetana \n\tKarbon monoksida", // Pluto

    )



    val listData: ArrayList<Planet>
        get() {
            val list = arrayListOf<Planet>()
            for (position in planetNames.indices) {
                val planet = Planet()
                planet.name = planetNames[position]
                planet.detail = planetDetails[position]
                planet.jenis = planetJenis[position]
                planet.photo = planetImages[position]
                planet.jariJari = planetJariJari[position]
                planet.luasPermukaan = planetLuasPermukaan[position]
                planet.volume = planetVolume[position]
                planet.massa = planetMassa[position]
                planet.atmosfer = planetAtmosfer[position]
                list.add(planet)
            }
            return list
        }
}
package com.example.kheti_baadi;

import android.icu.text.Transliterator;
import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class descfrag extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_descfrag, container, false);
        View view1 = view.findViewById(R.id.title);
        View view2 = view.findViewById(R.id.desc);
        View view3 = view.findViewById(R.id.img);
        View view4 = view.findViewById(R.id.link);

        Bundle bundle = getArguments();
        int position = bundle.getInt("itemPosition");

        String Title = getTitle(position);
        String Desc = getDesc(position);
        String link = getLink(position);



        ((TextView)view1).setText(Title);
        ((ImageView)view3).setImageResource(imageid[position]);
        ((TextView)view2).setText(Desc);
        ((TextView)view4).setText(link);



        return view;
    }




    private String getLink(int position) {

        ArrayList<String> link = new ArrayList<>();
        link.add("https://www.agrifarming.in/cotton-farming-guide");
        link.add( "https://www.apnikheti.com/en/pn/agriculture/crops/oilseeds/mustard#Typesofpestsanddiseases");
        link.add("http://www.hpmindia.com/blog/blog/blog-blog/wheat-cultivation-in-india-conditions/");
        link.add(  "https://www.agrifarming.in/bajra-cultivation");
        link.add("https://www.agrifarming.in/barley-cultivation");
        link.add("https://www.indiaagronet.com/indiaagronet/crop%20info/sugarcane.htm");


        String link1 = link.get(position);
        return link1;
    }


    private String getDesc(int position) {

        ArrayList<String> desc = new ArrayList<>();
        desc.add("Cotton is one of the most important fibres and a cash crop of India and plays a dominant role in the industrial and agriculture economy of the country. It provides the basic raw material to the cotton textile industry.\n" +
                "Type:\n Kharif Crop (sown in April-May)\n\n" +
                "Temperature:\n 25` C is ideal for cotton cultivation.\n\n" +
                "Soil:\n Irrigated cotton should be grown on medium black to deep black soil having a pH range of between 6 to 8. Saline soils are not suitable for cotton cultivation. \n\n" +
                "For more information click on given link:\n"
                );

        desc.add("Mustards, (Brassica spp.) are herbaceous annual plants in the family Brassicaceae grown for their seeds which are used as a spice. Mustard plants are thin herbaceous herbs with yellow flowers. The leaves of the plant are toothed, lobed, and occasionally have the larger terminal lobes. Plants can reach 16 cm (6.3 in) in length. Mustard seeds and its oil is used for culinary purpose. Young leaves are used for vegetable purpose. Its oil cake is used for feeding cattle.\n" +
                "\n\n" +
                "Type:\n Rabi Crop( Sown in October-november)\n\n" +
                "Temperature:\n 22`-25` C ideal for Mustard crop.\n\n" +
                "Soil:\n Light to heavy soil is good for mustard and rapeseed cultivation. Raya can be grown in all type of soil whereas loam to heavy soils are suitable for toria crop. Sandy and loamy sand soils are suitable for Taramira crops.\n" +
                " For More information click on the following link:\n"
               );

        desc.add("Wheat crop is India’s prime most staple harvest, placed second only to rice. It is mostly consumed in the north and north –west parts of the country. Being rich in protein, vitamin and carbohydrates, it provides a balanced food to millions of people each day.\n" +
                "With the advent of Green revolution in the 1960s, India’s wheat crop production and productivity increased at a great level. In current scenario, India with a production of 87 million tonnes is the second largest producer of wheat in the world after china. \n" +
                "Type:\n Rabi crop (sown in October- November and harvested in march-April).\n\n" +
                "Temperature:\n 21`-24` C (not too hot)\n\n" +
                "Soil:\n Wheat is grown in a variety of soils of India. Soils with a clay loam or loam texture, good structure and moderate water holding capacity are ideal for wheat cultivation. Care should be taken to avoid very porous and excessively drained oils. Soil should be neutral in its reaction.\n\n" +
                "For more information click on the given link:\n"
                );

        desc.add("Bajra is popularly known as “pearl millet” and belongs to the family of Gramineae. This grain is basically orginated from india and Africa. Bajra is a coarse grain crop and considered to be the poor mans’s staple nourishment and suitable to cultivate in drylands. Malor bajra production states in india are Rajasthan, Maharashtra, Haryana, U.P. and Gujrat. Bajra can also be used as valuable animal fodder. It is one of the major crops of china, india , South-Eastern Asia, Sudan, Pakistan, Russia.\n" +
                "Type:\n Kharif crop \n\n" +
                "Temperature:\n The ideal temperature for Bajra cultivation is between 20`C to 30`C.\n\n" +
                "Soil:\n Bajra can be grown in a wide range of soils. However, it thrives best in black cotton soils, sandy loam soils having good drainage. This crop does not prefer acidic and waterlogging soils.\n\n" +
                "For more information follow the given link:\n"
              );

        desc.add("Barley is popularly known as “Jau” in Hindi an done of the most important cereal grain crops after rice, wheat & maize. In India, this crop is cultivated as a summer crop in temperate regions & as a winter crop in tropical regions. Barley is a short growing season crop and has good drought tolerant. In olden days, Barley was mainly used as livestock feed and currently it is one of the grains used daily in human consumption. Coarse cereals are made out of this along with other cerel crops like oats, pearl millet (bajra), finger millet(ragi), corn/maize , jowar.\n" +
                "Type:\n Rabi crop ( sowing being undertaken from Oct to Dec & harvesting from Mar to May).\n\n" +
                "Temperature:\n This crop requires temperature of 12` C to 16`C at growing stage and about 30`c to 32`C at maturity.\n\n" +
                "Soil:\n Barley crop can be grown on wide range of soils including saline, sodic & lighter soils. Best in sandy to moderately heavy loam soils having neutral to saline reaction and medium fertility.\n\n" +
                "For more information follow the given link:\n"
                );

        desc.add("Sugarcane (Saccharum officinarum L.) is the main sources of sugar in India and holds a prominent position as a cash crop. India is the world’s largest consumer and the second largest producer of sugar, topped only by Brazil. Nearly 2.8 lakh farmers have been cultivating sugarcane in the vast area of 4.4 lakh acres and over 11 crore people are directly or indirectly dependent on the sugar industry in the country. Sugarcane is one of the important commercial crops of India.\n" +
                "Type:\n Planting of sugarcane is done in three seasons that is suru- January-February, adsali - July-August and pre seasonal- October-November for planting generally ridges and furrows are prepared on 100-120cm spacing. \n\n" +
                "Temperature:\n 20`C -50`C (Under warm humid conditions, it can continue its growth, unless terminated by flowering).\n\n" +
                "Soil:\n Sugarcane grows best on medium heavy soils, but can also be raised on lighter soils and heavy clays, provided there is adequate irrigation available in the former type of soils and drainage is good in the latter type of soils. \n\n" +
                "For more information follow the given link:\n"
                );
        String Desc = desc.get(position);

        return Desc;
    }

    private String getTitle(int position) {

        ArrayList<String> title = new ArrayList<>();
        title.add("Cotton/कपास");
        title.add("Mustard/सरसों");
        title.add("Wheat/गेहूँ");
        title.add("Millet/बाजरा");
        title.add("Barley/जौ");
        title.add("Sugarcane/गन्ना");

        String Title = title.get(position);

        return Title;
    }

    private Integer imageid[] ={
            R.drawable.img1,
            R.drawable.mustard,
            R.drawable.wheat,
            R.drawable.bajra,
            R.drawable.img5,
            R.drawable.sugarcane
    };
}

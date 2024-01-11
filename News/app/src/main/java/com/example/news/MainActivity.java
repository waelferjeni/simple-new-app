package com.example.news;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView newsRecycler;
    private List<News> newsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newsRecycler = findViewById(R.id.newsList);
        newsRecycler.setLayoutManager(new LinearLayoutManager(this));
        newsRecycler.setItemAnimator(new DefaultItemAnimator());
        RecyclerView.ItemDecoration dividerItemDecoration = new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        newsRecycler.addItemDecoration(dividerItemDecoration);

        Adapter adapter = new Adapter(newsList, this);
        newsRecycler.setAdapter(adapter);



        newsList.add(new News(R.drawable.rodrigo,"الترجي الرياضي: ورودريغو جاهز لمواجهة بترو أتليتيكو ","أكد المدرب طارق ثابت في تصريح لفووت24، جاهزية اللاعب البرازيلي رودريغو رودريغيز لمواجهة بيترو أتلتيكو بعد تعافيه من مخلفات الإصابة. وقال ثابت إنه خير الإبقاء على البرازيليين رودريغو ويان ساس خارج القائمة خلال مواجهة مستقبل المرسى أمس الثلاثاء نظرا لحالة ملعب عبد العزيز الشتيويويواجه نادي باب سويقة يوم السبت 09 ديسمبر 2023، ضيفه بترو أتليتكو الأنغولي، لحساب الجولة الثالثة من دور المجموعات ضمن فعاليات دوري أبطال إفريقيا."));
        newsList.add(new News(R.drawable.merieh,"أبطال إفريقيا: صافرة طوغولية لمباراة الترجي وبيترو لواندا","أعلن الترجي الرياضي التونسي اليوم الأربعاء عبر تطبيقة ''ترجي +'' عن تعيين الإتحاد الإفريقي لكرة القدم لطاقم تحكيمي طوغولي للمباراة القادمة أمام بيترو أتلتيكو الأنغولي.وسيتولى الحكم الحاجي علو محمد مهمة الحكم الأول للقاء، مصحوباً بمساعديْه عيسى بوغولا وموسى حفيظ، في حين سيكون ألفريد أرمي حكماً رابعاًيشار إلى أن أبناء طارق ثابت سيستضيفون نظيرهم الانغولي هذا السبت على الساعة الثامنة ليلاً بملعب حمادي العقربي برادس في إطار الجولة الثالثة من دور مجموعات دوري أبطال إفريقيا.\n"));
        newsList.add(new News(R.drawable.curvasud,"الترجي الرياضي يطرح تذاكر مواجهة بترو أتليتيكو ","أعلن الترجي الرياضي في بلاغ عبر صفحته الرسمية اليوم الاربعاء، عن طرح تذاكر مواجهة بترو أتليتيكو بداية من غد الاربعاء. وستكون التذاكر على ذمة الأحباء بشبابيك الملعب الأولمبي بالمنزه بسعر 20 دينارا علما وأن المنعرج الجنوبي (الفيراج) مخصص فقط لمن سنهم فوق 18 عاما.  ويواجه نادي باب سويقة يوم السبت 09 ديسمبر 2023، ضيفه بترو أتليتكو الأنغولي، لحساب الجولة الثالثة من دور المجموعات ضمن فعاليات دوري أبطال إفريقيا. "));

        adapter.notifyDataSetChanged();
    }

}

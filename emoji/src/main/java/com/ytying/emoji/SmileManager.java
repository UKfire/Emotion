package com.ytying.emoji;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by UKfire on 16/3/14.
 */
public class SmileManager {
    private static List<Smile> smileList;
    private static SparseArray<Smile> smileMap;
    private static SparseArray<Drawable> drawableMap;
    private static Context context;

    public SmileManager(Context context) {
        this.context = context;
    }

    public static SparseArray<Drawable> getDrawableMap(Context context) {
        if (drawableMap == null) {
            drawableMap = new SparseArray<>();
            List<Smile> smileList = getSmileList();
            float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
            int sp = (int) (20 * fontScale + 0.5f);
            for (Smile smile : smileList) {
                Drawable drawable = context.getResources().getDrawable(smile.getResId());
                drawable.setBounds(0, 0, sp, sp);
                drawableMap.put(smile.getResId(), drawable);
            }
        }
        return drawableMap;
    }

    public static List<Smile> getSmileList() {
        if(smileList==null){
            smileList=new ArrayList<>();
            smileList.add(new Smile(R.drawable.emotion_1001,"[e]1001[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1002,"[e]1002[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1003,"[e]1003[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1004,"[e]1004[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1005,"[e]1005[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1006,"[e]1006[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1007,"[e]1007[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1008,"[e]1008[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1009,"[e]1009[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1010,"[e]1010[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1011,"[e]1011[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1012,"[e]1012[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1013,"[e]1013[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1014,"[e]1014[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1015,"[e]1015[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1016,"[e]1016[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1017,"[e]1017[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1018,"[e]1018[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1019,"[e]1019[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1020,"[e]1020[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1021,"[e]1021[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1022,"[e]1022[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1023,"[e]1023[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1024,"[e]1024[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1025,"[e]1025[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1026,"[e]1026[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1027,"[e]1027[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1028,"[e]1028[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1029,"[e]1029[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1030,"[e]1030[/e]"));

            smileList.add(new Smile(R.drawable.emotion_1031,"[e]1031[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1032,"[e]1032[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1033,"[e]1033[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1034,"[e]1034[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1035,"[e]1035[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1036,"[e]1036[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1037,"[e]1037[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1038,"[e]1038[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1039,"[e]1039[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1040,"[e]1040[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1041,"[e]1041[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1042,"[e]1042[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1043,"[e]1043[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1044,"[e]1044[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1045,"[e]1045[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1046,"[e]1046[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1047,"[e]1047[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1048,"[e]1048[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1049,"[e]1049[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1050,"[e]1050[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1051,"[e]1051[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1052,"[e]1052[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1053,"[e]1053[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1054,"[e]1054[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1055,"[e]1055[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1056,"[e]1056[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1057,"[e]1057[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1058,"[e]1058[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1059,"[e]1059[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1060,"[e]1060[/e]"));

            smileList.add(new Smile(R.drawable.emotion_1061,"[e]1061[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1062,"[e]1062[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1063,"[e]1063[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1064,"[e]1064[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1065,"[e]1065[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1066,"[e]1066[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1067,"[e]1067[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1068,"[e]1068[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1069,"[e]1069[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1070,"[e]1070[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1071,"[e]1071[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1072,"[e]1072[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1073,"[e]1073[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1074,"[e]1074[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1075,"[e]1075[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1076,"[e]1076[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1077,"[e]1077[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1078,"[e]1078[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1079,"[e]1079[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1080,"[e]1080[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1081,"[e]1081[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1082,"[e]1082[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1083,"[e]1083[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1084,"[e]1084[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1085,"[e]1085[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1086,"[e]1086[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1087,"[e]1087[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1088,"[e]1088[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1089,"[e]1089[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1090,"[e]1090[/e]"));

            smileList.add(new Smile(R.drawable.emotion_1091,"[e]1091[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1092,"[e]1092[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1093,"[e]1093[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1094,"[e]1094[/e]"));
            smileList.add(new Smile(R.drawable.emotion_1095,"[e]1095[/e]"));
        }
        return smileList;
    }

    public static SparseArray<Smile> getSmileMap(){
        if(smileMap==null)
        {
            smileMap=new SparseArray<>();
            List<Smile> list=getSmileList();
            for (Smile smile: list) {
                smileMap.put(smile.getTag().hashCode(),smile);
            }
        }
        return smileMap;
    }

    /**
     * 将sp值转换为px值，保证文字大小不变
     */
    public static int sp2px(float spValue) {
        float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue * fontScale + 0.5f);
    }

}

package com.scut.itpm.umo.data;


import com.scut.itpm.umo.R;
import com.scut.itpm.umo.data.announce.FeelingModel;
import com.scut.itpm.umo.data.announce.RequirementModel;
import com.scut.itpm.umo.data.chat.ChatMessageModel;
import com.scut.itpm.umo.data.follow.FollowModel;
import com.scut.itpm.umo.data.inform.InformModel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import com.scut.itpm.umo.data.announce.AnnounceModel;

/**
 * Created by DELL on 2016/11/30.
 */

public class FakeDataProvider {
    //TODO 获取假数据的地方
//<<<<<<< HEAD
//    public static List<AnnounceModel>  getAnnounceList(){
//        List<AnnounceModel> announceModelList=new ArrayList<>();
//        return announceModelList;
//=======
    public static List<FeelingModel> getFeelingList() {
        List<FeelingModel> feelingModelList = new ArrayList<>();

        FeelingModel fake1 = new FeelingModel();
        fake1.setFeelingerName("李杭澍");
        fake1.setFeelingerPhotoID(R.drawable.fake_data_announce_1);
        fake1.setFeelingID(1);
        fake1.setFeelingContent("我最近好寂寞啊，希望有个帅哥来炸窝聊天啊~~啊啊啊啊啊啊啊啊啊啊~啊啊");
        fake1.setCommentCount(25);
        fake1.setCommendCount(52);
        Date currDate1 = new Date(System.currentTimeMillis()-111111);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        fake1.setFeelingMoment(formatter.format(currDate1));
        fake1.setViewCount(1240);
        fake1.setFeelingLocation("华南理工大学");
        List imageList=new ArrayList();
        imageList.add(R.drawable.action_comment);
        imageList.add(R.drawable.action_commend);
        imageList.add(R.drawable.action_view);
        imageList.add(R.drawable.fake_data_announce_2);
        imageList.add(R.drawable.fake_data_announce_3);
        imageList.add(R.drawable.fake_data_announce_4);
        imageList.add(R.drawable.main_tab_bar_contacts);
        imageList.add(R.drawable.main_tab_bar_announce);
        imageList.add(R.drawable.main_tab_bar_follow);
        imageList.add(R.drawable.main_tab_bar_inform);
        fake1.setFeelingImageList(imageList);

        FeelingModel fake2 = new FeelingModel();
        fake2.setFeelingerName("梁耀友");
        fake2.setFeelingerPhotoID(R.drawable.fake_data_announce_2);
        fake2.setFeelingID(2);
        fake2.setFeelingContent("我最近在玩Umo，一起来玩吧~");
        fake2.setCommentCount(1);
        fake2.setCommendCount(2);
        Date currDate2 = new Date(System.currentTimeMillis() - 222222);
        fake2.setFeelingMoment(formatter.format(currDate2));
        fake2.setViewCount(1143);
        fake2.setFeelingLocation("C10-652");
        fake2.setFeelingImageList(imageList);

        FeelingModel fake3 = new FeelingModel();
        fake3.setFeelingerName("张小贤");
        fake3.setFeelingerPhotoID(R.drawable.fake_data_announce_3);
        fake3.setFeelingID(3);
        fake3.setFeelingContent("二饭篮球场来个基友一起战斗~");
        fake3.setCommentCount(35);
        fake3.setCommendCount(67);
        Date currDate3 = new Date(System.currentTimeMillis() - 333333);
        fake3.setFeelingMoment(formatter.format(currDate3));
        fake3.setViewCount(1240);
        fake3.setFeelingLocation("华南理工大学-二饭篮球场");
        fake3.setFeelingImageList(imageList);

        FeelingModel fake4 = new FeelingModel();
        fake4.setFeelingerName("张志斌");
        fake4.setFeelingerPhotoID(R.drawable.fake_data_announce_4);
        fake4.setFeelingID(4);
        fake4.setFeelingContent("峡谷见，左小龙，有大龙，上先锋，下蓝爸~");
        fake4.setCommentCount(86);
        fake4.setCommendCount(143);
        Date currDate4 = new Date(System.currentTimeMillis() - 444444);
        fake4.setFeelingMoment(formatter.format(currDate4));
        fake4.setViewCount(1240);
        fake4.setFeelingLocation("华南理工大学-召唤师峡谷");
        fake4.setFeelingImageList(imageList);

        feelingModelList.add(fake1);
        feelingModelList.add(fake2);
        feelingModelList.add(fake3);
        feelingModelList.add(fake4);

        return feelingModelList;
    }
    public static List<RequirementModel> getRequirementList() {
        List<RequirementModel> requirementModelList = new ArrayList<>();

        RequirementModel fake1 = new RequirementModel();
        fake1.setRequirementerName("李杭澍");
        fake1.setRequirementerPhotoID(R.drawable.fake_data_announce_1);
        fake1.setRequirementID(1);
        fake1.setRequirementContent("我最近好寂寞啊，希望有个帅哥来炸窝聊天啊~~啊啊啊啊啊啊啊啊啊啊~啊啊");
        fake1.setCommentCount(25);
        fake1.setBookCount(52);
        Date currDate1 = new Date(System.currentTimeMillis() - 1111);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:SS");
        fake1.setRequirementMoment(formatter.format(currDate1));
        fake1.setViewCount(145);
        fake1.setRequirementLocation("华南理工大学");
        List imageList=new ArrayList();
        imageList.add(R.drawable.action_comment);
        imageList.add(R.drawable.action_commend);
        imageList.add(R.drawable.action_view);
        imageList.add(R.drawable.fake_data_announce_2);
        imageList.add(R.drawable.fake_data_announce_3);
        imageList.add(R.drawable.fake_data_announce_4);
        imageList.add(R.drawable.main_tab_bar_contacts);
        imageList.add(R.drawable.main_tab_bar_announce);
        imageList.add(R.drawable.main_tab_bar_follow);
        imageList.add(R.drawable.main_tab_bar_inform);
        fake1.setRequirementImageList(imageList);

        RequirementModel fake2 = new RequirementModel();
        fake2.setRequirementerName("梁耀友");
        fake2.setRequirementerPhotoID(R.drawable.fake_data_announce_2);
        fake2.setRequirementID(2);
        fake2.setRequirementContent("我最近在玩Umo，一起来玩吧~");
        fake2.setCommentCount(1);
        fake2.setBookCount(2);
        Date currDate2 = new Date(System.currentTimeMillis() - 2222);
        fake2.setRequirementMoment(formatter.format(currDate2));
        fake2.setViewCount(682);
        fake2.setRequirementLocation("C10-652");
        fake2.setRequirementImageList(imageList);

        RequirementModel fake3 = new RequirementModel();
        fake3.setRequirementerName("张小贤");
        fake3.setRequirementerPhotoID(R.drawable.fake_data_announce_3);
        fake3.setRequirementID(1);
        fake3.setRequirementContent("二饭篮球场来个基友一起战斗~");
        fake3.setCommentCount(35);
        fake3.setBookCount(67);
        Date currDate3 = new Date(System.currentTimeMillis() - 3333);
        fake3.setRequirementMoment(formatter.format(currDate3));
        fake3.setViewCount(1030);
        fake3.setRequirementLocation("华南理工大学-二饭篮球场");
        fake3.setRequirementImageList(imageList);

        RequirementModel fake4 = new RequirementModel();
        fake4.setRequirementerName("张志斌");
        fake4.setRequirementerPhotoID(R.drawable.fake_data_announce_4);
        fake4.setRequirementID(1);
        fake4.setRequirementContent("峡谷见，左小龙，有大龙，上先锋，下蓝爸~");
        fake4.setCommentCount(86);
        fake4.setBookCount(143);
        Date currDate4 = new Date(System.currentTimeMillis() - 4444);
        fake4.setRequirementMoment(formatter.format(currDate4));
        fake4.setViewCount(1240);
        fake4.setRequirementLocation("华南理工大学-召唤师峡谷");
        fake4.setRequirementImageList(imageList);

        requirementModelList.add(fake4);
        requirementModelList.add(fake1);
        requirementModelList.add(fake3);
        requirementModelList.add(fake2);

        return requirementModelList;
    }

//    public interface PhoneService {
//        @GET("UserService/users")
//        Call<test> getResult();
//    }

    public static List<Map<String,Object>> getMessageList(){

//        Retrofit retrofit = new Retrofit.Builder()
//                .addConverterFactory(SimpleXmlConverterFactory.create())
//                .baseUrl("http://localhost:8080/umo/rest/")
//                .build();
//        PhoneService service = retrofit.create(PhoneService.class);
//        Call<test> call = service.getResult();
//        call.enqueue(new Callback<test>() {
//            @Override
//            public void onResponse(Call<test> call, Response<test> response) {
////                test mytest=response.body();
//            }
//
//            @Override
//            public void onFailure(Call<test> call, Throwable throwable) {
//
//            }
//        });


        List<Map<String,Object>> messageModelList=new ArrayList<Map<String,Object>>();
        //TODO 设置假数据
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("title","张三");
        map.put("info","你好");
        map.put("img", R.drawable.u426);
        map.put("time","一分钟前");
        messageModelList.add(map);

        map = new HashMap<String,Object>();
        map.put("title","张一");
        map.put("info","你好");
        map.put("img",R.drawable.u426);
        map.put("time","两分钟前");
        messageModelList.add(map);

        map = new HashMap<String,Object>();
        map.put("title","张二");
        map.put("info","你好");
        map.put("img",R.drawable.u426);
        map.put("time","三分钟前");
        messageModelList.add(map);

        map = new HashMap<String,Object>();
        map.put("title","张三");
        map.put("info","你好");
        map.put("img",R.drawable.u426);
        map.put("time","四分钟前");
        messageModelList.add(map);

        map = new HashMap<String,Object>();
        map.put("title","张四");
        map.put("info","你好");
        map.put("img",R.drawable.u426);
        map.put("time","五分钟前");
        messageModelList.add(map);

        map = new HashMap<String,Object>();
        map.put("title","张五");
        map.put("info","你好");
        map.put("img",R.drawable.u426);
        map.put("time","五分钟前");
        messageModelList.add(map);

        map = new HashMap<String,Object>();
        map.put("title","张六");
        map.put("info","你好");
        map.put("img",R.drawable.u426);
        map.put("time","六分钟前");
        messageModelList.add(map);

        map = new HashMap<String,Object>();
        map.put("title","张七");
        map.put("info","你好");
        map.put("img",R.drawable.u426);
        map.put("time","七分钟前");
        messageModelList.add(map);


        map = new HashMap<String,Object>();
        map.put("title","张八");
        map.put("info","你好");
        map.put("img",R.drawable.u426);
        map.put("time","八分钟前");
        messageModelList.add(map);


        map = new HashMap<String,Object>();
        map.put("title","张九");
        map.put("info","你好");
        map.put("img",R.drawable.u426);
        map.put("time","九分钟前");
        messageModelList.add(map);

        map = new HashMap<String,Object>();
        map.put("title","张十");
        map.put("info","你好");
        map.put("img",R.drawable.u426);
        map.put("time","十分钟前");
        messageModelList.add(map);

        map = new HashMap<String,Object>();
        map.put("title","张十一");
        map.put("info","你好");
        map.put("img",R.drawable.u426);
        map.put("time","十一分钟前");
        messageModelList.add(map);

        map = new HashMap<String,Object>();
        map.put("title","张十二");
        map.put("info","你好");
        map.put("img",R.drawable.u426);
        map.put("time","十二分钟前");
        messageModelList.add(map);

        return messageModelList;
    }

    public static List<ChatMessageModel> getChatMessageList(){
        List<ChatMessageModel> chatMessageModelList = new ArrayList<>();

        String[] msgArray = new String[]{"  孩子们，要好好学习，天天向上！要好好听课，不要翘课！不要挂科，多拿奖学金！三等奖学金的争取拿二等，二等的争取拿一等，一等的争取拿励志！",
                "姚妈妈还有什么吩咐...",
                "还有，明天早上记得跑操啊，不来的就扣德育分！",
                "德育分是什么？扣了会怎么样？",
                "德育分会影响奖学金评比，严重的话，会影响毕业",
                "哇！学院那么不人道？",
                "你要是你不听话，我当场让你不能毕业！",
                "姚妈妈，我知错了(- -我错在哪了...)"};

        String[]dataArray = new String[]{"2012-09-01 18:00", "2012-09-01 18:10",
                "2012-09-01 18:11", "2012-09-01 18:20",
                "2012-09-01 18:30", "2012-09-01 18:35",
                "2012-09-01 18:40", "2012-09-01 18:50"};

        int COUNT = 8;

        chatMessageModelList = initData(COUNT,msgArray,dataArray);
        return chatMessageModelList;
    }

    public static List<ChatMessageModel> initData(int COUNT,String[] msgArray,String[] dataArray) {
        List<ChatMessageModel> chatMessageModelList = new ArrayList<>();
        for(int i = 0; i < COUNT; i++) {
            ChatMessageModel entity = new ChatMessageModel();
            entity.setDate(dataArray[i]);
            if (i % 2 == 0)
            {
//                entity.setName("姚妈妈");
                entity.setMsgType(true);
            }else{
//                entity.setName("Shamoo");
                entity.setMsgType(false);
            }

            entity.setText(msgArray[i]);
            chatMessageModelList.add(entity);
        }
        return chatMessageModelList;

    }

   public static List<InformModel> getInformList(){
        List<InformModel>SampleInformList=new ArrayList<>();

      InformModel sampleInformModel= new InformModel("土豪","一起来玩把");
       sampleInformModel.setInformImageID(R.drawable.simple_01);
       SampleInformList.add(sampleInformModel);

       sampleInformModel=new InformModel("小冰","#预约了你的需求# 快去回复他把！");
       sampleInformModel.setInformImageID(R.drawable.simple_02);
       SampleInformList.add(sampleInformModel);

       sampleInformModel=new InformModel("小贤","发布了新的动态，去看看吧。");
       sampleInformModel.setInformImageID(R.drawable.simple_03);
       SampleInformList.add(sampleInformModel);

       sampleInformModel=new InformModel("杭澍","#预约了你的需求#，快去回复他吧");
       sampleInformModel.setInformImageID(R.drawable.simple_02);
       SampleInformList.add(sampleInformModel);

       sampleInformModel=new InformModel("小明","发布了新的动态--今天天气真好，一起出去玩吧");
       sampleInformModel.setInformImageID(R.drawable.simple_03);
       SampleInformList.add(sampleInformModel);

       sampleInformModel=new InformModel("小刚","#预约了你的需求#，快去回复他吧");
       sampleInformModel.setInformImageID(R.drawable.simple_02);
       SampleInformList.add(sampleInformModel);

       sampleInformModel=new InformModel("小贤","发布了新的动态--今天看到一篇好文章...");
       sampleInformModel.setInformImageID(R.drawable.simple_03);
       SampleInformList.add(sampleInformModel);

       return SampleInformList;
    }
    public static List<FollowModel> getFollowList(){
        List<FollowModel> followModelList=new ArrayList<>();

        RequirementModel fake1 = new RequirementModel();
        fake1.setRequirementerName("李杭澍");
        fake1.setRequirementerPhotoID(R.drawable.fake_data_announce_1);
        fake1.setRequirementID(1);
        fake1.setRequirementContent("我最近好寂寞啊，希望有个帅哥来炸窝聊天啊~~啊啊啊啊啊啊啊啊啊啊~啊啊");
        fake1.setCommentCount(25);
        fake1.setBookCount(52);
        Date currDate1 = new Date(System.currentTimeMillis() - 1111);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:SS");
        fake1.setRequirementMoment(formatter.format(currDate1));
        fake1.setViewCount(145);
        fake1.setRequirementLocation("华南理工大学");
        List imageList=new ArrayList();
        imageList.add(R.drawable.action_comment);
        imageList.add(R.drawable.action_commend);
        imageList.add(R.drawable.action_view);
        imageList.add(R.drawable.fake_data_announce_2);
        imageList.add(R.drawable.fake_data_announce_3);
        imageList.add(R.drawable.fake_data_announce_4);
        imageList.add(R.drawable.main_tab_bar_contacts);
        imageList.add(R.drawable.main_tab_bar_announce);
        imageList.add(R.drawable.main_tab_bar_follow);
        imageList.add(R.drawable.main_tab_bar_inform);
        fake1.setRequirementImageList(imageList);

        RequirementModel fake4 = new RequirementModel();
        fake4.setRequirementerName("张志斌");
        fake4.setRequirementerPhotoID(R.drawable.fake_data_announce_4);
        fake4.setRequirementID(1);
        fake4.setRequirementContent("峡谷见，左小龙，有大龙，上先锋，下蓝爸~");
        fake4.setCommentCount(86);
        fake4.setBookCount(143);
        Date currDate4 = new Date(System.currentTimeMillis() - 4444);
        fake4.setRequirementMoment(formatter.format(currDate4));
        fake4.setViewCount(1240);
        fake4.setRequirementLocation("华南理工大学-召唤师峡谷");
        fake4.setRequirementImageList(imageList);

        FeelingModel fake3 = new FeelingModel();
        fake3.setFeelingerName("张小贤");
        fake3.setFeelingerPhotoID(R.drawable.fake_data_announce_3);
        fake3.setFeelingID(3);
        fake3.setFeelingContent("二饭篮球场来个基友一起战斗~");
        fake3.setCommentCount(35);
        fake3.setCommendCount(67);
        Date currDate3 = new Date(System.currentTimeMillis() - 333333);
        fake3.setFeelingMoment(formatter.format(currDate3));
        fake3.setViewCount(1240);
        fake3.setFeelingLocation("华南理工大学-二饭篮球场");
        fake3.setFeelingImageList(imageList);


        followModelList.add(fake1);
        followModelList.add(fake3);
        followModelList.add(fake4);

        return followModelList;

    }
}

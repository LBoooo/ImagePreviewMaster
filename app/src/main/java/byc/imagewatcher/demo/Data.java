package byc.imagewatcher.demo;

import android.net.Uri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {

    private String avatar;
    private String nickname;
    private String createTime;
    private String content;
    private List<Uri> pictureList;
    private List<Uri> pictureThumbList;

    public static List<Data> get() {
        List<Data> dataList = new ArrayList<>();

        Data data1 = new Data();
        data1.avatar = "http://b162.photo.store.qq.com/psb?/V14EhGon4cZvmh/z2WukT5EhNE76WtOcbqPIgwM2Wxz4Tb7Nub.rDpsDgo!/b/dOaanmAaKQAA";
        data1.nickname = "萌新-lpe";
        data1.createTime = "昨天 11:21";
        data1.content = "开司还是那么帅";
        data1.pictureList = Arrays.asList(

                Uri.parse("http://img6.16fan.com/201510/11/005258wdngg6rv0tpn8z9z.jpg"),
                Uri.parse("http://img6.16fan.com/201510/11/013553aj3kp9u6iuz6k9uj.jpg"),
                Uri.parse("http://img6.16fan.com/201510/11/011753fnanichdca0wbhxc.jpg"),
                Uri.parse("http://img6.16fan.com/201510/11/011819zbzbciir9ctn295o.jpg"),
                Uri.parse("http://img6.16fan.com/201510/11/004847l7w568jc5n5wn385.jpg"),
                Uri.parse("http://img6.16fan.com/201510/11/004906z0a0a0e0hs56ce0t.jpg"),
                Uri.parse("http://img6.16fan.com/201510/11/004937pwttwjt0bgtoton7.jpg"),
                Uri.parse("http://img6.16fan.com/201510/11/004946t38ybzt8bq8c838y.jpg"),
                Uri.parse("http://img6.16fan.com/201510/11/004955d8ftz3t1sttt7ft7.jpg"),
                Uri.parse("http://img6.16fan.com/201510/11/005027qy2g55yyglb59zdu.jpg"),
                Uri.parse("http://img6.16fan.com/201510/11/005229bbtxkczcl0btmw8e.jpg")

        );
        data1.pictureThumbList = Arrays.asList(

                Uri.parse("http://img6.16fan.com/201510/11/005258wdngg6rv0tpn8z9z.jpg"),
                Uri.parse("http://img6.16fan.com/201510/11/013553aj3kp9u6iuz6k9uj.jpg"),
                Uri.parse("http://img6.16fan.com/201510/11/011753fnanichdca0wbhxc.jpg"),
                Uri.parse("http://img6.16fan.com/201510/11/011819zbzbciir9ctn295o.jpg"),
                Uri.parse("http://img6.16fan.com/201510/11/004847l7w568jc5n5wn385.jpg"),
                Uri.parse("http://img6.16fan.com/201510/11/004906z0a0a0e0hs56ce0t.jpg"),
                Uri.parse("http://img6.16fan.com/201510/11/004937pwttwjt0bgtoton7.jpg"),
                Uri.parse("http://img6.16fan.com/201510/11/004946t38ybzt8bq8c838y.jpg"),
                Uri.parse("http://img6.16fan.com/201510/11/004955d8ftz3t1sttt7ft7.jpg"),
                Uri.parse("http://img6.16fan.com/201510/11/005027qy2g55yyglb59zdu.jpg"),
                Uri.parse("http://img6.16fan.com/201510/11/005229bbtxkczcl0btmw8e.jpg")
        );


        Data data2 = new Data();
        data2.avatar = "http://b167.photo.store.qq.com/psb?/V14EhGon2OmAUI/hQN450lNoDPF.dO82PVKEdFw0Qj5qyGeyN9fByKgWd0!/m/dJWKmWNZEwAAnull";
        data2.nickname = "苦涩";
        data2.createTime = "昨天 09:59";
        data2.content = "唐僧还是厉害啊。为什么？有宝马";
        data2.pictureList = Arrays.asList(
                Uri.parse("http://img.my.csdn.net/uploads/201701/06/1483664741_7475.png")
        );
        data2.pictureThumbList = Arrays.asList(
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647799_1689.png")
        );

        Data data3 = new Data();
        data3.avatar = "http://b167.photo.store.qq.com/psb?/V14EhGon2OmAUI/hQN450lNoDPF.dO82PVKEdFw0Qj5qyGeyN9fByKgWd0!/m/dJWKmWNZEwAAnull";
        data3.nickname = "empty";
        data3.createTime = "昨天 08:12";
        data3.content = "各种眼神";
        data3.pictureList = Arrays.asList(
                Uri.parse("http://img.my.csdn.net/uploads/201701/06/1483671690_1970.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/06/1483671690_6902.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/06/1483671702_6499.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/06/1483671702_2352.jpg")
        );
        data3.pictureThumbList = Arrays.asList(
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484650701_4150.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484650719_9275.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647702_8420.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647930_4474.jpg")
        );

        Data data4 = new Data();
        data4.avatar = "http://b167.photo.store.qq.com/psb?/V14EhGon2OmAUI/hQN450lNoDPF.dO82PVKEdFw0Qj5qyGeyN9fByKgWd0!/m/dJWKmWNZEwAAnull";
        data4.nickname = "empty";
        data4.createTime = "昨天 06:00";
        data4.content = "人与人间的信任，就像是纸片，一旦破损，就不会再回到原来的样子。";
        data4.pictureList = Arrays.asList(
                Uri.parse("http://img.my.csdn.net/uploads/201701/13/1484296303_7395.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/13/1484296122_9613.jpg"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/13/1484296303_6984.png")
        );
        data4.pictureThumbList = Arrays.asList(
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647817_3557.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647818_9583.jpg"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647817_7305.png")
        );

        Data data5 = new Data();
        data5.avatar = "http://qlogo3.store.qq.com/qzone/383559698/383559698/100?1416542262";
        data5.nickname = "越线龙马";
        data5.createTime = "前天 14:61";
        data5.content = "雪.触之即化..愿永久飘零";
        data5.pictureList = Arrays.asList(
                Uri.parse("http://img.my.csdn.net/uploads/201701/13/1484296288_3031.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/13/1484296303_5044.jpg")
        );
        data5.pictureThumbList = Arrays.asList(
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647278_8869.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647702_1117.jpg")
        );

        Data data6 = new Data();
        data6.avatar = "http://b162.photo.store.qq.com/psb?/V14EhGon4cZvmh/z2WukT5EhNE76WtOcbqPIgwM2Wxz4Tb7Nub.rDpsDgo!/b/dOaanmAaKQAA";
        data6.nickname = "顺子要不起";
        data6.createTime = "圣诞节";
        data6.content = "颜宇扬的期末总结\n1、有本事冲我来，别再家长会上吓唬我爸\n2、期末考试成绩出来了，我觉得我妈生二胎是非常明智的选择\n3、这场考试对于我的意义就是知道了班上到底有多少人\n4、期末考试不给老师们露一手，他们还真以为自己教的好";
        data6.pictureList = Arrays.asList(
                Uri.parse("http://img.my.csdn.net/uploads/201701/13/1484296287_2190.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/13/1484296286_7908.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/13/1484296286_7013.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/13/1484296286_6401.jpg"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/13/1484296106_5671.png")
        );
        data6.pictureThumbList = Arrays.asList(
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647898_9300.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647278_2143.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647816_4929.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647817_5319.jpg"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647818_3369.png")
        );


        if (System.currentTimeMillis() % 3 == 0) {
            dataList.add(data1);
            dataList.add(data2);
            dataList.add(data3);
            dataList.add(data4);
            dataList.add(data6);
        } else if (System.currentTimeMillis() % 3 == 1) {
            dataList.add(data5);
            dataList.add(data6);
            dataList.add(data2);
            dataList.add(data4);
            dataList.add(data3);
        } else {
            dataList.add(data1);
            dataList.add(data3);
            dataList.add(data4);
            dataList.add(data5);
            dataList.add(data6);
        }

        return dataList;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Uri> getPictureList() {
        return pictureList;
    }

    public void setPictureList(List<Uri> pictureList) {
        this.pictureList = pictureList;
    }

    public List<Uri> getPictureThumbList() {
        return pictureThumbList;
    }

    public void setPictureThumbList(List<Uri> pictureThumbList) {
        this.pictureThumbList = pictureThumbList;
    }
}

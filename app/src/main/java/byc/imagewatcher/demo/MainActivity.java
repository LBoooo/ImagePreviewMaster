package byc.imagewatcher.demo;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.List;

import byc.imagewatcher.ImageWatcher;
import byc.imagewatcher.ImageWatcherHelper;


public class MainActivity extends Activity implements MessagePicturesLayout.Callback, ImageWatcher.OnPictureLongPressListener {

    private ImageWatcher vImageWatcher;//方式一
    private ImageWatcherHelper iwHelper;//方式二
    private RecyclerView vRecycler;
    private MessageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        boolean isTranslucentStatus = false;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS | WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
            window.setNavigationBarColor(Color.TRANSPARENT);
            isTranslucentStatus = true;
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vRecycler = (RecyclerView) findViewById(R.id.v_recycler);
        vRecycler.setLayoutManager(new LinearLayoutManager(this));
        vRecycler.addItemDecoration(new SpaceItemDecoration(this).setSpace(14).setSpaceColor(0xFFECECEC));
        vRecycler.setAdapter(adapter = new MessageAdapter(this).setPictureClickCallback(this));
        adapter.set(Data.get());
//        初始化方式一，在Activity对应布局文件加入<ImageWatcher>标签，推荐使用方式二
//        // 一般来讲， ImageWatcher 需要占据全屏的位置
//        vImageWatcher = (ImageWatcher) findViewById(R.id.v_image_watcher);
//        // 如果不是透明状态栏，你需要给ImageWatcher标记 一个偏移值，以修正点击ImageView查看的启动动画的Y轴起点的不正确
//        vImageWatcher.setTranslucentStatus(!isTranslucentStatus ? Utils.calcStatusBarHeight(this) : 0);
//        // 配置error图标 如果不介意使用lib自带的图标，并不一定要调用这个API
//        vImageWatcher.setErrorImageRes(R.mipmap.error_picture);
//        // 长按图片的回调，你可以显示一个框继续提供一些复制，发送等功能
//        vImageWatcher.setOnPictureLongPressListener(this);
//        vImageWatcher.setLoader(new GlideSimpleLoader());
//        vImageWatcher.setOnStateChangedListener(new ImageWatcher.OnStateChangedListener() {
//            @Override
//            public void onStateChangeUpdate(ImageWatcher imageWatcher, ImageView clicked, int position, Uri uri, float animatedValue, int actionTag) {
//                Log.e("IW", "onStateChangeUpdate [" + position + "][" + uri + "][" + animatedValue + "][" + actionTag + "]");
//            }
//
//            @Override
//            public void onStateChanged(ImageWatcher imageWatcher, int position, Uri uri, int actionTag) {
//                if (actionTag == ImageWatcher.STATE_ENTER_DISPLAYING) {
//                    Toast.makeText(getApplicationContext(), "点击了图片 [" + position + "]" + uri + "", Toast.LENGTH_SHORT).show();
//                } else if (actionTag == ImageWatcher.STATE_EXIT_HIDING) {
//                    Toast.makeText(getApplicationContext(), "退出了查看大图", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//        Utils.fitsSystemWindows(isTranslucentStatus, findViewById(R.id.v_fit));
//        新的初始化方式二，不再需要在布局文件中加入<ImageWatcher>标签 减少布局嵌套
        iwHelper = ImageWatcherHelper.with(this, new GlideSimpleLoader()) // 一般来讲， ImageWatcher 需要占据全屏的位置
//                .setTranslucentStatus(!isTranslucentStatus ? Utils.calcStatusBarHeight(this) : 0) // 如果不是透明状态栏，你需要给ImageWatcher标记 一个偏移值，以修正点击ImageView查看的启动动画的Y轴起点的不正确
                .setErrorImageRes(R.mipmap.error_picture) // 配置error图标 如果不介意使用lib自带的图标，并不一定要调用这个API
                .setOnPictureLongPressListener(this);
//                .setOnStateChangedListener(new ImageWatcher.OnStateChangedListener() {
//                    @Override
//                    public void onStateChangeUpdate(ImageWatcher imageWatcher, ImageView clicked, int position, Uri uri, float animatedValue, int actionTag) {
//                        Log.e("IW", "onStateChangeUpdate [" + position + "][" + uri + "][" + animatedValue + "][" + actionTag + "]");
//                    }
//
//                    @Override
//                    public void onStateChanged(ImageWatcher imageWatcher, int position, Uri uri, int actionTag) {
//                        if (actionTag == ImageWatcher.STATE_ENTER_DISPLAYING) {
//                            Toast.makeText(getApplicationContext(), "点击了图片 [" + position + "]" + uri + "", Toast.LENGTH_SHORT).show();
//                        } else if (actionTag == ImageWatcher.STATE_EXIT_HIDING) {
//                            Toast.makeText(getApplicationContext(), "退出了查看大图", Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                })
//                .setIndexProvider(new CustomDotIndexProvider())//自定义页码指示器（默认数字）
//                .setLoadingUIProvider(new CustomLoadingUIProvider()); // 自定义LoadingUI


        Utils.fitsSystemWindows(isTranslucentStatus, findViewById(R.id.v_fit));
    }

    @Override
    public void onThumbPictureClick(ImageView i, List<ImageView> imageGroupList, List<Uri> urlList) {
//        //方式一
//        vImageWatcher.show(i, imageGroupList, urlList);
        //方式二
        iwHelper.show(i, imageGroupList, urlList);
    }

    @Override
    public void onPictureLongPress(ImageView v, Uri uri, int pos) {
        Toast.makeText(v.getContext().getApplicationContext(), "长按了第" + (pos + 1) + "张图片", Toast.LENGTH_SHORT).show();

        new SheetDialog.Builder(this)
                .addSheet("发送给好友", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .addSheet("转载到空间相册", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .addSheet("保存到手机", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .addSheet("收藏", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).create().show();
    }

    //记得重写返回键哦
    @Override
    public void onBackPressed() {
//        //方式一
//        if (!vImageWatcher.handleBackPressed()) {
//            super.onBackPressed();
//        }
        //方式二
        if (!iwHelper.handleBackPressed()) {
            super.onBackPressed();
        }
    }
}

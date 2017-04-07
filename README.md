# DistRefreshLayout

[ ![Download](https://api.bintray.com/packages/nukc/maven/DistRefreshLayout/images/download.svg) ](https://bintray.com/nukc/maven/DistRefreshLayout/_latestVersion)

应壳而来的下拉刷新控件, 是在SwipeRefreshLayout原有的基础上改的.

以后要加的功能:
- 支持自定义刷新视图

<img src="https://raw.githubusercontent.com/nukc/distrefreshlayout/master/images/distrefresh.gif">

## Installation
add the dependency:
```groovy
dependencies {
    compile 'com.github.nukc:distrefreshlayout:0.1.1'
}
```

## Usage

用法跟SwipeRefreshLayout一样.

添加到布局:
```xml
<com.github.nukc.distrefreshlayout.DistRefreshLayout
    android:id="@+id/refreshLayout"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.github.nukc.sample.MainActivity">

    <!-- support ListView/Scrollview/... -->
    <android.support.v7.widget.RecyclerView
        android:id="@+id/recyclerView"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
</com.github.nukc.distrefreshlayout.DistRefreshLayout>
```

获取它并使用:
```java
mDistRefreshLayout = (DistRefreshLayout) findViewById(R.id.refreshLayout);
mDistRefreshLayout.setOnRefreshListener(new DistRefreshLayout.OnRefreshListener() {
    @Override
    public void onRefresh() {
        mDistRefreshLayout.postDelayed(new Runnable() {
            @Override
            public void run() {
                mDistRefreshLayout.setRefreshing(false);
            }
        }, 1000);
    }
});
```
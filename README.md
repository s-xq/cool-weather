#分工
本项目采用`MVP`模式，包括数据层`Model`、展示层`Presenter`以及界面层`View`<br>

###数据层`Model`--王铭海<br>   
>负责将数据从网络获取，并将数据缓存到手机自带的SQLlite数据库中。<br>
>使用技术：<br>
>>1.OkHttp:获取网络数据的Http框架<br>
>>2.Gson:将从网络获取的json格式的数据，解析成对应的Java实体类对象<br>
>>3.SQLLite:缓存从网络获取的数据，将这些数据存入数据库中。<br>
###展示层`Presenter`--石小强<br>
>在数据层与界面层之间搭起一座桥梁，连接数据层，适配界面层。<br>
>使用技术：<br>
>>1.Service：Android四大组件之一，用于数据的自动更新，更新间隔为每4小时更新一次。<br>
>>2.Acitivity：在WeatherActivity中将数据层中的数据读取，将数据传递给界面层。<br>
>>3.数据读取策略为：<br>
>>>采用三级缓存：<br>
>>>>1.优先内存<br>
>>>>2.其次本地持久化-数据库<br>
>>>>3.最后网络<br>
###界面层`View` --欧建培<br>
>负责界面对布局，与用户交互的所有工作<br>
>使用技术：<br>
>>1.Acitivity：Android界面展示的活动窗口<br>
>>2.Fragment：展示天气数据<br>
>>3.SwipeRefreshLayout：下拉刷新组件<br>
        

#开发模式<br>
分支开发，主干发布。分为三个分支。
1.master：主干<br>
2.sxq：石小强<br>
3.wang:王铭海<br>
4.ou:欧建培<br>
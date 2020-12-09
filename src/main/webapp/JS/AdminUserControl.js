layui.use(['laydate'], function(){
    var laydate = layui.laydate;
    //执行一个laydate实例
    laydate.render({
        elem: '#beginTime' //指定元素
    });
    laydate.render({
        elem: '#endTime' //指定元素
    });
});

layui.use('table', function(){
    var table = layui.table;
    //方法级渲染
    table.render({
        elem: '#LAY_table_user'
        ,url: '/AdminUserControlServlet'
        ,cellMinWidth:80
        ,cols: [[
            {field:'name', title: '用户名'}
            ,{field:'regsitertime', title: '注册时间', sort: true}
            ,{field:'d.userScore.SocerCount', title: '积分', sort: true}
            ,{field:'upLoading', title: '上传文档数', sort: true}
            ,{field:'downLoading', title: '下载文档数', sort: true}
            ,{field:'userParmars',title: '用户状态',templet: '<div>{{d.userParmars.userParmars}}</div>'}
            ,{field:'classify', title: '操作',toolbar: '#barDemo'}
        ]]
        ,id: 'testReload'
        ,page: true
        ,height: 310
    });

    var $ = layui.$, active = {
        reload: function(){
            var beginTime = $('#beginTime');
            var endTime = $('#endTime');
            var demoReload=$('#demoReload');
            //执行重载
            table.reload('testReload', {
                page: {
                    curr: 1 //重新从第 1 页开始
                }
                ,where: {
                    beginTime: beginTime.val(),
                    endTime:endTime.val(),
                    demoReload:demoReload.val(),
                }
            }, 'data');
        }
    }
    $('.demoTable .layui-btn').on('click', function(){
        var type = $(this).data('type');
        active[type] ? active[type].call(this) : '';

    });
    // var $ = layui.$, active = {
    //     reload: function(){
    //         var demoReload = $('#demoReload');
    //         //执行重载
    //         table.reload('testReload', {
    //             page: {
    //                 curr: 1 //重新从第 1 页开始
    //             }
    //             ,where: {
    //                 key: {
    //                     id: demoReload.val()
    //                 }
    //             }
    //         }, 'data');
    //     }
    // };

});
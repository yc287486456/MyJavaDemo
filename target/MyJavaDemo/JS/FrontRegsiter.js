
layui.use(['form','jquery','layer'], function () {
    var form = layui.form;
    var $ = layui.jquery;
    var layer = layui.layer;
//添加表单失焦事件

//验证表单
    $('#user').blur(function() {
        var user = $(this).val();
        $.ajax({
            url:'/RegsiterServlet',
            type:'post',
            dataType:'text',
            data:{user:user},
//验证用户名是否可用
            beforeSend:function(){
               if($.trim(user)==""||$.trim(user).length<=0){
                   alert("账号不能为null");
                   return false;
               }
            },
            success:function(data){
                if (data == 1) {
                    $('#ri').removeAttr('hidden');
                    $('#wr').attr('hidden','hidden');
                } else {
                    $('#wr').removeAttr('hidden');
                    $('#ri').attr('hidden','hidden');
                    layer.msg('当前用户名已被占用! ');
                }
            }
        })
    });
// you code ...

// 为密码添加正则验证

    $('#pwd').blur(function() {

        var reg = /^[\w]{6,12}$/;

        if(!($('#pwd').val().match(reg))){

//layer.msg('请输入合法密码');

            $('#pwr').removeAttr('hidden');

            $('#pri').attr('hidden','hidden');

            layer.msg('请输入合法密码');

        }else {

            $('#pri').removeAttr('hidden');

            $('#pwr').attr('hidden','hidden');

        }

    });


//验证两次密码是否一致

    $('#rpwd').blur(function() {

        if($('#pwd').val() != $('#rpwd').val()){

            $('#rpwr').removeAttr('hidden');

            $('#rpri').attr('hidden','hidden');

            layer.msg('两次输入密码不一致!');

        }else {

            $('#rpri').removeAttr('hidden');

            $('#rpwr').attr('hidden','hidden');

        };

    });
    //验证性别是否为null
    $('#rpwd').blur(function() {

        if($('#pwd').val() != $('#rpwd').val()){

            $('#rpwr').removeAttr('hidden');

            $('#rpri').attr('hidden','hidden');

            layer.msg('两次输入密码不一致!');

        }else {

            $('#rpri').removeAttr('hidden');

            $('#rpwr').attr('hidden','hidden');
        };
    });
//添加表单监听事件,提交注册信息
    form.on('submit(sub)', function() {
        var user=$('#user').val();
        var pwd=$('#pwd').val();
        var sex=$("input[name='sex']:checked").val();
        var educational=$("select[name='interest'] option:selected").val();
        var job=$("select[name='job'] option:selected").val();
        var phoneNumber=$('#phoneNumber').val();
        var email=$('#Email').val();
        $.ajax({
            url:'/UserInsertServlet',
            type:'post',
            dataType:'text',
            data:{
                user:user,
                pwd:pwd,
                sex:sex,
                educational:educational,
                job:job,
                phoneNumber:phoneNumber,
                Email:email,
            },
            beforeSend:function(){
                if($.trim(sex)==""||$.trim(sex).length<=0){
                    alert("性别不没选择");
                    return false;
                }
            },
            success:function(data){
                if (data == 1) {
                    layer.msg('注册成功');
                    location.href="../FrontAdmin/Login.jsp";
                }else {
                    layer.msg('注册失败');
                }
            }
        })
//防止页面跳转
        return false;
    });
});
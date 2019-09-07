/*登录*/
function requestJson(){
    var name =$("#username").val();//#是id选择器
    var pwd =$("#password").val();
    if(name==="" || null == name){
        alert("用户名不能为空！");
    }else {
        if(pwd==="" || null == pwd){
            alert("密码不能为空！");
        }else{
            $.ajax({
                type:'post',
                url:'checklogin',
                dataType:"text",//注意使用的是打他dataType，而不是Content-Type
                async: true,
                data:{username:name,paasword:pwd},
                success:function(jsonStr){
                    if(jsonStr.length === 0 || jsonStr === null){
                        alert("没有这个用户！");
                    }
                    else{
                        alert("登录成功");
                        window.location.href ="TODO";
                    }
                }
            });
        }
    }
}

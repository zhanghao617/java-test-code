function check(form) {
         var p1 = document.getElementById("password1");
         var p2 = document.getElementById("password2");;
         if (p2.value != p1.value) {
        	 p2.value="";
             p1.focus();
             document.getElementById("tip2").innerHTML="两次密码不一致，请重新输入";
             return false;
         }
         	document.getElementById("tip2").innerHTML="";
         	return true;
     }
     
     function checkOld() {
         var p3 = document.getElementById("oldPassword1");
         var p4 = document.getElementById("oldPassword2");
         if (p4.value != p3.value) {
        	 p4.focus();
        	 document.getElementById("tip1").innerHTML="原始密码错误，请重新输入";
        	 return false;
         }
         	document.getElementById("tip1").innerHTML="原始密码验证成功";
         	return true;
     }
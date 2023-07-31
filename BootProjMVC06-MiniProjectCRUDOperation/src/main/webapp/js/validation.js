function doValidation(frm) {
    //empty old form validation error message
    document.getElementById("enameErr").innerHTML="";
    document.getElementById("jobErr").innerHTML="";
    document.getElementById("salErr").innerHTML="";
    document.getElementById("detpnoErr").innerHTML="";

    //reaed the form comp value
    let name=frm.ename.value;
    let desg=frm.job.value;
    let salary=frm.sal.value;
    let deptno=frm.deptno.value;
    let isValid=true;
   

    //write client side form validation logic
    if(name==""){//required rule
        document.getElementById("enameErr").innerHTML="Employee name is mandatory";
        isValid=false;
    }
    else if(name.length<5|| name.length>15){//length rule
        document.getElementById("enameErr").innerHTML="Employee name not less than 5 or greater than 15 chars";
        isValid=false;
    }
    if(desg==""){//required rule
        document.getElementById("jobErr").innerHTML="Employee job is mandatory";
        isValid=false;
    }
    else if(desg.length<5|| desg.length>10){//length rule
        document.getElementById("jobErr").innerHTML="Employee job not less than 5 or greater than 10 chars";
        isValid=false;
    }
    else if(salary<1000||salary>=200000){//length rule
        document.getElementById("salErr").innerHTML="Employee salary not less than 1000 or greater than 200000";
        isValid=false;
    }
    if(deptno==""){//required rule
        document.getElementById("enameErr").innerHTML="deptno is mandatory";
        isValid=false;
    }
   return isValid;
     frm.vflag.value="no";
}
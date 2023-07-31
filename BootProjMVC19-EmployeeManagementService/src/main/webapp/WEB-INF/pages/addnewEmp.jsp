<%@ page language="java" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
 <link  rel="stylesheet"type="text/css" href="css/form.css"/>
<frm:form  modelAttribute="emp"  >
 <div class="form">
     
      <div class="input-container ic1">
        <frm:input  path="empno"  id="empno" class="input" placeholder=" "  />
        <div class="cut"></div>
        <label for="empno" class="placeholder">empno</label>
      </div>
      <div class="input-container ic2">
        <frm:input path="ename" id="ename" class="input"  placeholder=" " /><frm:errors path="ename" />
        <div class="cut"></div>
        <label for="ename" class="placeholder">ename</label>
      </div>
      <div class="input-container ic2">
        <frm:input path="job" id="job" class="input"  placeholder=" " /><frm:errors path="job" />
        <div class="cut cut-short"></div>
        <label for="job1" class="placeholder">job</label>
      </div>
      <div class="input-container ic2">
        <frm:input path="sal" id="sal" class="input"  placeholder=" " /><frm:errors path="sal" />
        <div class="cut cut-short"></div>
        <label for="sal" class="placeholder">sal</label>
      </div>
      <button type="submit" class="submit">submit</button>
    </div>

</frm:form>

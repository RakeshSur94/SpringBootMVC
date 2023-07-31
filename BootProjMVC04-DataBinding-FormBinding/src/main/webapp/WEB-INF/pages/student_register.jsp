<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
  <h1 style="color:red; text-align:center" >Registration Info</h1>
  

                            <frm:form modelAttribute="stud" >
                           <table border="0" bgcolor="cyan" align="center">
                                            <tr>
                                            <td>  Student No: </td>       
                             <td> <frm:input path="sno"/></td>
                                             </tr>             
                                                <tr>
                                            <td>  Student Name: </td>       
                             <td> <frm:input path="sname"/></td>
                                             </tr>  
                                                <tr>
                                            <td>  Student addrs: </td>       
                             <td> <frm:input path="sadd"/></td>
                                             </tr>        
                                                <tr>
                                            <td>  Student avg: </td>       
                             <td> <frm:input path="avg"/></td>
                                             </tr>  
                                             <tr>
                                             <td><input type="submit" value="register"></td>
                                              <td><input type="reset" value="cancel"></td>
                                             </tr>                                               
        </table>

                        </frm:form>

